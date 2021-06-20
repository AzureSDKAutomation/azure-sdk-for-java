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

/** The MigrateMySqlAzureDbForMySqlOfflineTaskOutputError model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("ErrorOutput")
@Immutable
public final class MigrateMySqlAzureDbForMySqlOfflineTaskOutputError
    extends MigrateMySqlAzureDbForMySqlOfflineTaskOutput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(MigrateMySqlAzureDbForMySqlOfflineTaskOutputError.class);

    /*
     * Migration error
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ReportableException error;

    /**
     * Get the error property: Migration error.
     *
     * @return the error value.
     */
    public ReportableException error() {
        return this.error;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (error() != null) {
            error().validate();
        }
    }
}
