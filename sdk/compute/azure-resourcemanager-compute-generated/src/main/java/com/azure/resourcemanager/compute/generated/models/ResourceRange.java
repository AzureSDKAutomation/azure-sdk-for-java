// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the resource range. */
@Fluent
public final class ResourceRange {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceRange.class);

    /*
     * The minimum number of the resource.
     */
    @JsonProperty(value = "min")
    private Integer min;

    /*
     * The maximum number of the resource.
     */
    @JsonProperty(value = "max")
    private Integer max;

    /**
     * Get the min property: The minimum number of the resource.
     *
     * @return the min value.
     */
    public Integer min() {
        return this.min;
    }

    /**
     * Set the min property: The minimum number of the resource.
     *
     * @param min the min value to set.
     * @return the ResourceRange object itself.
     */
    public ResourceRange withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * Get the max property: The maximum number of the resource.
     *
     * @return the max value.
     */
    public Integer max() {
        return this.max;
    }

    /**
     * Set the max property: The maximum number of the resource.
     *
     * @param max the max value to set.
     * @return the ResourceRange object itself.
     */
    public ResourceRange withMax(Integer max) {
        this.max = max;
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
