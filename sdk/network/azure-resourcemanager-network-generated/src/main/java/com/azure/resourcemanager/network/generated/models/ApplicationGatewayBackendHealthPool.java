// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Application gateway BackendHealth pool. */
@Fluent
public final class ApplicationGatewayBackendHealthPool {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayBackendHealthPool.class);

    /*
     * Reference to an ApplicationGatewayBackendAddressPool resource.
     */
    @JsonProperty(value = "backendAddressPool")
    private ApplicationGatewayBackendAddressPool backendAddressPool;

    /*
     * List of ApplicationGatewayBackendHealthHttpSettings resources.
     */
    @JsonProperty(value = "backendHttpSettingsCollection")
    private List<ApplicationGatewayBackendHealthHttpSettings> backendHttpSettingsCollection;

    /**
     * Get the backendAddressPool property: Reference to an ApplicationGatewayBackendAddressPool resource.
     *
     * @return the backendAddressPool value.
     */
    public ApplicationGatewayBackendAddressPool backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Reference to an ApplicationGatewayBackendAddressPool resource.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayBackendHealthPool object itself.
     */
    public ApplicationGatewayBackendHealthPool withBackendAddressPool(
        ApplicationGatewayBackendAddressPool backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHttpSettingsCollection property: List of ApplicationGatewayBackendHealthHttpSettings resources.
     *
     * @return the backendHttpSettingsCollection value.
     */
    public List<ApplicationGatewayBackendHealthHttpSettings> backendHttpSettingsCollection() {
        return this.backendHttpSettingsCollection;
    }

    /**
     * Set the backendHttpSettingsCollection property: List of ApplicationGatewayBackendHealthHttpSettings resources.
     *
     * @param backendHttpSettingsCollection the backendHttpSettingsCollection value to set.
     * @return the ApplicationGatewayBackendHealthPool object itself.
     */
    public ApplicationGatewayBackendHealthPool withBackendHttpSettingsCollection(
        List<ApplicationGatewayBackendHealthHttpSettings> backendHttpSettingsCollection) {
        this.backendHttpSettingsCollection = backendHttpSettingsCollection;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backendAddressPool() != null) {
            backendAddressPool().validate();
        }
        if (backendHttpSettingsCollection() != null) {
            backendHttpSettingsCollection().forEach(e -> e.validate());
        }
    }
}
