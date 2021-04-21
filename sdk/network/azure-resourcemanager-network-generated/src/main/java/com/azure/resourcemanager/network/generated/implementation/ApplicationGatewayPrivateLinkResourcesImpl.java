// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ApplicationGatewayPrivateLinkResourcesClient;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayPrivateLinkResourceInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayPrivateLinkResource;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayPrivateLinkResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ApplicationGatewayPrivateLinkResourcesImpl implements ApplicationGatewayPrivateLinkResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayPrivateLinkResourcesImpl.class);

    private final ApplicationGatewayPrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ApplicationGatewayPrivateLinkResourcesImpl(
        ApplicationGatewayPrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApplicationGatewayPrivateLinkResource> list(
        String resourceGroupName, String applicationGatewayName) {
        PagedIterable<ApplicationGatewayPrivateLinkResourceInner> inner =
            this.serviceClient().list(resourceGroupName, applicationGatewayName);
        return Utils.mapPage(inner, inner1 -> new ApplicationGatewayPrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationGatewayPrivateLinkResource> list(
        String resourceGroupName, String applicationGatewayName, Context context) {
        PagedIterable<ApplicationGatewayPrivateLinkResourceInner> inner =
            this.serviceClient().list(resourceGroupName, applicationGatewayName, context);
        return Utils.mapPage(inner, inner1 -> new ApplicationGatewayPrivateLinkResourceImpl(inner1, this.manager()));
    }

    private ApplicationGatewayPrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
