// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.ElasticPoolOperationsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ElasticPoolOperationInner;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolOperation;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolOperations;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.UUID;

public final class ElasticPoolOperationsImpl implements ElasticPoolOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ElasticPoolOperationsImpl.class);

    private final ElasticPoolOperationsClient innerClient;

    private final SqlManager serviceManager;

    public ElasticPoolOperationsImpl(ElasticPoolOperationsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void cancel(String resourceGroupName, String serverName, String elasticPoolName, UUID operationId) {
        this.serviceClient().cancel(resourceGroupName, serverName, elasticPoolName, operationId);
    }

    public Response<Void> cancelWithResponse(
        String resourceGroupName, String serverName, String elasticPoolName, UUID operationId, Context context) {
        return this
            .serviceClient()
            .cancelWithResponse(resourceGroupName, serverName, elasticPoolName, operationId, context);
    }

    public PagedIterable<ElasticPoolOperation> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName) {
        PagedIterable<ElasticPoolOperationInner> inner =
            this.serviceClient().listByElasticPool(resourceGroupName, serverName, elasticPoolName);
        return inner.mapPage(inner1 -> new ElasticPoolOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<ElasticPoolOperation> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        PagedIterable<ElasticPoolOperationInner> inner =
            this.serviceClient().listByElasticPool(resourceGroupName, serverName, elasticPoolName, context);
        return inner.mapPage(inner1 -> new ElasticPoolOperationImpl(inner1, this.manager()));
    }

    private ElasticPoolOperationsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
