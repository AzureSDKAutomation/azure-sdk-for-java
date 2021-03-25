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

/** Hyper V replica provider specific settings base class. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaBaseReplicationDetails")
@Fluent
public final class HyperVReplicaBaseReplicationDetails extends ReplicationProviderSpecificSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HyperVReplicaBaseReplicationDetails.class);

    /*
     * The Last replication time.
     */
    @JsonProperty(value = "lastReplicatedTime")
    private OffsetDateTime lastReplicatedTime;

    /*
     * The PE Network details.
     */
    @JsonProperty(value = "vmNics")
    private List<VMNicDetails> vmNics;

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
     * VM disk details.
     */
    @JsonProperty(value = "vMDiskDetails")
    private List<DiskDetails> vMDiskDetails;

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
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withLastReplicatedTime(OffsetDateTime lastReplicatedTime) {
        this.lastReplicatedTime = lastReplicatedTime;
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
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withVmNics(List<VMNicDetails> vmNics) {
        this.vmNics = vmNics;
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
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withVmId(String vmId) {
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
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withVmProtectionState(String vmProtectionState) {
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
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withVmProtectionStateDescription(String vmProtectionStateDescription) {
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
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withInitialReplicationDetails(
        InitialReplicationDetails initialReplicationDetails) {
        this.initialReplicationDetails = initialReplicationDetails;
        return this;
    }

    /**
     * Get the vMDiskDetails property: VM disk details.
     *
     * @return the vMDiskDetails value.
     */
    public List<DiskDetails> vMDiskDetails() {
        return this.vMDiskDetails;
    }

    /**
     * Set the vMDiskDetails property: VM disk details.
     *
     * @param vMDiskDetails the vMDiskDetails value to set.
     * @return the HyperVReplicaBaseReplicationDetails object itself.
     */
    public HyperVReplicaBaseReplicationDetails withVMDiskDetails(List<DiskDetails> vMDiskDetails) {
        this.vMDiskDetails = vMDiskDetails;
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
        if (vmNics() != null) {
            vmNics().forEach(e -> e.validate());
        }
        if (initialReplicationDetails() != null) {
            initialReplicationDetails().validate();
        }
        if (vMDiskDetails() != null) {
            vMDiskDetails().forEach(e -> e.validate());
        }
    }
}
