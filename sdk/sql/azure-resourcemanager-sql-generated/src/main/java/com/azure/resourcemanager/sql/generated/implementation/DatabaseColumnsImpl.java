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
import com.azure.resourcemanager.sql.generated.fluent.DatabaseColumnsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseColumnInner;
import com.azure.resourcemanager.sql.generated.models.DatabaseColumn;
import com.azure.resourcemanager.sql.generated.models.DatabaseColumns;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

public final class DatabaseColumnsImpl implements DatabaseColumns {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseColumnsImpl.class);

    private final DatabaseColumnsClient innerClient;

    private final SqlManager serviceManager;

    public DatabaseColumnsImpl(DatabaseColumnsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DatabaseColumn> listByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        PagedIterable<DatabaseColumnInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName);
        return inner.mapPage(inner1 -> new DatabaseColumnImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseColumn> listByDatabase(
        String resourceGroupName,
        String serverName,
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
                    resourceGroupName, serverName, databaseName, schema, table, column, orderBy, skiptoken, context);
        return inner.mapPage(inner1 -> new DatabaseColumnImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseColumn> listByTable(
        String resourceGroupName, String serverName, String databaseName, String schemaName, String tableName) {
        PagedIterable<DatabaseColumnInner> inner =
            this.serviceClient().listByTable(resourceGroupName, serverName, databaseName, schemaName, tableName);
        return inner.mapPage(inner1 -> new DatabaseColumnImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseColumn> listByTable(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String filter,
        Context context) {
        PagedIterable<DatabaseColumnInner> inner =
            this
                .serviceClient()
                .listByTable(resourceGroupName, serverName, databaseName, schemaName, tableName, filter, context);
        return inner.mapPage(inner1 -> new DatabaseColumnImpl(inner1, this.manager()));
    }

    public DatabaseColumn get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName) {
        DatabaseColumnInner inner =
            this.serviceClient().get(resourceGroupName, serverName, databaseName, schemaName, tableName, columnName);
        if (inner != null) {
            return new DatabaseColumnImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DatabaseColumn> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        Response<DatabaseColumnInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, serverName, databaseName, schemaName, tableName, columnName, context);
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

    private DatabaseColumnsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
