// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.resourcemanager.machinelearningservices.fluent.models.VirtualMachineSizeListResultInner;
import com.azure.resourcemanager.machinelearningservices.models.VirtualMachineSize;
import com.azure.resourcemanager.machinelearningservices.models.VirtualMachineSizeListResult;
import java.util.Collections;
import java.util.List;

public final class VirtualMachineSizeListResultImpl implements VirtualMachineSizeListResult {
    private VirtualMachineSizeListResultInner innerObject;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    VirtualMachineSizeListResultImpl(
        VirtualMachineSizeListResultInner innerObject,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<VirtualMachineSize> value() {
        List<VirtualMachineSize> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualMachineSizeListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
