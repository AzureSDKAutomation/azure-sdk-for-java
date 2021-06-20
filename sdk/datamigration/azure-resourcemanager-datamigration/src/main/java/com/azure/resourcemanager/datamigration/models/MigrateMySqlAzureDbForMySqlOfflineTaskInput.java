// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Input for the task that migrates MySQL databases to Azure Database for MySQL for offline migrations. */
@Fluent
public final class MigrateMySqlAzureDbForMySqlOfflineTaskInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrateMySqlAzureDbForMySqlOfflineTaskInput.class);

    /*
     * Connection information for source MySQL
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private MySqlConnectionInfo sourceConnectionInfo;

    /*
     * Connection information for target Azure Database for MySQL
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private MySqlConnectionInfo targetConnectionInfo;

    /*
     * Databases to migrate
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<MigrateMySqlAzureDbForMySqlOfflineDatabaseInput> selectedDatabases;

    /*
     * Setting to set the source server read only
     */
    @JsonProperty(value = "makeSourceServerReadOnly")
    private Boolean makeSourceServerReadOnly;

    /*
     * Parameter to specify when the migration started
     */
    @JsonProperty(value = "startedOn")
    private OffsetDateTime startedOn;

    /*
     * Optional parameters for fine tuning the data transfer rate during
     * migration
     */
    @JsonProperty(value = "optionalAgentSettings")
    private Map<String, String> optionalAgentSettings;

    /**
     * Get the sourceConnectionInfo property: Connection information for source MySQL.
     *
     * @return the sourceConnectionInfo value.
     */
    public MySqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set the sourceConnectionInfo property: Connection information for source MySQL.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set.
     * @return the MigrateMySqlAzureDbForMySqlOfflineTaskInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlOfflineTaskInput withSourceConnectionInfo(
        MySqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get the targetConnectionInfo property: Connection information for target Azure Database for MySQL.
     *
     * @return the targetConnectionInfo value.
     */
    public MySqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Connection information for target Azure Database for MySQL.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the MigrateMySqlAzureDbForMySqlOfflineTaskInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlOfflineTaskInput withTargetConnectionInfo(
        MySqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get the selectedDatabases property: Databases to migrate.
     *
     * @return the selectedDatabases value.
     */
    public List<MigrateMySqlAzureDbForMySqlOfflineDatabaseInput> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set the selectedDatabases property: Databases to migrate.
     *
     * @param selectedDatabases the selectedDatabases value to set.
     * @return the MigrateMySqlAzureDbForMySqlOfflineTaskInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlOfflineTaskInput withSelectedDatabases(
        List<MigrateMySqlAzureDbForMySqlOfflineDatabaseInput> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

    /**
     * Get the makeSourceServerReadOnly property: Setting to set the source server read only.
     *
     * @return the makeSourceServerReadOnly value.
     */
    public Boolean makeSourceServerReadOnly() {
        return this.makeSourceServerReadOnly;
    }

    /**
     * Set the makeSourceServerReadOnly property: Setting to set the source server read only.
     *
     * @param makeSourceServerReadOnly the makeSourceServerReadOnly value to set.
     * @return the MigrateMySqlAzureDbForMySqlOfflineTaskInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlOfflineTaskInput withMakeSourceServerReadOnly(Boolean makeSourceServerReadOnly) {
        this.makeSourceServerReadOnly = makeSourceServerReadOnly;
        return this;
    }

    /**
     * Get the startedOn property: Parameter to specify when the migration started.
     *
     * @return the startedOn value.
     */
    public OffsetDateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Set the startedOn property: Parameter to specify when the migration started.
     *
     * @param startedOn the startedOn value to set.
     * @return the MigrateMySqlAzureDbForMySqlOfflineTaskInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlOfflineTaskInput withStartedOn(OffsetDateTime startedOn) {
        this.startedOn = startedOn;
        return this;
    }

    /**
     * Get the optionalAgentSettings property: Optional parameters for fine tuning the data transfer rate during
     * migration.
     *
     * @return the optionalAgentSettings value.
     */
    public Map<String, String> optionalAgentSettings() {
        return this.optionalAgentSettings;
    }

    /**
     * Set the optionalAgentSettings property: Optional parameters for fine tuning the data transfer rate during
     * migration.
     *
     * @param optionalAgentSettings the optionalAgentSettings value to set.
     * @return the MigrateMySqlAzureDbForMySqlOfflineTaskInput object itself.
     */
    public MigrateMySqlAzureDbForMySqlOfflineTaskInput withOptionalAgentSettings(
        Map<String, String> optionalAgentSettings) {
        this.optionalAgentSettings = optionalAgentSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceConnectionInfo in model"
                            + " MigrateMySqlAzureDbForMySqlOfflineTaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
        if (targetConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model"
                            + " MigrateMySqlAzureDbForMySqlOfflineTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
        if (selectedDatabases() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property selectedDatabases in model"
                            + " MigrateMySqlAzureDbForMySqlOfflineTaskInput"));
        } else {
            selectedDatabases().forEach(e -> e.validate());
        }
    }
}
