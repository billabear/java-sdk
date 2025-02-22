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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * SubscriptionTrialBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-25T11:57:02.849979787Z[Etc/UTC]")

public class SubscriptionTrialBody {
  @SerializedName("subscription_plan")
  private UUID subscriptionPlan = null;

  @SerializedName("card_token")
  private String cardToken = null;

  @SerializedName("seat_numbrers")
  private Integer seatNumbrers = null;

  @SerializedName("trial_length_days")
  private Integer trialLengthDays = null;

  public SubscriptionTrialBody subscriptionPlan(UUID subscriptionPlan) {
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

  public SubscriptionTrialBody cardToken(String cardToken) {
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

  public SubscriptionTrialBody seatNumbrers(Integer seatNumbrers) {
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

  public SubscriptionTrialBody trialLengthDays(Integer trialLengthDays) {
    this.trialLengthDays = trialLengthDays;
    return this;
  }

   /**
   * Get trialLengthDays
   * @return trialLengthDays
  **/
  @Schema(example = "1", description = "")
  public Integer getTrialLengthDays() {
    return trialLengthDays;
  }

  public void setTrialLengthDays(Integer trialLengthDays) {
    this.trialLengthDays = trialLengthDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionTrialBody subscriptionTrialBody = (SubscriptionTrialBody) o;
    return Objects.equals(this.subscriptionPlan, subscriptionTrialBody.subscriptionPlan) &&
        Objects.equals(this.cardToken, subscriptionTrialBody.cardToken) &&
        Objects.equals(this.seatNumbrers, subscriptionTrialBody.seatNumbrers) &&
        Objects.equals(this.trialLengthDays, subscriptionTrialBody.trialLengthDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionPlan, cardToken, seatNumbrers, trialLengthDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionTrialBody {\n");
    
    sb.append("    subscriptionPlan: ").append(toIndentedString(subscriptionPlan)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    seatNumbrers: ").append(toIndentedString(seatNumbrers)).append("\n");
    sb.append("    trialLengthDays: ").append(toIndentedString(trialLengthDays)).append("\n");
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
