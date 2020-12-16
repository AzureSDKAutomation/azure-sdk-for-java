// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager;
import com.azure.resourcemanager.digitaltwins.fluent.DigitalTwinsEndpointsClient;
import com.azure.resourcemanager.digitaltwins.fluent.models.DigitalTwinsEndpointResourceInner;
import com.azure.resourcemanager.digitaltwins.models.DigitalTwinsEndpointResource;
import com.azure.resourcemanager.digitaltwins.models.DigitalTwinsEndpoints;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DigitalTwinsEndpointsImpl implements DigitalTwinsEndpoints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DigitalTwinsEndpointsImpl.class);

    private final DigitalTwinsEndpointsClient innerClient;

    private final AzureDigitalTwinsManager serviceManager;

    public DigitalTwinsEndpointsImpl(DigitalTwinsEndpointsClient innerClient, AzureDigitalTwinsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DigitalTwinsEndpointResource> list(String resourceGroupName, String resourceName) {
        PagedIterable<DigitalTwinsEndpointResourceInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName);
        return inner.mapPage(inner1 -> new DigitalTwinsEndpointResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DigitalTwinsEndpointResource> list(
        String resourceGroupName, String resourceName, Context context) {
        PagedIterable<DigitalTwinsEndpointResourceInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName, context);
        return inner.mapPage(inner1 -> new DigitalTwinsEndpointResourceImpl(inner1, this.manager()));
    }

    public DigitalTwinsEndpointResource get(String resourceGroupName, String resourceName, String endpointName) {
        DigitalTwinsEndpointResourceInner inner =
            this.serviceClient().get(resourceGroupName, resourceName, endpointName);
        if (inner != null) {
            return new DigitalTwinsEndpointResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DigitalTwinsEndpointResource> getWithResponse(
        String resourceGroupName, String resourceName, String endpointName, Context context) {
        Response<DigitalTwinsEndpointResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, endpointName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DigitalTwinsEndpointResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DigitalTwinsEndpointResource delete(String resourceGroupName, String resourceName, String endpointName) {
        DigitalTwinsEndpointResourceInner inner =
            this.serviceClient().delete(resourceGroupName, resourceName, endpointName);
        if (inner != null) {
            return new DigitalTwinsEndpointResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DigitalTwinsEndpointResource delete(
        String resourceGroupName, String resourceName, String endpointName, Context context) {
        DigitalTwinsEndpointResourceInner inner =
            this.serviceClient().delete(resourceGroupName, resourceName, endpointName, context);
        if (inner != null) {
            return new DigitalTwinsEndpointResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DigitalTwinsEndpointResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "digitalTwinsInstances");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'digitalTwinsInstances'.",
                                id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "endpoints");
        if (endpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'endpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, endpointName, Context.NONE).getValue();
    }

    public Response<DigitalTwinsEndpointResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "digitalTwinsInstances");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'digitalTwinsInstances'.",
                                id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "endpoints");
        if (endpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'endpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, endpointName, context);
    }

    private DigitalTwinsEndpointsClient serviceClient() {
        return this.innerClient;
    }

    private AzureDigitalTwinsManager manager() {
        return this.serviceManager;
    }

    public DigitalTwinsEndpointResourceImpl define(String name) {
        return new DigitalTwinsEndpointResourceImpl(name, this.manager());
    }
}
