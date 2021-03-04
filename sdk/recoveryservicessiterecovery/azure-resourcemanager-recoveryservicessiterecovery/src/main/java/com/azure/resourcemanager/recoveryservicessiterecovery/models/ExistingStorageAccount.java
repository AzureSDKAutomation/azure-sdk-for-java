// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Existing storage account input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeName("Existing")
@Fluent
public final class ExistingStorageAccount extends StorageAccountCustomDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExistingStorageAccount.class);

    /*
     * The storage account Arm Id. Throw error, if resource does not exists.
     */
    @JsonProperty(value = "azureStorageAccountId", required = true)
    private String azureStorageAccountId;

    /**
     * Get the azureStorageAccountId property: The storage account Arm Id. Throw error, if resource does not exists.
     *
     * @return the azureStorageAccountId value.
     */
    public String azureStorageAccountId() {
        return this.azureStorageAccountId;
    }

    /**
     * Set the azureStorageAccountId property: The storage account Arm Id. Throw error, if resource does not exists.
     *
     * @param azureStorageAccountId the azureStorageAccountId value to set.
     * @return the ExistingStorageAccount object itself.
     */
    public ExistingStorageAccount withAzureStorageAccountId(String azureStorageAccountId) {
        this.azureStorageAccountId = azureStorageAccountId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (azureStorageAccountId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property azureStorageAccountId in model ExistingStorageAccount"));
        }
    }
}
