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
import org.threeten.bp.LocalDate;
/**
 * SubscriptionIdCancelBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-07-21T17:32:45.393056317Z[Etc/UTC]")

public class SubscriptionIdCancelBody {
  /**
   * Gets or Sets when
   */
  @JsonAdapter(WhenEnum.Adapter.class)
  public enum WhenEnum {
    @SerializedName("end-of-run")
    END_OF_RUN("end-of-run"),
    @SerializedName("instantly")
    INSTANTLY("instantly"),
    @SerializedName("specific-date")
    SPECIFIC_DATE("specific-date");

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
  private WhenEnum when = WhenEnum.END_OF_RUN;

  /**
   * Gets or Sets refundType
   */
  @JsonAdapter(RefundTypeEnum.Adapter.class)
  public enum RefundTypeEnum {
    @SerializedName("none")
    NONE("none"),
    @SerializedName("full")
    FULL("full"),
    @SerializedName("prorate")
    PRORATE("prorate");

    private String value;

    RefundTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RefundTypeEnum fromValue(String input) {
      for (RefundTypeEnum b : RefundTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RefundTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefundTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RefundTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RefundTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("refund_type")
  private RefundTypeEnum refundType = RefundTypeEnum.NONE;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("comment")
  private String comment = null;

  public SubscriptionIdCancelBody when(WhenEnum when) {
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

  public SubscriptionIdCancelBody refundType(RefundTypeEnum refundType) {
    this.refundType = refundType;
    return this;
  }

   /**
   * Get refundType
   * @return refundType
  **/
  @Schema(required = true, description = "")
  public RefundTypeEnum getRefundType() {
    return refundType;
  }

  public void setRefundType(RefundTypeEnum refundType) {
    this.refundType = refundType;
  }

  public SubscriptionIdCancelBody date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public SubscriptionIdCancelBody comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionIdCancelBody subscriptionIdCancelBody = (SubscriptionIdCancelBody) o;
    return Objects.equals(this.when, subscriptionIdCancelBody.when) &&
        Objects.equals(this.refundType, subscriptionIdCancelBody.refundType) &&
        Objects.equals(this.date, subscriptionIdCancelBody.date) &&
        Objects.equals(this.comment, subscriptionIdCancelBody.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(when, refundType, date, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionIdCancelBody {\n");
    
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    refundType: ").append(toIndentedString(refundType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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