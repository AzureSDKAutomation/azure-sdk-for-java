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
import com.azure.resourcemanager.sql.generated.fluent.ManagedDatabaseSensitivityLabelsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseSensitivityLabels;
import com.azure.resourcemanager.sql.generated.models.SensitivityLabel;
import com.azure.resourcemanager.sql.generated.models.SensitivityLabelSource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagedDatabaseSensitivityLabelsImpl implements ManagedDatabaseSensitivityLabels {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedDatabaseSensitivityLabelsImpl.class);

    private final ManagedDatabaseSensitivityLabelsClient innerClient;

    private final SqlManager serviceManager;

    public ManagedDatabaseSensitivityLabelsImpl(
        ManagedDatabaseSensitivityLabelsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SensitivityLabel get(
        String resourceGroupName,
        String managedInstanceName,
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
                    managedInstanceName,
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
        String managedInstanceName,
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
                    managedInstanceName,
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

    public SensitivityLabel createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelInner parameters) {
        SensitivityLabelInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    managedInstanceName,
                    databaseName,
                    schemaName,
                    tableName,
                    columnName,
                    parameters);
        if (inner != null) {
            return new SensitivityLabelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SensitivityLabel> createOrUpdateWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelInner parameters,
        Context context) {
        Response<SensitivityLabelInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    managedInstanceName,
                    databaseName,
                    schemaName,
                    tableName,
                    columnName,
                    parameters,
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
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName) {
        this
            .serviceClient()
            .delete(resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(
                resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, context);
    }

    public void disableRecommendation(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName) {
        this
            .serviceClient()
            .disableRecommendation(
                resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName);
    }

    public Response<Void> disableRecommendationWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        return this
            .serviceClient()
            .disableRecommendationWithResponse(
                resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, context);
    }

    public void enableRecommendation(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName) {
        this
            .serviceClient()
            .enableRecommendation(
                resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName);
    }

    public Response<Void> enableRecommendationWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        return this
            .serviceClient()
            .enableRecommendationWithResponse(
                resourceGroupName, managedInstanceName, databaseName, schemaName, tableName, columnName, context);
    }

    public PagedIterable<SensitivityLabel> listCurrentByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName) {
        PagedIterable<SensitivityLabelInner> inner =
            this.serviceClient().listCurrentByDatabase(resourceGroupName, managedInstanceName, databaseName);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    public PagedIterable<SensitivityLabel> listCurrentByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName, String filter, Context context) {
        PagedIterable<SensitivityLabelInner> inner =
            this
                .serviceClient()
                .listCurrentByDatabase(resourceGroupName, managedInstanceName, databaseName, filter, context);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    public PagedIterable<SensitivityLabel> listRecommendedByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName) {
        PagedIterable<SensitivityLabelInner> inner =
            this.serviceClient().listRecommendedByDatabase(resourceGroupName, managedInstanceName, databaseName);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    public PagedIterable<SensitivityLabel> listRecommendedByDatabase(
        String resourceGroupName,
        String managedInstanceName,
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
                    managedInstanceName,
                    databaseName,
                    includeDisabledRecommendations,
                    skipToken,
                    filter,
                    context);
        return inner.mapPage(inner1 -> new SensitivityLabelImpl(inner1, this.manager()));
    }

    private ManagedDatabaseSensitivityLabelsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
