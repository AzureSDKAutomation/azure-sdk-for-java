// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.implementation;

import com.azure.resourcemanager.mixedreality.MixedRealityManager;
import com.azure.resourcemanager.mixedreality.fluent.models.OperationInner;
import com.azure.resourcemanager.mixedreality.models.Operation;
import com.azure.resourcemanager.mixedreality.models.OperationDisplay;
import com.azure.resourcemanager.mixedreality.models.OperationProperties;

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

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public OperationProperties properties() {
        return this.innerModel().properties();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private MixedRealityManager manager() {
        return this.serviceManager;
    }
}
