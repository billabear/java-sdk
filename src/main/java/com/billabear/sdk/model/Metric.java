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
import com.billabear.sdk.model.MetricFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * Metric
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-25T11:57:02.849979787Z[Etc/UTC]")

public class Metric {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  /**
   * Gets or Sets aggregationMethod
   */
  @JsonAdapter(AggregationMethodEnum.Adapter.class)
  public enum AggregationMethodEnum {
    @SerializedName("count")
    COUNT("count"),
    @SerializedName("sum")
    SUM("sum"),
    @SerializedName("latest")
    LATEST("latest"),
    @SerializedName("unique_count")
    UNIQUE_COUNT("unique_count"),
    @SerializedName("max")
    MAX("max");

    private String value;

    AggregationMethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AggregationMethodEnum fromValue(String input) {
      for (AggregationMethodEnum b : AggregationMethodEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AggregationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AggregationMethodEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AggregationMethodEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AggregationMethodEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("aggregation_method")
  private AggregationMethodEnum aggregationMethod = null;

  @SerializedName("aggregation_property")
  private String aggregationProperty = null;

  @SerializedName("filters")
  private List<MetricFilter> filters = null;

  public Metric id(UUID id) {
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

  public Metric name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Revenue", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Metric code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(example = "code_one", description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Metric aggregationMethod(AggregationMethodEnum aggregationMethod) {
    this.aggregationMethod = aggregationMethod;
    return this;
  }

   /**
   * Get aggregationMethod
   * @return aggregationMethod
  **/
  @Schema(description = "")
  public AggregationMethodEnum getAggregationMethod() {
    return aggregationMethod;
  }

  public void setAggregationMethod(AggregationMethodEnum aggregationMethod) {
    this.aggregationMethod = aggregationMethod;
  }

  public Metric aggregationProperty(String aggregationProperty) {
    this.aggregationProperty = aggregationProperty;
    return this;
  }

   /**
   * Get aggregationProperty
   * @return aggregationProperty
  **/
  @Schema(description = "")
  public String getAggregationProperty() {
    return aggregationProperty;
  }

  public void setAggregationProperty(String aggregationProperty) {
    this.aggregationProperty = aggregationProperty;
  }

  public Metric filters(List<MetricFilter> filters) {
    this.filters = filters;
    return this;
  }

  public Metric addFiltersItem(MetricFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<MetricFilter>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @Schema(description = "")
  public List<MetricFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<MetricFilter> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metric metric = (Metric) o;
    return Objects.equals(this.id, metric.id) &&
        Objects.equals(this.name, metric.name) &&
        Objects.equals(this.code, metric.code) &&
        Objects.equals(this.aggregationMethod, metric.aggregationMethod) &&
        Objects.equals(this.aggregationProperty, metric.aggregationProperty) &&
        Objects.equals(this.filters, metric.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, aggregationMethod, aggregationProperty, filters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metric {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    aggregationMethod: ").append(toIndentedString(aggregationMethod)).append("\n");
    sb.append("    aggregationProperty: ").append(toIndentedString(aggregationProperty)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
