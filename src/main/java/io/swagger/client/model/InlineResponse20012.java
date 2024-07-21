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
/**
 * InlineResponse20012
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-07-21T17:32:45.393056317Z[Etc/UTC]")

public class InlineResponse20012 {
  @SerializedName("paid")
  private Boolean paid = null;

  /**
   * Gets or Sets failureReason
   */
  @JsonAdapter(FailureReasonEnum.Adapter.class)
  public enum FailureReasonEnum {
    @SerializedName("expired_card")
    EXPIRED_CARD("expired_card"),
    @SerializedName("invalid_details")
    INVALID_DETAILS("invalid_details"),
    @SerializedName("fraud")
    FRAUD("fraud"),
    @SerializedName("authentication_required")
    AUTHENTICATION_REQUIRED("authentication_required"),
    @SerializedName("invalid_card")
    INVALID_CARD("invalid_card"),
    @SerializedName("general_decline")
    GENERAL_DECLINE("general_decline"),
    @SerializedName("contact_provider")
    CONTACT_PROVIDER("contact_provider"),
    @SerializedName("lack_of_funds")
    LACK_OF_FUNDS("lack_of_funds");

    private String value;

    FailureReasonEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FailureReasonEnum fromValue(String input) {
      for (FailureReasonEnum b : FailureReasonEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FailureReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FailureReasonEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FailureReasonEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FailureReasonEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("failure_reason")
  private FailureReasonEnum failureReason = null;

  public InlineResponse20012 paid(Boolean paid) {
    this.paid = paid;
    return this;
  }

   /**
   * Get paid
   * @return paid
  **/
  @Schema(description = "")
  public Boolean isPaid() {
    return paid;
  }

  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  public InlineResponse20012 failureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @Schema(description = "")
  public FailureReasonEnum getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012 inlineResponse20012 = (InlineResponse20012) o;
    return Objects.equals(this.paid, inlineResponse20012.paid) &&
        Objects.equals(this.failureReason, inlineResponse20012.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paid, failureReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012 {\n");
    
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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
