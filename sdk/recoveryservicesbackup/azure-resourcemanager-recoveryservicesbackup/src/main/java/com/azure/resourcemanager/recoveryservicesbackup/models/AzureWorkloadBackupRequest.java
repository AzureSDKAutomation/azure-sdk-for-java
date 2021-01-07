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
import java.time.OffsetDateTime;

/** AzureWorkload workload-specific backup request. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureWorkloadBackupRequest")
@Fluent
public final class AzureWorkloadBackupRequest extends BackupRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureWorkloadBackupRequest.class);

    /*
     * Type of backup, viz. Full, Differential, Log or CopyOnlyFull
     */
    @JsonProperty(value = "backupType")
    private BackupType backupType;

    /*
     * Bool for Compression setting
     */
    @JsonProperty(value = "enableCompression")
    private Boolean enableCompression;

    /*
     * Backup copy will expire after the time specified (UTC).
     */
    @JsonProperty(value = "recoveryPointExpiryTimeInUTC")
    private OffsetDateTime recoveryPointExpiryTimeInUtc;

    /**
     * Get the backupType property: Type of backup, viz. Full, Differential, Log or CopyOnlyFull.
     *
     * @return the backupType value.
     */
    public BackupType backupType() {
        return this.backupType;
    }

    /**
     * Set the backupType property: Type of backup, viz. Full, Differential, Log or CopyOnlyFull.
     *
     * @param backupType the backupType value to set.
     * @return the AzureWorkloadBackupRequest object itself.
     */
    public AzureWorkloadBackupRequest withBackupType(BackupType backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * Get the enableCompression property: Bool for Compression setting.
     *
     * @return the enableCompression value.
     */
    public Boolean enableCompression() {
        return this.enableCompression;
    }

    /**
     * Set the enableCompression property: Bool for Compression setting.
     *
     * @param enableCompression the enableCompression value to set.
     * @return the AzureWorkloadBackupRequest object itself.
     */
    public AzureWorkloadBackupRequest withEnableCompression(Boolean enableCompression) {
        this.enableCompression = enableCompression;
        return this;
    }

    /**
     * Get the recoveryPointExpiryTimeInUtc property: Backup copy will expire after the time specified (UTC).
     *
     * @return the recoveryPointExpiryTimeInUtc value.
     */
    public OffsetDateTime recoveryPointExpiryTimeInUtc() {
        return this.recoveryPointExpiryTimeInUtc;
    }

    /**
     * Set the recoveryPointExpiryTimeInUtc property: Backup copy will expire after the time specified (UTC).
     *
     * @param recoveryPointExpiryTimeInUtc the recoveryPointExpiryTimeInUtc value to set.
     * @return the AzureWorkloadBackupRequest object itself.
     */
    public AzureWorkloadBackupRequest withRecoveryPointExpiryTimeInUtc(OffsetDateTime recoveryPointExpiryTimeInUtc) {
        this.recoveryPointExpiryTimeInUtc = recoveryPointExpiryTimeInUtc;
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
