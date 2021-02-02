// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.PrivateEndpointConnectionsPrivateLinkHubsClient;
import com.azure.resourcemanager.synapse.fluent.models.PrivateEndpointConnectionForPrivateLinkHubInner;
import com.azure.resourcemanager.synapse.models.PrivateEndpointConnectionForPrivateLinkHub;
import com.azure.resourcemanager.synapse.models.PrivateEndpointConnectionsPrivateLinkHubs;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateEndpointConnectionsPrivateLinkHubsImpl implements PrivateEndpointConnectionsPrivateLinkHubs {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionsPrivateLinkHubsImpl.class);

    private final PrivateEndpointConnectionsPrivateLinkHubsClient innerClient;

    private final SynapseManager serviceManager;

    public PrivateEndpointConnectionsPrivateLinkHubsImpl(
        PrivateEndpointConnectionsPrivateLinkHubsClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateEndpointConnectionForPrivateLinkHub> list(
        String resourceGroupName, String privateLinkHubName) {
        PagedIterable<PrivateEndpointConnectionForPrivateLinkHubInner> inner =
            this.serviceClient().list(resourceGroupName, privateLinkHubName);
        return inner.mapPage(inner1 -> new PrivateEndpointConnectionForPrivateLinkHubImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnectionForPrivateLinkHub> list(
        String resourceGroupName, String privateLinkHubName, Context context) {
        PagedIterable<PrivateEndpointConnectionForPrivateLinkHubInner> inner =
            this.serviceClient().list(resourceGroupName, privateLinkHubName, context);
        return inner.mapPage(inner1 -> new PrivateEndpointConnectionForPrivateLinkHubImpl(inner1, this.manager()));
    }

    private PrivateEndpointConnectionsPrivateLinkHubsClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
