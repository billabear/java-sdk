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
import com.billabear.sdk.model.Price;
import com.billabear.sdk.model.SubscriptionPlan;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * Subscription
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-25T11:57:02.849979787Z[Etc/UTC]")

public class Subscription {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("seat_number")
  private Integer seatNumber = null;

  @SerializedName("schedule")
  private String schedule = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("ended_at")
  private String endedAt = null;

  @SerializedName("valid_until")
  private String validUntil = null;

  @SerializedName("main_external_reference")
  private String mainExternalReference = null;

  @SerializedName("child_external_reference")
  private String childExternalReference = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("price")
  private Price price = null;

  @SerializedName("plan")
  private SubscriptionPlan plan = null;

  public Subscription id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Subscription seatNumber(Integer seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

   /**
   * Get seatNumber
   * @return seatNumber
  **/
  @Schema(example = "1", description = "")
  public Integer getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(Integer seatNumber) {
    this.seatNumber = seatNumber;
  }

  public Subscription schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @Schema(example = "month", description = "")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public Subscription status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Subscription createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Subscription updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Subscription endedAt(String endedAt) {
    this.endedAt = endedAt;
    return this;
  }

   /**
   * Get endedAt
   * @return endedAt
  **/
  @Schema(description = "")
  public String getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(String endedAt) {
    this.endedAt = endedAt;
  }

  public Subscription validUntil(String validUntil) {
    this.validUntil = validUntil;
    return this;
  }

   /**
   * Get validUntil
   * @return validUntil
  **/
  @Schema(description = "")
  public String getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(String validUntil) {
    this.validUntil = validUntil;
  }

  public Subscription mainExternalReference(String mainExternalReference) {
    this.mainExternalReference = mainExternalReference;
    return this;
  }

   /**
   * Get mainExternalReference
   * @return mainExternalReference
  **/
  @Schema(description = "")
  public String getMainExternalReference() {
    return mainExternalReference;
  }

  public void setMainExternalReference(String mainExternalReference) {
    this.mainExternalReference = mainExternalReference;
  }

  public Subscription childExternalReference(String childExternalReference) {
    this.childExternalReference = childExternalReference;
    return this;
  }

   /**
   * Get childExternalReference
   * @return childExternalReference
  **/
  @Schema(description = "")
  public String getChildExternalReference() {
    return childExternalReference;
  }

  public void setChildExternalReference(String childExternalReference) {
    this.childExternalReference = childExternalReference;
  }

  public Subscription metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public Subscription price(Price price) {
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

  public Subscription plan(SubscriptionPlan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @Schema(description = "")
  public SubscriptionPlan getPlan() {
    return plan;
  }

  public void setPlan(SubscriptionPlan plan) {
    this.plan = plan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.seatNumber, subscription.seatNumber) &&
        Objects.equals(this.schedule, subscription.schedule) &&
        Objects.equals(this.status, subscription.status) &&
        Objects.equals(this.createdAt, subscription.createdAt) &&
        Objects.equals(this.updatedAt, subscription.updatedAt) &&
        Objects.equals(this.endedAt, subscription.endedAt) &&
        Objects.equals(this.validUntil, subscription.validUntil) &&
        Objects.equals(this.mainExternalReference, subscription.mainExternalReference) &&
        Objects.equals(this.childExternalReference, subscription.childExternalReference) &&
        Objects.equals(this.metadata, subscription.metadata) &&
        Objects.equals(this.price, subscription.price) &&
        Objects.equals(this.plan, subscription.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, seatNumber, schedule, status, createdAt, updatedAt, endedAt, validUntil, mainExternalReference, childExternalReference, metadata, price, plan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    mainExternalReference: ").append(toIndentedString(mainExternalReference)).append("\n");
    sb.append("    childExternalReference: ").append(toIndentedString(childExternalReference)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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
