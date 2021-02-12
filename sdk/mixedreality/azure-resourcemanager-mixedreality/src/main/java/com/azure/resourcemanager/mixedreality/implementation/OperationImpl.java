// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.implementation;

import com.azure.resourcemanager.mixedreality.MixedRealityManager;
import com.azure.resourcemanager.mixedreality.fluent.models.OperationInner;
import com.azure.resourcemanager.mixedreality.models.Operation;
import com.azure.resourcemanager.mixedreality.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final MixedRealityManager serviceManager;

    OperationImpl(OperationInner innerObject, MixedRealityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private MixedRealityManager manager() {
        return this.serviceManager;
    }
}
