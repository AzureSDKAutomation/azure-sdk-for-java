// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.testbase.fluent.models.FlightingRingResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of flighting rings. */
@Fluent
public final class FlightingRingListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FlightingRingListResult.class);

    /*
     * The list of flighting rings.
     */
    @JsonProperty(value = "value")
    private List<FlightingRingResourceInner> value;

    /*
     * Link to the next set of results. Not empty if value contains incomplete
     * list of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of flighting rings.
     *
     * @return the value value.
     */
    public List<FlightingRingResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of flighting rings.
     *
     * @param value the value value to set.
     * @return the FlightingRingListResult object itself.
     */
    public FlightingRingListResult withValue(List<FlightingRingResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if value contains incomplete list of
     * results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
