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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * SubscriptionIdPlanBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-07-21T17:32:45.393056317Z[Etc/UTC]")

public class SubscriptionIdPlanBody {
  /**
   * Gets or Sets when
   */
  @JsonAdapter(WhenEnum.Adapter.class)
  public enum WhenEnum {
    @SerializedName("instantly")
    INSTANTLY("instantly"),
    @SerializedName("next-cycle")
    NEXT_CYCLE("next-cycle");

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

  @SerializedName("plan")
  private UUID plan = null;

  @SerializedName("price")
  private UUID price = null;

  public SubscriptionIdPlanBody when(WhenEnum when) {
    this.when = when;
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @Schema(example = "instantly", required = true, description = "")
  public WhenEnum getWhen() {
    return when;
  }

  public void setWhen(WhenEnum when) {
    this.when = when;
  }

  public SubscriptionIdPlanBody plan(UUID plan) {
    this.plan = plan;
    return this;
  }

   /**
   * The ID for the subscription plan to be used
   * @return plan
  **/
  @Schema(description = "The ID for the subscription plan to be used")
  public UUID getPlan() {
    return plan;
  }

  public void setPlan(UUID plan) {
    this.plan = plan;
  }

  public SubscriptionIdPlanBody price(UUID price) {
    this.price = price;
    return this;
  }

   /**
   * The ID for the price to be used
   * @return price
  **/
  @Schema(required = true, description = "The ID for the price to be used")
  public UUID getPrice() {
    return price;
  }

  public void setPrice(UUID price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionIdPlanBody subscriptionIdPlanBody = (SubscriptionIdPlanBody) o;
    return Objects.equals(this.when, subscriptionIdPlanBody.when) &&
        Objects.equals(this.plan, subscriptionIdPlanBody.plan) &&
        Objects.equals(this.price, subscriptionIdPlanBody.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(when, plan, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionIdPlanBody {\n");
    
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
