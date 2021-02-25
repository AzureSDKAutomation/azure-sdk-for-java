// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.AppServiceManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.InboundEnvironmentEndpointInner;
import com.azure.resourcemanager.appservice.generated.models.InboundEnvironmentEndpoint;
import java.util.Collections;
import java.util.List;

public final class InboundEnvironmentEndpointImpl implements InboundEnvironmentEndpoint {
    private InboundEnvironmentEndpointInner innerObject;

    private final AppServiceManager serviceManager;

    InboundEnvironmentEndpointImpl(InboundEnvironmentEndpointInner innerObject, AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String description() {
        return this.innerModel().description();
    }

    public List<String> endpoints() {
        List<String> inner = this.innerModel().endpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> ports() {
        List<String> inner = this.innerModel().ports();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public InboundEnvironmentEndpointInner innerModel() {
        return this.innerObject;
    }

    private AppServiceManager manager() {
        return this.serviceManager;
    }
}
