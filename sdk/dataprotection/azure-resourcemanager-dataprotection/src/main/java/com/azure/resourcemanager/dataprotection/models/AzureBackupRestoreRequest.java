// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure backup restore request. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = AzureBackupRestoreRequest.class)
@JsonTypeName("AzureBackupRestoreRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "AzureBackupRecoveryPointBasedRestoreRequest",
        value = AzureBackupRecoveryPointBasedRestoreRequest.class)
})
@Fluent
public class AzureBackupRestoreRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureBackupRestoreRequest.class);

    /*
     * Gets or sets the restore target information.
     */
    @JsonProperty(value = "restoreTargetInfo", required = true)
    private RestoreTargetInfoBase restoreTargetInfo;

    /*
     * Gets or sets the type of the source data store.
     */
    @JsonProperty(value = "sourceDataStoreType", required = true)
    private SourceDataStoreType sourceDataStoreType;

    /**
     * Get the restoreTargetInfo property: Gets or sets the restore target information.
     *
     * @return the restoreTargetInfo value.
     */
    public RestoreTargetInfoBase restoreTargetInfo() {
        return this.restoreTargetInfo;
    }

    /**
     * Set the restoreTargetInfo property: Gets or sets the restore target information.
     *
     * @param restoreTargetInfo the restoreTargetInfo value to set.
     * @return the AzureBackupRestoreRequest object itself.
     */
    public AzureBackupRestoreRequest withRestoreTargetInfo(RestoreTargetInfoBase restoreTargetInfo) {
        this.restoreTargetInfo = restoreTargetInfo;
        return this;
    }

    /**
     * Get the sourceDataStoreType property: Gets or sets the type of the source data store.
     *
     * @return the sourceDataStoreType value.
     */
    public SourceDataStoreType sourceDataStoreType() {
        return this.sourceDataStoreType;
    }

    /**
     * Set the sourceDataStoreType property: Gets or sets the type of the source data store.
     *
     * @param sourceDataStoreType the sourceDataStoreType value to set.
     * @return the AzureBackupRestoreRequest object itself.
     */
    public AzureBackupRestoreRequest withSourceDataStoreType(SourceDataStoreType sourceDataStoreType) {
        this.sourceDataStoreType = sourceDataStoreType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restoreTargetInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property restoreTargetInfo in model AzureBackupRestoreRequest"));
        } else {
            restoreTargetInfo().validate();
        }
        if (sourceDataStoreType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceDataStoreType in model AzureBackupRestoreRequest"));
        }
    }
}
