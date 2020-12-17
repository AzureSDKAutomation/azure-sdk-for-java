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
import com.azure.resourcemanager.network.generated.fluent.NetworkVirtualApplianceSitesClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceSiteInner;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualApplianceSite;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualApplianceSites;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NetworkVirtualApplianceSitesImpl implements NetworkVirtualApplianceSites {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkVirtualApplianceSitesImpl.class);

    private final NetworkVirtualApplianceSitesClient innerClient;

    private final NetworkManager serviceManager;

    public NetworkVirtualApplianceSitesImpl(
        NetworkVirtualApplianceSitesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String siteName) {
        this.serviceClient().delete(resourceGroupName, siteName);
    }

    public void delete(String resourceGroupName, String siteName, Context context) {
        this.serviceClient().delete(resourceGroupName, siteName, context);
    }

    public NetworkVirtualApplianceSite getByResourceGroup(String resourceGroupName, String siteName) {
        NetworkVirtualApplianceSiteInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, siteName);
        if (inner != null) {
            return new NetworkVirtualApplianceSiteImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkVirtualApplianceSite> getByResourceGroupWithResponse(
        String resourceGroupName, String siteName, Context context) {
        Response<NetworkVirtualApplianceSiteInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, siteName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkVirtualApplianceSiteImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<NetworkVirtualApplianceSite> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkVirtualApplianceSiteInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new NetworkVirtualApplianceSiteImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkVirtualApplianceSite> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetworkVirtualApplianceSiteInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new NetworkVirtualApplianceSiteImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkVirtualApplianceSite> list() {
        PagedIterable<NetworkVirtualApplianceSiteInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new NetworkVirtualApplianceSiteImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkVirtualApplianceSite> list(Context context) {
        PagedIterable<NetworkVirtualApplianceSiteInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new NetworkVirtualApplianceSiteImpl(inner1, this.manager()));
    }

    public NetworkVirtualApplianceSite getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String siteName = Utils.getValueFromIdByName(id, "virtualApplianceSites");
        if (siteName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualApplianceSites'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, siteName, Context.NONE).getValue();
    }

    public Response<NetworkVirtualApplianceSite> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String siteName = Utils.getValueFromIdByName(id, "virtualApplianceSites");
        if (siteName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualApplianceSites'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, siteName, context);
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
        String siteName = Utils.getValueFromIdByName(id, "virtualApplianceSites");
        if (siteName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualApplianceSites'.",
                                id)));
        }
        this.delete(resourceGroupName, siteName, Context.NONE);
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
        String siteName = Utils.getValueFromIdByName(id, "virtualApplianceSites");
        if (siteName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualApplianceSites'.",
                                id)));
        }
        this.delete(resourceGroupName, siteName, context);
    }

    private NetworkVirtualApplianceSitesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public NetworkVirtualApplianceSiteImpl define(String name) {
        return new NetworkVirtualApplianceSiteImpl(name, this.manager());
    }
}
