// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Actions are applied to the filtered blobs when the execution condition is met. */
@Fluent
public final class ManagementPolicyAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementPolicyAction.class);

    /*
     * The management policy action for base blob
     */
    @JsonProperty(value = "baseBlob")
    private ManagementPolicyBaseBlob baseBlob;

    /*
     * The management policy action for snapshot
     */
    @JsonProperty(value = "snapshot")
    private ManagementPolicySnapShot snapshot;

    /*
     * The management policy action for version
     */
    @JsonProperty(value = "version")
    private ManagementPolicyVersion version;

    /**
     * Get the baseBlob property: The management policy action for base blob.
     *
     * @return the baseBlob value.
     */
    public ManagementPolicyBaseBlob baseBlob() {
        return this.baseBlob;
    }

    /**
     * Set the baseBlob property: The management policy action for base blob.
     *
     * @param baseBlob the baseBlob value to set.
     * @return the ManagementPolicyAction object itself.
     */
    public ManagementPolicyAction withBaseBlob(ManagementPolicyBaseBlob baseBlob) {
        this.baseBlob = baseBlob;
        return this;
    }

    /**
     * Get the snapshot property: The management policy action for snapshot.
     *
     * @return the snapshot value.
     */
    public ManagementPolicySnapShot snapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The management policy action for snapshot.
     *
     * @param snapshot the snapshot value to set.
     * @return the ManagementPolicyAction object itself.
     */
    public ManagementPolicyAction withSnapshot(ManagementPolicySnapShot snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the version property: The management policy action for version.
     *
     * @return the version value.
     */
    public ManagementPolicyVersion version() {
        return this.version;
    }

    /**
     * Set the version property: The management policy action for version.
     *
     * @param version the version value to set.
     * @return the ManagementPolicyAction object itself.
     */
    public ManagementPolicyAction withVersion(ManagementPolicyVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (baseBlob() != null) {
            baseBlob().validate();
        }
        if (snapshot() != null) {
            snapshot().validate();
        }
        if (version() != null) {
            version().validate();
        }
    }
}
