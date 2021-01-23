// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.ServerUsageInner;
import com.azure.resourcemanager.synapse.models.ServerUsage;
import java.time.OffsetDateTime;

public final class ServerUsageImpl implements ServerUsage {
    private ServerUsageInner innerObject;

    private final SynapseManager serviceManager;

    ServerUsageImpl(ServerUsageInner innerObject, SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String resourceName() {
        return this.innerModel().resourceName();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public Double currentValue() {
        return this.innerModel().currentValue();
    }

    public Double limit() {
        return this.innerModel().limit();
    }

    public String unit() {
        return this.innerModel().unit();
    }

    public OffsetDateTime nextResetTime() {
        return this.innerModel().nextResetTime();
    }

    public ServerUsageInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}