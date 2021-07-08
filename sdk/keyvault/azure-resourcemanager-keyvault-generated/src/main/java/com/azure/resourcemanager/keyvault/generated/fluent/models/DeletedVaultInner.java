// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.keyvault.generated.models.DeletedVaultProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Deleted vault information with extended details. */
@Fluent
public final class DeletedVaultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeletedVaultInner.class);

    /*
     * The resource ID for the deleted key vault.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the key vault.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The resource type of the key vault.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Properties of the vault
     */
    @JsonProperty(value = "properties")
    private DeletedVaultProperties properties;

    /**
     * Get the id property: The resource ID for the deleted key vault.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the key vault.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type of the key vault.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the properties property: Properties of the vault.
     *
     * @return the properties value.
     */
    public DeletedVaultProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the vault.
     *
     * @param properties the properties value to set.
     * @return the DeletedVaultInner object itself.
     */
    public DeletedVaultInner withProperties(DeletedVaultProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
