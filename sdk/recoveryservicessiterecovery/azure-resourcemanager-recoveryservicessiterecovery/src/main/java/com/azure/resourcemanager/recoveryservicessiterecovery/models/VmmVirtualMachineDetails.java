// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** VMM fabric provider specific VM settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VmmVirtualMachine")
@Immutable
public final class VmmVirtualMachineDetails extends HyperVVirtualMachineDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VmmVirtualMachineDetails.class);

    /** {@inheritDoc} */
    @Override
    public VmmVirtualMachineDetails withSourceItemId(String sourceItemId) {
        super.withSourceItemId(sourceItemId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmmVirtualMachineDetails withGeneration(String generation) {
        super.withGeneration(generation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmmVirtualMachineDetails withOsDetails(OSDetails osDetails) {
        super.withOsDetails(osDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmmVirtualMachineDetails withDiskDetails(List<DiskDetails> diskDetails) {
        super.withDiskDetails(diskDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmmVirtualMachineDetails withHasPhysicalDisk(PresenceStatus hasPhysicalDisk) {
        super.withHasPhysicalDisk(hasPhysicalDisk);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmmVirtualMachineDetails withHasFibreChannelAdapter(PresenceStatus hasFibreChannelAdapter) {
        super.withHasFibreChannelAdapter(hasFibreChannelAdapter);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmmVirtualMachineDetails withHasSharedVhd(PresenceStatus hasSharedVhd) {
        super.withHasSharedVhd(hasSharedVhd);
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
