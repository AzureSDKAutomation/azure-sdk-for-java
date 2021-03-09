// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specification of the service. */
@Fluent
public final class OperationPropertiesFormatServiceSpecification {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(OperationPropertiesFormatServiceSpecification.class);

    /*
     * Operation service specification.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecification> metricSpecifications;

    /*
     * Operation log specification.
     */
    @JsonProperty(value = "logSpecifications")
    private List<LogSpecification> logSpecifications;

    /**
     * Get the metricSpecifications property: Operation service specification.
     *
     * @return the metricSpecifications value.
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: Operation service specification.
     *
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the OperationPropertiesFormatServiceSpecification object itself.
     */
    public OperationPropertiesFormatServiceSpecification withMetricSpecifications(
        List<MetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Get the logSpecifications property: Operation log specification.
     *
     * @return the logSpecifications value.
     */
    public List<LogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications property: Operation log specification.
     *
     * @param logSpecifications the logSpecifications value to set.
     * @return the OperationPropertiesFormatServiceSpecification object itself.
     */
    public OperationPropertiesFormatServiceSpecification withLogSpecifications(
        List<LogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
    }
}
