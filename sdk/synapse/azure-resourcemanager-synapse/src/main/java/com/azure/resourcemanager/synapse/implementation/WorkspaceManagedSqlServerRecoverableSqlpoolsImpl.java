// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.WorkspaceManagedSqlServerRecoverableSqlpoolsClient;
import com.azure.resourcemanager.synapse.fluent.models.RecoverableSqlPoolInner;
import com.azure.resourcemanager.synapse.models.RecoverableSqlPool;
import com.azure.resourcemanager.synapse.models.WorkspaceManagedSqlServerRecoverableSqlpools;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WorkspaceManagedSqlServerRecoverableSqlpoolsImpl
    implements WorkspaceManagedSqlServerRecoverableSqlpools {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(WorkspaceManagedSqlServerRecoverableSqlpoolsImpl.class);

    private final WorkspaceManagedSqlServerRecoverableSqlpoolsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public WorkspaceManagedSqlServerRecoverableSqlpoolsImpl(
        WorkspaceManagedSqlServerRecoverableSqlpoolsClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RecoverableSqlPool> list(String resourceGroupName, String workspaceName) {
        PagedIterable<RecoverableSqlPoolInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new RecoverableSqlPoolImpl(inner1, this.manager()));
    }

    public PagedIterable<RecoverableSqlPool> list(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<RecoverableSqlPoolInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new RecoverableSqlPoolImpl(inner1, this.manager()));
    }

    public RecoverableSqlPool get(String resourceGroupName, String workspaceName, String sqlComputeName) {
        RecoverableSqlPoolInner inner = this.serviceClient().get(resourceGroupName, workspaceName, sqlComputeName);
        if (inner != null) {
            return new RecoverableSqlPoolImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecoverableSqlPool> getWithResponse(
        String resourceGroupName, String workspaceName, String sqlComputeName, Context context) {
        Response<RecoverableSqlPoolInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, sqlComputeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RecoverableSqlPoolImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private WorkspaceManagedSqlServerRecoverableSqlpoolsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
