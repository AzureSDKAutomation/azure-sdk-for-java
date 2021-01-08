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
import com.azure.resourcemanager.network.generated.fluent.VirtualApplianceSitesClient;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualApplianceSiteInner;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceSite;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceSites;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualApplianceSitesImpl implements VirtualApplianceSites {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualApplianceSitesImpl.class);

    private final VirtualApplianceSitesClient innerClient;

    private final NetworkManager serviceManager;

    public VirtualApplianceSitesImpl(VirtualApplianceSitesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String networkVirtualApplianceName, String siteName) {
        this.serviceClient().delete(resourceGroupName, networkVirtualApplianceName, siteName);
    }

    public void delete(String resourceGroupName, String networkVirtualApplianceName, String siteName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkVirtualApplianceName, siteName, context);
    }

    public VirtualApplianceSite get(String resourceGroupName, String networkVirtualApplianceName, String siteName) {
        VirtualApplianceSiteInner inner =
            this.serviceClient().get(resourceGroupName, networkVirtualApplianceName, siteName);
        if (inner != null) {
            return new VirtualApplianceSiteImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualApplianceSite> getWithResponse(
        String resourceGroupName, String networkVirtualApplianceName, String siteName, Context context) {
        Response<VirtualApplianceSiteInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, networkVirtualApplianceName, siteName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualApplianceSiteImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualApplianceSite> list(String resourceGroupName, String networkVirtualApplianceName) {
        PagedIterable<VirtualApplianceSiteInner> inner =
            this.serviceClient().list(resourceGroupName, networkVirtualApplianceName);
        return inner.mapPage(inner1 -> new VirtualApplianceSiteImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualApplianceSite> list(
        String resourceGroupName, String networkVirtualApplianceName, Context context) {
        PagedIterable<VirtualApplianceSiteInner> inner =
            this.serviceClient().list(resourceGroupName, networkVirtualApplianceName, context);
        return inner.mapPage(inner1 -> new VirtualApplianceSiteImpl(inner1, this.manager()));
    }

    public VirtualApplianceSite getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkVirtualApplianceName = Utils.getValueFromIdByName(id, "networkVirtualAppliances");
        if (networkVirtualApplianceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkVirtualAppliances'.",
                                id)));
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
        return this.getWithResponse(resourceGroupName, networkVirtualApplianceName, siteName, Context.NONE).getValue();
    }

    public Response<VirtualApplianceSite> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkVirtualApplianceName = Utils.getValueFromIdByName(id, "networkVirtualAppliances");
        if (networkVirtualApplianceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkVirtualAppliances'.",
                                id)));
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
        return this.getWithResponse(resourceGroupName, networkVirtualApplianceName, siteName, context);
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
        String networkVirtualApplianceName = Utils.getValueFromIdByName(id, "networkVirtualAppliances");
        if (networkVirtualApplianceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkVirtualAppliances'.",
                                id)));
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
        this.delete(resourceGroupName, networkVirtualApplianceName, siteName, Context.NONE);
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
        String networkVirtualApplianceName = Utils.getValueFromIdByName(id, "networkVirtualAppliances");
        if (networkVirtualApplianceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkVirtualAppliances'.",
                                id)));
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
        this.delete(resourceGroupName, networkVirtualApplianceName, siteName, context);
    }

    private VirtualApplianceSitesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualApplianceSiteImpl define(String name) {
        return new VirtualApplianceSiteImpl(name, this.manager());
    }
}
