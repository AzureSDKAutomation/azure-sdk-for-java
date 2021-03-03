// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.models.EffectiveConfigurationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list networkManagerEffectiveConfiguration. It contains a list of groups and a URL link to
 * get the next set of results.
 */
@Fluent
public final class NetworkManagerEffectiveConfigurationListResult {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(NetworkManagerEffectiveConfigurationListResult.class);

    /*
     * Gets a page of NetworkManagerEffectiveConfiguration
     */
    @JsonProperty(value = "value")
    private List<EffectiveConfigurationInner> value;

    /*
     * Gets the URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets a page of NetworkManagerEffectiveConfiguration.
     *
     * @return the value value.
     */
    public List<EffectiveConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a page of NetworkManagerEffectiveConfiguration.
     *
     * @param value the value value to set.
     * @return the NetworkManagerEffectiveConfigurationListResult object itself.
     */
    public NetworkManagerEffectiveConfigurationListResult withValue(List<EffectiveConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the NetworkManagerEffectiveConfigurationListResult object itself.
     */
    public NetworkManagerEffectiveConfigurationListResult withNextLink(String nextLink) {
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
