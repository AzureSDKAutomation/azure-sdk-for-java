// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.DatastoreProvisioningState;
import com.azure.resourcemanager.avs.models.DiskPoolVolumeProperties;
import com.azure.resourcemanager.avs.models.NetAppVolumeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A datastore resource. */
@JsonFlatten
@Fluent
public class DatastoreInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatastoreInner.class);

    /*
     * The state of the datastore provisioning
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DatastoreProvisioningState provisioningState;

    /*
     * Resource ID of the Azure NetApp Files volume
     */
    @JsonProperty(value = "properties.netAppVolume")
    private NetAppVolumeProperties netAppVolume;

    /*
     * Resource ID of the iSCSI target from a Storage Pool and LUN to be used
     */
    @JsonProperty(value = "properties.diskPoolVolume")
    private DiskPoolVolumeProperties diskPoolVolume;

    /**
     * Get the provisioningState property: The state of the datastore provisioning.
     *
     * @return the provisioningState value.
     */
    public DatastoreProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the netAppVolume property: Resource ID of the Azure NetApp Files volume.
     *
     * @return the netAppVolume value.
     */
    public NetAppVolumeProperties netAppVolume() {
        return this.netAppVolume;
    }

    /**
     * Set the netAppVolume property: Resource ID of the Azure NetApp Files volume.
     *
     * @param netAppVolume the netAppVolume value to set.
     * @return the DatastoreInner object itself.
     */
    public DatastoreInner withNetAppVolume(NetAppVolumeProperties netAppVolume) {
        this.netAppVolume = netAppVolume;
        return this;
    }

    /**
     * Get the diskPoolVolume property: Resource ID of the iSCSI target from a Storage Pool and LUN to be used.
     *
     * @return the diskPoolVolume value.
     */
    public DiskPoolVolumeProperties diskPoolVolume() {
        return this.diskPoolVolume;
    }

    /**
     * Set the diskPoolVolume property: Resource ID of the iSCSI target from a Storage Pool and LUN to be used.
     *
     * @param diskPoolVolume the diskPoolVolume value to set.
     * @return the DatastoreInner object itself.
     */
    public DatastoreInner withDiskPoolVolume(DiskPoolVolumeProperties diskPoolVolume) {
        this.diskPoolVolume = diskPoolVolume;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (netAppVolume() != null) {
            netAppVolume().validate();
        }
        if (diskPoolVolume() != null) {
            diskPoolVolume().validate();
        }
    }
}
