package com.consumer.json;

import com.consumer.json.object.ObjectFromApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sun.codemodel.JCodeModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONString;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

@Slf4j
@Component
public class Json {

    public String toJson(String json){
        JSONArray jsonArray = new JSONArray(json);
        log.info(jsonArray.get(1).toString());
        return jsonArray.get(1).toString();

    }

    public void generateClass(String json) throws Exception{

        JCodeModel jcodeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };

        new File("json.json");


        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        mapper.generate(jcodeModel, "ObjectFromApi", "com.consumer.json.object", json);

        File newFile = new File("src/main/java/");

        jcodeModel.build(newFile);

        ObjectFromApi test
    }
}

