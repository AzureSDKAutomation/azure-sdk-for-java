// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.compute.generated.models.Usage;
import com.azure.resourcemanager.compute.generated.models.UsageName;

public final class UsageImpl implements Usage {
    private UsageInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    UsageImpl(UsageInner innerObject, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String unit() {
        return this.innerModel().unit();
    }

    public int currentValue() {
        return this.innerModel().currentValue();
    }

    public long limit() {
        return this.innerModel().limit();
    }

    public UsageName name() {
        return this.innerModel().name();
    }

    public UsageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
