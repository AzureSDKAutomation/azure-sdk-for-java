/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_09_01;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_09_01.CollectionDatabasisDatabaseAccountMetricDefinition;
import com.microsoft.azure.management.cosmosdb.v2020_09_01.CollectionDatabasisDatabaseAccountMetric;
import com.microsoft.azure.management.cosmosdb.v2020_09_01.CollectionDatabasisDatabaseAccountUsage;

/**
 * Type representing Collections.
 */
public interface Collections {
    /**
     * Retrieves metric definitions for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CollectionDatabasisDatabaseAccountMetricDefinition> listMetricDefinitionsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid);

    /**
     * Retrieves the metrics determined by the given filter for the given database account and collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CollectionDatabasisDatabaseAccountMetric> listMetricsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter);

    /**
     * Retrieves the usages (most recent storage data) for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CollectionDatabasisDatabaseAccountUsage> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid);

}
