// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.ProximityPlacementGroupsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.ProximityPlacementGroupInner;
import com.azure.resourcemanager.compute.generated.models.ProximityPlacementGroup;
import com.azure.resourcemanager.compute.generated.models.ProximityPlacementGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProximityPlacementGroupsImpl implements ProximityPlacementGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProximityPlacementGroupsImpl.class);

    private final ProximityPlacementGroupsClient innerClient;

    private final ComputeManager serviceManager;

    public ProximityPlacementGroupsImpl(ProximityPlacementGroupsClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String proximityPlacementGroupName) {
        this.serviceClient().delete(resourceGroupName, proximityPlacementGroupName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String proximityPlacementGroupName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, proximityPlacementGroupName, context);
    }

    public ProximityPlacementGroup getByResourceGroup(String resourceGroupName, String proximityPlacementGroupName) {
        ProximityPlacementGroupInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, proximityPlacementGroupName);
        if (inner != null) {
            return new ProximityPlacementGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProximityPlacementGroup> getByResourceGroupWithResponse(
        String resourceGroupName, String proximityPlacementGroupName, String includeColocationStatus, Context context) {
        Response<ProximityPlacementGroupInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(
                    resourceGroupName, proximityPlacementGroupName, includeColocationStatus, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProximityPlacementGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ProximityPlacementGroup> list() {
        PagedIterable<ProximityPlacementGroupInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ProximityPlacementGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<ProximityPlacementGroup> list(Context context) {
        PagedIterable<ProximityPlacementGroupInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ProximityPlacementGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<ProximityPlacementGroup> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ProximityPlacementGroupInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ProximityPlacementGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<ProximityPlacementGroup> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ProximityPlacementGroupInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ProximityPlacementGroupImpl(inner1, this.manager()));
    }

    public ProximityPlacementGroup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String proximityPlacementGroupName = Utils.getValueFromIdByName(id, "proximityPlacementGroups");
        if (proximityPlacementGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'proximityPlacementGroups'.",
                                id)));
        }
        String localIncludeColocationStatus = null;
        return this
            .getByResourceGroupWithResponse(
                resourceGroupName, proximityPlacementGroupName, localIncludeColocationStatus, Context.NONE)
            .getValue();
    }

    public Response<ProximityPlacementGroup> getByIdWithResponse(
        String id, String includeColocationStatus, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String proximityPlacementGroupName = Utils.getValueFromIdByName(id, "proximityPlacementGroups");
        if (proximityPlacementGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'proximityPlacementGroups'.",
                                id)));
        }
        return this
            .getByResourceGroupWithResponse(
                resourceGroupName, proximityPlacementGroupName, includeColocationStatus, context);
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
        String proximityPlacementGroupName = Utils.getValueFromIdByName(id, "proximityPlacementGroups");
        if (proximityPlacementGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'proximityPlacementGroups'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, proximityPlacementGroupName, Context.NONE).getValue();
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
        String proximityPlacementGroupName = Utils.getValueFromIdByName(id, "proximityPlacementGroups");
        if (proximityPlacementGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'proximityPlacementGroups'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, proximityPlacementGroupName, context);
    }

    private ProximityPlacementGroupsClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    public ProximityPlacementGroupImpl define(String name) {
        return new ProximityPlacementGroupImpl(name, this.manager());
    }
}
