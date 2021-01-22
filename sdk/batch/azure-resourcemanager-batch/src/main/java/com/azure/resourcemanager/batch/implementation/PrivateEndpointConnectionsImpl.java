// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batch.BatchManager;
import com.azure.resourcemanager.batch.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.batch.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.batch.models.PrivateEndpointConnection;
import com.azure.resourcemanager.batch.models.PrivateEndpointConnections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final BatchManager serviceManager;

    public PrivateEndpointConnectionsImpl(PrivateEndpointConnectionsClient innerClient, BatchManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateEndpointConnection> listByBatchAccount(String resourceGroupName, String accountName) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listByBatchAccount(resourceGroupName, accountName);
        return inner.mapPage(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> listByBatchAccount(
        String resourceGroupName, String accountName, Integer maxresults, Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listByBatchAccount(resourceGroupName, accountName, maxresults, context);
        return inner.mapPage(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PrivateEndpointConnection get(
        String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().get(resourceGroupName, accountName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String accountName, String privateEndpointConnectionName, Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, accountName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection update(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters,
        String ifMatch) {
        PrivateEndpointConnectionInner inner =
            this
                .serviceClient()
                .update(resourceGroupName, accountName, privateEndpointConnectionName, parameters, ifMatch);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection update(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().update(resourceGroupName, accountName, privateEndpointConnectionName, parameters);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection update(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters,
        String ifMatch,
        Context context) {
        PrivateEndpointConnectionInner inner =
            this
                .serviceClient()
                .update(resourceGroupName, accountName, privateEndpointConnectionName, parameters, ifMatch, context);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private BatchManager manager() {
        return this.serviceManager;
    }
}
