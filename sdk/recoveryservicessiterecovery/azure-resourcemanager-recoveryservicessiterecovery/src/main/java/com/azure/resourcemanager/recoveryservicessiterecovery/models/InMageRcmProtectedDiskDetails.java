// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** InMageRcm protected disk details. */
@Immutable
public final class InMageRcmProtectedDiskDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InMageRcmProtectedDiskDetails.class);

    /*
     * The disk Id.
     */
    @JsonProperty(value = "diskId", access = JsonProperty.Access.WRITE_ONLY)
    private String diskId;

    /*
     * The disk name.
     */
    @JsonProperty(value = "diskName", access = JsonProperty.Access.WRITE_ONLY)
    private String diskName;

    /*
     * A value indicating whether the disk is the OS disk.
     */
    @JsonProperty(value = "isOSDisk", access = JsonProperty.Access.WRITE_ONLY)
    private String isOSDisk;

    /*
     * The disk capacity in bytes.
     */
    @JsonProperty(value = "capacityInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long capacityInBytes;

    /*
     * The log storage account ARM Id.
     */
    @JsonProperty(value = "logStorageAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String logStorageAccountId;

    /*
     * The disk encryption set ARM Id.
     */
    @JsonProperty(value = "diskEncryptionSetId", access = JsonProperty.Access.WRITE_ONLY)
    private String diskEncryptionSetId;

    /*
     * The ARM Id of the seed managed disk.
     */
    @JsonProperty(value = "seedManagedDiskId", access = JsonProperty.Access.WRITE_ONLY)
    private String seedManagedDiskId;

    /*
     * The ARM Id of the target managed disk.
     */
    @JsonProperty(value = "targetManagedDiskId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetManagedDiskId;

    /*
     * The disk type.
     */
    @JsonProperty(value = "diskType", access = JsonProperty.Access.WRITE_ONLY)
    private DiskAccountType diskType;

    /**
     * Get the diskId property: The disk Id.
     *
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Get the diskName property: The disk name.
     *
     * @return the diskName value.
     */
    public String diskName() {
        return this.diskName;
    }

    /**
     * Get the isOSDisk property: A value indicating whether the disk is the OS disk.
     *
     * @return the isOSDisk value.
     */
    public String isOSDisk() {
        return this.isOSDisk;
    }

    /**
     * Get the capacityInBytes property: The disk capacity in bytes.
     *
     * @return the capacityInBytes value.
     */
    public Long capacityInBytes() {
        return this.capacityInBytes;
    }

    /**
     * Get the logStorageAccountId property: The log storage account ARM Id.
     *
     * @return the logStorageAccountId value.
     */
    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * Get the diskEncryptionSetId property: The disk encryption set ARM Id.
     *
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Get the seedManagedDiskId property: The ARM Id of the seed managed disk.
     *
     * @return the seedManagedDiskId value.
     */
    public String seedManagedDiskId() {
        return this.seedManagedDiskId;
    }

    /**
     * Get the targetManagedDiskId property: The ARM Id of the target managed disk.
     *
     * @return the targetManagedDiskId value.
     */
    public String targetManagedDiskId() {
        return this.targetManagedDiskId;
    }

    /**
     * Get the diskType property: The disk type.
     *
     * @return the diskType value.
     */
    public DiskAccountType diskType() {
        return this.diskType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
