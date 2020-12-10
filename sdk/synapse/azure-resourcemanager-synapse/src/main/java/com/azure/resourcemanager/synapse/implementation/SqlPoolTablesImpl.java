// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Resource;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.SqlPoolTablesClient;
import com.azure.resourcemanager.synapse.models.SqlPoolTables;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SqlPoolTablesImpl implements SqlPoolTables {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolTablesImpl.class);

    private final SqlPoolTablesClient innerClient;

    private final SynapseManager serviceManager;

    public SqlPoolTablesImpl(SqlPoolTablesClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Resource> listBySchema(
        String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName) {
        return this.serviceClient().listBySchema(resourceGroupName, workspaceName, sqlPoolName, schemaName);
    }

    public PagedIterable<Resource> listBySchema(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String filter,
        Context context) {
        return this
            .serviceClient()
            .listBySchema(resourceGroupName, workspaceName, sqlPoolName, schemaName, filter, context);
    }

    public Resource get(
        String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName) {
        return this.serviceClient().get(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName);
    }

    public Response<Resource> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        Context context) {
        return this
            .serviceClient()
            .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, context);
    }

    private SqlPoolTablesClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
