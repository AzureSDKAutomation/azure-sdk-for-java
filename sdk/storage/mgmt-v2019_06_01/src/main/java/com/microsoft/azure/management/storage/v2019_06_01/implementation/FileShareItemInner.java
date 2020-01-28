/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import org.joda.time.DateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.storage.v2019_06_01.AzureEntityResource;

/**
 * The file share properties be listed out.
 */
@JsonFlatten
public class FileShareItemInner extends AzureEntityResource {
    /**
     * Returns the date and time the share was last modified.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * A name-value pair to associate with the share as metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Map<String, String> metadata;

    /**
     * The maximum size of the share, in gigabytes. Must be greater than 0, and
     * less than or equal to 5TB (5120). For Large File Shares, the maximum
     * size is 102400.
     */
    @JsonProperty(value = "properties.shareQuota")
    private Integer shareQuota;

    /**
     * The version of the share.
     */
    @JsonProperty(value = "properties.version")
    private String version;

    /**
     * Indicates whether the share was deleted.
     */
    @JsonProperty(value = "properties.deleted", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean deleted;

    /**
     * The deleted time if the share was deleted.
     */
    @JsonProperty(value = "properties.deletedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime deletedTime;

    /**
     * Remaining retention days for share that was soft deleted.
     */
    @JsonProperty(value = "properties.remainingRetentionDays", access = JsonProperty.Access.WRITE_ONLY)
    private Integer remainingRetentionDays;

    /**
     * Get returns the date and time the share was last modified.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get a name-value pair to associate with the share as metadata.
     *
     * @return the metadata value
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set a name-value pair to associate with the share as metadata.
     *
     * @param metadata the metadata value to set
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the maximum size of the share, in gigabytes. Must be greater than 0, and less than or equal to 5TB (5120). For Large File Shares, the maximum size is 102400.
     *
     * @return the shareQuota value
     */
    public Integer shareQuota() {
        return this.shareQuota;
    }

    /**
     * Set the maximum size of the share, in gigabytes. Must be greater than 0, and less than or equal to 5TB (5120). For Large File Shares, the maximum size is 102400.
     *
     * @param shareQuota the shareQuota value to set
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withShareQuota(Integer shareQuota) {
        this.shareQuota = shareQuota;
        return this;
    }

    /**
     * Get the version of the share.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version of the share.
     *
     * @param version the version value to set
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get indicates whether the share was deleted.
     *
     * @return the deleted value
     */
    public Boolean deleted() {
        return this.deleted;
    }

    /**
     * Get the deleted time if the share was deleted.
     *
     * @return the deletedTime value
     */
    public DateTime deletedTime() {
        return this.deletedTime;
    }

    /**
     * Get remaining retention days for share that was soft deleted.
     *
     * @return the remainingRetentionDays value
     */
    public Integer remainingRetentionDays() {
        return this.remainingRetentionDays;
    }

}
