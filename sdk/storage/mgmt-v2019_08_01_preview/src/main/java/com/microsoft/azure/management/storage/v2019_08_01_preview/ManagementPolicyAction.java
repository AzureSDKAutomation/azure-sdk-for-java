/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Actions are applied to the filtered blobs when the execution condition is
 * met.
 */
public class ManagementPolicyAction {
    /**
     * The management policy action for base blob.
     */
    @JsonProperty(value = "baseBlob")
    private ManagementPolicyBaseBlob baseBlob;

    /**
     * The management policy action for snapshot.
     */
    @JsonProperty(value = "snapshot")
    private ManagementPolicySnapShot snapshot;

    /**
     * Get the management policy action for base blob.
     *
     * @return the baseBlob value
     */
    public ManagementPolicyBaseBlob baseBlob() {
        return this.baseBlob;
    }

    /**
     * Set the management policy action for base blob.
     *
     * @param baseBlob the baseBlob value to set
     * @return the ManagementPolicyAction object itself.
     */
    public ManagementPolicyAction withBaseBlob(ManagementPolicyBaseBlob baseBlob) {
        this.baseBlob = baseBlob;
        return this;
    }

    /**
     * Get the management policy action for snapshot.
     *
     * @return the snapshot value
     */
    public ManagementPolicySnapShot snapshot() {
        return this.snapshot;
    }

    /**
     * Set the management policy action for snapshot.
     *
     * @param snapshot the snapshot value to set
     * @return the ManagementPolicyAction object itself.
     */
    public ManagementPolicyAction withSnapshot(ManagementPolicySnapShot snapshot) {
        this.snapshot = snapshot;
        return this;
    }

}
