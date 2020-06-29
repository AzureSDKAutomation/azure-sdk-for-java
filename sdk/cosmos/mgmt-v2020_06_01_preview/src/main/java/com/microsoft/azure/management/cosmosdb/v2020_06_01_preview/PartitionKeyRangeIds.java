/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import rx.Observable;

/**
 * Type representing PartitionKeyRangeIds.
 */
public interface PartitionKeyRangeIds {
    /**
     * Retrieves the metrics determined by the given filter for the given partition key range id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param partitionKeyRangeId Partition Key Range Id for which to get data.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PartitionMetric> listMetricsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String partitionKeyRangeId, String filter);

}
