// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VirtualRouterPeeringsClient;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualRouterPeeringInner;
import com.azure.resourcemanager.network.generated.models.VirtualRouterPeering;
import com.azure.resourcemanager.network.generated.models.VirtualRouterPeerings;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualRouterPeeringsImpl implements VirtualRouterPeerings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualRouterPeeringsImpl.class);

    private final VirtualRouterPeeringsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VirtualRouterPeeringsImpl(
        VirtualRouterPeeringsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String virtualRouterName, String peeringName) {
        this.serviceClient().delete(resourceGroupName, virtualRouterName, peeringName);
    }

    public void delete(String resourceGroupName, String virtualRouterName, String peeringName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualRouterName, peeringName, context);
    }

    public VirtualRouterPeering get(String resourceGroupName, String virtualRouterName, String peeringName) {
        VirtualRouterPeeringInner inner = this.serviceClient().get(resourceGroupName, virtualRouterName, peeringName);
        if (inner != null) {
            return new VirtualRouterPeeringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualRouterPeering> getWithResponse(
        String resourceGroupName, String virtualRouterName, String peeringName, Context context) {
        Response<VirtualRouterPeeringInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, virtualRouterName, peeringName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualRouterPeeringImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualRouterPeering> list(String resourceGroupName, String virtualRouterName) {
        PagedIterable<VirtualRouterPeeringInner> inner =
            this.serviceClient().list(resourceGroupName, virtualRouterName);
        return Utils.mapPage(inner, inner1 -> new VirtualRouterPeeringImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualRouterPeering> list(
        String resourceGroupName, String virtualRouterName, Context context) {
        PagedIterable<VirtualRouterPeeringInner> inner =
            this.serviceClient().list(resourceGroupName, virtualRouterName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualRouterPeeringImpl(inner1, this.manager()));
    }

    public VirtualRouterPeering getById(String id) {
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
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualRouterName, peeringName, Context.NONE).getValue();
    }

    public Response<VirtualRouterPeering> getByIdWithResponse(String id, Context context) {
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
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualRouterName, peeringName, context);
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
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        this.delete(resourceGroupName, virtualRouterName, peeringName, Context.NONE);
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
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        this.delete(resourceGroupName, virtualRouterName, peeringName, context);
    }

    private VirtualRouterPeeringsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualRouterPeeringImpl define(String name) {
        return new VirtualRouterPeeringImpl(name, this.manager());
    }
}
