// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.synapse.fluent.models.OperationResourceInner;
import com.azure.resourcemanager.synapse.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.synapse.models.OperationResource;
import com.azure.resourcemanager.synapse.models.PrivateEndpointConnection;
import com.azure.resourcemanager.synapse.models.PrivateEndpointConnections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final SynapseManager serviceManager;

    public PrivateEndpointConnectionsImpl(PrivateEndpointConnectionsClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PrivateEndpointConnection get(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, privateEndpointConnectionName, context);
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

    public OperationResource delete(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName) {
        OperationResourceInner inner =
            this.serviceClient().delete(resourceGroupName, workspaceName, privateEndpointConnectionName);
        if (inner != null) {
            return new OperationResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationResource delete(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context) {
        OperationResourceInner inner =
            this.serviceClient().delete(resourceGroupName, workspaceName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new OperationResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String workspaceName) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName);
        return inner.mapPage(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> list(
        String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, context);
        return inner.mapPage(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PrivateEndpointConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, workspaceName, privateEndpointConnectionName, Context.NONE)
            .getValue();
    }

    public Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, privateEndpointConnectionName, context);
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }

    public PrivateEndpointConnectionImpl define(String name) {
        return new PrivateEndpointConnectionImpl(name, this.manager());
    }
}
