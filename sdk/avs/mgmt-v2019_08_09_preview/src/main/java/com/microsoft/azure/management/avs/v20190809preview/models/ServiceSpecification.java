/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Service specification payload.
 */
public class ServiceSpecification {
    /**
     * Specifications of the Log for Azure Monitoring.
     */
    @JsonProperty(value = "logSpecifications")
    private List<LogSpecification> logSpecifications;

    /**
     * Specifications of the Metrics for Azure Monitoring.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecification> metricSpecifications;

    /**
     * Get specifications of the Log for Azure Monitoring.
     *
     * @return the logSpecifications value
     */
    public List<LogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set specifications of the Log for Azure Monitoring.
     *
     * @param logSpecifications the logSpecifications value to set
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withLogSpecifications(List<LogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Get specifications of the Metrics for Azure Monitoring.
     *
     * @return the metricSpecifications value
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set specifications of the Metrics for Azure Monitoring.
     *
     * @param metricSpecifications the metricSpecifications value to set
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withMetricSpecifications(List<MetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

}
