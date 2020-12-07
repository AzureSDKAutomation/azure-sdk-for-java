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
import com.azure.resourcemanager.network.generated.fluent.RouteTablesClient;
import com.azure.resourcemanager.network.generated.fluent.models.RouteTableInner;
import com.azure.resourcemanager.network.generated.models.RouteTable;
import com.azure.resourcemanager.network.generated.models.RouteTables;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RouteTablesImpl implements RouteTables {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RouteTablesImpl.class);

    private final RouteTablesClient innerClient;

    private final NetworkManager serviceManager;

    public RouteTablesImpl(RouteTablesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String routeTableName) {
        this.serviceClient().delete(resourceGroupName, routeTableName);
    }

    public void delete(String resourceGroupName, String routeTableName, Context context) {
        this.serviceClient().delete(resourceGroupName, routeTableName, context);
    }

    public RouteTable getByResourceGroup(String resourceGroupName, String routeTableName) {
        RouteTableInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, routeTableName);
        if (inner != null) {
            return new RouteTableImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RouteTable> getByResourceGroupWithResponse(
        String resourceGroupName, String routeTableName, String expand, Context context) {
        Response<RouteTableInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, routeTableName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RouteTableImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<RouteTable> listByResourceGroup(String resourceGroupName) {
        PagedIterable<RouteTableInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new RouteTableImpl(inner1, this.manager()));
    }

    public PagedIterable<RouteTable> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<RouteTableInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new RouteTableImpl(inner1, this.manager()));
    }

    public PagedIterable<RouteTable> list() {
        PagedIterable<RouteTableInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new RouteTableImpl(inner1, this.manager()));
    }

    public PagedIterable<RouteTable> list(Context context) {
        PagedIterable<RouteTableInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new RouteTableImpl(inner1, this.manager()));
    }

    public RouteTable getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String routeTableName = Utils.getValueFromIdByName(id, "routeTables");
        if (routeTableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routeTables'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, routeTableName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<RouteTable> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String routeTableName = Utils.getValueFromIdByName(id, "routeTables");
        if (routeTableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routeTables'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, routeTableName, expand, context);
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
        String routeTableName = Utils.getValueFromIdByName(id, "routeTables");
        if (routeTableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routeTables'.", id)));
        }
        this.delete(resourceGroupName, routeTableName, Context.NONE);
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
        String routeTableName = Utils.getValueFromIdByName(id, "routeTables");
        if (routeTableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routeTables'.", id)));
        }
        this.delete(resourceGroupName, routeTableName, context);
    }

    private RouteTablesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public RouteTableImpl define(String name) {
        return new RouteTableImpl(name, this.manager());
    }
}
