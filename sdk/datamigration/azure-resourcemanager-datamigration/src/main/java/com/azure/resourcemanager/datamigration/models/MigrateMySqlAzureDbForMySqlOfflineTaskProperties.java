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
import java.util.Map;

/** Properties for the task that migrates MySQL databases to Azure Database for MySQL for offline migrations. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("Migrate.MySql.AzureDbForMySql")
@Fluent
public final class MigrateMySqlAzureDbForMySqlOfflineTaskProperties extends ProjectTaskProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(MigrateMySqlAzureDbForMySqlOfflineTaskProperties.class);

    /*
     * Task input
     */
    @JsonProperty(value = "input")
    private MigrateMySqlAzureDbForMySqlOfflineTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<MigrateMySqlAzureDbForMySqlOfflineTaskOutput> output;

    /**
     * Get the input property: Task input.
     *
     * @return the input value.
     */
    public MigrateMySqlAzureDbForMySqlOfflineTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     *
     * @param input the input value to set.
     * @return the MigrateMySqlAzureDbForMySqlOfflineTaskProperties object itself.
     */
    public MigrateMySqlAzureDbForMySqlOfflineTaskProperties withInput(
        MigrateMySqlAzureDbForMySqlOfflineTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<MigrateMySqlAzureDbForMySqlOfflineTaskOutput> output() {
        return this.output;
    }

    /** {@inheritDoc} */
    @Override
    public MigrateMySqlAzureDbForMySqlOfflineTaskProperties withClientData(Map<String, String> clientData) {
        super.withClientData(clientData);
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
        if (input() != null) {
            input().validate();
        }
        if (output() != null) {
            output().forEach(e -> e.validate());
        }
    }
}
