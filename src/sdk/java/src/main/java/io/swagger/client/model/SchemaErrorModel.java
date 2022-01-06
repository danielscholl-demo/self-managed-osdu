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
import io.swagger.client.model.SchemaError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SchemaErrorModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T20:23:53.013Z")
public class SchemaErrorModel {
  @SerializedName("errors")
  private List<SchemaError> errors = null;

  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  public SchemaErrorModel errors(List<SchemaError> errors) {
    this.errors = errors;
    return this;
  }

  public SchemaErrorModel addErrorsItem(SchemaError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<SchemaError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<SchemaError> getErrors() {
    return errors;
  }

  public void setErrors(List<SchemaError> errors) {
    this.errors = errors;
  }

  public SchemaErrorModel code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public SchemaErrorModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaErrorModel schemaErrorModel = (SchemaErrorModel) o;
    return Objects.equals(this.errors, schemaErrorModel.errors) &&
        Objects.equals(this.code, schemaErrorModel.code) &&
        Objects.equals(this.message, schemaErrorModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, code, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaErrorModel {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

