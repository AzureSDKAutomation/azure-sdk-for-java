// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Output for the task that validates Oracle database connection. */
@Immutable
public final class ConnectToSourceOracleSyncTaskOutput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectToSourceOracleSyncTaskOutput.class);

    /*
     * Version of the source server
     */
    @JsonProperty(value = "sourceServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerVersion;

    /*
     * List of schemas on source server
     */
    @JsonProperty(value = "databases", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> databases;

    /*
     * Source server brand version
     */
    @JsonProperty(value = "sourceServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerBrandVersion;

    /*
     * Validation errors associated with the task
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /**
     * Get the sourceServerVersion property: Version of the source server.
     *
     * @return the sourceServerVersion value.
     */
    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Get the databases property: List of schemas on source server.
     *
     * @return the databases value.
     */
    public List<String> databases() {
        return this.databases;
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
     * Get the validationErrors property: Validation errors associated with the task.
     *
     * @return the validationErrors value.
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
    }
}
