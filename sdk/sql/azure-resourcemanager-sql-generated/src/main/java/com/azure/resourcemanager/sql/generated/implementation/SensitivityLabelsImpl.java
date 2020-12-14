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
import com.azure.resourcemanager.sql.generated.fluent.SensitivityLabelsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.sql.generated.models.SensitivityLabel;
import com.azure.resourcemanager.sql.generated.models.SensitivityLabelSource;
import com.azure.resourcemanager.sql.generated.models.SensitivityLabels;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SensitivityLabelsImpl implements SensitivityLabels {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SensitivityLabelsImpl.class);

    private final SensitivityLabelsClient innerClient;

    private final SqlManager serviceManager;

    public SensitivityLabelsImpl(SensitivityLabelsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SensitivityLabel> listCurrentByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        PagedIterable<SensitivityLabelInner> inner =
            this.serviceClient().listCurrentByDatabase(resourceGroupName, serverName, databaseName);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    public PagedIterable<SensitivityLabel> listCurrentByDatabase(
        String resourceGroupName, String serverName, String databaseName, String filter, Context context) {
        PagedIterable<SensitivityLabelInner> inner =
            this.serviceClient().listCurrentByDatabase(resourceGroupName, serverName, databaseName, filter, context);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    public PagedIterable<SensitivityLabel> listRecommendedByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        PagedIterable<SensitivityLabelInner> inner =
            this.serviceClient().listRecommendedByDatabase(resourceGroupName, serverName, databaseName);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    public PagedIterable<SensitivityLabel> listRecommendedByDatabase(
        String resourceGroupName,
        String serverName,
        String databaseName,
        Boolean includeDisabledRecommendations,
        String skipToken,
        String filter,
        Context context) {
        PagedIterable<SensitivityLabelInner> inner =
            this
                .serviceClient()
                .listRecommendedByDatabase(
                    resourceGroupName,
                    serverName,
                    databaseName,
                    includeDisabledRecommendations,
                    skipToken,
                    filter,
                    context);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    public void enableRecommendation(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName) {
        this
            .serviceClient()
            .enableRecommendation(resourceGroupName, serverName, databaseName, schemaName, tableName, columnName);
    }

    public Response<Void> enableRecommendationWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        return this
            .serviceClient()
            .enableRecommendationWithResponse(
                resourceGroupName, serverName, databaseName, schemaName, tableName, columnName, context);
    }

    public void disableRecommendation(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName) {
        this
            .serviceClient()
            .disableRecommendation(resourceGroupName, serverName, databaseName, schemaName, tableName, columnName);
    }

    public Response<Void> disableRecommendationWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        return this
            .serviceClient()
            .disableRecommendationWithResponse(
                resourceGroupName, serverName, databaseName, schemaName, tableName, columnName, context);
    }

    public SensitivityLabel get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelSource sensitivityLabelSource) {
        SensitivityLabelInner inner =
            this
                .serviceClient()
                .get(
                    resourceGroupName,
                    serverName,
                    databaseName,
                    schemaName,
                    tableName,
                    columnName,
                    sensitivityLabelSource);
        if (inner != null) {
            return new SensitivityLabelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SensitivityLabel> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelSource sensitivityLabelSource,
        Context context) {
        Response<SensitivityLabelInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName,
                    serverName,
                    databaseName,
                    schemaName,
                    tableName,
                    columnName,
                    sensitivityLabelSource,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SensitivityLabelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName) {
        this.serviceClient().delete(resourceGroupName, serverName, databaseName, schemaName, tableName, columnName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(
                resourceGroupName, serverName, databaseName, schemaName, tableName, columnName, context);
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String schemaName = Utils.getValueFromIdByName(id, "schemas");
        if (schemaName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'schemas'.", id)));
        }
        String tableName = Utils.getValueFromIdByName(id, "tables");
        if (tableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tables'.", id)));
        }
        String columnName = Utils.getValueFromIdByName(id, "columns");
        if (columnName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'columns'.", id)));
        }
        this
            .deleteWithResponse(
                resourceGroupName, serverName, databaseName, schemaName, tableName, columnName, Context.NONE)
            .getValue();
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String schemaName = Utils.getValueFromIdByName(id, "schemas");
        if (schemaName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'schemas'.", id)));
        }
        String tableName = Utils.getValueFromIdByName(id, "tables");
        if (tableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tables'.", id)));
        }
        String columnName = Utils.getValueFromIdByName(id, "columns");
        if (columnName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'columns'.", id)));
        }
        return this
            .deleteWithResponse(
                resourceGroupName, serverName, databaseName, schemaName, tableName, columnName, context);
    }

    private SensitivityLabelsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    public SensitivityLabelImpl define(String name) {
        return new SensitivityLabelImpl(name, this.manager());
    }
}
