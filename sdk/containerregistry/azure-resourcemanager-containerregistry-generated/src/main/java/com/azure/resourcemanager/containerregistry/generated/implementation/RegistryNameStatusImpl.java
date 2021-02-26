// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryNameStatusInner;
import com.azure.resourcemanager.containerregistry.generated.models.RegistryNameStatus;

public final class RegistryNameStatusImpl implements RegistryNameStatus {
    private RegistryNameStatusInner innerObject;

    private final ContainerRegistryManager serviceManager;

    RegistryNameStatusImpl(RegistryNameStatusInner innerObject, ContainerRegistryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public RegistryNameStatusInner innerModel() {
        return this.innerObject;
    }

    private ContainerRegistryManager manager() {
        return this.serviceManager;
    }
}
