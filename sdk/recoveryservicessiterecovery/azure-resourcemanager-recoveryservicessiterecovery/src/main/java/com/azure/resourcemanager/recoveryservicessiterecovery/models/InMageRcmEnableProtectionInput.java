// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** InMageRcm specific enable protection input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcm")
@Fluent
public final class InMageRcmEnableProtectionInput extends EnableProtectionProviderSpecificInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InMageRcmEnableProtectionInput.class);

    /*
     * The ARM Id of discovered machine.
     */
    @JsonProperty(value = "fabricDiscoveryMachineId")
    private String fabricDiscoveryMachineId;

    /*
     * The disks to include list.
     */
    @JsonProperty(value = "disksToInclude")
    private List<InMageRcmDiskInput> disksToInclude;

    /*
     * The default disk input.
     */
    @JsonProperty(value = "disksDefault")
    private InMageRcmDisksDefaultInput disksDefault;

    /*
     * The target resource group ARM Id.
     */
    @JsonProperty(value = "targetResourceGroupId")
    private String targetResourceGroupId;

    /*
     * The selected target network ARM Id.
     */
    @JsonProperty(value = "targetNetworkId")
    private String targetNetworkId;

    /*
     * The selected test network ARM Id.
     */
    @JsonProperty(value = "testNetworkId")
    private String testNetworkId;

    /*
     * The selected target subnet name.
     */
    @JsonProperty(value = "targetSubnetName")
    private String targetSubnetName;

    /*
     * The selected test subnet name.
     */
    @JsonProperty(value = "testSubnetName")
    private String testSubnetName;

    /*
     * The target VM name.
     */
    @JsonProperty(value = "targetVmName")
    private String targetVmName;

    /*
     * The target VM size.
     */
    @JsonProperty(value = "targetVmSize")
    private String targetVmSize;

    /*
     * The license type.
     */
    @JsonProperty(value = "licenseType")
    private LicenseType licenseType;

    /*
     * The target availability set ARM Id.
     */
    @JsonProperty(value = "targetAvailabilitySetId")
    private String targetAvailabilitySetId;

    /*
     * The target availability zone.
     */
    @JsonProperty(value = "targetAvailabilityZone")
    private String targetAvailabilityZone;

    /*
     * The target proximity placement group Id.
     */
    @JsonProperty(value = "targetProximityPlacementGroupId")
    private String targetProximityPlacementGroupId;

    /*
     * The target boot diagnostics storage account ARM Id.
     */
    @JsonProperty(value = "targetBootDiagnosticsStorageAccountId")
    private String targetBootDiagnosticsStorageAccountId;

    /*
     * The run-as account Id.
     */
    @JsonProperty(value = "runAsAccountId")
    private String runAsAccountId;

    /*
     * The process server Id.
     */
    @JsonProperty(value = "processServerId")
    private String processServerId;

    /*
     * The multi VM group name.
     */
    @JsonProperty(value = "multiVmGroupName")
    private String multiVmGroupName;

    /**
     * Get the fabricDiscoveryMachineId property: The ARM Id of discovered machine.
     *
     * @return the fabricDiscoveryMachineId value.
     */
    public String fabricDiscoveryMachineId() {
        return this.fabricDiscoveryMachineId;
    }

    /**
     * Set the fabricDiscoveryMachineId property: The ARM Id of discovered machine.
     *
     * @param fabricDiscoveryMachineId the fabricDiscoveryMachineId value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withFabricDiscoveryMachineId(String fabricDiscoveryMachineId) {
        this.fabricDiscoveryMachineId = fabricDiscoveryMachineId;
        return this;
    }

    /**
     * Get the disksToInclude property: The disks to include list.
     *
     * @return the disksToInclude value.
     */
    public List<InMageRcmDiskInput> disksToInclude() {
        return this.disksToInclude;
    }

    /**
     * Set the disksToInclude property: The disks to include list.
     *
     * @param disksToInclude the disksToInclude value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withDisksToInclude(List<InMageRcmDiskInput> disksToInclude) {
        this.disksToInclude = disksToInclude;
        return this;
    }

    /**
     * Get the disksDefault property: The default disk input.
     *
     * @return the disksDefault value.
     */
    public InMageRcmDisksDefaultInput disksDefault() {
        return this.disksDefault;
    }

    /**
     * Set the disksDefault property: The default disk input.
     *
     * @param disksDefault the disksDefault value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withDisksDefault(InMageRcmDisksDefaultInput disksDefault) {
        this.disksDefault = disksDefault;
        return this;
    }

    /**
     * Get the targetResourceGroupId property: The target resource group ARM Id.
     *
     * @return the targetResourceGroupId value.
     */
    public String targetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * Set the targetResourceGroupId property: The target resource group ARM Id.
     *
     * @param targetResourceGroupId the targetResourceGroupId value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }

    /**
     * Get the targetNetworkId property: The selected target network ARM Id.
     *
     * @return the targetNetworkId value.
     */
    public String targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * Set the targetNetworkId property: The selected target network ARM Id.
     *
     * @param targetNetworkId the targetNetworkId value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withTargetNetworkId(String targetNetworkId) {
        this.targetNetworkId = targetNetworkId;
        return this;
    }

    /**
     * Get the testNetworkId property: The selected test network ARM Id.
     *
     * @return the testNetworkId value.
     */
    public String testNetworkId() {
        return this.testNetworkId;
    }

    /**
     * Set the testNetworkId property: The selected test network ARM Id.
     *
     * @param testNetworkId the testNetworkId value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withTestNetworkId(String testNetworkId) {
        this.testNetworkId = testNetworkId;
        return this;
    }

    /**
     * Get the targetSubnetName property: The selected target subnet name.
     *
     * @return the targetSubnetName value.
     */
    public String targetSubnetName() {
        return this.targetSubnetName;
    }

    /**
     * Set the targetSubnetName property: The selected target subnet name.
     *
     * @param targetSubnetName the targetSubnetName value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withTargetSubnetName(String targetSubnetName) {
        this.targetSubnetName = targetSubnetName;
        return this;
    }

    /**
     * Get the testSubnetName property: The selected test subnet name.
     *
     * @return the testSubnetName value.
     */
    public String testSubnetName() {
        return this.testSubnetName;
    }

    /**
     * Set the testSubnetName property: The selected test subnet name.
     *
     * @param testSubnetName the testSubnetName value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withTestSubnetName(String testSubnetName) {
        this.testSubnetName = testSubnetName;
        return this;
    }

    /**
     * Get the targetVmName property: The target VM name.
     *
     * @return the targetVmName value.
     */
    public String targetVmName() {
        return this.targetVmName;
    }

    /**
     * Set the targetVmName property: The target VM name.
     *
     * @param targetVmName the targetVmName value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withTargetVmName(String targetVmName) {
        this.targetVmName = targetVmName;
        return this;
    }

    /**
     * Get the targetVmSize property: The target VM size.
     *
     * @return the targetVmSize value.
     */
    public String targetVmSize() {
        return this.targetVmSize;
    }

    /**
     * Set the targetVmSize property: The target VM size.
     *
     * @param targetVmSize the targetVmSize value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withTargetVmSize(String targetVmSize) {
        this.targetVmSize = targetVmSize;
        return this;
    }

    /**
     * Get the licenseType property: The license type.
     *
     * @return the licenseType value.
     */
    public LicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type.
     *
     * @param licenseType the licenseType value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the targetAvailabilitySetId property: The target availability set ARM Id.
     *
     * @return the targetAvailabilitySetId value.
     */
    public String targetAvailabilitySetId() {
        return this.targetAvailabilitySetId;
    }

    /**
     * Set the targetAvailabilitySetId property: The target availability set ARM Id.
     *
     * @param targetAvailabilitySetId the targetAvailabilitySetId value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withTargetAvailabilitySetId(String targetAvailabilitySetId) {
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        return this;
    }

    /**
     * Get the targetAvailabilityZone property: The target availability zone.
     *
     * @return the targetAvailabilityZone value.
     */
    public String targetAvailabilityZone() {
        return this.targetAvailabilityZone;
    }

    /**
     * Set the targetAvailabilityZone property: The target availability zone.
     *
     * @param targetAvailabilityZone the targetAvailabilityZone value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withTargetAvailabilityZone(String targetAvailabilityZone) {
        this.targetAvailabilityZone = targetAvailabilityZone;
        return this;
    }

    /**
     * Get the targetProximityPlacementGroupId property: The target proximity placement group Id.
     *
     * @return the targetProximityPlacementGroupId value.
     */
    public String targetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId;
    }

    /**
     * Set the targetProximityPlacementGroupId property: The target proximity placement group Id.
     *
     * @param targetProximityPlacementGroupId the targetProximityPlacementGroupId value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withTargetProximityPlacementGroupId(String targetProximityPlacementGroupId) {
        this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
        return this;
    }

    /**
     * Get the targetBootDiagnosticsStorageAccountId property: The target boot diagnostics storage account ARM Id.
     *
     * @return the targetBootDiagnosticsStorageAccountId value.
     */
    public String targetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId;
    }

    /**
     * Set the targetBootDiagnosticsStorageAccountId property: The target boot diagnostics storage account ARM Id.
     *
     * @param targetBootDiagnosticsStorageAccountId the targetBootDiagnosticsStorageAccountId value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withTargetBootDiagnosticsStorageAccountId(
        String targetBootDiagnosticsStorageAccountId) {
        this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
        return this;
    }

    /**
     * Get the runAsAccountId property: The run-as account Id.
     *
     * @return the runAsAccountId value.
     */
    public String runAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * Set the runAsAccountId property: The run-as account Id.
     *
     * @param runAsAccountId the runAsAccountId value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withRunAsAccountId(String runAsAccountId) {
        this.runAsAccountId = runAsAccountId;
        return this;
    }

    /**
     * Get the processServerId property: The process server Id.
     *
     * @return the processServerId value.
     */
    public String processServerId() {
        return this.processServerId;
    }

    /**
     * Set the processServerId property: The process server Id.
     *
     * @param processServerId the processServerId value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withProcessServerId(String processServerId) {
        this.processServerId = processServerId;
        return this;
    }

    /**
     * Get the multiVmGroupName property: The multi VM group name.
     *
     * @return the multiVmGroupName value.
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Set the multiVmGroupName property: The multi VM group name.
     *
     * @param multiVmGroupName the multiVmGroupName value to set.
     * @return the InMageRcmEnableProtectionInput object itself.
     */
    public InMageRcmEnableProtectionInput withMultiVmGroupName(String multiVmGroupName) {
        this.multiVmGroupName = multiVmGroupName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (disksToInclude() != null) {
            disksToInclude().forEach(e -> e.validate());
        }
        if (disksDefault() != null) {
            disksDefault().validate();
        }
    }
}
