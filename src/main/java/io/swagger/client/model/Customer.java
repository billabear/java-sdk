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
import io.swagger.client.model.Address;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * Customer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-17T11:40:00.098774036Z[Etc/UTC]")

public class Customer {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("tax_number")
  private String taxNumber = null;

  @SerializedName("standard_tax_rate")
  private Float standardTaxRate = null;

  @SerializedName("digital_tax_rate")
  private Float digitalTaxRate = null;

  /**
   * Choice between card and invoice
   */
  @JsonAdapter(BillingTypeEnum.Adapter.class)
  public enum BillingTypeEnum {
    @SerializedName("card")
    CARD("card"),
    @SerializedName("invoice")
    INVOICE("invoice");

    private String value;

    BillingTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BillingTypeEnum fromValue(String input) {
      for (BillingTypeEnum b : BillingTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BillingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BillingTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public BillingTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return BillingTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("billing_type")
  private BillingTypeEnum billingType = null;

  /**
   * Choice between &#x27;individual&#x27; and &#x27;business&#x27;. When not provided &#x27;individual&#x27; is used. &lt;strong&gt;Since 1.1&lt;/strong&gt;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("individual")
    INDIVIDUAL("individual"),
    @SerializedName("business")
    BUSINESS("business");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("external_reference")
  private String externalReference = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("brand")
  private String brand = null;

  /**
   * Choice between &#x27;pdf&#x27; and &#x27;xrechnung&#x27;. &lt;strong&gt;Since 2024.02.01&lt;/strong&gt;
   */
  @JsonAdapter(InvoiceFormatEnum.Adapter.class)
  public enum InvoiceFormatEnum {
    @SerializedName("pdf")
    PDF("pdf"),
    @SerializedName("xrechnung")
    XRECHNUNG("xrechnung");

    private String value;

    InvoiceFormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InvoiceFormatEnum fromValue(String input) {
      for (InvoiceFormatEnum b : InvoiceFormatEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InvoiceFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InvoiceFormatEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public InvoiceFormatEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InvoiceFormatEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("invoice_format")
  private InvoiceFormatEnum invoiceFormat = null;

  @SerializedName("marketing_opt_in")
  private Boolean marketingOptIn = null;

  public Customer id(UUID id) {
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

  public Customer email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(example = "iain.cambridge@example.org", required = true, description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer taxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
    return this;
  }

   /**
   * The tax number for the customer &lt;strong&gt;Since 1.1&lt;/strong&gt;
   * @return taxNumber
  **/
  @Schema(example = "GB459324", description = "The tax number for the customer <strong>Since 1.1</strong>")
  public String getTaxNumber() {
    return taxNumber;
  }

  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }

  public Customer standardTaxRate(Float standardTaxRate) {
    this.standardTaxRate = standardTaxRate;
    return this;
  }

   /**
   * The tax rate for the customer on for standard services a &lt;strong&gt;Since 1.1&lt;/strong&gt;
   * @return standardTaxRate
  **/
  @Schema(example = "15", description = "The tax rate for the customer on for standard services a <strong>Since 1.1</strong>")
  public Float getStandardTaxRate() {
    return standardTaxRate;
  }

  public void setStandardTaxRate(Float standardTaxRate) {
    this.standardTaxRate = standardTaxRate;
  }

  public Customer digitalTaxRate(Float digitalTaxRate) {
    this.digitalTaxRate = digitalTaxRate;
    return this;
  }

   /**
   * The tax rate for the customer on digital services &lt;strong&gt;Since 1.1&lt;/strong&gt;
   * @return digitalTaxRate
  **/
  @Schema(example = "19.5", description = "The tax rate for the customer on digital services <strong>Since 1.1</strong>")
  public Float getDigitalTaxRate() {
    return digitalTaxRate;
  }

  public void setDigitalTaxRate(Float digitalTaxRate) {
    this.digitalTaxRate = digitalTaxRate;
  }

  public Customer billingType(BillingTypeEnum billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Choice between card and invoice
   * @return billingType
  **/
  @Schema(example = "card", description = "Choice between card and invoice")
  public BillingTypeEnum getBillingType() {
    return billingType;
  }

  public void setBillingType(BillingTypeEnum billingType) {
    this.billingType = billingType;
  }

  public Customer type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Choice between &#x27;individual&#x27; and &#x27;business&#x27;. When not provided &#x27;individual&#x27; is used. &lt;strong&gt;Since 1.1&lt;/strong&gt;
   * @return type
  **/
  @Schema(example = "business", description = "Choice between 'individual' and 'business'. When not provided 'individual' is used. <strong>Since 1.1</strong>")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Customer reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @Schema(example = "internal-id", description = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Customer externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

   /**
   * Get externalReference
   * @return externalReference
  **/
  @Schema(description = "")
  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public Customer address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Customer locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Defaults to &#x27;en&#x27; if not sent.
   * @return locale
  **/
  @Schema(example = "en", description = "Defaults to 'en' if not sent.")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Customer brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Defaults to &#x27;default&#x27; if not sent.
   * @return brand
  **/
  @Schema(example = "default", description = "Defaults to 'default' if not sent.")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Customer invoiceFormat(InvoiceFormatEnum invoiceFormat) {
    this.invoiceFormat = invoiceFormat;
    return this;
  }

   /**
   * Choice between &#x27;pdf&#x27; and &#x27;xrechnung&#x27;. &lt;strong&gt;Since 2024.02.01&lt;/strong&gt;
   * @return invoiceFormat
  **/
  @Schema(example = "pdf", description = "Choice between 'pdf' and 'xrechnung'. <strong>Since 2024.02.01</strong>")
  public InvoiceFormatEnum getInvoiceFormat() {
    return invoiceFormat;
  }

  public void setInvoiceFormat(InvoiceFormatEnum invoiceFormat) {
    this.invoiceFormat = invoiceFormat;
  }

  public Customer marketingOptIn(Boolean marketingOptIn) {
    this.marketingOptIn = marketingOptIn;
    return this;
  }

   /**
   * If the customer has opted in for marketing
   * @return marketingOptIn
  **/
  @Schema(description = "If the customer has opted in for marketing")
  public Boolean isMarketingOptIn() {
    return marketingOptIn;
  }

  public void setMarketingOptIn(Boolean marketingOptIn) {
    this.marketingOptIn = marketingOptIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.taxNumber, customer.taxNumber) &&
        Objects.equals(this.standardTaxRate, customer.standardTaxRate) &&
        Objects.equals(this.digitalTaxRate, customer.digitalTaxRate) &&
        Objects.equals(this.billingType, customer.billingType) &&
        Objects.equals(this.type, customer.type) &&
        Objects.equals(this.reference, customer.reference) &&
        Objects.equals(this.externalReference, customer.externalReference) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.locale, customer.locale) &&
        Objects.equals(this.brand, customer.brand) &&
        Objects.equals(this.invoiceFormat, customer.invoiceFormat) &&
        Objects.equals(this.marketingOptIn, customer.marketingOptIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, taxNumber, standardTaxRate, digitalTaxRate, billingType, type, reference, externalReference, address, locale, brand, invoiceFormat, marketingOptIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("    standardTaxRate: ").append(toIndentedString(standardTaxRate)).append("\n");
    sb.append("    digitalTaxRate: ").append(toIndentedString(digitalTaxRate)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    invoiceFormat: ").append(toIndentedString(invoiceFormat)).append("\n");
    sb.append("    marketingOptIn: ").append(toIndentedString(marketingOptIn)).append("\n");
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
