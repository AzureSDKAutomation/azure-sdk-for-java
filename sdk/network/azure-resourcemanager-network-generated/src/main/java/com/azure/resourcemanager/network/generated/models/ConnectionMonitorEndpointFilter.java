// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the connection monitor endpoint filter. */
@Fluent
public final class ConnectionMonitorEndpointFilter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorEndpointFilter.class);

    /*
     * The behavior of the endpoint filter. Currently only 'Include' is
     * supported.
     */
    @JsonProperty(value = "type")
    private ConnectionMonitorEndpointFilterType type;

    /*
     * List of items in the filter.
     */
    @JsonProperty(value = "items")
    private List<ConnectionMonitorEndpointFilterItem> items;

    /**
     * Get the type property: The behavior of the endpoint filter. Currently only 'Include' is supported.
     *
     * @return the type value.
     */
    public ConnectionMonitorEndpointFilterType type() {
        return this.type;
    }

    /**
     * Set the type property: The behavior of the endpoint filter. Currently only 'Include' is supported.
     *
     * @param type the type value to set.
     * @return the ConnectionMonitorEndpointFilter object itself.
     */
    public ConnectionMonitorEndpointFilter withType(ConnectionMonitorEndpointFilterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the items property: List of items in the filter.
     *
     * @return the items value.
     */
    public List<ConnectionMonitorEndpointFilterItem> items() {
        return this.items;
    }

    /**
     * Set the items property: List of items in the filter.
     *
     * @param items the items value to set.
     * @return the ConnectionMonitorEndpointFilter object itself.
     */
    public ConnectionMonitorEndpointFilter withItems(List<ConnectionMonitorEndpointFilterItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (items() != null) {
            items().forEach(e -> e.validate());
        }
    }
}
