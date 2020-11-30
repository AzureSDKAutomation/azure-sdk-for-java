/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of the properties for a TagRules resource.
 */
public class MonitoringTagRulesProperties {
    /**
     * The logRules property.
     */
    @JsonProperty(value = "logRules")
    private LogRules logRules;

    /**
     * The metricRules property.
     */
    @JsonProperty(value = "metricRules")
    private MetricRules metricRules;

    /**
     * Get the logRules value.
     *
     * @return the logRules value
     */
    public LogRules logRules() {
        return this.logRules;
    }

    /**
     * Set the logRules value.
     *
     * @param logRules the logRules value to set
     * @return the MonitoringTagRulesProperties object itself.
     */
    public MonitoringTagRulesProperties withLogRules(LogRules logRules) {
        this.logRules = logRules;
        return this;
    }

    /**
     * Get the metricRules value.
     *
     * @return the metricRules value
     */
    public MetricRules metricRules() {
        return this.metricRules;
    }

    /**
     * Set the metricRules value.
     *
     * @param metricRules the metricRules value to set
     * @return the MonitoringTagRulesProperties object itself.
     */
    public MonitoringTagRulesProperties withMetricRules(MetricRules metricRules) {
        this.metricRules = metricRules;
        return this;
    }

}
