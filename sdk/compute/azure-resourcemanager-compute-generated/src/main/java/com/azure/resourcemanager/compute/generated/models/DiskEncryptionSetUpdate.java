// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** disk encryption set update resource. */
@JsonFlatten
@Fluent
public class DiskEncryptionSetUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskEncryptionSetUpdate.class);

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The type of key used to encrypt the data of the disk.
     */
    @JsonProperty(value = "properties.encryptionType")
    private DiskEncryptionSetType encryptionType;

    /*
     * Key Vault Key Url to be used for server side encryption of Managed Disks
     * and Snapshots
     */
    @JsonProperty(value = "properties.activeKey")
    private KeyForDiskEncryptionSet activeKey;

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
     * @return the DiskEncryptionSetUpdate object itself.
     */
    public DiskEncryptionSetUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the encryptionType property: The type of key used to encrypt the data of the disk.
     *
     * @return the encryptionType value.
     */
    public DiskEncryptionSetType encryptionType() {
        return this.encryptionType;
    }

    /**
     * Set the encryptionType property: The type of key used to encrypt the data of the disk.
     *
     * @param encryptionType the encryptionType value to set.
     * @return the DiskEncryptionSetUpdate object itself.
     */
    public DiskEncryptionSetUpdate withEncryptionType(DiskEncryptionSetType encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * Get the activeKey property: Key Vault Key Url to be used for server side encryption of Managed Disks and
     * Snapshots.
     *
     * @return the activeKey value.
     */
    public KeyForDiskEncryptionSet activeKey() {
        return this.activeKey;
    }

    /**
     * Set the activeKey property: Key Vault Key Url to be used for server side encryption of Managed Disks and
     * Snapshots.
     *
     * @param activeKey the activeKey value to set.
     * @return the DiskEncryptionSetUpdate object itself.
     */
    public DiskEncryptionSetUpdate withActiveKey(KeyForDiskEncryptionSet activeKey) {
        this.activeKey = activeKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (activeKey() != null) {
            activeKey().validate();
        }
    }
}
