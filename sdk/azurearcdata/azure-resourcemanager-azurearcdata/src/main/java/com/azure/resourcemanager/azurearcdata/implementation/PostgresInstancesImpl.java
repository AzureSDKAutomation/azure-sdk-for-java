// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurearcdata.fluent.PostgresInstancesClient;
import com.azure.resourcemanager.azurearcdata.fluent.models.PostgresInstanceInner;
import com.azure.resourcemanager.azurearcdata.models.PostgresInstance;
import com.azure.resourcemanager.azurearcdata.models.PostgresInstances;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PostgresInstancesImpl implements PostgresInstances {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PostgresInstancesImpl.class);

    private final PostgresInstancesClient innerClient;

    private final com.azure.resourcemanager.azurearcdata.AzureArcDataManager serviceManager;

    public PostgresInstancesImpl(
        PostgresInstancesClient innerClient,
        com.azure.resourcemanager.azurearcdata.AzureArcDataManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PostgresInstance> list() {
        PagedIterable<PostgresInstanceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PostgresInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<PostgresInstance> list(Context context) {
        PagedIterable<PostgresInstanceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new PostgresInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<PostgresInstance> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PostgresInstanceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PostgresInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<PostgresInstance> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PostgresInstanceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new PostgresInstanceImpl(inner1, this.manager()));
    }

    public PostgresInstance getByResourceGroup(String resourceGroupName, String postgresInstanceName) {
        PostgresInstanceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, postgresInstanceName);
        if (inner != null) {
            return new PostgresInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PostgresInstance> getByResourceGroupWithResponse(
        String resourceGroupName, String postgresInstanceName, Context context) {
        Response<PostgresInstanceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, postgresInstanceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PostgresInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String postgresInstanceName) {
        this.serviceClient().delete(resourceGroupName, postgresInstanceName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String postgresInstanceName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, postgresInstanceName, context);
    }

    public PostgresInstance getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String postgresInstanceName = Utils.getValueFromIdByName(id, "postgresInstances");
        if (postgresInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'postgresInstances'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, postgresInstanceName, Context.NONE).getValue();
    }

    public Response<PostgresInstance> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String postgresInstanceName = Utils.getValueFromIdByName(id, "postgresInstances");
        if (postgresInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'postgresInstances'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, postgresInstanceName, context);
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
        String postgresInstanceName = Utils.getValueFromIdByName(id, "postgresInstances");
        if (postgresInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'postgresInstances'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, postgresInstanceName, Context.NONE).getValue();
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
        String postgresInstanceName = Utils.getValueFromIdByName(id, "postgresInstances");
        if (postgresInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'postgresInstances'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, postgresInstanceName, context);
    }

    private PostgresInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurearcdata.AzureArcDataManager manager() {
        return this.serviceManager;
    }

    public PostgresInstanceImpl define(String name) {
        return new PostgresInstanceImpl(name, this.manager());
    }
}
