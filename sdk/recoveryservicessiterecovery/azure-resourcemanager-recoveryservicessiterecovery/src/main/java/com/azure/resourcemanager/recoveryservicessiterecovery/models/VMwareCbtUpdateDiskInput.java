// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VMwareCbt disk input for update. */
@Fluent
public final class VMwareCbtUpdateDiskInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VMwareCbtUpdateDiskInput.class);

    /*
     * The disk Id.
     */
    @JsonProperty(value = "diskId", required = true)
    private String diskId;

    /*
     * The target disk name.
     */
    @JsonProperty(value = "targetDiskName")
    private String targetDiskName;

    /**
     * Get the diskId property: The disk Id.
     *
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId property: The disk Id.
     *
     * @param diskId the diskId value to set.
     * @return the VMwareCbtUpdateDiskInput object itself.
     */
    public VMwareCbtUpdateDiskInput withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the targetDiskName property: The target disk name.
     *
     * @return the targetDiskName value.
     */
    public String targetDiskName() {
        return this.targetDiskName;
    }

    /**
     * Set the targetDiskName property: The target disk name.
     *
     * @param targetDiskName the targetDiskName value to set.
     * @return the VMwareCbtUpdateDiskInput object itself.
     */
    public VMwareCbtUpdateDiskInput withTargetDiskName(String targetDiskName) {
        this.targetDiskName = targetDiskName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property diskId in model VMwareCbtUpdateDiskInput"));
        }
    }
}
