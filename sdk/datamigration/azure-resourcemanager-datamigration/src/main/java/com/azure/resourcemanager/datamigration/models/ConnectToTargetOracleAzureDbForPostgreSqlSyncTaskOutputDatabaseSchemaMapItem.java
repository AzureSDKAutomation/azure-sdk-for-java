// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutputDatabaseSchemaMapItem model. */
@Fluent
public final class ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutputDatabaseSchemaMapItem {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutputDatabaseSchemaMapItem.class);

    /*
     * The database property.
     */
    @JsonProperty(value = "database")
    private String database;

    /*
     * The schemas property.
     */
    @JsonProperty(value = "schemas")
    private List<String> schemas;

    /**
     * Get the database property: The database property.
     *
     * @return the database value.
     */
    public String database() {
        return this.database;
    }

    /**
     * Set the database property: The database property.
     *
     * @param database the database value to set.
     * @return the ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutputDatabaseSchemaMapItem object itself.
     */
    public ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutputDatabaseSchemaMapItem withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * Get the schemas property: The schemas property.
     *
     * @return the schemas value.
     */
    public List<String> schemas() {
        return this.schemas;
    }

    /**
     * Set the schemas property: The schemas property.
     *
     * @param schemas the schemas value to set.
     * @return the ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutputDatabaseSchemaMapItem object itself.
     */
    public ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskOutputDatabaseSchemaMapItem withSchemas(
        List<String> schemas) {
        this.schemas = schemas;
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
