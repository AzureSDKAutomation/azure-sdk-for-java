// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ElasticPoolsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ElasticPoolInner;
import com.azure.resourcemanager.sql.generated.models.ElasticPool;
import com.azure.resourcemanager.sql.generated.models.ElasticPools;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ElasticPoolsImpl implements ElasticPools {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ElasticPoolsImpl.class);

    private final ElasticPoolsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ElasticPoolsImpl(
        ElasticPoolsClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ElasticPool> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ElasticPoolInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ElasticPoolImpl(inner1, this.manager()));
    }

    public PagedIterable<ElasticPool> listByServer(
        String resourceGroupName, String serverName, Long skip, Context context) {
        PagedIterable<ElasticPoolInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, skip, context);
        return Utils.mapPage(inner, inner1 -> new ElasticPoolImpl(inner1, this.manager()));
    }

    public ElasticPool get(String resourceGroupName, String serverName, String elasticPoolName) {
        ElasticPoolInner inner = this.serviceClient().get(resourceGroupName, serverName, elasticPoolName);
        if (inner != null) {
            return new ElasticPoolImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ElasticPool> getWithResponse(
        String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        Response<ElasticPoolInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, elasticPoolName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ElasticPoolImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serverName, String elasticPoolName) {
        this.serviceClient().delete(resourceGroupName, serverName, elasticPoolName);
    }

    public void delete(String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, elasticPoolName, context);
    }

    public void failover(String resourceGroupName, String serverName, String elasticPoolName) {
        this.serviceClient().failover(resourceGroupName, serverName, elasticPoolName);
    }

    public void failover(String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        this.serviceClient().failover(resourceGroupName, serverName, elasticPoolName, context);
    }

    public ElasticPool getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String elasticPoolName = Utils.getValueFromIdByName(id, "elasticPools");
        if (elasticPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'elasticPools'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, elasticPoolName, Context.NONE).getValue();
    }

    public Response<ElasticPool> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String elasticPoolName = Utils.getValueFromIdByName(id, "elasticPools");
        if (elasticPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'elasticPools'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, elasticPoolName, context);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String elasticPoolName = Utils.getValueFromIdByName(id, "elasticPools");
        if (elasticPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'elasticPools'.", id)));
        }
        this.delete(resourceGroupName, serverName, elasticPoolName, Context.NONE);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String elasticPoolName = Utils.getValueFromIdByName(id, "elasticPools");
        if (elasticPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'elasticPools'.", id)));
        }
        this.delete(resourceGroupName, serverName, elasticPoolName, context);
    }

    private ElasticPoolsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public ElasticPoolImpl define(String name) {
        return new ElasticPoolImpl(name, this.manager());
    }
}
