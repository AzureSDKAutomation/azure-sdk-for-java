// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.connectedvmware.fluent.ResourcePoolsClient;
import com.azure.resourcemanager.connectedvmware.fluent.models.ResourcePoolInner;
import com.azure.resourcemanager.connectedvmware.models.ResourcePool;
import com.azure.resourcemanager.connectedvmware.models.ResourcePools;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourcePoolsImpl implements ResourcePools {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourcePoolsImpl.class);

    private final ResourcePoolsClient innerClient;

    private final com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager;

    public ResourcePoolsImpl(
        ResourcePoolsClient innerClient,
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ResourcePool getByResourceGroup(String resourceGroupName, String resourcePoolName) {
        ResourcePoolInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourcePoolName);
        if (inner != null) {
            return new ResourcePoolImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourcePool> getByResourceGroupWithResponse(
        String resourceGroupName, String resourcePoolName, Context context) {
        Response<ResourcePoolInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourcePoolName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResourcePoolImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String resourcePoolName, Boolean force) {
        this.serviceClient().delete(resourceGroupName, resourcePoolName, force);
    }

    public void delete(String resourceGroupName, String resourcePoolName) {
        this.serviceClient().delete(resourceGroupName, resourcePoolName);
    }

    public void delete(String resourceGroupName, String resourcePoolName, Boolean force, Context context) {
        this.serviceClient().delete(resourceGroupName, resourcePoolName, force, context);
    }

    public PagedIterable<ResourcePool> list() {
        PagedIterable<ResourcePoolInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ResourcePoolImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourcePool> list(Context context) {
        PagedIterable<ResourcePoolInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ResourcePoolImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourcePool> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ResourcePoolInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ResourcePoolImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourcePool> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ResourcePoolInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ResourcePoolImpl(inner1, this.manager()));
    }

    public ResourcePool getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourcePoolName = Utils.getValueFromIdByName(id, "resourcePools");
        if (resourcePoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourcePools'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourcePoolName, Context.NONE).getValue();
    }

    public Response<ResourcePool> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourcePoolName = Utils.getValueFromIdByName(id, "resourcePools");
        if (resourcePoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourcePools'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourcePoolName, context);
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
        String resourcePoolName = Utils.getValueFromIdByName(id, "resourcePools");
        if (resourcePoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourcePools'.", id)));
        }
        Boolean localForce = null;
        this.delete(resourceGroupName, resourcePoolName, localForce, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean force, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourcePoolName = Utils.getValueFromIdByName(id, "resourcePools");
        if (resourcePoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourcePools'.", id)));
        }
        this.delete(resourceGroupName, resourcePoolName, force, context);
    }

    private ResourcePoolsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager() {
        return this.serviceManager;
    }

    public ResourcePoolImpl define(String name) {
        return new ResourcePoolImpl(name, this.manager());
    }
}
