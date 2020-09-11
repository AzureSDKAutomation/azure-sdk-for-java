/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.CassandraDataCentersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing CassandraDataCenters.
 */
public interface CassandraDataCenters extends SupportsCreating<DataCenterGetResults.DefinitionStages.Blank>, HasInner<CassandraDataCentersInner> {
    /**
     * Get properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataCenterGetResults> getAsync(String resourceGroupName, String clusterName, String dataCenterName);

    /**
     * Delete a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String clusterName, String dataCenterName);

}
