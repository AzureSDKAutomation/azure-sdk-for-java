// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineInstallPatchesResultInner;
import com.azure.resourcemanager.compute.generated.models.ApiError;
import com.azure.resourcemanager.compute.generated.models.PatchInstallationDetail;
import com.azure.resourcemanager.compute.generated.models.PatchOperationStatus;
import com.azure.resourcemanager.compute.generated.models.VMGuestPatchRebootStatus;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineInstallPatchesResult;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class VirtualMachineInstallPatchesResultImpl implements VirtualMachineInstallPatchesResult {
    private VirtualMachineInstallPatchesResultInner innerObject;

    private final ComputeManager serviceManager;

    VirtualMachineInstallPatchesResultImpl(
        VirtualMachineInstallPatchesResultInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public PatchOperationStatus status() {
        return this.innerModel().status();
    }

    public String installationActivityId() {
        return this.innerModel().installationActivityId();
    }

    public VMGuestPatchRebootStatus rebootStatus() {
        return this.innerModel().rebootStatus();
    }

    public Boolean maintenanceWindowExceeded() {
        return this.innerModel().maintenanceWindowExceeded();
    }

    public Integer excludedPatchCount() {
        return this.innerModel().excludedPatchCount();
    }

    public Integer notSelectedPatchCount() {
        return this.innerModel().notSelectedPatchCount();
    }

    public Integer pendingPatchCount() {
        return this.innerModel().pendingPatchCount();
    }

    public Integer installedPatchCount() {
        return this.innerModel().installedPatchCount();
    }

    public Integer failedPatchCount() {
        return this.innerModel().failedPatchCount();
    }

    public List<PatchInstallationDetail> patches() {
        List<PatchInstallationDetail> inner = this.innerModel().patches();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime startDateTime() {
        return this.innerModel().startDateTime();
    }

    public ApiError error() {
        return this.innerModel().error();
    }

    public VirtualMachineInstallPatchesResultInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
