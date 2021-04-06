// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

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
import com.azure.resourcemanager.sql.generated.fluent.DataWarehouseUserActivitiesOperationsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.DataWarehouseUserActivitiesInner;
import com.azure.resourcemanager.sql.generated.models.DataWarehouseUserActivitiesListResult;
import com.azure.resourcemanager.sql.generated.models.DataWarehouseUserActivityName;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * DataWarehouseUserActivitiesOperationsClient.
 */
public final class DataWarehouseUserActivitiesOperationsClientImpl
    implements DataWarehouseUserActivitiesOperationsClient {
    private final ClientLogger logger = new ClientLogger(DataWarehouseUserActivitiesOperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DataWarehouseUserActivitiesOperationsService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of DataWarehouseUserActivitiesOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DataWarehouseUserActivitiesOperationsClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    DataWarehouseUserActivitiesOperationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientDataWarehouseUserActivitiesOperations to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientD")
    private interface DataWarehouseUserActivitiesOperationsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/dataWarehouseUserActivities/{dataWarehouseUserActivityName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataWarehouseUserActivitiesInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("dataWarehouseUserActivityName") DataWarehouseUserActivityName dataWarehouseUserActivityName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/dataWarehouseUserActivities")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataWarehouseUserActivitiesListResult>> listByDatabase(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataWarehouseUserActivitiesListResult>> listByDatabaseNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param dataWarehouseUserActivityName The activity name of the data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a data warehouse which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataWarehouseUserActivitiesInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (dataWarehouseUserActivityName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter dataWarehouseUserActivityName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            dataWarehouseUserActivityName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a data warehouse which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataWarehouseUserActivitiesInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (dataWarehouseUserActivityName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter dataWarehouseUserActivityName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                dataWarehouseUserActivityName,
                this.client.getSubscriptionId(),
                apiVersion,
                accept,
                context);
    }

    /**
     * Gets the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param dataWarehouseUserActivityName The activity name of the data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a data warehouse which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DataWarehouseUserActivitiesInner> getAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, dataWarehouseUserActivityName)
            .flatMap(
                (Response<DataWarehouseUserActivitiesInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param dataWarehouseUserActivityName The activity name of the data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a data warehouse which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataWarehouseUserActivitiesInner get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName) {
        return getAsync(resourceGroupName, serverName, databaseName, dataWarehouseUserActivityName).block();
    }

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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a data warehouse which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DataWarehouseUserActivitiesInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName,
        Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, dataWarehouseUserActivityName, context)
            .block();
    }

    /**
     * List the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user activities of a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataWarehouseUserActivitiesInner>> listByDatabaseSinglePageAsync(
        String resourceGroupName, String serverName, String databaseName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByDatabase(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .<PagedResponse<DataWarehouseUserActivitiesInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user activities of a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataWarehouseUserActivitiesInner>> listByDatabaseSinglePageAsync(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByDatabase(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                this.client.getSubscriptionId(),
                apiVersion,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * List the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user activities of a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataWarehouseUserActivitiesInner> listByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName) {
        return new PagedFlux<>(
            () -> listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * List the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user activities of a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataWarehouseUserActivitiesInner> listByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        return new PagedFlux<>(
            () -> listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName, context),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink, context));
    }

    /**
     * List the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user activities of a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataWarehouseUserActivitiesInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        return new PagedIterable<>(listByDatabaseAsync(resourceGroupName, serverName, databaseName));
    }

    /**
     * List the user activities of a data warehouse which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user activities of a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataWarehouseUserActivitiesInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        return new PagedIterable<>(listByDatabaseAsync(resourceGroupName, serverName, databaseName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user activities of a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataWarehouseUserActivitiesInner>> listByDatabaseNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByDatabaseNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DataWarehouseUserActivitiesInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user activities of a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataWarehouseUserActivitiesInner>> listByDatabaseNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByDatabaseNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
