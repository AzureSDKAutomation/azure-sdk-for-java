// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.fluent.GlobalReachConnectionsClient;
import com.azure.resourcemanager.avs.fluent.models.GlobalReachConnectionInner;
import com.azure.resourcemanager.avs.models.GlobalReachConnection;
import com.azure.resourcemanager.avs.models.GlobalReachConnections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GlobalReachConnectionsImpl implements GlobalReachConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GlobalReachConnectionsImpl.class);

    private final GlobalReachConnectionsClient innerClient;

    private final AvsManager serviceManager;

    public GlobalReachConnectionsImpl(GlobalReachConnectionsClient innerClient, AvsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GlobalReachConnection> list(String resourceGroupName, String privateCloudName) {
        PagedIterable<GlobalReachConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, privateCloudName);
        return inner.mapPage(inner1 -> new GlobalReachConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<GlobalReachConnection> list(
        String resourceGroupName, String privateCloudName, Context context) {
        PagedIterable<GlobalReachConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, privateCloudName, context);
        return inner.mapPage(inner1 -> new GlobalReachConnectionImpl(inner1, this.manager()));
    }

    public GlobalReachConnection get(
        String resourceGroupName, String privateCloudName, String globalReachConnectionName) {
        GlobalReachConnectionInner inner =
            this.serviceClient().get(resourceGroupName, privateCloudName, globalReachConnectionName);
        if (inner != null) {
            return new GlobalReachConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GlobalReachConnection> getWithResponse(
        String resourceGroupName, String privateCloudName, String globalReachConnectionName, Context context) {
        Response<GlobalReachConnectionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, privateCloudName, globalReachConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GlobalReachConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String privateCloudName, String globalReachConnectionName) {
        this.serviceClient().delete(resourceGroupName, privateCloudName, globalReachConnectionName);
    }

    public void delete(
        String resourceGroupName, String privateCloudName, String globalReachConnectionName, Context context) {
        this.serviceClient().delete(resourceGroupName, privateCloudName, globalReachConnectionName, context);
    }

    public GlobalReachConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String globalReachConnectionName = Utils.getValueFromIdByName(id, "globalReachConnections");
        if (globalReachConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'globalReachConnections'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, privateCloudName, globalReachConnectionName, Context.NONE)
            .getValue();
    }

    public Response<GlobalReachConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String globalReachConnectionName = Utils.getValueFromIdByName(id, "globalReachConnections");
        if (globalReachConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'globalReachConnections'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, privateCloudName, globalReachConnectionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String globalReachConnectionName = Utils.getValueFromIdByName(id, "globalReachConnections");
        if (globalReachConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'globalReachConnections'.",
                                id)));
        }
        this.delete(resourceGroupName, privateCloudName, globalReachConnectionName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String globalReachConnectionName = Utils.getValueFromIdByName(id, "globalReachConnections");
        if (globalReachConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'globalReachConnections'.",
                                id)));
        }
        this.delete(resourceGroupName, privateCloudName, globalReachConnectionName, context);
    }

    private GlobalReachConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private AvsManager manager() {
        return this.serviceManager;
    }

    public GlobalReachConnectionImpl define(String name) {
        return new GlobalReachConnectionImpl(name, this.manager());
    }
}
