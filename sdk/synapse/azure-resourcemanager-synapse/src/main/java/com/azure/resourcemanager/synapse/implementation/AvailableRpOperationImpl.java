// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.AvailableRpOperationInner;
import com.azure.resourcemanager.synapse.models.AvailableRpOperation;
import com.azure.resourcemanager.synapse.models.AvailableRpOperationDisplayInfo;
import com.azure.resourcemanager.synapse.models.OperationMetaServiceSpecification;

public final class AvailableRpOperationImpl implements AvailableRpOperation {
    private AvailableRpOperationInner innerObject;

    private final SynapseManager serviceManager;

    AvailableRpOperationImpl(AvailableRpOperationInner innerObject, SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public AvailableRpOperationDisplayInfo display() {
        return this.innerModel().display();
    }

    public String isDataAction() {
        return this.innerModel().isDataAction();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public OperationMetaServiceSpecification serviceSpecification() {
        return this.innerModel().serviceSpecification();
    }

    public AvailableRpOperationInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}