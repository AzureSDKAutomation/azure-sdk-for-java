// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.generated.fluent.ResolvePrivateLinkServiceIdsClient;
import com.azure.resourcemanager.containerservice.generated.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.containerservice.generated.models.PrivateLinkResource;
import com.azure.resourcemanager.containerservice.generated.models.ResolvePrivateLinkServiceIds;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResolvePrivateLinkServiceIdsImpl implements ResolvePrivateLinkServiceIds {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResolvePrivateLinkServiceIdsImpl.class);

    private final ResolvePrivateLinkServiceIdsClient innerClient;

    private final com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager;

    public ResolvePrivateLinkServiceIdsImpl(
        ResolvePrivateLinkServiceIdsClient innerClient,
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PrivateLinkResource post(
        String resourceGroupName, String resourceName, PrivateLinkResourceInner parameters) {
        PrivateLinkResourceInner inner = this.serviceClient().post(resourceGroupName, resourceName, parameters);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResource> postWithResponse(
        String resourceGroupName, String resourceName, PrivateLinkResourceInner parameters, Context context) {
        Response<PrivateLinkResourceInner> inner =
            this.serviceClient().postWithResponse(resourceGroupName, resourceName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ResolvePrivateLinkServiceIdsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager() {
        return this.serviceManager;
    }
}
