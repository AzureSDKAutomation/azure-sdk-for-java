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

/** Properties for task that migrates Schema for SQL Server databases to Azure SQL databases. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("MigrateSchemaSqlServerSqlDb")
@Fluent
public final class MigrateSchemaSqlServerSqlDbTaskProperties extends ProjectTaskProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrateSchemaSqlServerSqlDbTaskProperties.class);

    /*
     * Task input
     */
    @JsonProperty(value = "input")
    private MigrateSchemaSqlServerSqlDbTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<MigrateSchemaSqlServerSqlDbTaskOutput> output;

    /**
     * Get the input property: Task input.
     *
     * @return the input value.
     */
    public MigrateSchemaSqlServerSqlDbTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     *
     * @param input the input value to set.
     * @return the MigrateSchemaSqlServerSqlDbTaskProperties object itself.
     */
    public MigrateSchemaSqlServerSqlDbTaskProperties withInput(MigrateSchemaSqlServerSqlDbTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<MigrateSchemaSqlServerSqlDbTaskOutput> output() {
        return this.output;
    }

    /** {@inheritDoc} */
    @Override
    public MigrateSchemaSqlServerSqlDbTaskProperties withClientData(Map<String, String> clientData) {
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
