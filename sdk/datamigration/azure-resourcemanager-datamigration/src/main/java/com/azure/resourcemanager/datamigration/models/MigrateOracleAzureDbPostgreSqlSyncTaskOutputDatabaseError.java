// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("DatabaseLevelErrorOutput")
@Fluent
public final class MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError
    extends MigrateOracleAzureDbPostgreSqlSyncTaskOutput {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError.class);

    /*
     * Error message
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /*
     * List of error events.
     */
    @JsonProperty(value = "events")
    private List<SyncMigrationDatabaseErrorEvent> events;

    /**
     * Get the errorMessage property: Error message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Error message.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError object itself.
     */
    public MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the events property: List of error events.
     *
     * @return the events value.
     */
    public List<SyncMigrationDatabaseErrorEvent> events() {
        return this.events;
    }

    /**
     * Set the events property: List of error events.
     *
     * @param events the events value to set.
     * @return the MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError object itself.
     */
    public MigrateOracleAzureDbPostgreSqlSyncTaskOutputDatabaseError withEvents(
        List<SyncMigrationDatabaseErrorEvent> events) {
        this.events = events;
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
        if (events() != null) {
            events().forEach(e -> e.validate());
        }
    }
}
