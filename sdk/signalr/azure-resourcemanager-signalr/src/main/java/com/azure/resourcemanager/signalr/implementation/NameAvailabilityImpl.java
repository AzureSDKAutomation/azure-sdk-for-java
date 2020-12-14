// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.implementation;

import com.azure.resourcemanager.signalr.SignalRManager;
import com.azure.resourcemanager.signalr.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.signalr.models.NameAvailability;

public final class NameAvailabilityImpl implements NameAvailability {
    private NameAvailabilityInner innerObject;

    private final SignalRManager serviceManager;

    public NameAvailabilityImpl(NameAvailabilityInner innerObject, SignalRManager serviceManager) {
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

    public NameAvailabilityInner innerModel() {
        return this.innerObject;
    }

    private SignalRManager manager() {
        return this.serviceManager;
    }
}
