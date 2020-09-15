/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.bing.v2020_06_10_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The usage data for a usage request.
 */
public class Usage {
    /**
     * The unit of the metric. Possible values include: 'Count', 'Bytes',
     * 'Seconds', 'Percent', 'CountPerSecond', 'BytesPerSecond',
     * 'Milliseconds'.
     */
    @JsonProperty(value = "unit")
    private UnitType unit;

    /**
     * The name information for the metric.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private MetricName name;

    /**
     * The quota period used to summarize the usage values.
     */
    @JsonProperty(value = "quotaPeriod", access = JsonProperty.Access.WRITE_ONLY)
    private String quotaPeriod;

    /**
     * Maximum value for this metric.
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Double limit;

    /**
     * Current value for this metric.
     */
    @JsonProperty(value = "currentValue", access = JsonProperty.Access.WRITE_ONLY)
    private Double currentValue;

    /**
     * Next reset time for current quota.
     */
    @JsonProperty(value = "nextResetTime", access = JsonProperty.Access.WRITE_ONLY)
    private String nextResetTime;

    /**
     * Bing account quota usage status. Possible values include: 'Included',
     * 'Blocked', 'InOverage', 'Unknown'.
     */
    @JsonProperty(value = "status")
    private QuotaUsageStatus status;

    /**
     * Get the unit of the metric. Possible values include: 'Count', 'Bytes', 'Seconds', 'Percent', 'CountPerSecond', 'BytesPerSecond', 'Milliseconds'.
     *
     * @return the unit value
     */
    public UnitType unit() {
        return this.unit;
    }

    /**
     * Set the unit of the metric. Possible values include: 'Count', 'Bytes', 'Seconds', 'Percent', 'CountPerSecond', 'BytesPerSecond', 'Milliseconds'.
     *
     * @param unit the unit value to set
     * @return the Usage object itself.
     */
    public Usage withUnit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the name information for the metric.
     *
     * @return the name value
     */
    public MetricName name() {
        return this.name;
    }

    /**
     * Get the quota period used to summarize the usage values.
     *
     * @return the quotaPeriod value
     */
    public String quotaPeriod() {
        return this.quotaPeriod;
    }

    /**
     * Get maximum value for this metric.
     *
     * @return the limit value
     */
    public Double limit() {
        return this.limit;
    }

    /**
     * Get current value for this metric.
     *
     * @return the currentValue value
     */
    public Double currentValue() {
        return this.currentValue;
    }

    /**
     * Get next reset time for current quota.
     *
     * @return the nextResetTime value
     */
    public String nextResetTime() {
        return this.nextResetTime;
    }

    /**
     * Get bing account quota usage status. Possible values include: 'Included', 'Blocked', 'InOverage', 'Unknown'.
     *
     * @return the status value
     */
    public QuotaUsageStatus status() {
        return this.status;
    }

    /**
     * Set bing account quota usage status. Possible values include: 'Included', 'Blocked', 'InOverage', 'Unknown'.
     *
     * @param status the status value to set
     * @return the Usage object itself.
     */
    public Usage withStatus(QuotaUsageStatus status) {
        this.status = status;
        return this;
    }

}
