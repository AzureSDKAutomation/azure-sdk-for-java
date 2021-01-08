// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.fluent.models.OnlineEndpointPropertiesTrackedResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A paginated list of OnlineEndpointProperties entities. */
@Fluent
public final class OnlineEndpointPropertiesTrackedResourceArmPaginatedResult {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(OnlineEndpointPropertiesTrackedResourceArmPaginatedResult.class);

    /*
     * An array of objects of type OnlineEndpointProperties.
     */
    @JsonProperty(value = "value")
    private List<OnlineEndpointPropertiesTrackedResourceInner> value;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: An array of objects of type OnlineEndpointProperties.
     *
     * @return the value value.
     */
    public List<OnlineEndpointPropertiesTrackedResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of objects of type OnlineEndpointProperties.
     *
     * @param value the value value to set.
     * @return the OnlineEndpointPropertiesTrackedResourceArmPaginatedResult object itself.
     */
    public OnlineEndpointPropertiesTrackedResourceArmPaginatedResult withValue(
        List<OnlineEndpointPropertiesTrackedResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     *
     * @param nextLink the nextLink value to set.
     * @return the OnlineEndpointPropertiesTrackedResourceArmPaginatedResult object itself.
     */
    public OnlineEndpointPropertiesTrackedResourceArmPaginatedResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
