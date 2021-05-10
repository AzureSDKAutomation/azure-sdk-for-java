// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Server endpoint cloud tiering status object. */
@Immutable
public final class CloudTieringFilesNotTiering {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudTieringFilesNotTiering.class);

    /*
     * Last updated timestamp
     */
    @JsonProperty(value = "lastUpdatedTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedTimestamp;

    /*
     * Last cloud tiering result (HResult)
     */
    @JsonProperty(value = "totalFileCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalFileCount;

    /*
     * Array of tiering errors
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private List<FilesNotTieringError> errors;

    /**
     * Get the lastUpdatedTimestamp property: Last updated timestamp.
     *
     * @return the lastUpdatedTimestamp value.
     */
    public OffsetDateTime lastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * Get the totalFileCount property: Last cloud tiering result (HResult).
     *
     * @return the totalFileCount value.
     */
    public Long totalFileCount() {
        return this.totalFileCount;
    }

    /**
     * Get the errors property: Array of tiering errors.
     *
     * @return the errors value.
     */
    public List<FilesNotTieringError> errors() {
        return this.errors;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
    }
}
