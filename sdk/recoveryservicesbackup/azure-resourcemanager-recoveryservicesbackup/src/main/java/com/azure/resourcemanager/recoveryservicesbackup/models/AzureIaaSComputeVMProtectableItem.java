// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** IaaS VM workload-specific backup item representing the Azure Resource Manager VM. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableItemType")
@JsonTypeName("Microsoft.Compute/virtualMachines")
@Fluent
public final class AzureIaaSComputeVMProtectableItem extends IaaSvmProtectableItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureIaaSComputeVMProtectableItem.class);

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectableItem withVirtualMachineId(String virtualMachineId) {
        super.withVirtualMachineId(virtualMachineId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectableItem withVirtualMachineVersion(String virtualMachineVersion) {
        super.withVirtualMachineVersion(virtualMachineVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectableItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectableItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectableItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectableItem withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
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
    }
}
