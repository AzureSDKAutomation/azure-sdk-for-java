/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metric specification of operation.
 */
public class MetricSpecification {
    /**
     * Name of metric specification.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Display name of metric specification.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Display description of metric specification.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /**
     * Unit could be Bytes or Count.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Dimensions of blobs, including blob type and access tier.
     */
    @JsonProperty(value = "dimensions")
    private List<Dimension> dimensions;

    /**
     * Aggregation type could be Average.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /**
     * The property to decide fill gap with zero or not.
     */
    @JsonProperty(value = "fillGapWithZero")
    private Boolean fillGapWithZero;

    /**
     * The category this metric specification belong to, could be Capacity.
     */
    @JsonProperty(value = "category")
    private String category;

    /**
     * Account Resource Id.
     */
    @JsonProperty(value = "resourceIdDimensionNameOverride")
    private String resourceIdDimensionNameOverride;

    /**
     * Get name of metric specification.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of metric specification.
     *
     * @param name the name value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get display name of metric specification.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set display name of metric specification.
     *
     * @param displayName the displayName value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get display description of metric specification.
     *
     * @return the displayDescription value
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set display description of metric specification.
     *
     * @param displayDescription the displayDescription value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get unit could be Bytes or Count.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set unit could be Bytes or Count.
     *
     * @param unit the unit value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get dimensions of blobs, including blob type and access tier.
     *
     * @return the dimensions value
     */
    public List<Dimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set dimensions of blobs, including blob type and access tier.
     *
     * @param dimensions the dimensions value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get aggregation type could be Average.
     *
     * @return the aggregationType value
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set aggregation type could be Average.
     *
     * @param aggregationType the aggregationType value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the property to decide fill gap with zero or not.
     *
     * @return the fillGapWithZero value
     */
    public Boolean fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set the property to decide fill gap with zero or not.
     *
     * @param fillGapWithZero the fillGapWithZero value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withFillGapWithZero(Boolean fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get the category this metric specification belong to, could be Capacity.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category this metric specification belong to, could be Capacity.
     *
     * @param category the category value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get account Resource Id.
     *
     * @return the resourceIdDimensionNameOverride value
     */
    public String resourceIdDimensionNameOverride() {
        return this.resourceIdDimensionNameOverride;
    }

    /**
     * Set account Resource Id.
     *
     * @param resourceIdDimensionNameOverride the resourceIdDimensionNameOverride value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withResourceIdDimensionNameOverride(String resourceIdDimensionNameOverride) {
        this.resourceIdDimensionNameOverride = resourceIdDimensionNameOverride;
        return this;
    }

}
