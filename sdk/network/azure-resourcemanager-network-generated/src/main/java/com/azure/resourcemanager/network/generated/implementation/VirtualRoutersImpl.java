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
import com.azure.resourcemanager.network.generated.fluent.VirtualRoutersClient;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualRouterInner;
import com.azure.resourcemanager.network.generated.models.VirtualRouter;
import com.azure.resourcemanager.network.generated.models.VirtualRouters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualRoutersImpl implements VirtualRouters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualRoutersImpl.class);

    private final VirtualRoutersClient innerClient;

    private final NetworkManager serviceManager;

    public VirtualRoutersImpl(VirtualRoutersClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String virtualRouterName) {
        this.serviceClient().delete(resourceGroupName, virtualRouterName);
    }

    public void delete(String resourceGroupName, String virtualRouterName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualRouterName, context);
    }

    public VirtualRouter getByResourceGroup(String resourceGroupName, String virtualRouterName) {
        VirtualRouterInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, virtualRouterName);
        if (inner != null) {
            return new VirtualRouterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualRouter> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualRouterName, String expand, Context context) {
        Response<VirtualRouterInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, virtualRouterName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualRouterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualRouter> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualRouterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new VirtualRouterImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualRouter> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualRouterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new VirtualRouterImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualRouter> list() {
        PagedIterable<VirtualRouterInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new VirtualRouterImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualRouter> list(Context context) {
        PagedIterable<VirtualRouterInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new VirtualRouterImpl(inner1, this.manager()));
    }

    public VirtualRouter getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualRouterName = Utils.getValueFromIdByName(id, "virtualRouters");
        if (virtualRouterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualRouters'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, virtualRouterName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<VirtualRouter> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualRouterName = Utils.getValueFromIdByName(id, "virtualRouters");
        if (virtualRouterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualRouters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualRouterName, expand, context);
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
        String virtualRouterName = Utils.getValueFromIdByName(id, "virtualRouters");
        if (virtualRouterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualRouters'.", id)));
        }
        this.delete(resourceGroupName, virtualRouterName, Context.NONE);
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
        String virtualRouterName = Utils.getValueFromIdByName(id, "virtualRouters");
        if (virtualRouterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualRouters'.", id)));
        }
        this.delete(resourceGroupName, virtualRouterName, context);
    }

    private VirtualRoutersClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualRouterImpl define(String name) {
        return new VirtualRouterImpl(name, this.manager());
    }
}
