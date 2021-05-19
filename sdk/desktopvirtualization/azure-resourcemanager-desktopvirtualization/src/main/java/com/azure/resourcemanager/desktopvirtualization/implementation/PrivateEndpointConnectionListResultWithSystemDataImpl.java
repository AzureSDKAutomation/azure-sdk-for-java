// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.resourcemanager.desktopvirtualization.fluent.models.PrivateEndpointConnectionListResultWithSystemDataInner;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.PrivateEndpointConnectionWithSystemDataInner;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnectionListResultWithSystemData;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnectionWithSystemData;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PrivateEndpointConnectionListResultWithSystemDataImpl
    implements PrivateEndpointConnectionListResultWithSystemData {
    private PrivateEndpointConnectionListResultWithSystemDataInner innerObject;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    PrivateEndpointConnectionListResultWithSystemDataImpl(
        PrivateEndpointConnectionListResultWithSystemDataInner innerObject,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PrivateEndpointConnectionWithSystemData> value() {
        List<PrivateEndpointConnectionWithSystemDataInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionWithSystemDataImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateEndpointConnectionListResultWithSystemDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }
}
