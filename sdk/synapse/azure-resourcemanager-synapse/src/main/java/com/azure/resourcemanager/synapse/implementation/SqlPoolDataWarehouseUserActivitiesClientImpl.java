// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.SqlPoolDataWarehouseUserActivitiesClient;
import com.azure.resourcemanager.synapse.fluent.models.DataWarehouseUserActivitiesInner;
import com.azure.resourcemanager.synapse.models.DataWarehouseUserActivityName;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SqlPoolDataWarehouseUserActivitiesClient.
 */
public final class SqlPoolDataWarehouseUserActivitiesClientImpl implements SqlPoolDataWarehouseUserActivitiesClient {
    private final ClientLogger logger = new ClientLogger(SqlPoolDataWarehouseUserActivitiesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final SqlPoolDataWarehouseUserActivitiesService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolDataWarehouseUserActivitiesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SqlPoolDataWarehouseUserActivitiesClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    SqlPoolDataWarehouseUserActivitiesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientSqlPoolDataWarehouseUserActivities to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    private interface SqlPoolDataWarehouseUserActivitiesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/sqlPools/{sqlPoolName}/dataWarehouseUserActivities/{dataWarehouseUserActivityName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataWarehouseUserActivitiesInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName,
            @PathParam("dataWarehouseUserActivityName") DataWarehouseUserActivityName dataWarehouseUserActivityName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the user activities of a SQL pool which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataWarehouseUserActivityName The activity name of the Sql pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a SQL pool which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataWarehouseUserActivitiesInner>> getWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (dataWarehouseUserActivityName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter dataWarehouseUserActivityName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            sqlPoolName,
                            dataWarehouseUserActivityName,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the user activities of a SQL pool which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataWarehouseUserActivityName The activity name of the Sql pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a SQL pool which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataWarehouseUserActivitiesInner>> getWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName,
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (dataWarehouseUserActivityName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter dataWarehouseUserActivityName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                sqlPoolName,
                dataWarehouseUserActivityName,
                accept,
                context);
    }

    /**
     * Gets the user activities of a SQL pool which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataWarehouseUserActivityName The activity name of the Sql pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a SQL pool which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DataWarehouseUserActivitiesInner> getAsync(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName) {
        return getWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, dataWarehouseUserActivityName)
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
     * Gets the user activities of a SQL pool which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataWarehouseUserActivityName The activity name of the Sql pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a SQL pool which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataWarehouseUserActivitiesInner get(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName) {
        return getAsync(resourceGroupName, workspaceName, sqlPoolName, dataWarehouseUserActivityName).block();
    }

    /**
     * Gets the user activities of a SQL pool which includes running and suspended queries.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataWarehouseUserActivityName The activity name of the Sql pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user activities of a SQL pool which includes running and suspended queries.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DataWarehouseUserActivitiesInner> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        DataWarehouseUserActivityName dataWarehouseUserActivityName,
        Context context) {
        return getWithResponseAsync(
                resourceGroupName, workspaceName, sqlPoolName, dataWarehouseUserActivityName, context)
            .block();
    }
}
