// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.RestorePointsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.RestorePointInner;
import com.azure.resourcemanager.sql.generated.models.CreateDatabaseRestorePointDefinition;
import com.azure.resourcemanager.sql.generated.models.RestorePoint;
import com.azure.resourcemanager.sql.generated.models.RestorePoints;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RestorePointsImpl implements RestorePoints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorePointsImpl.class);

    private final RestorePointsClient innerClient;

    private final SqlManager serviceManager;

    public RestorePointsImpl(RestorePointsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RestorePoint> listByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        PagedIterable<RestorePointInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName);
        return inner.mapPage(inner1 -> new RestorePointImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorePoint> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        PagedIterable<RestorePointInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName, context);
        return inner.mapPage(inner1 -> new RestorePointImpl(inner1, this.manager()));
    }

    public RestorePoint create(
        String resourceGroupName,
        String serverName,
        String databaseName,
        CreateDatabaseRestorePointDefinition parameters) {
        RestorePointInner inner = this.serviceClient().create(resourceGroupName, serverName, databaseName, parameters);
        if (inner != null) {
            return new RestorePointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public RestorePoint create(
        String resourceGroupName,
        String serverName,
        String databaseName,
        CreateDatabaseRestorePointDefinition parameters,
        Context context) {
        RestorePointInner inner =
            this.serviceClient().create(resourceGroupName, serverName, databaseName, parameters, context);
        if (inner != null) {
            return new RestorePointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public RestorePoint get(String resourceGroupName, String serverName, String databaseName, String restorePointName) {
        RestorePointInner inner =
            this.serviceClient().get(resourceGroupName, serverName, databaseName, restorePointName);
        if (inner != null) {
            return new RestorePointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RestorePoint> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, String restorePointName, Context context) {
        Response<RestorePointInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serverName, databaseName, restorePointName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RestorePointImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serverName, String databaseName, String restorePointName) {
        this.serviceClient().delete(resourceGroupName, serverName, databaseName, restorePointName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serverName, String databaseName, String restorePointName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, serverName, databaseName, restorePointName, context);
    }

    private RestorePointsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
