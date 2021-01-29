// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a storage account connection. */
@Fluent
public final class StorageAccount {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccount.class);

    /*
     * The Azure Resource Manager ID of the storage account resource.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The storage account key.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get the id property: The Azure Resource Manager ID of the storage account resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The Azure Resource Manager ID of the storage account resource.
     *
     * @param id the id value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the key property: The storage account key.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: The storage account key.
     *
     * @param key the key value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model StorageAccount"));
        }
    }
}
