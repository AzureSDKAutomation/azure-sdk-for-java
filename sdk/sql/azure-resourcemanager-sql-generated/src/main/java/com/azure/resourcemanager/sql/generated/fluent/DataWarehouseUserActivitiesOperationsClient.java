// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.DataWarehouseUserActivitiesInner;
import com.azure.resourcemanager.sql.generated.models.DataWarehouseUserActivityName;

/**
 * An instance of this class provides access to all the operations defined in
 * DataWarehouseUserActivitiesOperationsClient.
 */
public interface DataWarehouseUserActivitiesOperationsClient {
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataWarehouseUserActivitiesInner get(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataWarehouseUserActivitiesInner> getWithResponse(
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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataWarehouseUserActivitiesInner> listByDatabase(
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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataWarehouseUserActivitiesInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);
}
