// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.CollectionPartitionsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PartitionMetricInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PartitionUsageInner;
import com.azure.resourcemanager.cosmos.generated.models.PartitionMetricListResult;
import com.azure.resourcemanager.cosmos.generated.models.PartitionUsagesResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CollectionPartitionsClient. */
public final class CollectionPartitionsClientImpl implements CollectionPartitionsClient {
    private final ClientLogger logger = new ClientLogger(CollectionPartitionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final CollectionPartitionsService service;

    /** The service client containing this operation class. */
    private final CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of CollectionPartitionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CollectionPartitionsClientImpl(CosmosDBManagementClientImpl client) {
        this.service =
            RestProxy
                .create(CollectionPartitionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CosmosDBManagementClientCollectionPartitions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CosmosDBManagementCl")
    private interface CollectionPartitionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB"
                + "/databaseAccounts/{accountName}/databases/{databaseRid}/collections/{collectionRid}/partitions"
                + "/metrics")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PartitionMetricListResult>> listMetrics(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("databaseRid") String databaseRid,
            @PathParam("collectionRid") String collectionRid,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB"
                + "/databaseAccounts/{accountName}/databases/{databaseRid}/collections/{collectionRid}/partitions"
                + "/usages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PartitionUsagesResult>> listUsages(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("databaseRid") String databaseRid,
            @PathParam("collectionRid") String collectionRid,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PartitionMetricInner>> listMetricsSinglePageAsync(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (databaseRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseRid is required and cannot be null."));
        }
        if (collectionRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter collectionRid is required and cannot be null."));
        }
        if (filter == null) {
            return Mono.error(new IllegalArgumentException("Parameter filter is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listMetrics(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            accountName,
                            databaseRid,
                            collectionRid,
                            this.client.getApiVersion(),
                            filter,
                            accept,
                            context))
            .<PagedResponse<PartitionMetricInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PartitionMetricInner>> listMetricsSinglePageAsync(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (databaseRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseRid is required and cannot be null."));
        }
        if (collectionRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter collectionRid is required and cannot be null."));
        }
        if (filter == null) {
            return Mono.error(new IllegalArgumentException("Parameter filter is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listMetrics(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                accountName,
                databaseRid,
                collectionRid,
                this.client.getApiVersion(),
                filter,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PartitionMetricInner> listMetricsAsync(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        return new PagedFlux<>(
            () -> listMetricsSinglePageAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PartitionMetricInner> listMetricsAsync(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        return new PagedFlux<>(
            () ->
                listMetricsSinglePageAsync(
                    resourceGroupName, accountName, databaseRid, collectionRid, filter, context));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PartitionMetricInner> listMetrics(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        return new PagedIterable<>(
            listMetricsAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PartitionMetricInner> listMetrics(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        return new PagedIterable<>(
            listMetricsAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter, context));
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is
     *     name.value (name of the metric, can have an or of multiple names).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition level usage request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PartitionUsageInner>> listUsagesSinglePageAsync(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (databaseRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseRid is required and cannot be null."));
        }
        if (collectionRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter collectionRid is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listUsages(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            accountName,
                            databaseRid,
                            collectionRid,
                            this.client.getApiVersion(),
                            filter,
                            accept,
                            context))
            .<PagedResponse<PartitionUsageInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is
     *     name.value (name of the metric, can have an or of multiple names).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition level usage request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PartitionUsageInner>> listUsagesSinglePageAsync(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (databaseRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseRid is required and cannot be null."));
        }
        if (collectionRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter collectionRid is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listUsages(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                accountName,
                databaseRid,
                collectionRid,
                this.client.getApiVersion(),
                filter,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is
     *     name.value (name of the metric, can have an or of multiple names).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition level usage request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PartitionUsageInner> listUsagesAsync(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        return new PagedFlux<>(
            () -> listUsagesSinglePageAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter));
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition level usage request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PartitionUsageInner> listUsagesAsync(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listUsagesSinglePageAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter));
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is
     *     name.value (name of the metric, can have an or of multiple names).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition level usage request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PartitionUsageInner> listUsagesAsync(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        return new PagedFlux<>(
            () ->
                listUsagesSinglePageAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter, context));
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition level usage request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PartitionUsageInner> listUsages(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        final String filter = null;
        return new PagedIterable<>(listUsagesAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter));
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is
     *     name.value (name of the metric, can have an or of multiple names).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition level usage request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PartitionUsageInner> listUsages(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        return new PagedIterable<>(
            listUsagesAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter, context));
    }
}
