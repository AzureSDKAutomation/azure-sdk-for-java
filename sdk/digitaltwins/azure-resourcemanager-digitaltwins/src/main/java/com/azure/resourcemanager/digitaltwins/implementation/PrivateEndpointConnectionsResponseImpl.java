// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.implementation;

import com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager;
import com.azure.resourcemanager.digitaltwins.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.digitaltwins.fluent.models.PrivateEndpointConnectionsResponseInner;
import com.azure.resourcemanager.digitaltwins.models.PrivateEndpointConnection;
import com.azure.resourcemanager.digitaltwins.models.PrivateEndpointConnectionsResponse;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PrivateEndpointConnectionsResponseImpl implements PrivateEndpointConnectionsResponse {
    private PrivateEndpointConnectionsResponseInner innerObject;

    private final AzureDigitalTwinsManager serviceManager;

    public PrivateEndpointConnectionsResponseImpl(
        PrivateEndpointConnectionsResponseInner innerObject, AzureDigitalTwinsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PrivateEndpointConnection> value() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateEndpointConnectionsResponseInner innerModel() {
        return this.innerObject;
    }

    private AzureDigitalTwinsManager manager() {
        return this.serviceManager;
    }
}
