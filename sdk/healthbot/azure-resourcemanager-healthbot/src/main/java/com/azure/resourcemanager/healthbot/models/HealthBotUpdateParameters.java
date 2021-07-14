// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters for updating a Azure Health Bot. */
@Fluent
public final class HealthBotUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HealthBotUpdateParameters.class);

    /*
     * Tags for a Azure Health Bot.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * SKU of the Azure Health Bot.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The identity of the Azure Health Bot.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Get the tags property: Tags for a Azure Health Bot.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags for a Azure Health Bot.
     *
     * @param tags the tags value to set.
     * @return the HealthBotUpdateParameters object itself.
     */
    public HealthBotUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: SKU of the Azure Health Bot.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of the Azure Health Bot.
     *
     * @param sku the sku value to set.
     * @return the HealthBotUpdateParameters object itself.
     */
    public HealthBotUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: The identity of the Azure Health Bot.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the Azure Health Bot.
     *
     * @param identity the identity value to set.
     * @return the HealthBotUpdateParameters object itself.
     */
    public HealthBotUpdateParameters withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
