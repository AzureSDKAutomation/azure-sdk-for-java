// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Extended info class details. */
@Immutable
public final class AzureWorkloadSqlRecoveryPointExtendedInfoAutoGenerated {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AzureWorkloadSqlRecoveryPointExtendedInfoAutoGenerated.class);

    /*
     * UTC time at which data directory info was captured
     */
    @JsonProperty(value = "dataDirectoryTimeInUTC", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime dataDirectoryTimeInUtc;

    /*
     * List of data directory paths during restore operation.
     */
    @JsonProperty(value = "dataDirectoryPaths", access = JsonProperty.Access.WRITE_ONLY)
    private List<SqlDataDirectory> dataDirectoryPaths;

    /**
     * Get the dataDirectoryTimeInUtc property: UTC time at which data directory info was captured.
     *
     * @return the dataDirectoryTimeInUtc value.
     */
    public OffsetDateTime dataDirectoryTimeInUtc() {
        return this.dataDirectoryTimeInUtc;
    }

    /**
     * Get the dataDirectoryPaths property: List of data directory paths during restore operation.
     *
     * @return the dataDirectoryPaths value.
     */
    public List<SqlDataDirectory> dataDirectoryPaths() {
        return this.dataDirectoryPaths;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataDirectoryPaths() != null) {
            dataDirectoryPaths().forEach(e -> e.validate());
        }
    }
}
