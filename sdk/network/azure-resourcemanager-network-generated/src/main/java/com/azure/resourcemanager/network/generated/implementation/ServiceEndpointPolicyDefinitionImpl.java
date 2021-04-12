// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyDefinitionInner;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPolicyDefinition;
import java.util.Collections;
import java.util.List;

public final class ServiceEndpointPolicyDefinitionImpl implements ServiceEndpointPolicyDefinition {
    private ServiceEndpointPolicyDefinitionInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ServiceEndpointPolicyDefinitionImpl(
        ServiceEndpointPolicyDefinitionInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String service() {
        return this.innerModel().service();
    }

    public List<String> serviceResources() {
        List<String> inner = this.innerModel().serviceResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ServiceEndpointPolicyDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
