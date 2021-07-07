// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ManagedDatabaseColumnsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseColumnInner;
import com.azure.resourcemanager.sql.generated.models.DatabaseColumn;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseColumns;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

public final class ManagedDatabaseColumnsImpl implements ManagedDatabaseColumns {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedDatabaseColumnsImpl.class);

    private final ManagedDatabaseColumnsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ManagedDatabaseColumnsImpl(
        ManagedDatabaseColumnsClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DatabaseColumn> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName) {
        PagedIterable<DatabaseColumnInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, managedInstanceName, databaseName);
        return Utils.mapPage(inner, inner1 -> new DatabaseColumnImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseColumn> listByDatabase(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        List<String> schema,
        List<String> table,
        List<String> column,
        List<String> orderBy,
        String skiptoken,
        Context context) {
        PagedIterable<DatabaseColumnInner> inner =
            this
                .serviceClient()
                .listByDatabase(
                    resourceGroupName,
                    managedInstanceName,
                    databaseName,
                    schema,
                    table,
                    column,
                    orderBy,
                    skiptoken,
                    context);
        return Utils.mapPage(inner, inner1 -> new DatabaseColumnImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseColumn> listByTable(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName) {
        PagedIterable<DatabaseColumnInner> inner =
            this
                .serviceClient()
                .listByTable(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName);
        return Utils.mapPage(inner, inner1 -> new DatabaseColumnImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseColumn> listByTable(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String filter,
        Context context) {
        PagedIterable<DatabaseColumnInner> inner =
            this
                .serviceClient()
                .listByTable(
                    resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, filter, context);
        return Utils.mapPage(inner, inner1 -> new DatabaseColumnImpl(inner1, this.manager()));
    }

    public DatabaseColumn get(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName) {
        DatabaseColumnInner inner =
            this
                .serviceClient()
                .get(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName);
        if (inner != null) {
            return new DatabaseColumnImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DatabaseColumn> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        Response<DatabaseColumnInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabaseColumnImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ManagedDatabaseColumnsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
