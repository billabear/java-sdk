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
import io.swagger.client.model.Price;
import io.swagger.client.model.SubscriptionPlan;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * InlineResponse201Lines
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-07-21T17:32:45.393056317Z[Etc/UTC]")

public class InlineResponse201Lines {
  @SerializedName("subscription_plan")
  private SubscriptionPlan subscriptionPlan = null;

  @SerializedName("price")
  private Price price = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("seat_number")
  private Integer seatNumber = null;

  @SerializedName("sub_total")
  private Integer subTotal = null;

  @SerializedName("tax_total")
  private Integer taxTotal = null;

  @SerializedName("tax_rate")
  private BigDecimal taxRate = null;

  public InlineResponse201Lines subscriptionPlan(SubscriptionPlan subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
    return this;
  }

   /**
   * Get subscriptionPlan
   * @return subscriptionPlan
  **/
  @Schema(description = "")
  public SubscriptionPlan getSubscriptionPlan() {
    return subscriptionPlan;
  }

  public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
  }

  public InlineResponse201Lines price(Price price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public InlineResponse201Lines description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InlineResponse201Lines currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public InlineResponse201Lines seatNumber(Integer seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

   /**
   * Get seatNumber
   * @return seatNumber
  **/
  @Schema(description = "")
  public Integer getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(Integer seatNumber) {
    this.seatNumber = seatNumber;
  }

  public InlineResponse201Lines subTotal(Integer subTotal) {
    this.subTotal = subTotal;
    return this;
  }

   /**
   * Get subTotal
   * @return subTotal
  **/
  @Schema(description = "")
  public Integer getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Integer subTotal) {
    this.subTotal = subTotal;
  }

  public InlineResponse201Lines taxTotal(Integer taxTotal) {
    this.taxTotal = taxTotal;
    return this;
  }

   /**
   * Get taxTotal
   * @return taxTotal
  **/
  @Schema(description = "")
  public Integer getTaxTotal() {
    return taxTotal;
  }

  public void setTaxTotal(Integer taxTotal) {
    this.taxTotal = taxTotal;
  }

  public InlineResponse201Lines taxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * @return taxRate
  **/
  @Schema(description = "")
  public BigDecimal getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201Lines inlineResponse201Lines = (InlineResponse201Lines) o;
    return Objects.equals(this.subscriptionPlan, inlineResponse201Lines.subscriptionPlan) &&
        Objects.equals(this.price, inlineResponse201Lines.price) &&
        Objects.equals(this.description, inlineResponse201Lines.description) &&
        Objects.equals(this.currency, inlineResponse201Lines.currency) &&
        Objects.equals(this.seatNumber, inlineResponse201Lines.seatNumber) &&
        Objects.equals(this.subTotal, inlineResponse201Lines.subTotal) &&
        Objects.equals(this.taxTotal, inlineResponse201Lines.taxTotal) &&
        Objects.equals(this.taxRate, inlineResponse201Lines.taxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionPlan, price, description, currency, seatNumber, subTotal, taxTotal, taxRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201Lines {\n");
    
    sb.append("    subscriptionPlan: ").append(toIndentedString(subscriptionPlan)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    taxTotal: ").append(toIndentedString(taxTotal)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
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