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
 * CheckoutSubscriptions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-28T15:35:57.107133003Z[Etc/UTC]")

public class CheckoutSubscriptions {
  @SerializedName("plan")
  private String plan = null;

  @SerializedName("price")
  private String price = null;

  @SerializedName("seat_number")
  private Integer seatNumber = null;

  public CheckoutSubscriptions plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @Schema(description = "")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public CheckoutSubscriptions price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public CheckoutSubscriptions seatNumber(Integer seatNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutSubscriptions checkoutSubscriptions = (CheckoutSubscriptions) o;
    return Objects.equals(this.plan, checkoutSubscriptions.plan) &&
        Objects.equals(this.price, checkoutSubscriptions.price) &&
        Objects.equals(this.seatNumber, checkoutSubscriptions.seatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plan, price, seatNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutSubscriptions {\n");
    
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
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
