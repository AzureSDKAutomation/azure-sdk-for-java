// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.models.MetricName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A metric describing the usage of a resource. */
@Fluent
public final class UsageMetricInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsageMetricInner.class);

    /*
     * The name of the metric.
     */
    @JsonProperty(value = "name")
    private MetricName name;

    /*
     * The units used for the metric.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * The current value of the metric.
     */
    @JsonProperty(value = "currentValue")
    private Double currentValue;

    /*
     * The quota limit for the metric.
     */
    @JsonProperty(value = "limit")
    private Double limit;

    /*
     * The time that the metric's value will reset.
     */
    @JsonProperty(value = "nextResetTime")
    private OffsetDateTime nextResetTime;

    /*
     * The quota period that determines the length of time between value
     * resets.
     */
    @JsonProperty(value = "quotaPeriod")
    private String quotaPeriod;

    /**
     * Get the name property: The name of the metric.
     *
     * @return the name value.
     */
    public MetricName name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metric.
     *
     * @param name the name value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withName(MetricName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the unit property: The units used for the metric.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The units used for the metric.
     *
     * @param unit the unit value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the currentValue property: The current value of the metric.
     *
     * @return the currentValue value.
     */
    public Double currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current value of the metric.
     *
     * @param currentValue the currentValue value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: The quota limit for the metric.
     *
     * @return the limit value.
     */
    public Double limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The quota limit for the metric.
     *
     * @param limit the limit value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withLimit(Double limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the nextResetTime property: The time that the metric's value will reset.
     *
     * @return the nextResetTime value.
     */
    public OffsetDateTime nextResetTime() {
        return this.nextResetTime;
    }

    /**
     * Set the nextResetTime property: The time that the metric's value will reset.
     *
     * @param nextResetTime the nextResetTime value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withNextResetTime(OffsetDateTime nextResetTime) {
        this.nextResetTime = nextResetTime;
        return this;
    }

    /**
     * Get the quotaPeriod property: The quota period that determines the length of time between value resets.
     *
     * @return the quotaPeriod value.
     */
    public String quotaPeriod() {
        return this.quotaPeriod;
    }

    /**
     * Set the quotaPeriod property: The quota period that determines the length of time between value resets.
     *
     * @param quotaPeriod the quotaPeriod value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withQuotaPeriod(String quotaPeriod) {
        this.quotaPeriod = quotaPeriod;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}
