// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.fluent.models.DataSourceInner;

/** An instance of this class provides access to all the operations defined in DataSourcesClient. */
public interface DataSourcesClient {
    /**
     * Create or update a data source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceName The name of the datasource resource.
     * @param parameters Datasources under OMS Workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return datasources under OMS Workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataSourceInner createOrUpdate(
        String resourceGroupName, String workspaceName, String dataSourceName, DataSourceInner parameters);

    /**
     * Create or update a data source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceName The name of the datasource resource.
     * @param parameters Datasources under OMS Workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return datasources under OMS Workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataSourceInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String dataSourceName,
        DataSourceInner parameters,
        Context context);

    /**
     * Deletes a data source instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceName Name of the datasource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String dataSourceName);

    /**
     * Deletes a data source instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceName Name of the datasource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String dataSourceName, Context context);

    /**
     * Gets a datasource instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceName Name of the datasource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a datasource instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataSourceInner get(String resourceGroupName, String workspaceName, String dataSourceName);

    /**
     * Gets a datasource instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceName Name of the datasource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a datasource instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataSourceInner> getWithResponse(
        String resourceGroupName, String workspaceName, String dataSourceName, Context context);

    /**
     * Gets the first page of data source instances in a workspace with the link to the next page.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of data source instances in a workspace with the link to the next page.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataSourceInner> listByWorkspace(String resourceGroupName, String workspaceName, String filter);

    /**
     * Gets the first page of data source instances in a workspace with the link to the next page.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param filter The filter to apply on the operation.
     * @param skiptoken Starting point of the collection of data source instances.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of data source instances in a workspace with the link to the next page.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataSourceInner> listByWorkspace(
        String resourceGroupName, String workspaceName, String filter, String skiptoken, Context context);
}
