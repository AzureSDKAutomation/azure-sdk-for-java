// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.implementation;

import com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager;
import com.azure.resourcemanager.containerinstance.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.containerinstance.generated.models.Usage;
import com.azure.resourcemanager.containerinstance.generated.models.UsageName;

public final class UsageImpl implements Usage {
    private UsageInner innerObject;

    private final ContainerInstanceManager serviceManager;

    public UsageImpl(UsageInner innerObject, ContainerInstanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String unit() {
        return this.innerModel().unit();
    }

    public Integer currentValue() {
        return this.innerModel().currentValue();
    }

    public Integer limit() {
        return this.innerModel().limit();
    }

    public UsageName name() {
        return this.innerModel().name();
    }

    public UsageInner innerModel() {
        return this.innerObject;
    }

    private ContainerInstanceManager manager() {
        return this.serviceManager;
    }
}
