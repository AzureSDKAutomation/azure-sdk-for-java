// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for the task that validates connection to Azure Database for PostgreSQL and target server requirements for
 * Oracle source.
 */
@Fluent
public final class ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskInput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskInput.class);

    /*
     * Connection information for target Azure Database for PostgreSQL server
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private PostgreSqlConnectionInfo targetConnectionInfo;

    /**
     * Get the targetConnectionInfo property: Connection information for target Azure Database for PostgreSQL server.
     *
     * @return the targetConnectionInfo value.
     */
    public PostgreSqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Connection information for target Azure Database for PostgreSQL server.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskInput object itself.
     */
    public ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskInput withTargetConnectionInfo(
        PostgreSqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model"
                            + " ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
    }
}
