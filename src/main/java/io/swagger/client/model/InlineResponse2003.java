/*
 * BillaBear
 * The REST API provided by BillaBear
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@billabear.com
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
import io.swagger.client.model.Refund;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * InlineResponse2003
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-17T11:40:00.098774036Z[Etc/UTC]")

public class InlineResponse2003 {
  @SerializedName("data")
  private List<Refund> data = null;

  @SerializedName("has_more")
  private Boolean hasMore = null;

  @SerializedName("last_key")
  private UUID lastKey = null;

  public InlineResponse2003 data(List<Refund> data) {
    this.data = data;
    return this;
  }

  public InlineResponse2003 addDataItem(Refund dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Refund>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<Refund> getData() {
    return data;
  }

  public void setData(List<Refund> data) {
    this.data = data;
  }

  public InlineResponse2003 hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @Schema(description = "")
  public Boolean isHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public InlineResponse2003 lastKey(UUID lastKey) {
    this.lastKey = lastKey;
    return this;
  }

   /**
   * Get lastKey
   * @return lastKey
  **/
  @Schema(description = "")
  public UUID getLastKey() {
    return lastKey;
  }

  public void setLastKey(UUID lastKey) {
    this.lastKey = lastKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.data, inlineResponse2003.data) &&
        Objects.equals(this.hasMore, inlineResponse2003.hasMore) &&
        Objects.equals(this.lastKey, inlineResponse2003.lastKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, hasMore, lastKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    lastKey: ").append(toIndentedString(lastKey)).append("\n");
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
