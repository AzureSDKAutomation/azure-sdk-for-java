// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for container with backup items. Containers with specific workloads are derived from this class. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "containerType",
    defaultImpl = ProtectionContainer.class)
@JsonTypeName("ProtectionContainer")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DPMContainer", value = DpmContainer.class),
    @JsonSubTypes.Type(name = "IaaSVMContainer", value = IaaSvmContainer.class),
    @JsonSubTypes.Type(name = "AzureWorkloadContainer", value = AzureWorkloadContainer.class),
    @JsonSubTypes.Type(name = "AzureSqlContainer", value = AzureSqlContainer.class),
    @JsonSubTypes.Type(name = "StorageContainer", value = AzureStorageContainer.class),
    @JsonSubTypes.Type(name = "GenericContainer", value = GenericContainer.class),
    @JsonSubTypes.Type(name = "Windows", value = MabContainer.class)
})
@Fluent
public class ProtectionContainer {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtectionContainer.class);

    /*
     * Friendly name of the container.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * Type of backup management for the container.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /*
     * Status of registration of the container with the Recovery Services
     * Vault.
     */
    @JsonProperty(value = "registrationStatus")
    private String registrationStatus;

    /*
     * Status of health of the container.
     */
    @JsonProperty(value = "healthStatus")
    private String healthStatus;

    /*
     * Type of the protectable object associated with this container.
     */
    @JsonProperty(value = "protectableObjectType")
    private String protectableObjectType;

    /**
     * Get the friendlyName property: Friendly name of the container.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of the container.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the ProtectionContainer object itself.
     */
    public ProtectionContainer withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the backupManagementType property: Type of backup management for the container.
     *
     * @return the backupManagementType value.
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backupManagementType property: Type of backup management for the container.
     *
     * @param backupManagementType the backupManagementType value to set.
     * @return the ProtectionContainer object itself.
     */
    public ProtectionContainer withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the registrationStatus property: Status of registration of the container with the Recovery Services Vault.
     *
     * @return the registrationStatus value.
     */
    public String registrationStatus() {
        return this.registrationStatus;
    }

    /**
     * Set the registrationStatus property: Status of registration of the container with the Recovery Services Vault.
     *
     * @param registrationStatus the registrationStatus value to set.
     * @return the ProtectionContainer object itself.
     */
    public ProtectionContainer withRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }

    /**
     * Get the healthStatus property: Status of health of the container.
     *
     * @return the healthStatus value.
     */
    public String healthStatus() {
        return this.healthStatus;
    }

    /**
     * Set the healthStatus property: Status of health of the container.
     *
     * @param healthStatus the healthStatus value to set.
     * @return the ProtectionContainer object itself.
     */
    public ProtectionContainer withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * Get the protectableObjectType property: Type of the protectable object associated with this container.
     *
     * @return the protectableObjectType value.
     */
    public String protectableObjectType() {
        return this.protectableObjectType;
    }

    /**
     * Set the protectableObjectType property: Type of the protectable object associated with this container.
     *
     * @param protectableObjectType the protectableObjectType value to set.
     * @return the ProtectionContainer object itself.
     */
    public ProtectionContainer withProtectableObjectType(String protectableObjectType) {
        this.protectableObjectType = protectableObjectType;
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
