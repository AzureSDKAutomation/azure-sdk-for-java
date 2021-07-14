// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure Storage Account workload-specific container. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "containerType")
@JsonTypeName("StorageContainer")
@Fluent
public final class AzureStorageContainer extends ProtectionContainer {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureStorageContainer.class);

    /*
     * Fully qualified ARM url.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /*
     * Storage account version.
     */
    @JsonProperty(value = "storageAccountVersion")
    private String storageAccountVersion;

    /*
     * Resource group name of Recovery Services Vault.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /*
     * Number of items backed up in this container.
     */
    @JsonProperty(value = "protectedItemCount")
    private Long protectedItemCount;

    /**
     * Get the sourceResourceId property: Fully qualified ARM url.
     *
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the sourceResourceId property: Fully qualified ARM url.
     *
     * @param sourceResourceId the sourceResourceId value to set.
     * @return the AzureStorageContainer object itself.
     */
    public AzureStorageContainer withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get the storageAccountVersion property: Storage account version.
     *
     * @return the storageAccountVersion value.
     */
    public String storageAccountVersion() {
        return this.storageAccountVersion;
    }

    /**
     * Set the storageAccountVersion property: Storage account version.
     *
     * @param storageAccountVersion the storageAccountVersion value to set.
     * @return the AzureStorageContainer object itself.
     */
    public AzureStorageContainer withStorageAccountVersion(String storageAccountVersion) {
        this.storageAccountVersion = storageAccountVersion;
        return this;
    }

    /**
     * Get the resourceGroup property: Resource group name of Recovery Services Vault.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: Resource group name of Recovery Services Vault.
     *
     * @param resourceGroup the resourceGroup value to set.
     * @return the AzureStorageContainer object itself.
     */
    public AzureStorageContainer withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the protectedItemCount property: Number of items backed up in this container.
     *
     * @return the protectedItemCount value.
     */
    public Long protectedItemCount() {
        return this.protectedItemCount;
    }

    /**
     * Set the protectedItemCount property: Number of items backed up in this container.
     *
     * @param protectedItemCount the protectedItemCount value to set.
     * @return the AzureStorageContainer object itself.
     */
    public AzureStorageContainer withProtectedItemCount(Long protectedItemCount) {
        this.protectedItemCount = protectedItemCount;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureStorageContainer withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureStorageContainer withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureStorageContainer withRegistrationStatus(String registrationStatus) {
        super.withRegistrationStatus(registrationStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureStorageContainer withHealthStatus(String healthStatus) {
        super.withHealthStatus(healthStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureStorageContainer withProtectableObjectType(String protectableObjectType) {
        super.withProtectableObjectType(protectableObjectType);
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
    }
}
