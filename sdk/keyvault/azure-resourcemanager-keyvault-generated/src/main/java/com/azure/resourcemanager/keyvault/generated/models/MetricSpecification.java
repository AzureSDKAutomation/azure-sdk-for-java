// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Metric specification of operation. */
@Fluent
public final class MetricSpecification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricSpecification.class);

    /*
     * Name of metric specification.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display name of metric specification.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Display description of metric specification.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * The metric unit. Possible values include: 'Bytes', 'Count',
     * 'Milliseconds'.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * The metric aggregation type. Possible values include: 'Average',
     * 'Count', 'Total'.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /*
     * The supported aggregation types for the metrics.
     */
    @JsonProperty(value = "supportedAggregationTypes")
    private List<String> supportedAggregationTypes;

    /*
     * The supported time grain types for the metrics.
     */
    @JsonProperty(value = "supportedTimeGrainTypes")
    private List<String> supportedTimeGrainTypes;

    /*
     * The metric lock aggregation type.
     */
    @JsonProperty(value = "lockAggregationType")
    private String lockAggregationType;

    /*
     * The dimensions of metric
     */
    @JsonProperty(value = "dimensions")
    private List<DimensionProperties> dimensions;

    /*
     * Property to specify whether to fill gap with zero.
     */
    @JsonProperty(value = "fillGapWithZero")
    private Boolean fillGapWithZero;

    /*
     * The internal metric name.
     */
    @JsonProperty(value = "internalMetricName")
    private String internalMetricName;

    /**
     * Get the name property: Name of metric specification.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of metric specification.
     *
     * @param name the name value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of metric specification.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of metric specification.
     *
     * @param displayName the displayName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: Display description of metric specification.
     *
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Display description of metric specification.
     *
     * @param displayDescription the displayDescription value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: The metric unit. Possible values include: 'Bytes', 'Count', 'Milliseconds'.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The metric unit. Possible values include: 'Bytes', 'Count', 'Milliseconds'.
     *
     * @param unit the unit value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType property: The metric aggregation type. Possible values include: 'Average', 'Count',
     * 'Total'.
     *
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: The metric aggregation type. Possible values include: 'Average', 'Count',
     * 'Total'.
     *
     * @param aggregationType the aggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the supportedAggregationTypes property: The supported aggregation types for the metrics.
     *
     * @return the supportedAggregationTypes value.
     */
    public List<String> supportedAggregationTypes() {
        return this.supportedAggregationTypes;
    }

    /**
     * Set the supportedAggregationTypes property: The supported aggregation types for the metrics.
     *
     * @param supportedAggregationTypes the supportedAggregationTypes value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSupportedAggregationTypes(List<String> supportedAggregationTypes) {
        this.supportedAggregationTypes = supportedAggregationTypes;
        return this;
    }

    /**
     * Get the supportedTimeGrainTypes property: The supported time grain types for the metrics.
     *
     * @return the supportedTimeGrainTypes value.
     */
    public List<String> supportedTimeGrainTypes() {
        return this.supportedTimeGrainTypes;
    }

    /**
     * Set the supportedTimeGrainTypes property: The supported time grain types for the metrics.
     *
     * @param supportedTimeGrainTypes the supportedTimeGrainTypes value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSupportedTimeGrainTypes(List<String> supportedTimeGrainTypes) {
        this.supportedTimeGrainTypes = supportedTimeGrainTypes;
        return this;
    }

    /**
     * Get the lockAggregationType property: The metric lock aggregation type.
     *
     * @return the lockAggregationType value.
     */
    public String lockAggregationType() {
        return this.lockAggregationType;
    }

    /**
     * Set the lockAggregationType property: The metric lock aggregation type.
     *
     * @param lockAggregationType the lockAggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withLockAggregationType(String lockAggregationType) {
        this.lockAggregationType = lockAggregationType;
        return this;
    }

    /**
     * Get the dimensions property: The dimensions of metric.
     *
     * @return the dimensions value.
     */
    public List<DimensionProperties> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: The dimensions of metric.
     *
     * @param dimensions the dimensions value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<DimensionProperties> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the fillGapWithZero property: Property to specify whether to fill gap with zero.
     *
     * @return the fillGapWithZero value.
     */
    public Boolean fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set the fillGapWithZero property: Property to specify whether to fill gap with zero.
     *
     * @param fillGapWithZero the fillGapWithZero value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withFillGapWithZero(Boolean fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get the internalMetricName property: The internal metric name.
     *
     * @return the internalMetricName value.
     */
    public String internalMetricName() {
        return this.internalMetricName;
    }

    /**
     * Set the internalMetricName property: The internal metric name.
     *
     * @param internalMetricName the internalMetricName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withInternalMetricName(String internalMetricName) {
        this.internalMetricName = internalMetricName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }
}
