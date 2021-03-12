// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of PercentileSourceTargets. */
public interface PercentileSourceTargets {
    /**
     * Retrieves the metrics determined by the given filter for the given account, source and target region. This url is
     * only for PBS and Replication Latency data.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param sourceRegion Source region from which data is written. Cosmos DB region, with spaces between words and
     *     each word capitalized.
     * @param targetRegion Target region to which data is written. Cosmos DB region, with spaces between words and each
     *     word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request.
     */
    PagedIterable<PercentileMetric> listMetrics(
        String resourceGroupName, String accountName, String sourceRegion, String targetRegion, String filter);

    /**
     * Retrieves the metrics determined by the given filter for the given account, source and target region. This url is
     * only for PBS and Replication Latency data.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param sourceRegion Source region from which data is written. Cosmos DB region, with spaces between words and
     *     each word capitalized.
     * @param targetRegion Target region to which data is written. Cosmos DB region, with spaces between words and each
     *     word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request.
     */
    PagedIterable<PercentileMetric> listMetrics(
        String resourceGroupName,
        String accountName,
        String sourceRegion,
        String targetRegion,
        String filter,
        Context context);

    /**
     * Retrieves the metrics determined by the given filter for the given account, source and target region. This url is
     * only for PBS and Replication Latency data.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param sourceRegion Source region from which data is written. Cosmos DB region, with spaces between words and
     *     each word capitalized.
     * @param targetRegion Target region to which data is written. Cosmos DB region, with spaces between words and each
     *     word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request.
     */
    PagedIterable<PercentileMetric> listMetrics(
        String resourceGroupName, String accountName, String sourceRegion, String targetRegion, String filter);

    /**
     * Retrieves the metrics determined by the given filter for the given account, source and target region. This url is
     * only for PBS and Replication Latency data.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param sourceRegion Source region from which data is written. Cosmos DB region, with spaces between words and
     *     each word capitalized.
     * @param targetRegion Target region to which data is written. Cosmos DB region, with spaces between words and each
     *     word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request.
     */
    PagedIterable<PercentileMetric> listMetrics(
        String resourceGroupName,
        String accountName,
        String sourceRegion,
        String targetRegion,
        String filter,
        Context context);
}
