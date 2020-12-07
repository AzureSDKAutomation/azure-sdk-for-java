// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.peering.PeeringManager;
import com.azure.resourcemanager.peering.fluent.RegisteredAsnsClient;
import com.azure.resourcemanager.peering.fluent.models.PeeringRegisteredAsnInner;
import com.azure.resourcemanager.peering.models.PeeringRegisteredAsn;
import com.azure.resourcemanager.peering.models.RegisteredAsns;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RegisteredAsnsImpl implements RegisteredAsns {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegisteredAsnsImpl.class);

    private final RegisteredAsnsClient innerClient;

    private final PeeringManager serviceManager;

    public RegisteredAsnsImpl(RegisteredAsnsClient innerClient, PeeringManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PeeringRegisteredAsn get(String resourceGroupName, String peeringName, String registeredAsnName) {
        PeeringRegisteredAsnInner inner = this.serviceClient().get(resourceGroupName, peeringName, registeredAsnName);
        if (inner != null) {
            return new PeeringRegisteredAsnImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PeeringRegisteredAsn> getWithResponse(
        String resourceGroupName, String peeringName, String registeredAsnName, Context context) {
        Response<PeeringRegisteredAsnInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, peeringName, registeredAsnName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PeeringRegisteredAsnImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String peeringName, String registeredAsnName) {
        this.serviceClient().delete(resourceGroupName, peeringName, registeredAsnName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String peeringName, String registeredAsnName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, peeringName, registeredAsnName, context);
    }

    public PagedIterable<PeeringRegisteredAsn> listByPeering(String resourceGroupName, String peeringName) {
        PagedIterable<PeeringRegisteredAsnInner> inner =
            this.serviceClient().listByPeering(resourceGroupName, peeringName);
        return inner.mapPage(inner1 -> new PeeringRegisteredAsnImpl(inner1, this.manager()));
    }

    public PagedIterable<PeeringRegisteredAsn> listByPeering(
        String resourceGroupName, String peeringName, Context context) {
        PagedIterable<PeeringRegisteredAsnInner> inner =
            this.serviceClient().listByPeering(resourceGroupName, peeringName, context);
        return inner.mapPage(inner1 -> new PeeringRegisteredAsnImpl(inner1, this.manager()));
    }

    public PeeringRegisteredAsn getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        String registeredAsnName = Utils.getValueFromIdByName(id, "registeredAsns");
        if (registeredAsnName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'registeredAsns'.", id)));
        }
        return this.getWithResponse(resourceGroupName, peeringName, registeredAsnName, Context.NONE).getValue();
    }

    public Response<PeeringRegisteredAsn> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        String registeredAsnName = Utils.getValueFromIdByName(id, "registeredAsns");
        if (registeredAsnName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'registeredAsns'.", id)));
        }
        return this.getWithResponse(resourceGroupName, peeringName, registeredAsnName, context);
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
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        String registeredAsnName = Utils.getValueFromIdByName(id, "registeredAsns");
        if (registeredAsnName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'registeredAsns'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, peeringName, registeredAsnName, Context.NONE).getValue();
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
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        String registeredAsnName = Utils.getValueFromIdByName(id, "registeredAsns");
        if (registeredAsnName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'registeredAsns'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, peeringName, registeredAsnName, context);
    }

    private RegisteredAsnsClient serviceClient() {
        return this.innerClient;
    }

    private PeeringManager manager() {
        return this.serviceManager;
    }

    public PeeringRegisteredAsnImpl define(String name) {
        return new PeeringRegisteredAsnImpl(name, this.manager());
    }
}
