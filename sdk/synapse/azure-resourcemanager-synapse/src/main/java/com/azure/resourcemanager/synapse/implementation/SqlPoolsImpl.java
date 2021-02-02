// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.SqlPoolsClient;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolInner;
import com.azure.resourcemanager.synapse.models.ResourceMoveDefinition;
import com.azure.resourcemanager.synapse.models.SqlPool;
import com.azure.resourcemanager.synapse.models.SqlPools;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SqlPoolsImpl implements SqlPools {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolsImpl.class);

    private final SqlPoolsClient innerClient;

    private final SynapseManager serviceManager;

    public SqlPoolsImpl(SqlPoolsClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SqlPool get(String resourceGroupName, String workspaceName, String sqlPoolName) {
        SqlPoolInner inner = this.serviceClient().get(resourceGroupName, workspaceName, sqlPoolName);
        if (inner != null) {
            return new SqlPoolImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SqlPool> getWithResponse(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        Response<SqlPoolInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, sqlPoolName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SqlPoolImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Object delete(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return this.serviceClient().delete(resourceGroupName, workspaceName, sqlPoolName);
    }

    public Object delete(String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        return this.serviceClient().delete(resourceGroupName, workspaceName, sqlPoolName, context);
    }

    public PagedIterable<SqlPool> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<SqlPoolInner> inner = this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return inner.mapPage(inner1 -> new SqlPoolImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlPool> listByWorkspace(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<SqlPoolInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return inner.mapPage(inner1 -> new SqlPoolImpl(inner1, this.manager()));
    }

    public Object pause(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return this.serviceClient().pause(resourceGroupName, workspaceName, sqlPoolName);
    }

    public Object pause(String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        return this.serviceClient().pause(resourceGroupName, workspaceName, sqlPoolName, context);
    }

    public Object resume(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return this.serviceClient().resume(resourceGroupName, workspaceName, sqlPoolName);
    }

    public Object resume(String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        return this.serviceClient().resume(resourceGroupName, workspaceName, sqlPoolName, context);
    }

    public void rename(
        String resourceGroupName, String workspaceName, String sqlPoolName, ResourceMoveDefinition parameters) {
        this.serviceClient().rename(resourceGroupName, workspaceName, sqlPoolName, parameters);
    }

    public Response<Void> renameWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        ResourceMoveDefinition parameters,
        Context context) {
        return this
            .serviceClient()
            .renameWithResponse(resourceGroupName, workspaceName, sqlPoolName, parameters, context);
    }

    public SqlPool getById(String id) {
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
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, sqlPoolName, Context.NONE).getValue();
    }

    public Response<SqlPool> getByIdWithResponse(String id, Context context) {
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
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, sqlPoolName, context);
    }

    public Object deleteById(String id) {
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
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        return this.delete(resourceGroupName, workspaceName, sqlPoolName, Context.NONE);
    }

    public Object deleteByIdWithResponse(String id, Context context) {
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
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        return this.delete(resourceGroupName, workspaceName, sqlPoolName, context);
    }

    private SqlPoolsClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }

    public SqlPoolImpl define(String name) {
        return new SqlPoolImpl(name, this.manager());
    }
}
