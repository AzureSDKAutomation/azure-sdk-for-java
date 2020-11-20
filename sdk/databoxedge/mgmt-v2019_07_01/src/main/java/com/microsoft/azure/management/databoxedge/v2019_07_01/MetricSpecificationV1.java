/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metric specification version 1.
 */
public class MetricSpecificationV1 {
    /**
     * Name of the metric.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Display name of the metric.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Description of the metric to be displayed.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /**
     * Metric units. Possible values include: 'NotSpecified', 'Percent',
     * 'Count', 'Seconds', 'Milliseconds', 'Bytes', 'BytesPerSecond',
     * 'CountPerSecond'.
     */
    @JsonProperty(value = "unit")
    private MetricUnit unit;

    /**
     * Metric aggregation type. Possible values include: 'NotSpecified',
     * 'None', 'Average', 'Minimum', 'Maximum', 'Total', 'Count'.
     */
    @JsonProperty(value = "aggregationType")
    private MetricAggregationType aggregationType;

    /**
     * Metric dimensions, other than default dimension which is resource.
     */
    @JsonProperty(value = "dimensions")
    private List<MetricDimensionV1> dimensions;

    /**
     * Set true to fill the gaps with zero.
     */
    @JsonProperty(value = "fillGapWithZero")
    private Boolean fillGapWithZero;

    /**
     * Metric category. Possible values include: 'Capacity', 'Transaction'.
     */
    @JsonProperty(value = "category")
    private MetricCategory category;

    /**
     * Resource name override.
     */
    @JsonProperty(value = "resourceIdDimensionNameOverride")
    private String resourceIdDimensionNameOverride;

    /**
     * Support granularity of metrics.
     */
    @JsonProperty(value = "supportedTimeGrainTypes")
    private List<TimeGrain> supportedTimeGrainTypes;

    /**
     * Support metric aggregation type.
     */
    @JsonProperty(value = "supportedAggregationTypes")
    private List<MetricAggregationType> supportedAggregationTypes;

    /**
     * Get name of the metric.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the metric.
     *
     * @param name the name value to set
     * @return the MetricSpecificationV1 object itself.
     */
    public MetricSpecificationV1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get display name of the metric.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set display name of the metric.
     *
     * @param displayName the displayName value to set
     * @return the MetricSpecificationV1 object itself.
     */
    public MetricSpecificationV1 withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get description of the metric to be displayed.
     *
     * @return the displayDescription value
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set description of the metric to be displayed.
     *
     * @param displayDescription the displayDescription value to set
     * @return the MetricSpecificationV1 object itself.
     */
    public MetricSpecificationV1 withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get metric units. Possible values include: 'NotSpecified', 'Percent', 'Count', 'Seconds', 'Milliseconds', 'Bytes', 'BytesPerSecond', 'CountPerSecond'.
     *
     * @return the unit value
     */
    public MetricUnit unit() {
        return this.unit;
    }

    /**
     * Set metric units. Possible values include: 'NotSpecified', 'Percent', 'Count', 'Seconds', 'Milliseconds', 'Bytes', 'BytesPerSecond', 'CountPerSecond'.
     *
     * @param unit the unit value to set
     * @return the MetricSpecificationV1 object itself.
     */
    public MetricSpecificationV1 withUnit(MetricUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get metric aggregation type. Possible values include: 'NotSpecified', 'None', 'Average', 'Minimum', 'Maximum', 'Total', 'Count'.
     *
     * @return the aggregationType value
     */
    public MetricAggregationType aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set metric aggregation type. Possible values include: 'NotSpecified', 'None', 'Average', 'Minimum', 'Maximum', 'Total', 'Count'.
     *
     * @param aggregationType the aggregationType value to set
     * @return the MetricSpecificationV1 object itself.
     */
    public MetricSpecificationV1 withAggregationType(MetricAggregationType aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get metric dimensions, other than default dimension which is resource.
     *
     * @return the dimensions value
     */
    public List<MetricDimensionV1> dimensions() {
        return this.dimensions;
    }

    /**
     * Set metric dimensions, other than default dimension which is resource.
     *
     * @param dimensions the dimensions value to set
     * @return the MetricSpecificationV1 object itself.
     */
    public MetricSpecificationV1 withDimensions(List<MetricDimensionV1> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get set true to fill the gaps with zero.
     *
     * @return the fillGapWithZero value
     */
    public Boolean fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set set true to fill the gaps with zero.
     *
     * @param fillGapWithZero the fillGapWithZero value to set
     * @return the MetricSpecificationV1 object itself.
     */
    public MetricSpecificationV1 withFillGapWithZero(Boolean fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get metric category. Possible values include: 'Capacity', 'Transaction'.
     *
     * @return the category value
     */
    public MetricCategory category() {
        return this.category;
    }

    /**
     * Set metric category. Possible values include: 'Capacity', 'Transaction'.
     *
     * @param category the category value to set
     * @return the MetricSpecificationV1 object itself.
     */
    public MetricSpecificationV1 withCategory(MetricCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get resource name override.
     *
     * @return the resourceIdDimensionNameOverride value
     */
    public String resourceIdDimensionNameOverride() {
        return this.resourceIdDimensionNameOverride;
    }

    /**
     * Set resource name override.
     *
     * @param resourceIdDimensionNameOverride the resourceIdDimensionNameOverride value to set
     * @return the MetricSpecificationV1 object itself.
     */
    public MetricSpecificationV1 withResourceIdDimensionNameOverride(String resourceIdDimensionNameOverride) {
        this.resourceIdDimensionNameOverride = resourceIdDimensionNameOverride;
        return this;
    }

    /**
     * Get support granularity of metrics.
     *
     * @return the supportedTimeGrainTypes value
     */
    public List<TimeGrain> supportedTimeGrainTypes() {
        return this.supportedTimeGrainTypes;
    }

    /**
     * Set support granularity of metrics.
     *
     * @param supportedTimeGrainTypes the supportedTimeGrainTypes value to set
     * @return the MetricSpecificationV1 object itself.
     */
    public MetricSpecificationV1 withSupportedTimeGrainTypes(List<TimeGrain> supportedTimeGrainTypes) {
        this.supportedTimeGrainTypes = supportedTimeGrainTypes;
        return this;
    }

    /**
     * Get support metric aggregation type.
     *
     * @return the supportedAggregationTypes value
     */
    public List<MetricAggregationType> supportedAggregationTypes() {
        return this.supportedAggregationTypes;
    }

    /**
     * Set support metric aggregation type.
     *
     * @param supportedAggregationTypes the supportedAggregationTypes value to set
     * @return the MetricSpecificationV1 object itself.
     */
    public MetricSpecificationV1 withSupportedAggregationTypes(List<MetricAggregationType> supportedAggregationTypes) {
        this.supportedAggregationTypes = supportedAggregationTypes;
        return this;
    }

}
