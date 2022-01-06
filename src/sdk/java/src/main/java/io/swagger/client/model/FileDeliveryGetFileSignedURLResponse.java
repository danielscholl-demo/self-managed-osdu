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
 * FileDeliveryGetFileSignedURLResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T21:37:15.431Z")
public class FileDeliveryGetFileSignedURLResponse {
  @SerializedName("unprocessed")
  private List<String> unprocessed = null;

  @SerializedName("processed")
  private Map<String, Object> processed = null;

  public FileDeliveryGetFileSignedURLResponse unprocessed(List<String> unprocessed) {
    this.unprocessed = unprocessed;
    return this;
  }

  public FileDeliveryGetFileSignedURLResponse addUnprocessedItem(String unprocessedItem) {
    if (this.unprocessed == null) {
      this.unprocessed = new ArrayList<String>();
    }
    this.unprocessed.add(unprocessedItem);
    return this;
  }

   /**
   * A list of SRNs which could not be processed
   * @return unprocessed
  **/
  @ApiModelProperty(value = "A list of SRNs which could not be processed")
  public List<String> getUnprocessed() {
    return unprocessed;
  }

  public void setUnprocessed(List<String> unprocessed) {
    this.unprocessed = unprocessed;
  }

  public FileDeliveryGetFileSignedURLResponse processed(Map<String, Object> processed) {
    this.processed = processed;
    return this;
  }

  public FileDeliveryGetFileSignedURLResponse putProcessedItem(String key, Object processedItem) {
    if (this.processed == null) {
      this.processed = new HashMap<String, Object>();
    }
    this.processed.put(key, processedItem);
    return this;
  }

   /**
   * Each key is equal to an SRN that was able to be processed
   * @return processed
  **/
  @ApiModelProperty(value = "Each key is equal to an SRN that was able to be processed")
  public Map<String, Object> getProcessed() {
    return processed;
  }

  public void setProcessed(Map<String, Object> processed) {
    this.processed = processed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDeliveryGetFileSignedURLResponse fileDeliveryGetFileSignedURLResponse = (FileDeliveryGetFileSignedURLResponse) o;
    return Objects.equals(this.unprocessed, fileDeliveryGetFileSignedURLResponse.unprocessed) &&
        Objects.equals(this.processed, fileDeliveryGetFileSignedURLResponse.processed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unprocessed, processed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDeliveryGetFileSignedURLResponse {\n");
    
    sb.append("    unprocessed: ").append(toIndentedString(unprocessed)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
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

