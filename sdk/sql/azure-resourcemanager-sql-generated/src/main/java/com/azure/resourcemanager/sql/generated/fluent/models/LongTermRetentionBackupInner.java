// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.BackupStorageRedundancy;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A long term retention backup. */
@JsonFlatten
@Fluent
public class LongTermRetentionBackupInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LongTermRetentionBackupInner.class);

    /*
     * The server name that the backup database belong to.
     */
    @JsonProperty(value = "properties.serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /*
     * The create time of the server.
     */
    @JsonProperty(value = "properties.serverCreateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime serverCreateTime;

    /*
     * The name of the database the backup belong to
     */
    @JsonProperty(value = "properties.databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * The delete time of the database
     */
    @JsonProperty(value = "properties.databaseDeletionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime databaseDeletionTime;

    /*
     * The time the backup was taken
     */
    @JsonProperty(value = "properties.backupTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime backupTime;

    /*
     * The time the long term retention backup will expire.
     */
    @JsonProperty(value = "properties.backupExpirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime backupExpirationTime;

    /*
     * The storage redundancy type of the backup
     */
    @JsonProperty(value = "properties.backupStorageRedundancy", access = JsonProperty.Access.WRITE_ONLY)
    private BackupStorageRedundancy backupStorageRedundancy;

    /*
     * The storage redundancy type of the backup
     */
    @JsonProperty(value = "properties.requestedBackupStorageRedundancy")
    private BackupStorageRedundancy requestedBackupStorageRedundancy;

    /**
     * Get the serverName property: The server name that the backup database belong to.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the serverCreateTime property: The create time of the server.
     *
     * @return the serverCreateTime value.
     */
    public OffsetDateTime serverCreateTime() {
        return this.serverCreateTime;
    }

    /**
     * Get the databaseName property: The name of the database the backup belong to.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the databaseDeletionTime property: The delete time of the database.
     *
     * @return the databaseDeletionTime value.
     */
    public OffsetDateTime databaseDeletionTime() {
        return this.databaseDeletionTime;
    }

    /**
     * Get the backupTime property: The time the backup was taken.
     *
     * @return the backupTime value.
     */
    public OffsetDateTime backupTime() {
        return this.backupTime;
    }

    /**
     * Get the backupExpirationTime property: The time the long term retention backup will expire.
     *
     * @return the backupExpirationTime value.
     */
    public OffsetDateTime backupExpirationTime() {
        return this.backupExpirationTime;
    }

    /**
     * Get the backupStorageRedundancy property: The storage redundancy type of the backup.
     *
     * @return the backupStorageRedundancy value.
     */
    public BackupStorageRedundancy backupStorageRedundancy() {
        return this.backupStorageRedundancy;
    }

    /**
     * Get the requestedBackupStorageRedundancy property: The storage redundancy type of the backup.
     *
     * @return the requestedBackupStorageRedundancy value.
     */
    public BackupStorageRedundancy requestedBackupStorageRedundancy() {
        return this.requestedBackupStorageRedundancy;
    }

    /**
     * Set the requestedBackupStorageRedundancy property: The storage redundancy type of the backup.
     *
     * @param requestedBackupStorageRedundancy the requestedBackupStorageRedundancy value to set.
     * @return the LongTermRetentionBackupInner object itself.
     */
    public LongTermRetentionBackupInner withRequestedBackupStorageRedundancy(
        BackupStorageRedundancy requestedBackupStorageRedundancy) {
        this.requestedBackupStorageRedundancy = requestedBackupStorageRedundancy;
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
