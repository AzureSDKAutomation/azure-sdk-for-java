/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import org.joda.time.DateTime;
import java.util.Map;
import com.microsoft.azure.management.storage.v2019_08_01_preview.EnabledProtocols;
import com.microsoft.azure.management.storage.v2019_08_01_preview.RootSquashType;
import com.microsoft.azure.management.storage.v2019_08_01_preview.ShareAccessTier;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.storage.v2019_08_01_preview.AzureEntityResource;

/**
 * Properties of the file share, including Id, resource name, resource type,
 * Etag.
 */
@JsonFlatten
public class FileShareInner extends AzureEntityResource {
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
     * The authentication protocol that is used for the file share. Can only be
     * specified when creating a share. Possible values include: 'SMB', 'NFS'.
     */
    @JsonProperty(value = "properties.enabledProtocols")
    private EnabledProtocols enabledProtocols;

    /**
     * The property is for NFS share only. The default is NoRootSquash.
     * Possible values include: 'NoRootSquash', 'RootSquash', 'AllSquash'.
     */
    @JsonProperty(value = "properties.rootSquash")
    private RootSquashType rootSquash;

    /**
     * The version of the share.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
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
     * Access tier for specific share. GpV2 account can choose between
     * TransactionOptimized (default), Hot, and Cool. FileStorage account can
     * choose Premium. Possible values include: 'TransactionOptimized', 'Hot',
     * 'Cool', 'Premium'.
     */
    @JsonProperty(value = "properties.accessTier")
    private ShareAccessTier accessTier;

    /**
     * Indicates the last modification time for share access tier.
     */
    @JsonProperty(value = "properties.accessTierChangeTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime accessTierChangeTime;

    /**
     * Indicates if there is a pending transition for access tier.
     */
    @JsonProperty(value = "properties.accessTierStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String accessTierStatus;

    /**
     * The approximate size of the data stored on the share. Note that this
     * value may not include all recently created or recently resized files.
     */
    @JsonProperty(value = "properties.shareUsageBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long shareUsageBytes;

    /**
     * Creation time of share snapshot returned in the response of list shares
     * with expand param "snapshots".
     */
    @JsonProperty(value = "properties.snapshotTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime snapshotTime;

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
     * @return the FileShareInner object itself.
     */
    public FileShareInner withMetadata(Map<String, String> metadata) {
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
     * @return the FileShareInner object itself.
     */
    public FileShareInner withShareQuota(Integer shareQuota) {
        this.shareQuota = shareQuota;
        return this;
    }

    /**
     * Get the authentication protocol that is used for the file share. Can only be specified when creating a share. Possible values include: 'SMB', 'NFS'.
     *
     * @return the enabledProtocols value
     */
    public EnabledProtocols enabledProtocols() {
        return this.enabledProtocols;
    }

    /**
     * Set the authentication protocol that is used for the file share. Can only be specified when creating a share. Possible values include: 'SMB', 'NFS'.
     *
     * @param enabledProtocols the enabledProtocols value to set
     * @return the FileShareInner object itself.
     */
    public FileShareInner withEnabledProtocols(EnabledProtocols enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
        return this;
    }

    /**
     * Get the property is for NFS share only. The default is NoRootSquash. Possible values include: 'NoRootSquash', 'RootSquash', 'AllSquash'.
     *
     * @return the rootSquash value
     */
    public RootSquashType rootSquash() {
        return this.rootSquash;
    }

    /**
     * Set the property is for NFS share only. The default is NoRootSquash. Possible values include: 'NoRootSquash', 'RootSquash', 'AllSquash'.
     *
     * @param rootSquash the rootSquash value to set
     * @return the FileShareInner object itself.
     */
    public FileShareInner withRootSquash(RootSquashType rootSquash) {
        this.rootSquash = rootSquash;
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

    /**
     * Get access tier for specific share. GpV2 account can choose between TransactionOptimized (default), Hot, and Cool. FileStorage account can choose Premium. Possible values include: 'TransactionOptimized', 'Hot', 'Cool', 'Premium'.
     *
     * @return the accessTier value
     */
    public ShareAccessTier accessTier() {
        return this.accessTier;
    }

    /**
     * Set access tier for specific share. GpV2 account can choose between TransactionOptimized (default), Hot, and Cool. FileStorage account can choose Premium. Possible values include: 'TransactionOptimized', 'Hot', 'Cool', 'Premium'.
     *
     * @param accessTier the accessTier value to set
     * @return the FileShareInner object itself.
     */
    public FileShareInner withAccessTier(ShareAccessTier accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    /**
     * Get indicates the last modification time for share access tier.
     *
     * @return the accessTierChangeTime value
     */
    public DateTime accessTierChangeTime() {
        return this.accessTierChangeTime;
    }

    /**
     * Get indicates if there is a pending transition for access tier.
     *
     * @return the accessTierStatus value
     */
    public String accessTierStatus() {
        return this.accessTierStatus;
    }

    /**
     * Get the approximate size of the data stored on the share. Note that this value may not include all recently created or recently resized files.
     *
     * @return the shareUsageBytes value
     */
    public Long shareUsageBytes() {
        return this.shareUsageBytes;
    }

    /**
     * Get creation time of share snapshot returned in the response of list shares with expand param "snapshots".
     *
     * @return the snapshotTime value
     */
    public DateTime snapshotTime() {
        return this.snapshotTime;
    }

}
