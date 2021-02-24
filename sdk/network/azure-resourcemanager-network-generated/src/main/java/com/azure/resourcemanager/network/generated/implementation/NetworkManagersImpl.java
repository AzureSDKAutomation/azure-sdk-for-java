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
import com.azure.resourcemanager.network.generated.fluent.NetworkManagersClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerInner;
import com.azure.resourcemanager.network.generated.models.NetworkManager;
import com.azure.resourcemanager.network.generated.models.NetworkManagers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NetworkManagersImpl implements NetworkManagers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkManagersImpl.class);

    private final NetworkManagersClient innerClient;

    private final NetworkManager serviceManager;

    public NetworkManagersImpl(NetworkManagersClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public NetworkManager getByResourceGroup(String resourceGroupName, String networkManagerName) {
        NetworkManagerInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, networkManagerName);
        if (inner != null) {
            return new NetworkManagerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkManager> getByResourceGroupWithResponse(
        String resourceGroupName, String networkManagerName, Context context) {
        Response<NetworkManagerInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, networkManagerName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkManagerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String networkManagerName) {
        this.serviceClient().delete(resourceGroupName, networkManagerName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String networkManagerName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, networkManagerName, context);
    }

    public PagedIterable<NetworkManager> list() {
        PagedIterable<NetworkManagerInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkManagerImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkManager> list(Integer top, String skipToken, Context context) {
        PagedIterable<NetworkManagerInner> inner = this.serviceClient().list(top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new NetworkManagerImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkManager> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkManagerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NetworkManagerImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkManager> listByResourceGroup(
        String resourceGroupName, Integer top, String skipToken, Context context) {
        PagedIterable<NetworkManagerInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new NetworkManagerImpl(inner1, this.manager()));
    }

    public NetworkManager getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkManagerName, Context.NONE).getValue();
    }

    public Response<NetworkManager> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkManagerName, context);
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
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, networkManagerName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, networkManagerName, context);
    }

    private NetworkManagersClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public NetworkManagerImpl define(String name) {
        return new NetworkManagerImpl(name, this.manager());
    }
}
