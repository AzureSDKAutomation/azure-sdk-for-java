// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.ProbeInner;
import com.azure.resourcemanager.network.generated.models.Probe;
import com.azure.resourcemanager.network.generated.models.ProbeProtocol;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class ProbeImpl implements Probe {
    private ProbeInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ProbeImpl(ProbeInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
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

    public String type() {
        return this.innerModel().type();
    }

    public List<SubResource> loadBalancingRules() {
        List<SubResource> inner = this.innerModel().loadBalancingRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProbeProtocol protocol() {
        return this.innerModel().protocol();
    }

    public Integer port() {
        return this.innerModel().port();
    }

    public Integer intervalInSeconds() {
        return this.innerModel().intervalInSeconds();
    }

    public Integer numberOfProbes() {
        return this.innerModel().numberOfProbes();
    }

    public String requestPath() {
        return this.innerModel().requestPath();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ProbeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
