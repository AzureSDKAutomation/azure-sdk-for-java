// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningcompute.implementation;

import com.azure.resourcemanager.machinelearningcompute.fluent.models.UpdateSystemServicesResponseInner;
import com.azure.resourcemanager.machinelearningcompute.models.OperationStatus;
import com.azure.resourcemanager.machinelearningcompute.models.UpdateSystemServicesResponse;
import java.time.OffsetDateTime;

public final class UpdateSystemServicesResponseImpl implements UpdateSystemServicesResponse {
    private UpdateSystemServicesResponseInner innerObject;

    private final com.azure.resourcemanager.machinelearningcompute.MachineLearningComputeManager serviceManager;

    UpdateSystemServicesResponseImpl(
        UpdateSystemServicesResponseInner innerObject,
        com.azure.resourcemanager.machinelearningcompute.MachineLearningComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OperationStatus updateStatus() {
        return this.innerModel().updateStatus();
    }

    public OffsetDateTime updateStartedOn() {
        return this.innerModel().updateStartedOn();
    }

    public OffsetDateTime updateCompletedOn() {
        return this.innerModel().updateCompletedOn();
    }

    public UpdateSystemServicesResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearningcompute.MachineLearningComputeManager manager() {
        return this.serviceManager;
    }
}
