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
import com.azure.resourcemanager.network.generated.fluent.VirtualNetworksClient;
import com.azure.resourcemanager.network.generated.fluent.models.IpAddressAvailabilityResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkUsageInner;
import com.azure.resourcemanager.network.generated.models.IpAddressAvailabilityResult;
import com.azure.resourcemanager.network.generated.models.VirtualNetwork;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkUsage;
import com.azure.resourcemanager.network.generated.models.VirtualNetworks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualNetworksImpl implements VirtualNetworks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworksImpl.class);

    private final VirtualNetworksClient innerClient;

    private final NetworkManager serviceManager;

    public VirtualNetworksImpl(VirtualNetworksClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String virtualNetworkName) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkName);
    }

    public void delete(String resourceGroupName, String virtualNetworkName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkName, context);
    }

    public VirtualNetwork getByResourceGroup(String resourceGroupName, String virtualNetworkName) {
        VirtualNetworkInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, virtualNetworkName);
        if (inner != null) {
            return new VirtualNetworkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualNetwork> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualNetworkName, String expand, Context context) {
        Response<VirtualNetworkInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, virtualNetworkName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualNetworkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualNetwork> list() {
        PagedIterable<VirtualNetworkInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new VirtualNetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetwork> list(Context context) {
        PagedIterable<VirtualNetworkInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new VirtualNetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetwork> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualNetworkInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new VirtualNetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetwork> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualNetworkInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new VirtualNetworkImpl(inner1, this.manager()));
    }

    public IpAddressAvailabilityResult checkIpAddressAvailability(
        String resourceGroupName, String virtualNetworkName, String ipAddress) {
        IpAddressAvailabilityResultInner inner =
            this.serviceClient().checkIpAddressAvailability(resourceGroupName, virtualNetworkName, ipAddress);
        if (inner != null) {
            return new IpAddressAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IpAddressAvailabilityResult> checkIpAddressAvailabilityWithResponse(
        String resourceGroupName, String virtualNetworkName, String ipAddress, Context context) {
        Response<IpAddressAvailabilityResultInner> inner =
            this
                .serviceClient()
                .checkIpAddressAvailabilityWithResponse(resourceGroupName, virtualNetworkName, ipAddress, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IpAddressAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualNetworkUsage> listUsage(String resourceGroupName, String virtualNetworkName) {
        PagedIterable<VirtualNetworkUsageInner> inner =
            this.serviceClient().listUsage(resourceGroupName, virtualNetworkName);
        return inner.mapPage(inner1 -> new VirtualNetworkUsageImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkUsage> listUsage(
        String resourceGroupName, String virtualNetworkName, Context context) {
        PagedIterable<VirtualNetworkUsageInner> inner =
            this.serviceClient().listUsage(resourceGroupName, virtualNetworkName, context);
        return inner.mapPage(inner1 -> new VirtualNetworkUsageImpl(inner1, this.manager()));
    }

    public VirtualNetwork getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkName = Utils.getValueFromIdByName(id, "virtualNetworks");
        if (virtualNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworks'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<VirtualNetwork> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkName = Utils.getValueFromIdByName(id, "virtualNetworks");
        if (virtualNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworks'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualNetworkName, expand, context);
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
        String virtualNetworkName = Utils.getValueFromIdByName(id, "virtualNetworks");
        if (virtualNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworks'.", id)));
        }
        this.delete(resourceGroupName, virtualNetworkName, Context.NONE);
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
        String virtualNetworkName = Utils.getValueFromIdByName(id, "virtualNetworks");
        if (virtualNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworks'.", id)));
        }
        this.delete(resourceGroupName, virtualNetworkName, context);
    }

    private VirtualNetworksClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualNetworkImpl define(String name) {
        return new VirtualNetworkImpl(name, this.manager());
    }
}
