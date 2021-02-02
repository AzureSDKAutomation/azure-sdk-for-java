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
import com.azure.resourcemanager.synapse.fluent.SqlPoolSensitivityLabelsClient;
import com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.synapse.models.SensitivityLabel;
import com.azure.resourcemanager.synapse.models.SensitivityLabelSource;
import com.azure.resourcemanager.synapse.models.SensitivityLabelUpdateList;
import com.azure.resourcemanager.synapse.models.SqlPoolSensitivityLabels;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SqlPoolSensitivityLabelsImpl implements SqlPoolSensitivityLabels {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolSensitivityLabelsImpl.class);

    private final SqlPoolSensitivityLabelsClient innerClient;

    private final SynapseManager serviceManager;

    public SqlPoolSensitivityLabelsImpl(SqlPoolSensitivityLabelsClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SensitivityLabel> listCurrent(
        String resourceGroupName, String workspaceName, String sqlPoolName) {
        PagedIterable<SensitivityLabelInner> inner =
            this.serviceClient().listCurrent(resourceGroupName, workspaceName, sqlPoolName);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    public PagedIterable<SensitivityLabel> listCurrent(
        String resourceGroupName, String workspaceName, String sqlPoolName, String filter, Context context) {
        PagedIterable<SensitivityLabelInner> inner =
            this.serviceClient().listCurrent(resourceGroupName, workspaceName, sqlPoolName, filter, context);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    public void update(
        String resourceGroupName, String workspaceName, String sqlPoolName, SensitivityLabelUpdateList parameters) {
        this.serviceClient().update(resourceGroupName, workspaceName, sqlPoolName, parameters);
    }

    public Response<Void> updateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        SensitivityLabelUpdateList parameters,
        Context context) {
        return this
            .serviceClient()
            .updateWithResponse(resourceGroupName, workspaceName, sqlPoolName, parameters, context);
    }

    public PagedIterable<SensitivityLabel> listRecommended(
        String resourceGroupName, String workspaceName, String sqlPoolName) {
        PagedIterable<SensitivityLabelInner> inner =
            this.serviceClient().listRecommended(resourceGroupName, workspaceName, sqlPoolName);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    public PagedIterable<SensitivityLabel> listRecommended(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        Boolean includeDisabledRecommendations,
        String skipToken,
        String filter,
        Context context) {
        PagedIterable<SensitivityLabelInner> inner =
            this
                .serviceClient()
                .listRecommended(
                    resourceGroupName,
                    workspaceName,
                    sqlPoolName,
                    includeDisabledRecommendations,
                    skipToken,
                    filter,
                    context);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    public void delete(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(
                resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName, context);
    }

    public SensitivityLabel get(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelSource sensitivityLabelSource) {
        SensitivityLabelInner inner =
            this
                .serviceClient()
                .get(
                    resourceGroupName,
                    workspaceName,
                    sqlPoolName,
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
        String workspaceName,
        String sqlPoolName,
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
                    workspaceName,
                    sqlPoolName,
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

    public void enableRecommendation(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName) {
        this
            .serviceClient()
            .enableRecommendation(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName);
    }

    public Response<Void> enableRecommendationWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        return this
            .serviceClient()
            .enableRecommendationWithResponse(
                resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName, context);
    }

    public void disableRecommendation(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName) {
        this
            .serviceClient()
            .disableRecommendation(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName);
    }

    public Response<Void> disableRecommendationWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        return this
            .serviceClient()
            .disableRecommendationWithResponse(
                resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName, context);
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
                resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName, Context.NONE)
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
                resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName, context);
    }

    private SqlPoolSensitivityLabelsClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }

    public SensitivityLabelImpl define() {
        return new SensitivityLabelImpl(this.manager());
    }
}
