// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DataWarehouseUserActivitiesOperations. */
public interface DataWarehouseUserActivitiesOperations {
    /**
     * Gets the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param dataWarehouseUserActivityName The activity name of the data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a data warehouse which includes running and suspended queries.
     */
    DataWarehouseUserActivities get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName);

    /**
     * Gets the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param dataWarehouseUserActivityName The activity name of the data warehouse.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a data warehouse which includes running and suspended queries.
     */
    Response<DataWarehouseUserActivities> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName,
        Context context);

    /**
     * List the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user activities of a data warehouse.
     */
    PagedIterable<DataWarehouseUserActivities> listByDatabase(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * List the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user activities of a data warehouse.
     */
    PagedIterable<DataWarehouseUserActivities> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);
}
