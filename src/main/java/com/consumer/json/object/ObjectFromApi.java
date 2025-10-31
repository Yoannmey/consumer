
package com.consumer.json.object;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lastName",
    "firstName",
    "adid",
    "activeStatus",
    "officePhone",
    "endDate",
    "nameOfManager",
    "mailAddress",
    "personalTitle",
    "jobActivity"
})
@Generated("jsonschema2pojo")
public class ObjectFromApi {

    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("adid")
    private String adid;
    @JsonProperty("activeStatus")
    private Boolean activeStatus;
    @JsonProperty("officePhone")
    private String officePhone;
    @JsonProperty("endDate")
    private Object endDate;
    @JsonProperty("nameOfManager")
    private Object nameOfManager;
    @JsonProperty("mailAddress")
    private String mailAddress;
    @JsonProperty("personalTitle")
    private String personalTitle;
    @JsonProperty("jobActivity")
    private String jobActivity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ObjectFromApi withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ObjectFromApi withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("adid")
    public String getAdid() {
        return adid;
    }

    @JsonProperty("adid")
    public void setAdid(String adid) {
        this.adid = adid;
    }

    public ObjectFromApi withAdid(String adid) {
        this.adid = adid;
        return this;
    }

    @JsonProperty("activeStatus")
    public Boolean getActiveStatus() {
        return activeStatus;
    }

    @JsonProperty("activeStatus")
    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public ObjectFromApi withActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
        return this;
    }

    @JsonProperty("officePhone")
    public String getOfficePhone() {
        return officePhone;
    }

    @JsonProperty("officePhone")
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public ObjectFromApi withOfficePhone(String officePhone) {
        this.officePhone = officePhone;
        return this;
    }

    @JsonProperty("endDate")
    public Object getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public ObjectFromApi withEndDate(Object endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("nameOfManager")
    public Object getNameOfManager() {
        return nameOfManager;
    }

    @JsonProperty("nameOfManager")
    public void setNameOfManager(Object nameOfManager) {
        this.nameOfManager = nameOfManager;
    }

    public ObjectFromApi withNameOfManager(Object nameOfManager) {
        this.nameOfManager = nameOfManager;
        return this;
    }

    @JsonProperty("mailAddress")
    public String getMailAddress() {
        return mailAddress;
    }

    @JsonProperty("mailAddress")
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public ObjectFromApi withMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
        return this;
    }

    @JsonProperty("personalTitle")
    public String getPersonalTitle() {
        return personalTitle;
    }

    @JsonProperty("personalTitle")
    public void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }

    public ObjectFromApi withPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
        return this;
    }

    @JsonProperty("jobActivity")
    public String getJobActivity() {
        return jobActivity;
    }

    @JsonProperty("jobActivity")
    public void setJobActivity(String jobActivity) {
        this.jobActivity = jobActivity;
    }

    public ObjectFromApi withJobActivity(String jobActivity) {
        this.jobActivity = jobActivity;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ObjectFromApi withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ObjectFromApi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("adid");
        sb.append('=');
        sb.append(((this.adid == null)?"<null>":this.adid));
        sb.append(',');
        sb.append("activeStatus");
        sb.append('=');
        sb.append(((this.activeStatus == null)?"<null>":this.activeStatus));
        sb.append(',');
        sb.append("officePhone");
        sb.append('=');
        sb.append(((this.officePhone == null)?"<null>":this.officePhone));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("nameOfManager");
        sb.append('=');
        sb.append(((this.nameOfManager == null)?"<null>":this.nameOfManager));
        sb.append(',');
        sb.append("mailAddress");
        sb.append('=');
        sb.append(((this.mailAddress == null)?"<null>":this.mailAddress));
        sb.append(',');
        sb.append("personalTitle");
        sb.append('=');
        sb.append(((this.personalTitle == null)?"<null>":this.personalTitle));
        sb.append(',');
        sb.append("jobActivity");
        sb.append('=');
        sb.append(((this.jobActivity == null)?"<null>":this.jobActivity));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.adid == null)? 0 :this.adid.hashCode()));
        result = ((result* 31)+((this.activeStatus == null)? 0 :this.activeStatus.hashCode()));
        result = ((result* 31)+((this.officePhone == null)? 0 :this.officePhone.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.nameOfManager == null)? 0 :this.nameOfManager.hashCode()));
        result = ((result* 31)+((this.mailAddress == null)? 0 :this.mailAddress.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.personalTitle == null)? 0 :this.personalTitle.hashCode()));
        result = ((result* 31)+((this.jobActivity == null)? 0 :this.jobActivity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObjectFromApi) == false) {
            return false;
        }
        ObjectFromApi rhs = ((ObjectFromApi) other);
        return ((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.adid == rhs.adid)||((this.adid!= null)&&this.adid.equals(rhs.adid))))&&((this.activeStatus == rhs.activeStatus)||((this.activeStatus!= null)&&this.activeStatus.equals(rhs.activeStatus))))&&((this.officePhone == rhs.officePhone)||((this.officePhone!= null)&&this.officePhone.equals(rhs.officePhone))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.nameOfManager == rhs.nameOfManager)||((this.nameOfManager!= null)&&this.nameOfManager.equals(rhs.nameOfManager))))&&((this.mailAddress == rhs.mailAddress)||((this.mailAddress!= null)&&this.mailAddress.equals(rhs.mailAddress))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.personalTitle == rhs.personalTitle)||((this.personalTitle!= null)&&this.personalTitle.equals(rhs.personalTitle))))&&((this.jobActivity == rhs.jobActivity)||((this.jobActivity!= null)&&this.jobActivity.equals(rhs.jobActivity))));
    }

}
