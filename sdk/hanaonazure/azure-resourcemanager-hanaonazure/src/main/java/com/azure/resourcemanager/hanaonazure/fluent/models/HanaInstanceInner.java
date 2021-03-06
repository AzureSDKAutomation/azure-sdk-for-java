// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hanaonazure.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hanaonazure.models.HanaInstancePowerStateEnum;
import com.azure.resourcemanager.hanaonazure.models.HanaProvisioningStatesEnum;
import com.azure.resourcemanager.hanaonazure.models.HardwareProfile;
import com.azure.resourcemanager.hanaonazure.models.NetworkProfile;
import com.azure.resourcemanager.hanaonazure.models.OSProfile;
import com.azure.resourcemanager.hanaonazure.models.StorageProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** HANA instance info on Azure (ARM properties and HANA properties). */
@JsonFlatten
@Fluent
public class HanaInstanceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HanaInstanceInner.class);

    /*
     * Specifies the hardware settings for the HANA instance.
     */
    @JsonProperty(value = "properties.hardwareProfile")
    private HardwareProfile hardwareProfile;

    /*
     * Specifies the storage settings for the HANA instance disks.
     */
    @JsonProperty(value = "properties.storageProfile")
    private StorageProfile storageProfile;

    /*
     * Specifies the operating system settings for the HANA instance.
     */
    @JsonProperty(value = "properties.osProfile")
    private OSProfile osProfile;

    /*
     * Specifies the network settings for the HANA instance.
     */
    @JsonProperty(value = "properties.networkProfile")
    private NetworkProfile networkProfile;

    /*
     * Specifies the HANA instance unique ID.
     */
    @JsonProperty(value = "properties.hanaInstanceId")
    private String hanaInstanceId;

    /*
     * Resource power state
     */
    @JsonProperty(value = "properties.powerState")
    private HanaInstancePowerStateEnum powerState;

    /*
     * Resource proximity placement group
     */
    @JsonProperty(value = "properties.proximityPlacementGroup")
    private String proximityPlacementGroup;

    /*
     * Hardware revision of a HANA instance
     */
    @JsonProperty(value = "properties.hwRevision")
    private String hwRevision;

    /*
     * ARM ID of another HanaInstance that will share a network with this
     * HanaInstance
     */
    @JsonProperty(value = "properties.partnerNodeId")
    private String partnerNodeId;

    /*
     * State of provisioning of the HanaInstance
     */
    @JsonProperty(value = "properties.provisioningState")
    private HanaProvisioningStatesEnum provisioningState;

    /**
     * Get the hardwareProfile property: Specifies the hardware settings for the HANA instance.
     *
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile property: Specifies the hardware settings for the HANA instance.
     *
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the HANA instance disks.
     *
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the HANA instance disks.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the osProfile property: Specifies the operating system settings for the HANA instance.
     *
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Specifies the operating system settings for the HANA instance.
     *
     * @param osProfile the osProfile value to set.
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withOsProfile(OSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the networkProfile property: Specifies the network settings for the HANA instance.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Specifies the network settings for the HANA instance.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the hanaInstanceId property: Specifies the HANA instance unique ID.
     *
     * @return the hanaInstanceId value.
     */
    public String hanaInstanceId() {
        return this.hanaInstanceId;
    }

    /**
     * Set the hanaInstanceId property: Specifies the HANA instance unique ID.
     *
     * @param hanaInstanceId the hanaInstanceId value to set.
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withHanaInstanceId(String hanaInstanceId) {
        this.hanaInstanceId = hanaInstanceId;
        return this;
    }

    /**
     * Get the powerState property: Resource power state.
     *
     * @return the powerState value.
     */
    public HanaInstancePowerStateEnum powerState() {
        return this.powerState;
    }

    /**
     * Set the powerState property: Resource power state.
     *
     * @param powerState the powerState value to set.
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withPowerState(HanaInstancePowerStateEnum powerState) {
        this.powerState = powerState;
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Resource proximity placement group.
     *
     * @return the proximityPlacementGroup value.
     */
    public String proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set the proximityPlacementGroup property: Resource proximity placement group.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withProximityPlacementGroup(String proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }

    /**
     * Get the hwRevision property: Hardware revision of a HANA instance.
     *
     * @return the hwRevision value.
     */
    public String hwRevision() {
        return this.hwRevision;
    }

    /**
     * Set the hwRevision property: Hardware revision of a HANA instance.
     *
     * @param hwRevision the hwRevision value to set.
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withHwRevision(String hwRevision) {
        this.hwRevision = hwRevision;
        return this;
    }

    /**
     * Get the partnerNodeId property: ARM ID of another HanaInstance that will share a network with this HanaInstance.
     *
     * @return the partnerNodeId value.
     */
    public String partnerNodeId() {
        return this.partnerNodeId;
    }

    /**
     * Set the partnerNodeId property: ARM ID of another HanaInstance that will share a network with this HanaInstance.
     *
     * @param partnerNodeId the partnerNodeId value to set.
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withPartnerNodeId(String partnerNodeId) {
        this.partnerNodeId = partnerNodeId;
        return this;
    }

    /**
     * Get the provisioningState property: State of provisioning of the HanaInstance.
     *
     * @return the provisioningState value.
     */
    public HanaProvisioningStatesEnum provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: State of provisioning of the HanaInstance.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withProvisioningState(HanaProvisioningStatesEnum provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HanaInstanceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HanaInstanceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hardwareProfile() != null) {
            hardwareProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
    }
}
