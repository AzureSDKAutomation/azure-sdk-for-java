// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteLinksClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteLinkInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteLink;
import com.azure.resourcemanager.network.generated.models.ExpressRouteLinks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExpressRouteLinksImpl implements ExpressRouteLinks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteLinksImpl.class);

    private final ExpressRouteLinksClient innerClient;

    private final NetworkManager serviceManager;

    public ExpressRouteLinksImpl(ExpressRouteLinksClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ExpressRouteLink get(String resourceGroupName, String expressRoutePortName, String linkName) {
        ExpressRouteLinkInner inner = this.serviceClient().get(resourceGroupName, expressRoutePortName, linkName);
        if (inner != null) {
            return new ExpressRouteLinkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteLink> getWithResponse(
        String resourceGroupName, String expressRoutePortName, String linkName, Context context) {
        Response<ExpressRouteLinkInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, expressRoutePortName, linkName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExpressRouteLinkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ExpressRouteLink> list(String resourceGroupName, String expressRoutePortName) {
        PagedIterable<ExpressRouteLinkInner> inner = this.serviceClient().list(resourceGroupName, expressRoutePortName);
        return Utils.mapPage(inner, inner1 -> new ExpressRouteLinkImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteLink> list(
        String resourceGroupName, String expressRoutePortName, Context context) {
        PagedIterable<ExpressRouteLinkInner> inner =
            this.serviceClient().list(resourceGroupName, expressRoutePortName, context);
        return Utils.mapPage(inner, inner1 -> new ExpressRouteLinkImpl(inner1, this.manager()));
    }

    private ExpressRouteLinksClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
