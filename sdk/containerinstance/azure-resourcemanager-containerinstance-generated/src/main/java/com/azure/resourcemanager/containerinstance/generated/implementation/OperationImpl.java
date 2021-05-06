// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.implementation;

import com.azure.resourcemanager.containerinstance.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerInstanceOperationsOrigin;
import com.azure.resourcemanager.containerinstance.generated.models.Operation;
import com.azure.resourcemanager.containerinstance.generated.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager serviceManager;

    OperationImpl(
        OperationInner innerObject,
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public ContainerInstanceOperationsOrigin origin() {
        return this.innerModel().origin();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager() {
        return this.serviceManager;
    }
}
