// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.PrivateEndpointConnectionWithSystemDataInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of private endpoint connection associated with the specified storage account. */
@Fluent
public final class PrivateEndpointConnectionListResultWithSystemData {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionListResultWithSystemData.class);

    /*
     * Array of private endpoint connections
     */
    @JsonProperty(value = "value")
    private List<PrivateEndpointConnectionWithSystemDataInner> value;

    /*
     * Link to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Array of private endpoint connections.
     *
     * @return the value value.
     */
    public List<PrivateEndpointConnectionWithSystemDataInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of private endpoint connections.
     *
     * @param value the value value to set.
     * @return the PrivateEndpointConnectionListResultWithSystemData object itself.
     */
    public PrivateEndpointConnectionListResultWithSystemData withValue(
        List<PrivateEndpointConnectionWithSystemDataInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next page of results.
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
