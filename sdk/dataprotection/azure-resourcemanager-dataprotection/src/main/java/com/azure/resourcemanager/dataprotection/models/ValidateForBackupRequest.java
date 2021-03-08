// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Validate for backup request. */
@Fluent
public final class ValidateForBackupRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidateForBackupRequest.class);

    /*
     * Backup Instance
     */
    @JsonProperty(value = "backupInstance", required = true)
    private BackupInstance backupInstance;

    /**
     * Get the backupInstance property: Backup Instance.
     *
     * @return the backupInstance value.
     */
    public BackupInstance backupInstance() {
        return this.backupInstance;
    }

    /**
     * Set the backupInstance property: Backup Instance.
     *
     * @param backupInstance the backupInstance value to set.
     * @return the ValidateForBackupRequest object itself.
     */
    public ValidateForBackupRequest withBackupInstance(BackupInstance backupInstance) {
        this.backupInstance = backupInstance;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backupInstance() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property backupInstance in model ValidateForBackupRequest"));
        } else {
            backupInstance().validate();
        }
    }
}
