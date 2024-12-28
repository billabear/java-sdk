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
import io.swagger.client.model.Bool;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * SubscriptionStartBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-28T15:35:57.107133003Z[Etc/UTC]")

public class SubscriptionStartBody {
  @SerializedName("subscription_plan")
  private UUID subscriptionPlan = null;

  @SerializedName("payment_details")
  private UUID paymentDetails = null;

  @SerializedName("card_token")
  private String cardToken = null;

  @SerializedName("price")
  private UUID price = null;

  /**
   * The schedule of the plan that is to be started. Only used if price isn&#x27;t given. Requires currency as well.
   */
  @JsonAdapter(ScheduleEnum.Adapter.class)
  public enum ScheduleEnum {
    @SerializedName("week")
    WEEK("week"),
    @SerializedName("month")
    MONTH("month"),
    @SerializedName("year")
    YEAR("year"),
    @SerializedName("one-off")
    ONE_OFF("one-off");

    private String value;

    ScheduleEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ScheduleEnum fromValue(String input) {
      for (ScheduleEnum b : ScheduleEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ScheduleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScheduleEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ScheduleEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ScheduleEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("schedule")
  private ScheduleEnum schedule = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("seat_numbrers")
  private Integer seatNumbrers = null;

  @SerializedName("deny_trial")
  private Bool denyTrial = null;

  @SerializedName("metadata")
  private Object metadata = null;

  public SubscriptionStartBody subscriptionPlan(UUID subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
    return this;
  }

   /**
   * The ID for the subscription plan to be used (Can also be the code name)
   * @return subscriptionPlan
  **/
  @Schema(required = true, description = "The ID for the subscription plan to be used (Can also be the code name)")
  public UUID getSubscriptionPlan() {
    return subscriptionPlan;
  }

  public void setSubscriptionPlan(UUID subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
  }

  public SubscriptionStartBody paymentDetails(UUID paymentDetails) {
    this.paymentDetails = paymentDetails;
    return this;
  }

   /**
   * The Id for the customer&#x27;s payment details to be used
   * @return paymentDetails
  **/
  @Schema(description = "The Id for the customer's payment details to be used")
  public UUID getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(UUID paymentDetails) {
    this.paymentDetails = paymentDetails;
  }

  public SubscriptionStartBody cardToken(String cardToken) {
    this.cardToken = cardToken;
    return this;
  }

   /**
   * A stripe card token that&#x27;s been created using Stripe&#x27;s js sdk. It&#x27;ll create the payment details for the customer.
   * @return cardToken
  **/
  @Schema(description = "A stripe card token that's been created using Stripe's js sdk. It'll create the payment details for the customer.")
  public String getCardToken() {
    return cardToken;
  }

  public void setCardToken(String cardToken) {
    this.cardToken = cardToken;
  }

  public SubscriptionStartBody price(UUID price) {
    this.price = price;
    return this;
  }

   /**
   * The ID for the price to be used
   * @return price
  **/
  @Schema(description = "The ID for the price to be used")
  public UUID getPrice() {
    return price;
  }

  public void setPrice(UUID price) {
    this.price = price;
  }

  public SubscriptionStartBody schedule(ScheduleEnum schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * The schedule of the plan that is to be started. Only used if price isn&#x27;t given. Requires currency as well.
   * @return schedule
  **/
  @Schema(description = "The schedule of the plan that is to be started. Only used if price isn't given. Requires currency as well.")
  public ScheduleEnum getSchedule() {
    return schedule;
  }

  public void setSchedule(ScheduleEnum schedule) {
    this.schedule = schedule;
  }

  public SubscriptionStartBody currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the plan that is to be started. Only used if price isn&#x27;t given. Requires schedule as well.
   * @return currency
  **/
  @Schema(description = "The currency of the plan that is to be started. Only used if price isn't given. Requires schedule as well.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SubscriptionStartBody seatNumbrers(Integer seatNumbrers) {
    this.seatNumbrers = seatNumbrers;
    return this;
  }

   /**
   * Get seatNumbrers
   * @return seatNumbrers
  **/
  @Schema(example = "1", description = "")
  public Integer getSeatNumbrers() {
    return seatNumbrers;
  }

  public void setSeatNumbrers(Integer seatNumbrers) {
    this.seatNumbrers = seatNumbrers;
  }

  public SubscriptionStartBody denyTrial(Bool denyTrial) {
    this.denyTrial = denyTrial;
    return this;
  }

   /**
   * Get denyTrial
   * @return denyTrial
  **/
  @Schema(example = "true", description = "")
  public Bool getDenyTrial() {
    return denyTrial;
  }

  public void setDenyTrial(Bool denyTrial) {
    this.denyTrial = denyTrial;
  }

  public SubscriptionStartBody metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Any metadata you want to add to a subscription
   * @return metadata
  **/
  @Schema(description = "Any metadata you want to add to a subscription")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionStartBody subscriptionStartBody = (SubscriptionStartBody) o;
    return Objects.equals(this.subscriptionPlan, subscriptionStartBody.subscriptionPlan) &&
        Objects.equals(this.paymentDetails, subscriptionStartBody.paymentDetails) &&
        Objects.equals(this.cardToken, subscriptionStartBody.cardToken) &&
        Objects.equals(this.price, subscriptionStartBody.price) &&
        Objects.equals(this.schedule, subscriptionStartBody.schedule) &&
        Objects.equals(this.currency, subscriptionStartBody.currency) &&
        Objects.equals(this.seatNumbrers, subscriptionStartBody.seatNumbrers) &&
        Objects.equals(this.denyTrial, subscriptionStartBody.denyTrial) &&
        Objects.equals(this.metadata, subscriptionStartBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionPlan, paymentDetails, cardToken, price, schedule, currency, seatNumbrers, denyTrial, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionStartBody {\n");
    
    sb.append("    subscriptionPlan: ").append(toIndentedString(subscriptionPlan)).append("\n");
    sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    seatNumbrers: ").append(toIndentedString(seatNumbrers)).append("\n");
    sb.append("    denyTrial: ").append(toIndentedString(denyTrial)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
