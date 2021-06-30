// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.AvailableProvidersListInner;
import com.azure.resourcemanager.network.generated.models.AvailableProvidersList;
import com.azure.resourcemanager.network.generated.models.AvailableProvidersListCountry;
import java.util.Collections;
import java.util.List;

public final class AvailableProvidersListImpl implements AvailableProvidersList {
    private AvailableProvidersListInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    AvailableProvidersListImpl(
        AvailableProvidersListInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<AvailableProvidersListCountry> countries() {
        List<AvailableProvidersListCountry> inner = this.innerModel().countries();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AvailableProvidersListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
