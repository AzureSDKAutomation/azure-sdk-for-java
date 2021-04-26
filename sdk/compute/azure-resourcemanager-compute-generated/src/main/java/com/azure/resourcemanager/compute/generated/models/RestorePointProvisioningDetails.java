// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Restore Point Provisioning details. */
@Fluent
public final class RestorePointProvisioningDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorePointProvisioningDetails.class);

    /*
     * Gets the creation time of the restore point.
     */
    @JsonProperty(value = "creationTime")
    private OffsetDateTime creationTime;

    /*
     * Gets the total size of the data in all the disks which are part of the
     * restore point.
     */
    @JsonProperty(value = "totalUsedSizeInBytes")
    private Long totalUsedSizeInBytes;

    /*
     * Gets the status of the Create restore point operation.
     */
    @JsonProperty(value = "statusCode")
    private Integer statusCode;

    /*
     * Gets the status message of the Create restore point operation.
     */
    @JsonProperty(value = "statusMessage")
    private String statusMessage;

    /**
     * Get the creationTime property: Gets the creation time of the restore point.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: Gets the creation time of the restore point.
     *
     * @param creationTime the creationTime value to set.
     * @return the RestorePointProvisioningDetails object itself.
     */
    public RestorePointProvisioningDetails withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the totalUsedSizeInBytes property: Gets the total size of the data in all the disks which are part of the
     * restore point.
     *
     * @return the totalUsedSizeInBytes value.
     */
    public Long totalUsedSizeInBytes() {
        return this.totalUsedSizeInBytes;
    }

    /**
     * Set the totalUsedSizeInBytes property: Gets the total size of the data in all the disks which are part of the
     * restore point.
     *
     * @param totalUsedSizeInBytes the totalUsedSizeInBytes value to set.
     * @return the RestorePointProvisioningDetails object itself.
     */
    public RestorePointProvisioningDetails withTotalUsedSizeInBytes(Long totalUsedSizeInBytes) {
        this.totalUsedSizeInBytes = totalUsedSizeInBytes;
        return this;
    }

    /**
     * Get the statusCode property: Gets the status of the Create restore point operation.
     *
     * @return the statusCode value.
     */
    public Integer statusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode property: Gets the status of the Create restore point operation.
     *
     * @param statusCode the statusCode value to set.
     * @return the RestorePointProvisioningDetails object itself.
     */
    public RestorePointProvisioningDetails withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the statusMessage property: Gets the status message of the Create restore point operation.
     *
     * @return the statusMessage value.
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Set the statusMessage property: Gets the status message of the Create restore point operation.
     *
     * @param statusMessage the statusMessage value to set.
     * @return the RestorePointProvisioningDetails object itself.
     */
    public RestorePointProvisioningDetails withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
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
