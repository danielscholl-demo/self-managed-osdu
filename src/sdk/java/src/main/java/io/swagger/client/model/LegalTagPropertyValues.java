/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Shows the allowed values of the fields of a LegalTag.
 */
@ApiModel(description = "Shows the allowed values of the fields of a LegalTag.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T19:47:20.557Z")
public class LegalTagPropertyValues {
  @SerializedName("countriesOfOrigin")
  private Map<String, String> countriesOfOrigin = null;

  @SerializedName("otherRelevantDataCountries")
  private Map<String, String> otherRelevantDataCountries = null;

  @SerializedName("securityClassifications")
  private List<String> securityClassifications = null;

  @SerializedName("exportClassificationControlNumbers")
  private List<String> exportClassificationControlNumbers = null;

  @SerializedName("personalDataTypes")
  private List<String> personalDataTypes = null;

  public LegalTagPropertyValues countriesOfOrigin(Map<String, String> countriesOfOrigin) {
    this.countriesOfOrigin = countriesOfOrigin;
    return this;
  }

  public LegalTagPropertyValues putCountriesOfOriginItem(String key, String countriesOfOriginItem) {
    if (this.countriesOfOrigin == null) {
      this.countriesOfOrigin = new HashMap<String, String>();
    }
    this.countriesOfOrigin.put(key, countriesOfOriginItem);
    return this;
  }

   /**
   * The values of all the allowed Countries of Origin with the ISO Alpha 2 code and country name.
   * @return countriesOfOrigin
  **/
  @ApiModelProperty(value = "The values of all the allowed Countries of Origin with the ISO Alpha 2 code and country name.")
  public Map<String, String> getCountriesOfOrigin() {
    return countriesOfOrigin;
  }

  public void setCountriesOfOrigin(Map<String, String> countriesOfOrigin) {
    this.countriesOfOrigin = countriesOfOrigin;
  }

  public LegalTagPropertyValues otherRelevantDataCountries(Map<String, String> otherRelevantDataCountries) {
    this.otherRelevantDataCountries = otherRelevantDataCountries;
    return this;
  }

  public LegalTagPropertyValues putOtherRelevantDataCountriesItem(String key, String otherRelevantDataCountriesItem) {
    if (this.otherRelevantDataCountries == null) {
      this.otherRelevantDataCountries = new HashMap<String, String>();
    }
    this.otherRelevantDataCountries.put(key, otherRelevantDataCountriesItem);
    return this;
  }

   /**
   * The values of all the allowed Other Relevant Data Countries with the ISO Alpha 2 code and country name.
   * @return otherRelevantDataCountries
  **/
  @ApiModelProperty(value = "The values of all the allowed Other Relevant Data Countries with the ISO Alpha 2 code and country name.")
  public Map<String, String> getOtherRelevantDataCountries() {
    return otherRelevantDataCountries;
  }

  public void setOtherRelevantDataCountries(Map<String, String> otherRelevantDataCountries) {
    this.otherRelevantDataCountries = otherRelevantDataCountries;
  }

  public LegalTagPropertyValues securityClassifications(List<String> securityClassifications) {
    this.securityClassifications = securityClassifications;
    return this;
  }

  public LegalTagPropertyValues addSecurityClassificationsItem(String securityClassificationsItem) {
    if (this.securityClassifications == null) {
      this.securityClassifications = new ArrayList<String>();
    }
    this.securityClassifications.add(securityClassificationsItem);
    return this;
  }

   /**
   * The values of all the allowed Security Classifications.
   * @return securityClassifications
  **/
  @ApiModelProperty(value = "The values of all the allowed Security Classifications.")
  public List<String> getSecurityClassifications() {
    return securityClassifications;
  }

  public void setSecurityClassifications(List<String> securityClassifications) {
    this.securityClassifications = securityClassifications;
  }

  public LegalTagPropertyValues exportClassificationControlNumbers(List<String> exportClassificationControlNumbers) {
    this.exportClassificationControlNumbers = exportClassificationControlNumbers;
    return this;
  }

  public LegalTagPropertyValues addExportClassificationControlNumbersItem(String exportClassificationControlNumbersItem) {
    if (this.exportClassificationControlNumbers == null) {
      this.exportClassificationControlNumbers = new ArrayList<String>();
    }
    this.exportClassificationControlNumbers.add(exportClassificationControlNumbersItem);
    return this;
  }

   /**
   * The name of all the allowed Export Classifications.
   * @return exportClassificationControlNumbers
  **/
  @ApiModelProperty(value = "The name of all the allowed Export Classifications.")
  public List<String> getExportClassificationControlNumbers() {
    return exportClassificationControlNumbers;
  }

  public void setExportClassificationControlNumbers(List<String> exportClassificationControlNumbers) {
    this.exportClassificationControlNumbers = exportClassificationControlNumbers;
  }

  public LegalTagPropertyValues personalDataTypes(List<String> personalDataTypes) {
    this.personalDataTypes = personalDataTypes;
    return this;
  }

  public LegalTagPropertyValues addPersonalDataTypesItem(String personalDataTypesItem) {
    if (this.personalDataTypes == null) {
      this.personalDataTypes = new ArrayList<String>();
    }
    this.personalDataTypes.add(personalDataTypesItem);
    return this;
  }

   /**
   * The name of all the allowed Personal Data Type values.
   * @return personalDataTypes
  **/
  @ApiModelProperty(value = "The name of all the allowed Personal Data Type values.")
  public List<String> getPersonalDataTypes() {
    return personalDataTypes;
  }

  public void setPersonalDataTypes(List<String> personalDataTypes) {
    this.personalDataTypes = personalDataTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalTagPropertyValues legalTagPropertyValues = (LegalTagPropertyValues) o;
    return Objects.equals(this.countriesOfOrigin, legalTagPropertyValues.countriesOfOrigin) &&
        Objects.equals(this.otherRelevantDataCountries, legalTagPropertyValues.otherRelevantDataCountries) &&
        Objects.equals(this.securityClassifications, legalTagPropertyValues.securityClassifications) &&
        Objects.equals(this.exportClassificationControlNumbers, legalTagPropertyValues.exportClassificationControlNumbers) &&
        Objects.equals(this.personalDataTypes, legalTagPropertyValues.personalDataTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countriesOfOrigin, otherRelevantDataCountries, securityClassifications, exportClassificationControlNumbers, personalDataTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalTagPropertyValues {\n");
    
    sb.append("    countriesOfOrigin: ").append(toIndentedString(countriesOfOrigin)).append("\n");
    sb.append("    otherRelevantDataCountries: ").append(toIndentedString(otherRelevantDataCountries)).append("\n");
    sb.append("    securityClassifications: ").append(toIndentedString(securityClassifications)).append("\n");
    sb.append("    exportClassificationControlNumbers: ").append(toIndentedString(exportClassificationControlNumbers)).append("\n");
    sb.append("    personalDataTypes: ").append(toIndentedString(personalDataTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

