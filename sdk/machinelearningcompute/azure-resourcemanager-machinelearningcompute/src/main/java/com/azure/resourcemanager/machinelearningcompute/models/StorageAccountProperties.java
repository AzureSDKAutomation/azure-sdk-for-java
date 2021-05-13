// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of Storage Account. */
@Fluent
public final class StorageAccountProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccountProperties.class);

    /*
     * ARM resource ID of the Azure Storage Account to store CLI specific
     * files. If not provided one will be created. This cannot be changed once
     * the cluster is created.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Get the resourceId property: ARM resource ID of the Azure Storage Account to store CLI specific files. If not
     * provided one will be created. This cannot be changed once the cluster is created.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: ARM resource ID of the Azure Storage Account to store CLI specific files. If not
     * provided one will be created. This cannot be changed once the cluster is created.
     *
     * @param resourceId the resourceId value to set.
     * @return the StorageAccountProperties object itself.
     */
    public StorageAccountProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
