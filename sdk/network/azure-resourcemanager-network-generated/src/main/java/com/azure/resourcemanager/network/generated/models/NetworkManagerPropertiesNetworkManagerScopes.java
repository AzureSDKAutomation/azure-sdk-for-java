// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Scope of Network Manager. */
@Fluent
public final class NetworkManagerPropertiesNetworkManagerScopes {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(NetworkManagerPropertiesNetworkManagerScopes.class);

    /*
     * List of management groups.
     */
    @JsonProperty(value = "managementGroups")
    private List<String> managementGroups;

    /*
     * List of subscriptions.
     */
    @JsonProperty(value = "subscriptions")
    private List<String> subscriptions;

    /**
     * Get the managementGroups property: List of management groups.
     *
     * @return the managementGroups value.
     */
    public List<String> managementGroups() {
        return this.managementGroups;
    }

    /**
     * Set the managementGroups property: List of management groups.
     *
     * @param managementGroups the managementGroups value to set.
     * @return the NetworkManagerPropertiesNetworkManagerScopes object itself.
     */
    public NetworkManagerPropertiesNetworkManagerScopes withManagementGroups(List<String> managementGroups) {
        this.managementGroups = managementGroups;
        return this;
    }

    /**
     * Get the subscriptions property: List of subscriptions.
     *
     * @return the subscriptions value.
     */
    public List<String> subscriptions() {
        return this.subscriptions;
    }

    /**
     * Set the subscriptions property: List of subscriptions.
     *
     * @param subscriptions the subscriptions value to set.
     * @return the NetworkManagerPropertiesNetworkManagerScopes object itself.
     */
    public NetworkManagerPropertiesNetworkManagerScopes withSubscriptions(List<String> subscriptions) {
        this.subscriptions = subscriptions;
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
