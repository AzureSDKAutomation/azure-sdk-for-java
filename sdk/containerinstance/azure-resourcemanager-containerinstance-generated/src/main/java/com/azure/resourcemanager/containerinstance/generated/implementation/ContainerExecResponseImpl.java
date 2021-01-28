// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.implementation;

import com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager;
import com.azure.resourcemanager.containerinstance.generated.fluent.models.ContainerExecResponseInner;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerExecResponse;

public final class ContainerExecResponseImpl implements ContainerExecResponse {
    private ContainerExecResponseInner innerObject;

    private final ContainerInstanceManager serviceManager;

    ContainerExecResponseImpl(ContainerExecResponseInner innerObject, ContainerInstanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String webSocketUri() {
        return this.innerModel().webSocketUri();
    }

    public String password() {
        return this.innerModel().password();
    }

    public ContainerExecResponseInner innerModel() {
        return this.innerObject;
    }

    private ContainerInstanceManager manager() {
        return this.serviceManager;
    }
}
