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
import com.azure.resourcemanager.network.generated.fluent.ExpressRoutePortsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortInner;
import com.azure.resourcemanager.network.generated.fluent.models.GenerateExpressRoutePortsLoaResultInner;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePort;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePorts;
import com.azure.resourcemanager.network.generated.models.GenerateExpressRoutePortsLoaRequest;
import com.azure.resourcemanager.network.generated.models.GenerateExpressRoutePortsLoaResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExpressRoutePortsImpl implements ExpressRoutePorts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRoutePortsImpl.class);

    private final ExpressRoutePortsClient innerClient;

    private final NetworkManager serviceManager;

    public ExpressRoutePortsImpl(ExpressRoutePortsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String expressRoutePortName) {
        this.serviceClient().delete(resourceGroupName, expressRoutePortName);
    }

    public void delete(String resourceGroupName, String expressRoutePortName, Context context) {
        this.serviceClient().delete(resourceGroupName, expressRoutePortName, context);
    }

    public ExpressRoutePort getByResourceGroup(String resourceGroupName, String expressRoutePortName) {
        ExpressRoutePortInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, expressRoutePortName);
        if (inner != null) {
            return new ExpressRoutePortImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRoutePort> getByResourceGroupWithResponse(
        String resourceGroupName, String expressRoutePortName, Context context) {
        Response<ExpressRoutePortInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, expressRoutePortName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExpressRoutePortImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ExpressRoutePort> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ExpressRoutePortInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new ExpressRoutePortImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRoutePort> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ExpressRoutePortInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new ExpressRoutePortImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRoutePort> list() {
        PagedIterable<ExpressRoutePortInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ExpressRoutePortImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRoutePort> list(Context context) {
        PagedIterable<ExpressRoutePortInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ExpressRoutePortImpl(inner1, this.manager()));
    }

    public GenerateExpressRoutePortsLoaResult generateLoa(
        String resourceGroupName, String expressRoutePortName, GenerateExpressRoutePortsLoaRequest request) {
        GenerateExpressRoutePortsLoaResultInner inner =
            this.serviceClient().generateLoa(resourceGroupName, expressRoutePortName, request);
        if (inner != null) {
            return new GenerateExpressRoutePortsLoaResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GenerateExpressRoutePortsLoaResult> generateLoaWithResponse(
        String resourceGroupName,
        String expressRoutePortName,
        GenerateExpressRoutePortsLoaRequest request,
        Context context) {
        Response<GenerateExpressRoutePortsLoaResultInner> inner =
            this.serviceClient().generateLoaWithResponse(resourceGroupName, expressRoutePortName, request, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GenerateExpressRoutePortsLoaResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRoutePort getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String expressRoutePortName = Utils.getValueFromIdByName(id, "ExpressRoutePorts");
        if (expressRoutePortName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ExpressRoutePorts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, expressRoutePortName, Context.NONE).getValue();
    }

    public Response<ExpressRoutePort> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String expressRoutePortName = Utils.getValueFromIdByName(id, "ExpressRoutePorts");
        if (expressRoutePortName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ExpressRoutePorts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, expressRoutePortName, context);
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
        String expressRoutePortName = Utils.getValueFromIdByName(id, "ExpressRoutePorts");
        if (expressRoutePortName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ExpressRoutePorts'.", id)));
        }
        this.delete(resourceGroupName, expressRoutePortName, Context.NONE);
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
        String expressRoutePortName = Utils.getValueFromIdByName(id, "ExpressRoutePorts");
        if (expressRoutePortName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'ExpressRoutePorts'.", id)));
        }
        this.delete(resourceGroupName, expressRoutePortName, context);
    }

    private ExpressRoutePortsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public ExpressRoutePortImpl define(String name) {
        return new ExpressRoutePortImpl(name, this.manager());
    }
}
