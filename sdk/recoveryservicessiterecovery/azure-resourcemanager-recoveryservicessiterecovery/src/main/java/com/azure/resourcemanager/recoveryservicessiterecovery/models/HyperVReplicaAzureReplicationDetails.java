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
import java.time.OffsetDateTime;
import java.util.List;

/** Hyper V Replica Azure provider specific settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzure")
@Fluent
public final class HyperVReplicaAzureReplicationDetails extends ReplicationProviderSpecificSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HyperVReplicaAzureReplicationDetails.class);

    /*
     * Azure VM Disk details.
     */
    @JsonProperty(value = "azureVmDiskDetails")
    private List<AzureVmDiskDetails> azureVmDiskDetails;

    /*
     * Recovery Azure given name.
     */
    @JsonProperty(value = "recoveryAzureVmName")
    private String recoveryAzureVmName;

    /*
     * The Recovery Azure VM size.
     */
    @JsonProperty(value = "recoveryAzureVMSize")
    private String recoveryAzureVMSize;

    /*
     * The recovery Azure storage account.
     */
    @JsonProperty(value = "recoveryAzureStorageAccount")
    private String recoveryAzureStorageAccount;

    /*
     * The ARM id of the log storage account used for replication. This will be
     * set to null if no log storage account was provided during enable
     * protection.
     */
    @JsonProperty(value = "recoveryAzureLogStorageAccountId")
    private String recoveryAzureLogStorageAccountId;

    /*
     * The Last replication time.
     */
    @JsonProperty(value = "lastReplicatedTime")
    private OffsetDateTime lastReplicatedTime;

    /*
     * Last RPO value.
     */
    @JsonProperty(value = "rpoInSeconds")
    private Long rpoInSeconds;

    /*
     * The last RPO calculated time.
     */
    @JsonProperty(value = "lastRpoCalculatedTime")
    private OffsetDateTime lastRpoCalculatedTime;

    /*
     * The virtual machine Id.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /*
     * The protection state for the vm.
     */
    @JsonProperty(value = "vmProtectionState")
    private String vmProtectionState;

    /*
     * The protection state description for the vm.
     */
    @JsonProperty(value = "vmProtectionStateDescription")
    private String vmProtectionStateDescription;

    /*
     * Initial replication details.
     */
    @JsonProperty(value = "initialReplicationDetails")
    private InitialReplicationDetails initialReplicationDetails;

    /*
     * The PE Network details.
     */
    @JsonProperty(value = "vmNics")
    private List<VMNicDetails> vmNics;

    /*
     * The selected recovery azure network Id.
     */
    @JsonProperty(value = "selectedRecoveryAzureNetworkId")
    private String selectedRecoveryAzureNetworkId;

    /*
     * The selected source nic Id which will be used as the primary nic during
     * failover.
     */
    @JsonProperty(value = "selectedSourceNicId")
    private String selectedSourceNicId;

    /*
     * The encryption info.
     */
    @JsonProperty(value = "encryption")
    private String encryption;

    /*
     * The operating system info.
     */
    @JsonProperty(value = "oSDetails")
    private OSDetails oSDetails;

    /*
     * The RAM size of the VM on the primary side.
     */
    @JsonProperty(value = "sourceVmRamSizeInMB")
    private Integer sourceVmRamSizeInMB;

    /*
     * The CPU count of the VM on the primary side.
     */
    @JsonProperty(value = "sourceVmCpuCount")
    private Integer sourceVmCpuCount;

    /*
     * The selected option to enable RDP\SSH on target vm after failover.
     * String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     */
    @JsonProperty(value = "enableRdpOnTargetOption")
    private String enableRdpOnTargetOption;

    /*
     * The target resource group Id.
     */
    @JsonProperty(value = "recoveryAzureResourceGroupId")
    private String recoveryAzureResourceGroupId;

    /*
     * The recovery availability set Id.
     */
    @JsonProperty(value = "recoveryAvailabilitySetId")
    private String recoveryAvailabilitySetId;

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
     * A value indicating whether managed disks should be used during failover.
     */
    @JsonProperty(value = "useManagedDisks")
    private String useManagedDisks;

    /*
     * License Type of the VM to be used.
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /**
     * Get the azureVmDiskDetails property: Azure VM Disk details.
     *
     * @return the azureVmDiskDetails value.
     */
    public List<AzureVmDiskDetails> azureVmDiskDetails() {
        return this.azureVmDiskDetails;
    }

    /**
     * Set the azureVmDiskDetails property: Azure VM Disk details.
     *
     * @param azureVmDiskDetails the azureVmDiskDetails value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withAzureVmDiskDetails(List<AzureVmDiskDetails> azureVmDiskDetails) {
        this.azureVmDiskDetails = azureVmDiskDetails;
        return this;
    }

    /**
     * Get the recoveryAzureVmName property: Recovery Azure given name.
     *
     * @return the recoveryAzureVmName value.
     */
    public String recoveryAzureVmName() {
        return this.recoveryAzureVmName;
    }

    /**
     * Set the recoveryAzureVmName property: Recovery Azure given name.
     *
     * @param recoveryAzureVmName the recoveryAzureVmName value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAzureVmName(String recoveryAzureVmName) {
        this.recoveryAzureVmName = recoveryAzureVmName;
        return this;
    }

    /**
     * Get the recoveryAzureVMSize property: The Recovery Azure VM size.
     *
     * @return the recoveryAzureVMSize value.
     */
    public String recoveryAzureVMSize() {
        return this.recoveryAzureVMSize;
    }

    /**
     * Set the recoveryAzureVMSize property: The Recovery Azure VM size.
     *
     * @param recoveryAzureVMSize the recoveryAzureVMSize value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAzureVMSize(String recoveryAzureVMSize) {
        this.recoveryAzureVMSize = recoveryAzureVMSize;
        return this;
    }

    /**
     * Get the recoveryAzureStorageAccount property: The recovery Azure storage account.
     *
     * @return the recoveryAzureStorageAccount value.
     */
    public String recoveryAzureStorageAccount() {
        return this.recoveryAzureStorageAccount;
    }

    /**
     * Set the recoveryAzureStorageAccount property: The recovery Azure storage account.
     *
     * @param recoveryAzureStorageAccount the recoveryAzureStorageAccount value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAzureStorageAccount(String recoveryAzureStorageAccount) {
        this.recoveryAzureStorageAccount = recoveryAzureStorageAccount;
        return this;
    }

    /**
     * Get the recoveryAzureLogStorageAccountId property: The ARM id of the log storage account used for replication.
     * This will be set to null if no log storage account was provided during enable protection.
     *
     * @return the recoveryAzureLogStorageAccountId value.
     */
    public String recoveryAzureLogStorageAccountId() {
        return this.recoveryAzureLogStorageAccountId;
    }

    /**
     * Set the recoveryAzureLogStorageAccountId property: The ARM id of the log storage account used for replication.
     * This will be set to null if no log storage account was provided during enable protection.
     *
     * @param recoveryAzureLogStorageAccountId the recoveryAzureLogStorageAccountId value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAzureLogStorageAccountId(
        String recoveryAzureLogStorageAccountId) {
        this.recoveryAzureLogStorageAccountId = recoveryAzureLogStorageAccountId;
        return this;
    }

    /**
     * Get the lastReplicatedTime property: The Last replication time.
     *
     * @return the lastReplicatedTime value.
     */
    public OffsetDateTime lastReplicatedTime() {
        return this.lastReplicatedTime;
    }

    /**
     * Set the lastReplicatedTime property: The Last replication time.
     *
     * @param lastReplicatedTime the lastReplicatedTime value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withLastReplicatedTime(OffsetDateTime lastReplicatedTime) {
        this.lastReplicatedTime = lastReplicatedTime;
        return this;
    }

    /**
     * Get the rpoInSeconds property: Last RPO value.
     *
     * @return the rpoInSeconds value.
     */
    public Long rpoInSeconds() {
        return this.rpoInSeconds;
    }

    /**
     * Set the rpoInSeconds property: Last RPO value.
     *
     * @param rpoInSeconds the rpoInSeconds value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRpoInSeconds(Long rpoInSeconds) {
        this.rpoInSeconds = rpoInSeconds;
        return this;
    }

    /**
     * Get the lastRpoCalculatedTime property: The last RPO calculated time.
     *
     * @return the lastRpoCalculatedTime value.
     */
    public OffsetDateTime lastRpoCalculatedTime() {
        return this.lastRpoCalculatedTime;
    }

    /**
     * Set the lastRpoCalculatedTime property: The last RPO calculated time.
     *
     * @param lastRpoCalculatedTime the lastRpoCalculatedTime value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withLastRpoCalculatedTime(OffsetDateTime lastRpoCalculatedTime) {
        this.lastRpoCalculatedTime = lastRpoCalculatedTime;
        return this;
    }

    /**
     * Get the vmId property: The virtual machine Id.
     *
     * @return the vmId value.
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set the vmId property: The virtual machine Id.
     *
     * @param vmId the vmId value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get the vmProtectionState property: The protection state for the vm.
     *
     * @return the vmProtectionState value.
     */
    public String vmProtectionState() {
        return this.vmProtectionState;
    }

    /**
     * Set the vmProtectionState property: The protection state for the vm.
     *
     * @param vmProtectionState the vmProtectionState value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withVmProtectionState(String vmProtectionState) {
        this.vmProtectionState = vmProtectionState;
        return this;
    }

    /**
     * Get the vmProtectionStateDescription property: The protection state description for the vm.
     *
     * @return the vmProtectionStateDescription value.
     */
    public String vmProtectionStateDescription() {
        return this.vmProtectionStateDescription;
    }

    /**
     * Set the vmProtectionStateDescription property: The protection state description for the vm.
     *
     * @param vmProtectionStateDescription the vmProtectionStateDescription value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withVmProtectionStateDescription(String vmProtectionStateDescription) {
        this.vmProtectionStateDescription = vmProtectionStateDescription;
        return this;
    }

    /**
     * Get the initialReplicationDetails property: Initial replication details.
     *
     * @return the initialReplicationDetails value.
     */
    public InitialReplicationDetails initialReplicationDetails() {
        return this.initialReplicationDetails;
    }

    /**
     * Set the initialReplicationDetails property: Initial replication details.
     *
     * @param initialReplicationDetails the initialReplicationDetails value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withInitialReplicationDetails(
        InitialReplicationDetails initialReplicationDetails) {
        this.initialReplicationDetails = initialReplicationDetails;
        return this;
    }

    /**
     * Get the vmNics property: The PE Network details.
     *
     * @return the vmNics value.
     */
    public List<VMNicDetails> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the vmNics property: The PE Network details.
     *
     * @param vmNics the vmNics value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withVmNics(List<VMNicDetails> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get the selectedRecoveryAzureNetworkId property: The selected recovery azure network Id.
     *
     * @return the selectedRecoveryAzureNetworkId value.
     */
    public String selectedRecoveryAzureNetworkId() {
        return this.selectedRecoveryAzureNetworkId;
    }

    /**
     * Set the selectedRecoveryAzureNetworkId property: The selected recovery azure network Id.
     *
     * @param selectedRecoveryAzureNetworkId the selectedRecoveryAzureNetworkId value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withSelectedRecoveryAzureNetworkId(
        String selectedRecoveryAzureNetworkId) {
        this.selectedRecoveryAzureNetworkId = selectedRecoveryAzureNetworkId;
        return this;
    }

    /**
     * Get the selectedSourceNicId property: The selected source nic Id which will be used as the primary nic during
     * failover.
     *
     * @return the selectedSourceNicId value.
     */
    public String selectedSourceNicId() {
        return this.selectedSourceNicId;
    }

    /**
     * Set the selectedSourceNicId property: The selected source nic Id which will be used as the primary nic during
     * failover.
     *
     * @param selectedSourceNicId the selectedSourceNicId value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withSelectedSourceNicId(String selectedSourceNicId) {
        this.selectedSourceNicId = selectedSourceNicId;
        return this;
    }

    /**
     * Get the encryption property: The encryption info.
     *
     * @return the encryption value.
     */
    public String encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The encryption info.
     *
     * @param encryption the encryption value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the oSDetails property: The operating system info.
     *
     * @return the oSDetails value.
     */
    public OSDetails oSDetails() {
        return this.oSDetails;
    }

    /**
     * Set the oSDetails property: The operating system info.
     *
     * @param oSDetails the oSDetails value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withOSDetails(OSDetails oSDetails) {
        this.oSDetails = oSDetails;
        return this;
    }

    /**
     * Get the sourceVmRamSizeInMB property: The RAM size of the VM on the primary side.
     *
     * @return the sourceVmRamSizeInMB value.
     */
    public Integer sourceVmRamSizeInMB() {
        return this.sourceVmRamSizeInMB;
    }

    /**
     * Set the sourceVmRamSizeInMB property: The RAM size of the VM on the primary side.
     *
     * @param sourceVmRamSizeInMB the sourceVmRamSizeInMB value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withSourceVmRamSizeInMB(Integer sourceVmRamSizeInMB) {
        this.sourceVmRamSizeInMB = sourceVmRamSizeInMB;
        return this;
    }

    /**
     * Get the sourceVmCpuCount property: The CPU count of the VM on the primary side.
     *
     * @return the sourceVmCpuCount value.
     */
    public Integer sourceVmCpuCount() {
        return this.sourceVmCpuCount;
    }

    /**
     * Set the sourceVmCpuCount property: The CPU count of the VM on the primary side.
     *
     * @param sourceVmCpuCount the sourceVmCpuCount value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withSourceVmCpuCount(Integer sourceVmCpuCount) {
        this.sourceVmCpuCount = sourceVmCpuCount;
        return this;
    }

    /**
     * Get the enableRdpOnTargetOption property: The selected option to enable RDP\SSH on target vm after failover.
     * String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @return the enableRdpOnTargetOption value.
     */
    public String enableRdpOnTargetOption() {
        return this.enableRdpOnTargetOption;
    }

    /**
     * Set the enableRdpOnTargetOption property: The selected option to enable RDP\SSH on target vm after failover.
     * String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @param enableRdpOnTargetOption the enableRdpOnTargetOption value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withEnableRdpOnTargetOption(String enableRdpOnTargetOption) {
        this.enableRdpOnTargetOption = enableRdpOnTargetOption;
        return this;
    }

    /**
     * Get the recoveryAzureResourceGroupId property: The target resource group Id.
     *
     * @return the recoveryAzureResourceGroupId value.
     */
    public String recoveryAzureResourceGroupId() {
        return this.recoveryAzureResourceGroupId;
    }

    /**
     * Set the recoveryAzureResourceGroupId property: The target resource group Id.
     *
     * @param recoveryAzureResourceGroupId the recoveryAzureResourceGroupId value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAzureResourceGroupId(String recoveryAzureResourceGroupId) {
        this.recoveryAzureResourceGroupId = recoveryAzureResourceGroupId;
        return this;
    }

    /**
     * Get the recoveryAvailabilitySetId property: The recovery availability set Id.
     *
     * @return the recoveryAvailabilitySetId value.
     */
    public String recoveryAvailabilitySetId() {
        return this.recoveryAvailabilitySetId;
    }

    /**
     * Set the recoveryAvailabilitySetId property: The recovery availability set Id.
     *
     * @param recoveryAvailabilitySetId the recoveryAvailabilitySetId value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAvailabilitySetId(String recoveryAvailabilitySetId) {
        this.recoveryAvailabilitySetId = recoveryAvailabilitySetId;
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
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withTargetAvailabilityZone(String targetAvailabilityZone) {
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
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withTargetProximityPlacementGroupId(
        String targetProximityPlacementGroupId) {
        this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
        return this;
    }

    /**
     * Get the useManagedDisks property: A value indicating whether managed disks should be used during failover.
     *
     * @return the useManagedDisks value.
     */
    public String useManagedDisks() {
        return this.useManagedDisks;
    }

    /**
     * Set the useManagedDisks property: A value indicating whether managed disks should be used during failover.
     *
     * @param useManagedDisks the useManagedDisks value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withUseManagedDisks(String useManagedDisks) {
        this.useManagedDisks = useManagedDisks;
        return this;
    }

    /**
     * Get the licenseType property: License Type of the VM to be used.
     *
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: License Type of the VM to be used.
     *
     * @param licenseType the licenseType value to set.
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withLicenseType(String licenseType) {
        this.licenseType = licenseType;
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
        if (azureVmDiskDetails() != null) {
            azureVmDiskDetails().forEach(e -> e.validate());
        }
        if (initialReplicationDetails() != null) {
            initialReplicationDetails().validate();
        }
        if (vmNics() != null) {
            vmNics().forEach(e -> e.validate());
        }
        if (oSDetails() != null) {
            oSDetails().validate();
        }
    }
}
