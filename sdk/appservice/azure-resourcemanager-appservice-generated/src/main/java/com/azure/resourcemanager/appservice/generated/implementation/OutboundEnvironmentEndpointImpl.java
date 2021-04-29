// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.OutboundEnvironmentEndpointInner;
import com.azure.resourcemanager.appservice.generated.models.EndpointDependency;
import com.azure.resourcemanager.appservice.generated.models.OutboundEnvironmentEndpoint;
import java.util.Collections;
import java.util.List;

public final class OutboundEnvironmentEndpointImpl implements OutboundEnvironmentEndpoint {
    private OutboundEnvironmentEndpointInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    OutboundEnvironmentEndpointImpl(
        OutboundEnvironmentEndpointInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String category() {
        return this.innerModel().category();
    }

    public List<EndpointDependency> endpoints() {
        List<EndpointDependency> inner = this.innerModel().endpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OutboundEnvironmentEndpointInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
