// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.resourcemanager.containerregistry.generated.fluent.models.EventInner;
import com.azure.resourcemanager.containerregistry.generated.models.Event;
import com.azure.resourcemanager.containerregistry.generated.models.EventRequestMessage;
import com.azure.resourcemanager.containerregistry.generated.models.EventResponseMessage;

public final class EventImpl implements Event {
    private EventInner innerObject;

    private final com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager;

    EventImpl(
        EventInner innerObject,
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public EventRequestMessage eventRequestMessage() {
        return this.innerModel().eventRequestMessage();
    }

    public EventResponseMessage eventResponseMessage() {
        return this.innerModel().eventResponseMessage();
    }

    public EventInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager() {
        return this.serviceManager;
    }
}
