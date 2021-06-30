// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Specifies the metric alert criteria for a single resource that has multiple metric criteria. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata\\.type")
@JsonTypeName("Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria")
@JsonFlatten
@Fluent
public class MetricAlertSingleResourceMultipleMetricCriteria extends MetricAlertCriteria {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(MetricAlertSingleResourceMultipleMetricCriteria.class);

    /*
     * The list of metric criteria for this 'all of' operation.
     */
    @JsonProperty(value = "allOf")
    private List<MetricCriteria> allOf;

    /**
     * Get the allOf property: The list of metric criteria for this 'all of' operation.
     *
     * @return the allOf value.
     */
    public List<MetricCriteria> allOf() {
        return this.allOf;
    }

    /**
     * Set the allOf property: The list of metric criteria for this 'all of' operation.
     *
     * @param allOf the allOf value to set.
     * @return the MetricAlertSingleResourceMultipleMetricCriteria object itself.
     */
    public MetricAlertSingleResourceMultipleMetricCriteria withAllOf(List<MetricCriteria> allOf) {
        this.allOf = allOf;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (allOf() != null) {
            allOf().forEach(e -> e.validate());
        }
    }
}
