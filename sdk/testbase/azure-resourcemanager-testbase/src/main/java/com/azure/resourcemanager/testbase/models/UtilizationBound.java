// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The bound of a utilization result. */
@Fluent
public final class UtilizationBound {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UtilizationBound.class);

    /*
     * The percentile of the bound.
     */
    @JsonProperty(value = "percentile")
    private Double percentile;

    /*
     * The value of the bound.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * Get the percentile property: The percentile of the bound.
     *
     * @return the percentile value.
     */
    public Double percentile() {
        return this.percentile;
    }

    /**
     * Set the percentile property: The percentile of the bound.
     *
     * @param percentile the percentile value to set.
     * @return the UtilizationBound object itself.
     */
    public UtilizationBound withPercentile(Double percentile) {
        this.percentile = percentile;
        return this;
    }

    /**
     * Get the value property: The value of the bound.
     *
     * @return the value value.
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the bound.
     *
     * @param value the value value to set.
     * @return the UtilizationBound object itself.
     */
    public UtilizationBound withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
