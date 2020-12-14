// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.adp.implementation;

import com.azure.resourcemanager.adp.AdpManager;
import com.azure.resourcemanager.adp.fluent.models.OperationInner;
import com.azure.resourcemanager.adp.models.Operation;
import com.azure.resourcemanager.adp.models.OperationDisplay;
import com.azure.resourcemanager.adp.models.OperationServiceSpecification;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final AdpManager serviceManager;

    public OperationImpl(OperationInner innerObject, AdpManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public String actionType() {
        return this.innerModel().actionType();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public OperationServiceSpecification serviceSpecification() {
        return this.innerModel().serviceSpecification();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private AdpManager manager() {
        return this.serviceManager;
    }
}
