// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devops.implementation;

import com.azure.resourcemanager.devops.fluent.models.OperationInner;
import com.azure.resourcemanager.devops.models.Operation;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.devops.DevopsManager serviceManager;

    OperationImpl(OperationInner innerObject, com.azure.resourcemanager.devops.DevopsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String isDataAction() {
        return this.innerModel().isDataAction();
    }

    public String operation() {
        return this.innerModel().operation();
    }

    public String resource() {
        return this.innerModel().resource();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String provider() {
        return this.innerModel().provider();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devops.DevopsManager manager() {
        return this.serviceManager;
    }
}
