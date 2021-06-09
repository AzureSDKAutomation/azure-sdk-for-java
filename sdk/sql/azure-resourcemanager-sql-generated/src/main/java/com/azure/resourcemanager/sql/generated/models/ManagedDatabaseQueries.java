// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ManagedDatabaseQueries. */
public interface ManagedDatabaseQueries {
    /**
     * Get query by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query by query id.
     */
    ManagedInstanceQuery get(String resourceGroupName, String managedInstanceName, String databaseName, String queryId);

    /**
     * Get query by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query by query id.
     */
    Response<ManagedInstanceQuery> getWithResponse(
        String resourceGroupName, String managedInstanceName, String databaseName, String queryId, Context context);

    /**
     * Get query execution statistics by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query execution statistics by query id.
     */
    PagedIterable<QueryStatistics> listByQuery(
        String resourceGroupName, String managedInstanceName, String databaseName, String queryId);

    /**
     * Get query execution statistics by query id.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param queryId The queryId parameter.
     * @param startTime Start time for observed period.
     * @param endTime End time for observed period.
     * @param interval The time step to be used to summarize the metric values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query execution statistics by query id.
     */
    PagedIterable<QueryStatistics> listByQuery(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String queryId,
        String startTime,
        String endTime,
        QueryTimeGrainType interval,
        Context context);
}
