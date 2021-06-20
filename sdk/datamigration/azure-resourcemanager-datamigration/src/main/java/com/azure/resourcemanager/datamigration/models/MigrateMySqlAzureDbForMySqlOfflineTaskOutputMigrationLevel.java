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
import java.time.OffsetDateTime;
import java.util.List;

/** The MigrateMySqlAzureDbForMySqlOfflineTaskOutputMigrationLevel model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("MigrationLevelOutput")
@Fluent
public final class MigrateMySqlAzureDbForMySqlOfflineTaskOutputMigrationLevel
    extends MigrateMySqlAzureDbForMySqlOfflineTaskOutput {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(MigrateMySqlAzureDbForMySqlOfflineTaskOutputMigrationLevel.class);

    /*
     * Migration start time
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startedOn;

    /*
     * Migration end time
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endedOn;

    /*
     * Duration of task execution in seconds.
     */
    @JsonProperty(value = "durationInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Long durationInSeconds;

    /*
     * Current status of migration
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationStatus status;

    /*
     * Migration status message
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String statusMessage;

    /*
     * Migration progress message
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Selected databases as a map from database name to database id
     */
    @JsonProperty(value = "databases")
    private String databases;

    /*
     * Summary of database results in the migration
     */
    @JsonProperty(value = "databaseSummary", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseSummary;

    /*
     * Migration Report Result, provides unique url for downloading your
     * migration report.
     */
    @JsonProperty(value = "migrationReportResult")
    private MigrationReportResult migrationReportResult;

    /*
     * Source server version
     */
    @JsonProperty(value = "sourceServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerVersion;

    /*
     * Source server brand version
     */
    @JsonProperty(value = "sourceServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerBrandVersion;

    /*
     * Target server version
     */
    @JsonProperty(value = "targetServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerVersion;

    /*
     * Target server brand version
     */
    @JsonProperty(value = "targetServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerBrandVersion;

    /*
     * Migration exceptions and warnings.
     */
    @JsonProperty(value = "exceptionsAndWarnings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> exceptionsAndWarnings;

    /*
     * Last time the storage was updated
     */
    @JsonProperty(value = "lastStorageUpdate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastStorageUpdate;

    /**
     * Get the startedOn property: Migration start time.
     *
     * @return the startedOn value.
     */
    public OffsetDateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get the endedOn property: Migration end time.
     *
     * @return the endedOn value.
     */
    public OffsetDateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get the durationInSeconds property: Duration of task execution in seconds.
     *
     * @return the durationInSeconds value.
     */
    public Long durationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * Get the status property: Current status of migration.
     *
     * @return the status value.
     */
    public MigrationStatus status() {
        return this.status;
    }

    /**
     * Get the statusMessage property: Migration status message.
     *
     * @return the statusMessage value.
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Get the message property: Migration progress message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the databases property: Selected databases as a map from database name to database id.
     *
     * @return the databases value.
     */
    public String databases() {
        return this.databases;
    }

    /**
     * Set the databases property: Selected databases as a map from database name to database id.
     *
     * @param databases the databases value to set.
     * @return the MigrateMySqlAzureDbForMySqlOfflineTaskOutputMigrationLevel object itself.
     */
    public MigrateMySqlAzureDbForMySqlOfflineTaskOutputMigrationLevel withDatabases(String databases) {
        this.databases = databases;
        return this;
    }

    /**
     * Get the databaseSummary property: Summary of database results in the migration.
     *
     * @return the databaseSummary value.
     */
    public String databaseSummary() {
        return this.databaseSummary;
    }

    /**
     * Get the migrationReportResult property: Migration Report Result, provides unique url for downloading your
     * migration report.
     *
     * @return the migrationReportResult value.
     */
    public MigrationReportResult migrationReportResult() {
        return this.migrationReportResult;
    }

    /**
     * Set the migrationReportResult property: Migration Report Result, provides unique url for downloading your
     * migration report.
     *
     * @param migrationReportResult the migrationReportResult value to set.
     * @return the MigrateMySqlAzureDbForMySqlOfflineTaskOutputMigrationLevel object itself.
     */
    public MigrateMySqlAzureDbForMySqlOfflineTaskOutputMigrationLevel withMigrationReportResult(
        MigrationReportResult migrationReportResult) {
        this.migrationReportResult = migrationReportResult;
        return this;
    }

    /**
     * Get the sourceServerVersion property: Source server version.
     *
     * @return the sourceServerVersion value.
     */
    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Get the sourceServerBrandVersion property: Source server brand version.
     *
     * @return the sourceServerBrandVersion value.
     */
    public String sourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    /**
     * Get the targetServerVersion property: Target server version.
     *
     * @return the targetServerVersion value.
     */
    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    /**
     * Get the targetServerBrandVersion property: Target server brand version.
     *
     * @return the targetServerBrandVersion value.
     */
    public String targetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Get the exceptionsAndWarnings property: Migration exceptions and warnings.
     *
     * @return the exceptionsAndWarnings value.
     */
    public List<ReportableException> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

    /**
     * Get the lastStorageUpdate property: Last time the storage was updated.
     *
     * @return the lastStorageUpdate value.
     */
    public OffsetDateTime lastStorageUpdate() {
        return this.lastStorageUpdate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (migrationReportResult() != null) {
            migrationReportResult().validate();
        }
        if (exceptionsAndWarnings() != null) {
            exceptionsAndWarnings().forEach(e -> e.validate());
        }
    }
}
