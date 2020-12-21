// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineAssessPatchesResultInner;
import com.azure.resourcemanager.compute.generated.models.ApiError;
import com.azure.resourcemanager.compute.generated.models.PatchOperationStatus;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineAssessPatchesResult;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineSoftwarePatchProperties;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class VirtualMachineAssessPatchesResultImpl implements VirtualMachineAssessPatchesResult {
    private VirtualMachineAssessPatchesResultInner innerObject;

    private final ComputeManager serviceManager;

    VirtualMachineAssessPatchesResultImpl(
        VirtualMachineAssessPatchesResultInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public PatchOperationStatus status() {
        return this.innerModel().status();
    }

    public String assessmentActivityId() {
        return this.innerModel().assessmentActivityId();
    }

    public Boolean rebootPending() {
        return this.innerModel().rebootPending();
    }

    public Integer criticalAndSecurityPatchCount() {
        return this.innerModel().criticalAndSecurityPatchCount();
    }

    public Integer otherPatchCount() {
        return this.innerModel().otherPatchCount();
    }

    public OffsetDateTime startDateTime() {
        return this.innerModel().startDateTime();
    }

    public List<VirtualMachineSoftwarePatchProperties> patches() {
        List<VirtualMachineSoftwarePatchProperties> inner = this.innerModel().patches();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ApiError error() {
        return this.innerModel().error();
    }

    public VirtualMachineAssessPatchesResultInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
