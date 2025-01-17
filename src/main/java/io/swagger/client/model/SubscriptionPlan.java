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
import io.swagger.client.model.Feature;
import io.swagger.client.model.Limit;
import io.swagger.client.model.Price;
import io.swagger.client.model.Product;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * SubscriptionPlan
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-17T11:40:00.098774036Z[Etc/UTC]")

public class SubscriptionPlan {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("code_name")
  private String codeName = null;

  @SerializedName("user_count")
  private Integer userCount = null;

  @SerializedName("per_seat")
  private Boolean perSeat = null;

  @SerializedName("has_trial")
  private Boolean hasTrial = null;

  @SerializedName("is_trial_standalone")
  private Boolean isTrialStandalone = null;

  @SerializedName("free")
  private Boolean free = null;

  @SerializedName("public")
  private Boolean _public = null;

  @SerializedName("limits")
  private List<Limit> limits = null;

  @SerializedName("features")
  private List<Feature> features = null;

  @SerializedName("product")
  private Product product = null;

  @SerializedName("prices")
  private List<Price> prices = null;

  @SerializedName("trial_length_days")
  private Integer trialLengthDays = null;

  public SubscriptionPlan id(UUID id) {
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

  public SubscriptionPlan name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Plany McPlanFace", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionPlan codeName(String codeName) {
    this.codeName = codeName;
    return this;
  }

   /**
   * Get codeName
   * @return codeName
  **/
  @Schema(example = "mcplanface", description = "")
  public String getCodeName() {
    return codeName;
  }

  public void setCodeName(String codeName) {
    this.codeName = codeName;
  }

  public SubscriptionPlan userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * Get userCount
   * @return userCount
  **/
  @Schema(example = "10", description = "")
  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  public SubscriptionPlan perSeat(Boolean perSeat) {
    this.perSeat = perSeat;
    return this;
  }

   /**
   * Get perSeat
   * @return perSeat
  **/
  @Schema(example = "false", description = "")
  public Boolean isPerSeat() {
    return perSeat;
  }

  public void setPerSeat(Boolean perSeat) {
    this.perSeat = perSeat;
  }

  public SubscriptionPlan hasTrial(Boolean hasTrial) {
    this.hasTrial = hasTrial;
    return this;
  }

   /**
   * Get hasTrial
   * @return hasTrial
  **/
  @Schema(example = "true", description = "")
  public Boolean isHasTrial() {
    return hasTrial;
  }

  public void setHasTrial(Boolean hasTrial) {
    this.hasTrial = hasTrial;
  }

  public SubscriptionPlan isTrialStandalone(Boolean isTrialStandalone) {
    this.isTrialStandalone = isTrialStandalone;
    return this;
  }

   /**
   * Get isTrialStandalone
   * @return isTrialStandalone
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsTrialStandalone() {
    return isTrialStandalone;
  }

  public void setIsTrialStandalone(Boolean isTrialStandalone) {
    this.isTrialStandalone = isTrialStandalone;
  }

  public SubscriptionPlan free(Boolean free) {
    this.free = free;
    return this;
  }

   /**
   * Get free
   * @return free
  **/
  @Schema(example = "false", description = "")
  public Boolean isFree() {
    return free;
  }

  public void setFree(Boolean free) {
    this.free = free;
  }

  public SubscriptionPlan _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @Schema(example = "true", description = "")
  public Boolean isPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public SubscriptionPlan limits(List<Limit> limits) {
    this.limits = limits;
    return this;
  }

  public SubscriptionPlan addLimitsItem(Limit limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<Limit>();
    }
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @Schema(description = "")
  public List<Limit> getLimits() {
    return limits;
  }

  public void setLimits(List<Limit> limits) {
    this.limits = limits;
  }

  public SubscriptionPlan features(List<Feature> features) {
    this.features = features;
    return this;
  }

  public SubscriptionPlan addFeaturesItem(Feature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<Feature>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @Schema(description = "")
  public List<Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

  public SubscriptionPlan product(Product product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @Schema(description = "")
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public SubscriptionPlan prices(List<Price> prices) {
    this.prices = prices;
    return this;
  }

  public SubscriptionPlan addPricesItem(Price pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<Price>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @Schema(description = "")
  public List<Price> getPrices() {
    return prices;
  }

  public void setPrices(List<Price> prices) {
    this.prices = prices;
  }

  public SubscriptionPlan trialLengthDays(Integer trialLengthDays) {
    this.trialLengthDays = trialLengthDays;
    return this;
  }

   /**
   * Get trialLengthDays
   * @return trialLengthDays
  **/
  @Schema(description = "")
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
    SubscriptionPlan subscriptionPlan = (SubscriptionPlan) o;
    return Objects.equals(this.id, subscriptionPlan.id) &&
        Objects.equals(this.name, subscriptionPlan.name) &&
        Objects.equals(this.codeName, subscriptionPlan.codeName) &&
        Objects.equals(this.userCount, subscriptionPlan.userCount) &&
        Objects.equals(this.perSeat, subscriptionPlan.perSeat) &&
        Objects.equals(this.hasTrial, subscriptionPlan.hasTrial) &&
        Objects.equals(this.isTrialStandalone, subscriptionPlan.isTrialStandalone) &&
        Objects.equals(this.free, subscriptionPlan.free) &&
        Objects.equals(this._public, subscriptionPlan._public) &&
        Objects.equals(this.limits, subscriptionPlan.limits) &&
        Objects.equals(this.features, subscriptionPlan.features) &&
        Objects.equals(this.product, subscriptionPlan.product) &&
        Objects.equals(this.prices, subscriptionPlan.prices) &&
        Objects.equals(this.trialLengthDays, subscriptionPlan.trialLengthDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, codeName, userCount, perSeat, hasTrial, isTrialStandalone, free, _public, limits, features, product, prices, trialLengthDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    codeName: ").append(toIndentedString(codeName)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    perSeat: ").append(toIndentedString(perSeat)).append("\n");
    sb.append("    hasTrial: ").append(toIndentedString(hasTrial)).append("\n");
    sb.append("    isTrialStandalone: ").append(toIndentedString(isTrialStandalone)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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
