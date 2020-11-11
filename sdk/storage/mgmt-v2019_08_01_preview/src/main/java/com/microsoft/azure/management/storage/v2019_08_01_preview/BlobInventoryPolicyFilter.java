/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that defines the blob inventory rule filter conditions.
 */
public class BlobInventoryPolicyFilter {
    /**
     * An array of strings for blob prefixes to be matched.
     */
    @JsonProperty(value = "prefixMatch")
    private List<String> prefixMatch;

    /**
     * An array of predefined enum values. Valid values include blockBlob,
     * appendBlob, pageBlob. Hns accounts does not support pageBlobs.
     */
    @JsonProperty(value = "blobTypes", required = true)
    private List<String> blobTypes;

    /**
     * Includes blob versions in blob inventory when value set to true.
     */
    @JsonProperty(value = "includeBlobVersions")
    private Boolean includeBlobVersions;

    /**
     * Includes blob snapshots in blob inventory when value set to true.
     */
    @JsonProperty(value = "includeSnapshots")
    private Boolean includeSnapshots;

    /**
     * Get an array of strings for blob prefixes to be matched.
     *
     * @return the prefixMatch value
     */
    public List<String> prefixMatch() {
        return this.prefixMatch;
    }

    /**
     * Set an array of strings for blob prefixes to be matched.
     *
     * @param prefixMatch the prefixMatch value to set
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withPrefixMatch(List<String> prefixMatch) {
        this.prefixMatch = prefixMatch;
        return this;
    }

    /**
     * Get an array of predefined enum values. Valid values include blockBlob, appendBlob, pageBlob. Hns accounts does not support pageBlobs.
     *
     * @return the blobTypes value
     */
    public List<String> blobTypes() {
        return this.blobTypes;
    }

    /**
     * Set an array of predefined enum values. Valid values include blockBlob, appendBlob, pageBlob. Hns accounts does not support pageBlobs.
     *
     * @param blobTypes the blobTypes value to set
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withBlobTypes(List<String> blobTypes) {
        this.blobTypes = blobTypes;
        return this;
    }

    /**
     * Get includes blob versions in blob inventory when value set to true.
     *
     * @return the includeBlobVersions value
     */
    public Boolean includeBlobVersions() {
        return this.includeBlobVersions;
    }

    /**
     * Set includes blob versions in blob inventory when value set to true.
     *
     * @param includeBlobVersions the includeBlobVersions value to set
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withIncludeBlobVersions(Boolean includeBlobVersions) {
        this.includeBlobVersions = includeBlobVersions;
        return this;
    }

    /**
     * Get includes blob snapshots in blob inventory when value set to true.
     *
     * @return the includeSnapshots value
     */
    public Boolean includeSnapshots() {
        return this.includeSnapshots;
    }

    /**
     * Set includes blob snapshots in blob inventory when value set to true.
     *
     * @param includeSnapshots the includeSnapshots value to set
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withIncludeSnapshots(Boolean includeSnapshots) {
        this.includeSnapshots = includeSnapshots;
        return this;
    }

}
