// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.AppServiceManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.NetworkTraceInner;
import com.azure.resourcemanager.appservice.generated.models.NetworkTrace;

public final class NetworkTraceImpl implements NetworkTrace {
    private NetworkTraceInner innerObject;

    private final AppServiceManager serviceManager;

    NetworkTraceImpl(NetworkTraceInner innerObject, AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String path() {
        return this.innerModel().path();
    }

    public String status() {
        return this.innerModel().status();
    }

    public String message() {
        return this.innerModel().message();
    }

    public NetworkTraceInner innerModel() {
        return this.innerObject;
    }

    private AppServiceManager manager() {
        return this.serviceManager;
    }
}
