// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the ARM updatable properties of a hybrid machine. */
@Fluent
public final class MachineUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MachineUpdateProperties.class);

    /*
     * Metadata pertaining to the geographic location of the resource.
     */
    @JsonProperty(value = "locationData")
    private LocationData locationData;

    /*
     * Specifies the operating system settings for the hybrid machine.
     */
    @JsonProperty(value = "osProfile")
    private OSProfile osProfile;

    /*
     * The resource id of the parent cluster (Azure HCI) this machine is
     * assigned to, if any.
     */
    @JsonProperty(value = "parentClusterResourceId")
    private String parentClusterResourceId;

    /*
     * The resource id of the private link scope this machine is assigned to,
     * if any.
     */
    @JsonProperty(value = "privateLinkScopeResourceId")
    private String privateLinkScopeResourceId;

    /**
     * Get the locationData property: Metadata pertaining to the geographic location of the resource.
     *
     * @return the locationData value.
     */
    public LocationData locationData() {
        return this.locationData;
    }

    /**
     * Set the locationData property: Metadata pertaining to the geographic location of the resource.
     *
     * @param locationData the locationData value to set.
     * @return the MachineUpdateProperties object itself.
     */
    public MachineUpdateProperties withLocationData(LocationData locationData) {
        this.locationData = locationData;
        return this;
    }

    /**
     * Get the osProfile property: Specifies the operating system settings for the hybrid machine.
     *
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Specifies the operating system settings for the hybrid machine.
     *
     * @param osProfile the osProfile value to set.
     * @return the MachineUpdateProperties object itself.
     */
    public MachineUpdateProperties withOsProfile(OSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the parentClusterResourceId property: The resource id of the parent cluster (Azure HCI) this machine is
     * assigned to, if any.
     *
     * @return the parentClusterResourceId value.
     */
    public String parentClusterResourceId() {
        return this.parentClusterResourceId;
    }

    /**
     * Set the parentClusterResourceId property: The resource id of the parent cluster (Azure HCI) this machine is
     * assigned to, if any.
     *
     * @param parentClusterResourceId the parentClusterResourceId value to set.
     * @return the MachineUpdateProperties object itself.
     */
    public MachineUpdateProperties withParentClusterResourceId(String parentClusterResourceId) {
        this.parentClusterResourceId = parentClusterResourceId;
        return this;
    }

    /**
     * Get the privateLinkScopeResourceId property: The resource id of the private link scope this machine is assigned
     * to, if any.
     *
     * @return the privateLinkScopeResourceId value.
     */
    public String privateLinkScopeResourceId() {
        return this.privateLinkScopeResourceId;
    }

    /**
     * Set the privateLinkScopeResourceId property: The resource id of the private link scope this machine is assigned
     * to, if any.
     *
     * @param privateLinkScopeResourceId the privateLinkScopeResourceId value to set.
     * @return the MachineUpdateProperties object itself.
     */
    public MachineUpdateProperties withPrivateLinkScopeResourceId(String privateLinkScopeResourceId) {
        this.privateLinkScopeResourceId = privateLinkScopeResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (locationData() != null) {
            locationData().validate();
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
    }
}
