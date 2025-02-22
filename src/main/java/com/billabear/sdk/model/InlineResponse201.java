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
import com.billabear.sdk.model.BillingAdmin;
import com.billabear.sdk.model.Customer;
import com.billabear.sdk.model.InlineResponse201Lines;
import com.billabear.sdk.model.Uuid;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse201
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-25T11:57:02.849979787Z[Etc/UTC]")

public class InlineResponse201 {
  @SerializedName("id")
  private Uuid id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("customer")
  private Customer customer = null;

  @SerializedName("billing_admin")
  private BillingAdmin billingAdmin = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("sub_total")
  private Integer subTotal = null;

  @SerializedName("tax_total")
  private Integer taxTotal = null;

  @SerializedName("lines")
  private List<InlineResponse201Lines> lines = null;

  public InlineResponse201 id(Uuid id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public Uuid getId() {
    return id;
  }

  public void setId(Uuid id) {
    this.id = id;
  }

  public InlineResponse201 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse201 currency(String currency) {
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

  public InlineResponse201 customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @Schema(description = "")
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public InlineResponse201 billingAdmin(BillingAdmin billingAdmin) {
    this.billingAdmin = billingAdmin;
    return this;
  }

   /**
   * Get billingAdmin
   * @return billingAdmin
  **/
  @Schema(description = "")
  public BillingAdmin getBillingAdmin() {
    return billingAdmin;
  }

  public void setBillingAdmin(BillingAdmin billingAdmin) {
    this.billingAdmin = billingAdmin;
  }

  public InlineResponse201 total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public InlineResponse201 subTotal(Integer subTotal) {
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

  public InlineResponse201 taxTotal(Integer taxTotal) {
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

  public InlineResponse201 lines(List<InlineResponse201Lines> lines) {
    this.lines = lines;
    return this;
  }

  public InlineResponse201 addLinesItem(InlineResponse201Lines linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<InlineResponse201Lines>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @Schema(description = "")
  public List<InlineResponse201Lines> getLines() {
    return lines;
  }

  public void setLines(List<InlineResponse201Lines> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201 inlineResponse201 = (InlineResponse201) o;
    return Objects.equals(this.id, inlineResponse201.id) &&
        Objects.equals(this.name, inlineResponse201.name) &&
        Objects.equals(this.currency, inlineResponse201.currency) &&
        Objects.equals(this.customer, inlineResponse201.customer) &&
        Objects.equals(this.billingAdmin, inlineResponse201.billingAdmin) &&
        Objects.equals(this.total, inlineResponse201.total) &&
        Objects.equals(this.subTotal, inlineResponse201.subTotal) &&
        Objects.equals(this.taxTotal, inlineResponse201.taxTotal) &&
        Objects.equals(this.lines, inlineResponse201.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, currency, customer, billingAdmin, total, subTotal, taxTotal, lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    billingAdmin: ").append(toIndentedString(billingAdmin)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    taxTotal: ").append(toIndentedString(taxTotal)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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
