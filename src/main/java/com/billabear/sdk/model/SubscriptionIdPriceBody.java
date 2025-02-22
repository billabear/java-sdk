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

package com.billabear.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.billabear.sdk.model.Uuid;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SubscriptionIdPriceBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-25T11:57:02.849979787Z[Etc/UTC]")

public class SubscriptionIdPriceBody {
  @SerializedName("price")
  private Uuid price = null;

  /**
   * Gets or Sets when
   */
  @JsonAdapter(WhenEnum.Adapter.class)
  public enum WhenEnum {
    @SerializedName("next_cycle")
    NEXT_CYCLE("next_cycle"),
    @SerializedName("instantly")
    INSTANTLY("instantly");

    private String value;

    WhenEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static WhenEnum fromValue(String input) {
      for (WhenEnum b : WhenEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<WhenEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WhenEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public WhenEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return WhenEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("when")
  private WhenEnum when = null;

  public SubscriptionIdPriceBody price(Uuid price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(required = true, description = "")
  public Uuid getPrice() {
    return price;
  }

  public void setPrice(Uuid price) {
    this.price = price;
  }

  public SubscriptionIdPriceBody when(WhenEnum when) {
    this.when = when;
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @Schema(required = true, description = "")
  public WhenEnum getWhen() {
    return when;
  }

  public void setWhen(WhenEnum when) {
    this.when = when;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionIdPriceBody subscriptionIdPriceBody = (SubscriptionIdPriceBody) o;
    return Objects.equals(this.price, subscriptionIdPriceBody.price) &&
        Objects.equals(this.when, subscriptionIdPriceBody.when);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, when);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionIdPriceBody {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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
