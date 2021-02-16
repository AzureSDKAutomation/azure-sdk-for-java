// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryUsageListResultInner;
import com.azure.resourcemanager.containerregistry.generated.models.RegistryUsage;
import com.azure.resourcemanager.containerregistry.generated.models.RegistryUsageListResult;
import java.util.Collections;
import java.util.List;

public final class RegistryUsageListResultImpl implements RegistryUsageListResult {
    private RegistryUsageListResultInner innerObject;

    private final ContainerRegistryManager serviceManager;

    RegistryUsageListResultImpl(RegistryUsageListResultInner innerObject, ContainerRegistryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<RegistryUsage> value() {
        List<RegistryUsage> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RegistryUsageListResultInner innerModel() {
        return this.innerObject;
    }

    private ContainerRegistryManager manager() {
        return this.serviceManager;
    }
}
