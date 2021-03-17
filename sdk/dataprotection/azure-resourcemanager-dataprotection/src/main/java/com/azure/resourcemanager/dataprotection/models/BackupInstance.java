// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Backup Instance. */
@Fluent
public final class BackupInstance {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupInstance.class);

    /*
     * Gets or sets the Backup Instance friendly name.
     */
    @JsonProperty(value = "friendlyName", required = true)
    private String friendlyName;

    /*
     * Gets or sets the data source information.
     */
    @JsonProperty(value = "dataSourceInfo", required = true)
    private Datasource dataSourceInfo;

    /*
     * Gets or sets the data source set information.
     */
    @JsonProperty(value = "dataSourceSetInfo")
    private DatasourceSet dataSourceSetInfo;

    /*
     * Gets or sets the policy information.
     */
    @JsonProperty(value = "policyInfo", required = true)
    private PolicyInfo policyInfo;

    /*
     * Specifies the protection status of the resource
     */
    @JsonProperty(value = "protectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ProtectionStatusDetails protectionStatus;

    /*
     * Specifies the current protection state of the resource
     */
    @JsonProperty(value = "currentProtectionState", access = JsonProperty.Access.WRITE_ONLY)
    private CurrentProtectionState currentProtectionState;

    /*
     * Specifies the protection error of the resource
     */
    @JsonProperty(value = "protectionErrorDetails", access = JsonProperty.Access.WRITE_ONLY)
    private UserFacingError protectionErrorDetails;

    /*
     * Specifies the provisioning state of the resource i.e.
     * provisioning/updating/Succeeded/Failed
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The objectType property.
     */
    @JsonProperty(value = "objectType", required = true)
    private String objectType;

    /**
     * Get the friendlyName property: Gets or sets the Backup Instance friendly name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Gets or sets the Backup Instance friendly name.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the BackupInstance object itself.
     */
    public BackupInstance withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the dataSourceInfo property: Gets or sets the data source information.
     *
     * @return the dataSourceInfo value.
     */
    public Datasource dataSourceInfo() {
        return this.dataSourceInfo;
    }

    /**
     * Set the dataSourceInfo property: Gets or sets the data source information.
     *
     * @param dataSourceInfo the dataSourceInfo value to set.
     * @return the BackupInstance object itself.
     */
    public BackupInstance withDataSourceInfo(Datasource dataSourceInfo) {
        this.dataSourceInfo = dataSourceInfo;
        return this;
    }

    /**
     * Get the dataSourceSetInfo property: Gets or sets the data source set information.
     *
     * @return the dataSourceSetInfo value.
     */
    public DatasourceSet dataSourceSetInfo() {
        return this.dataSourceSetInfo;
    }

    /**
     * Set the dataSourceSetInfo property: Gets or sets the data source set information.
     *
     * @param dataSourceSetInfo the dataSourceSetInfo value to set.
     * @return the BackupInstance object itself.
     */
    public BackupInstance withDataSourceSetInfo(DatasourceSet dataSourceSetInfo) {
        this.dataSourceSetInfo = dataSourceSetInfo;
        return this;
    }

    /**
     * Get the policyInfo property: Gets or sets the policy information.
     *
     * @return the policyInfo value.
     */
    public PolicyInfo policyInfo() {
        return this.policyInfo;
    }

    /**
     * Set the policyInfo property: Gets or sets the policy information.
     *
     * @param policyInfo the policyInfo value to set.
     * @return the BackupInstance object itself.
     */
    public BackupInstance withPolicyInfo(PolicyInfo policyInfo) {
        this.policyInfo = policyInfo;
        return this;
    }

    /**
     * Get the protectionStatus property: Specifies the protection status of the resource.
     *
     * @return the protectionStatus value.
     */
    public ProtectionStatusDetails protectionStatus() {
        return this.protectionStatus;
    }

    /**
     * Get the currentProtectionState property: Specifies the current protection state of the resource.
     *
     * @return the currentProtectionState value.
     */
    public CurrentProtectionState currentProtectionState() {
        return this.currentProtectionState;
    }

    /**
     * Get the protectionErrorDetails property: Specifies the protection error of the resource.
     *
     * @return the protectionErrorDetails value.
     */
    public UserFacingError protectionErrorDetails() {
        return this.protectionErrorDetails;
    }

    /**
     * Get the provisioningState property: Specifies the provisioning state of the resource i.e.
     * provisioning/updating/Succeeded/Failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the objectType property: The objectType property.
     *
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: The objectType property.
     *
     * @param objectType the objectType value to set.
     * @return the BackupInstance object itself.
     */
    public BackupInstance withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (friendlyName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property friendlyName in model BackupInstance"));
        }
        if (dataSourceInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataSourceInfo in model BackupInstance"));
        } else {
            dataSourceInfo().validate();
        }
        if (dataSourceSetInfo() != null) {
            dataSourceSetInfo().validate();
        }
        if (policyInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property policyInfo in model BackupInstance"));
        } else {
            policyInfo().validate();
        }
        if (protectionStatus() != null) {
            protectionStatus().validate();
        }
        if (protectionErrorDetails() != null) {
            protectionErrorDetails().validate();
        }
        if (objectType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property objectType in model BackupInstance"));
        }
    }
}
