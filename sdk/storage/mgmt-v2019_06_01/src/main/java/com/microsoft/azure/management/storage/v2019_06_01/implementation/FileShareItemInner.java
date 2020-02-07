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
import com.microsoft.azure.management.storage.v2019_06_01.EnabledProtocols;
import com.microsoft.azure.management.storage.v2019_06_01.RootSquashType;
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
     * Immutable property for file shares protocol. Possible values include:
     * 'SMB', 'NFS'.
     */
    @JsonProperty(value = "properties.enabledProtocols")
    private EnabledProtocols enabledProtocols;

    /**
     * Reduction of the access rights for the remote superuser. Possible values
     * include: 'NoRootSquash', 'RootSquash', 'AllSquash'.
     */
    @JsonProperty(value = "properties.rootSquash")
    private RootSquashType rootSquash;

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
     * Get immutable property for file shares protocol. Possible values include: 'SMB', 'NFS'.
     *
     * @return the enabledProtocols value
     */
    public EnabledProtocols enabledProtocols() {
        return this.enabledProtocols;
    }

    /**
     * Set immutable property for file shares protocol. Possible values include: 'SMB', 'NFS'.
     *
     * @param enabledProtocols the enabledProtocols value to set
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withEnabledProtocols(EnabledProtocols enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
        return this;
    }

    /**
     * Get reduction of the access rights for the remote superuser. Possible values include: 'NoRootSquash', 'RootSquash', 'AllSquash'.
     *
     * @return the rootSquash value
     */
    public RootSquashType rootSquash() {
        return this.rootSquash;
    }

    /**
     * Set reduction of the access rights for the remote superuser. Possible values include: 'NoRootSquash', 'RootSquash', 'AllSquash'.
     *
     * @param rootSquash the rootSquash value to set
     * @return the FileShareItemInner object itself.
     */
    public FileShareItemInner withRootSquash(RootSquashType rootSquash) {
        this.rootSquash = rootSquash;
        return this;
    }

}
