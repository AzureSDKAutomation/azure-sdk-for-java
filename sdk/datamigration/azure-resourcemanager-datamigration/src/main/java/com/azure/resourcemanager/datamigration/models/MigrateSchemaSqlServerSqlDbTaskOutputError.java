// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The MigrateSchemaSqlServerSqlDbTaskOutputError model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("SchemaErrorOutput")
@Immutable
public final class MigrateSchemaSqlServerSqlDbTaskOutputError extends MigrateSchemaSqlServerSqlDbTaskOutput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrateSchemaSqlServerSqlDbTaskOutputError.class);

    /*
     * Schema command which failed
     */
    @JsonProperty(value = "commandText", access = JsonProperty.Access.WRITE_ONLY)
    private String commandText;

    /*
     * Reason of failure
     */
    @JsonProperty(value = "errorText", access = JsonProperty.Access.WRITE_ONLY)
    private String errorText;

    /**
     * Get the commandText property: Schema command which failed.
     *
     * @return the commandText value.
     */
    public String commandText() {
        return this.commandText;
    }

    /**
     * Get the errorText property: Reason of failure.
     *
     * @return the errorText value.
     */
    public String errorText() {
        return this.errorText;
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
