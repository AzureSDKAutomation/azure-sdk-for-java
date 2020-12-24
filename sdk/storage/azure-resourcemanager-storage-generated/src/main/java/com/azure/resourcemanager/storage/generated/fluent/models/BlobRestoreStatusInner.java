// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.models.BlobRestoreParameters;
import com.azure.resourcemanager.storage.generated.models.BlobRestoreProgressStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Blob restore status. */
@Immutable
public final class BlobRestoreStatusInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobRestoreStatusInner.class);

    /*
     * The status of blob restore progress. Possible values are: - InProgress:
     * Indicates that blob restore is ongoing. - Complete: Indicates that blob
     * restore has been completed successfully. - Failed: Indicates that blob
     * restore is failed.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private BlobRestoreProgressStatus status;

    /*
     * Failure reason when blob restore is failed.
     */
    @JsonProperty(value = "failureReason", access = JsonProperty.Access.WRITE_ONLY)
    private String failureReason;

    /*
     * Id for tracking blob restore request.
     */
    @JsonProperty(value = "restoreId", access = JsonProperty.Access.WRITE_ONLY)
    private String restoreId;

    /*
     * Blob restore request parameters.
     */
    @JsonProperty(value = "parameters", access = JsonProperty.Access.WRITE_ONLY)
    private BlobRestoreParameters parameters;

    /**
     * Get the status property: The status of blob restore progress. Possible values are: - InProgress: Indicates that
     * blob restore is ongoing. - Complete: Indicates that blob restore has been completed successfully. - Failed:
     * Indicates that blob restore is failed.
     *
     * @return the status value.
     */
    public BlobRestoreProgressStatus status() {
        return this.status;
    }

    /**
     * Get the failureReason property: Failure reason when blob restore is failed.
     *
     * @return the failureReason value.
     */
    public String failureReason() {
        return this.failureReason;
    }

    /**
     * Get the restoreId property: Id for tracking blob restore request.
     *
     * @return the restoreId value.
     */
    public String restoreId() {
        return this.restoreId;
    }

    /**
     * Get the parameters property: Blob restore request parameters.
     *
     * @return the parameters value.
     */
    public BlobRestoreParameters parameters() {
        return this.parameters;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().validate();
        }
    }
}
