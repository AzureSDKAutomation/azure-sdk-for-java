// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.implementation;

import com.azure.resourcemanager.quantum.AzureQuantumManager;
import com.azure.resourcemanager.quantum.fluent.models.OperationInner;
import com.azure.resourcemanager.quantum.models.Operation;
import com.azure.resourcemanager.quantum.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final AzureQuantumManager serviceManager;

    OperationImpl(OperationInner innerObject, AzureQuantumManager serviceManager) {
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

    private AzureQuantumManager manager() {
        return this.serviceManager;
    }
}
