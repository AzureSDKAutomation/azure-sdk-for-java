// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.implementation;

import com.azure.resourcemanager.signalr.SignalRManager;
import com.azure.resourcemanager.signalr.fluent.models.OperationInner;
import com.azure.resourcemanager.signalr.models.Operation;
import com.azure.resourcemanager.signalr.models.OperationDisplay;
import com.azure.resourcemanager.signalr.models.OperationProperties;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final SignalRManager serviceManager;

    public OperationImpl(OperationInner innerObject, SignalRManager serviceManager) {
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

    public String origin() {
        return this.innerModel().origin();
    }

    public OperationProperties properties() {
        return this.innerModel().properties();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private SignalRManager manager() {
        return this.serviceManager;
    }
}
