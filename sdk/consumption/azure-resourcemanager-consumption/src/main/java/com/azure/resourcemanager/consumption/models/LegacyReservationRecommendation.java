// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.models.ReservationRecommendationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Legacy reservation recommendation. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("legacy")
@JsonFlatten
@Immutable
public class LegacyReservationRecommendation extends ReservationRecommendationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LegacyReservationRecommendation.class);

    /*
     * The number of days of usage to look back for recommendation.
     */
    @JsonProperty(value = "properties.lookBackPeriod", access = JsonProperty.Access.WRITE_ONLY)
    private String lookBackPeriod;

    /*
     * The instance Flexibility Ratio.
     */
    @JsonProperty(value = "properties.instanceFlexibilityRatio", access = JsonProperty.Access.WRITE_ONLY)
    private Float instanceFlexibilityRatio;

    /*
     * The instance Flexibility Group.
     */
    @JsonProperty(value = "properties.instanceFlexibilityGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceFlexibilityGroup;

    /*
     * The normalized Size.
     */
    @JsonProperty(value = "properties.normalizedSize", access = JsonProperty.Access.WRITE_ONLY)
    private String normalizedSize;

    /*
     * The recommended Quantity Normalized.
     */
    @JsonProperty(value = "properties.recommendedQuantityNormalized", access = JsonProperty.Access.WRITE_ONLY)
    private Float recommendedQuantityNormalized;

    /*
     * The meter id (GUID)
     */
    @JsonProperty(value = "properties.meterId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID meterId;

    /*
     * RI recommendations in one or three year terms.
     */
    @JsonProperty(value = "properties.term", access = JsonProperty.Access.WRITE_ONLY)
    private String term;

    /*
     * The total amount of cost without reserved instances.
     */
    @JsonProperty(value = "properties.costWithNoReservedInstances", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal costWithNoReservedInstances;

    /*
     * Recommended quality for reserved instances.
     */
    @JsonProperty(value = "properties.recommendedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal recommendedQuantity;

    /*
     * The total amount of cost with reserved instances.
     */
    @JsonProperty(value = "properties.totalCostWithReservedInstances", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalCostWithReservedInstances;

    /*
     * Total estimated savings with reserved instances.
     */
    @JsonProperty(value = "properties.netSavings", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal netSavings;

    /*
     * The usage date for looking back.
     */
    @JsonProperty(value = "properties.firstUsageDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime firstUsageDate;

    /*
     * Shared or single recommendation.
     */
    @JsonProperty(value = "properties.scope", access = JsonProperty.Access.WRITE_ONLY)
    private String scope;

    /*
     * List of sku properties
     */
    @JsonProperty(value = "properties.skuProperties", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuProperty> skuProperties;

    /**
     * Get the lookBackPeriod property: The number of days of usage to look back for recommendation.
     *
     * @return the lookBackPeriod value.
     */
    public String lookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * Get the instanceFlexibilityRatio property: The instance Flexibility Ratio.
     *
     * @return the instanceFlexibilityRatio value.
     */
    public Float instanceFlexibilityRatio() {
        return this.instanceFlexibilityRatio;
    }

    /**
     * Get the instanceFlexibilityGroup property: The instance Flexibility Group.
     *
     * @return the instanceFlexibilityGroup value.
     */
    public String instanceFlexibilityGroup() {
        return this.instanceFlexibilityGroup;
    }

    /**
     * Get the normalizedSize property: The normalized Size.
     *
     * @return the normalizedSize value.
     */
    public String normalizedSize() {
        return this.normalizedSize;
    }

    /**
     * Get the recommendedQuantityNormalized property: The recommended Quantity Normalized.
     *
     * @return the recommendedQuantityNormalized value.
     */
    public Float recommendedQuantityNormalized() {
        return this.recommendedQuantityNormalized;
    }

    /**
     * Get the meterId property: The meter id (GUID).
     *
     * @return the meterId value.
     */
    public UUID meterId() {
        return this.meterId;
    }

    /**
     * Get the term property: RI recommendations in one or three year terms.
     *
     * @return the term value.
     */
    public String term() {
        return this.term;
    }

    /**
     * Get the costWithNoReservedInstances property: The total amount of cost without reserved instances.
     *
     * @return the costWithNoReservedInstances value.
     */
    public BigDecimal costWithNoReservedInstances() {
        return this.costWithNoReservedInstances;
    }

    /**
     * Get the recommendedQuantity property: Recommended quality for reserved instances.
     *
     * @return the recommendedQuantity value.
     */
    public BigDecimal recommendedQuantity() {
        return this.recommendedQuantity;
    }

    /**
     * Get the totalCostWithReservedInstances property: The total amount of cost with reserved instances.
     *
     * @return the totalCostWithReservedInstances value.
     */
    public BigDecimal totalCostWithReservedInstances() {
        return this.totalCostWithReservedInstances;
    }

    /**
     * Get the netSavings property: Total estimated savings with reserved instances.
     *
     * @return the netSavings value.
     */
    public BigDecimal netSavings() {
        return this.netSavings;
    }

    /**
     * Get the firstUsageDate property: The usage date for looking back.
     *
     * @return the firstUsageDate value.
     */
    public OffsetDateTime firstUsageDate() {
        return this.firstUsageDate;
    }

    /**
     * Get the scope property: Shared or single recommendation.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Get the skuProperties property: List of sku properties.
     *
     * @return the skuProperties value.
     */
    public List<SkuProperty> skuProperties() {
        return this.skuProperties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (skuProperties() != null) {
            skuProperties().forEach(e -> e.validate());
        }
    }
}
