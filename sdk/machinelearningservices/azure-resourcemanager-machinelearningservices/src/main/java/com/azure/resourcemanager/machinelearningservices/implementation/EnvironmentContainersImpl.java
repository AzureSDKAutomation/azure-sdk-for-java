// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.MachinelearningservicesManager;
import com.azure.resourcemanager.machinelearningservices.fluent.EnvironmentContainersClient;
import com.azure.resourcemanager.machinelearningservices.fluent.models.EnvironmentContainerResourceInner;
import com.azure.resourcemanager.machinelearningservices.models.EnvironmentContainerResource;
import com.azure.resourcemanager.machinelearningservices.models.EnvironmentContainers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EnvironmentContainersImpl implements EnvironmentContainers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnvironmentContainersImpl.class);

    private final EnvironmentContainersClient innerClient;

    private final MachinelearningservicesManager serviceManager;

    public EnvironmentContainersImpl(
        EnvironmentContainersClient innerClient, MachinelearningservicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public EnvironmentContainerResource get(String name, String resourceGroupName, String workspaceName) {
        EnvironmentContainerResourceInner inner = this.serviceClient().get(name, resourceGroupName, workspaceName);
        if (inner != null) {
            return new EnvironmentContainerResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EnvironmentContainerResource> getWithResponse(
        String name, String resourceGroupName, String workspaceName, Context context) {
        Response<EnvironmentContainerResourceInner> inner =
            this.serviceClient().getWithResponse(name, resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EnvironmentContainerResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String name, String resourceGroupName, String workspaceName) {
        this.serviceClient().delete(name, resourceGroupName, workspaceName);
    }

    public Response<Void> deleteWithResponse(
        String name, String resourceGroupName, String workspaceName, Context context) {
        return this.serviceClient().deleteWithResponse(name, resourceGroupName, workspaceName, context);
    }

    public PagedIterable<EnvironmentContainerResource> list(String resourceGroupName, String workspaceName) {
        PagedIterable<EnvironmentContainerResourceInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName);
        return inner.mapPage(inner1 -> new EnvironmentContainerResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<EnvironmentContainerResource> list(
        String resourceGroupName, String workspaceName, String skiptoken, Context context) {
        PagedIterable<EnvironmentContainerResourceInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, skiptoken, context);
        return inner.mapPage(inner1 -> new EnvironmentContainerResourceImpl(inner1, this.manager()));
    }

    public EnvironmentContainerResource getById(String id) {
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        return this.getWithResponse(name, resourceGroupName, workspaceName, Context.NONE).getValue();
    }

    public Response<EnvironmentContainerResource> getByIdWithResponse(String id, Context context) {
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        return this.getWithResponse(name, resourceGroupName, workspaceName, context);
    }

    public void deleteById(String id) {
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        this.deleteWithResponse(name, resourceGroupName, workspaceName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        return this.deleteWithResponse(name, resourceGroupName, workspaceName, context);
    }

    private EnvironmentContainersClient serviceClient() {
        return this.innerClient;
    }

    private MachinelearningservicesManager manager() {
        return this.serviceManager;
    }

    public EnvironmentContainerResourceImpl define(String name) {
        return new EnvironmentContainerResourceImpl(name, this.manager());
    }
}
