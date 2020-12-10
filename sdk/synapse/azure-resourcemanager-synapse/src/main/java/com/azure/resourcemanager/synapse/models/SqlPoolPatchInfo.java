// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** A SQL Analytics pool patch info. */
@JsonFlatten
@Fluent
public class SqlPoolPatchInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolPatchInfo.class);

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * SQL pool SKU
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Maximum size in bytes
     */
    @JsonProperty(value = "properties.maxSizeBytes")
    private Long maxSizeBytes;

    /*
     * Collation mode
     */
    @JsonProperty(value = "properties.collation")
    private String collation;

    /*
     * Source database to create from
     */
    @JsonProperty(value = "properties.sourceDatabaseId")
    private String sourceDatabaseId;

    /*
     * Backup database to restore from
     */
    @JsonProperty(value = "properties.recoverableDatabaseId")
    private String recoverableDatabaseId;

    /*
     * Resource state
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * Resource status
     */
    @JsonProperty(value = "properties.status")
    private String status;

    /*
     * Snapshot time to restore
     */
    @JsonProperty(value = "properties.restorePointInTime")
    private String restorePointInTime;

    /*
     * What is this?
     */
    @JsonProperty(value = "properties.createMode")
    private String createMode;

    /*
     * Date the SQL pool was created
     */
    @JsonProperty(value = "properties.creationDate")
    private OffsetDateTime creationDate;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     *
     * @param location the location value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the sku property: SQL pool SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SQL pool SKU.
     *
     * @param sku the sku value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the maxSizeBytes property: Maximum size in bytes.
     *
     * @return the maxSizeBytes value.
     */
    public Long maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Set the maxSizeBytes property: Maximum size in bytes.
     *
     * @param maxSizeBytes the maxSizeBytes value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withMaxSizeBytes(Long maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
        return this;
    }

    /**
     * Get the collation property: Collation mode.
     *
     * @return the collation value.
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Set the collation property: Collation mode.
     *
     * @param collation the collation value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * Get the sourceDatabaseId property: Source database to create from.
     *
     * @return the sourceDatabaseId value.
     */
    public String sourceDatabaseId() {
        return this.sourceDatabaseId;
    }

    /**
     * Set the sourceDatabaseId property: Source database to create from.
     *
     * @param sourceDatabaseId the sourceDatabaseId value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
        return this;
    }

    /**
     * Get the recoverableDatabaseId property: Backup database to restore from.
     *
     * @return the recoverableDatabaseId value.
     */
    public String recoverableDatabaseId() {
        return this.recoverableDatabaseId;
    }

    /**
     * Set the recoverableDatabaseId property: Backup database to restore from.
     *
     * @param recoverableDatabaseId the recoverableDatabaseId value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withRecoverableDatabaseId(String recoverableDatabaseId) {
        this.recoverableDatabaseId = recoverableDatabaseId;
        return this;
    }

    /**
     * Get the provisioningState property: Resource state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Resource state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the status property: Resource status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Resource status.
     *
     * @param status the status value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the restorePointInTime property: Snapshot time to restore.
     *
     * @return the restorePointInTime value.
     */
    public String restorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * Set the restorePointInTime property: Snapshot time to restore.
     *
     * @param restorePointInTime the restorePointInTime value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withRestorePointInTime(String restorePointInTime) {
        this.restorePointInTime = restorePointInTime;
        return this;
    }

    /**
     * Get the createMode property: What is this?.
     *
     * @return the createMode value.
     */
    public String createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: What is this?.
     *
     * @param createMode the createMode value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withCreateMode(String createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the creationDate property: Date the SQL pool was created.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Set the creationDate property: Date the SQL pool was created.
     *
     * @param creationDate the creationDate value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
    }
}
