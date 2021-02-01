// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
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
import com.azure.resourcemanager.sql.generated.fluent.DatabaseRecommendedActionsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.RecommendedActionAutoGeneratedInner;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DatabaseRecommendedActionsClient. */
public final class DatabaseRecommendedActionsClientImpl implements DatabaseRecommendedActionsClient {
    private final ClientLogger logger = new ClientLogger(DatabaseRecommendedActionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DatabaseRecommendedActionsService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseRecommendedActionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DatabaseRecommendedActionsClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    DatabaseRecommendedActionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientDatabaseRecommendedActions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientD")
    private interface DatabaseRecommendedActionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/advisors/{advisorName}/recommendedActions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<RecommendedActionAutoGeneratedInner>>> listByDatabaseAdvisor(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("advisorName") String advisorName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/advisors/{advisorName}/recommendedActions"
                + "/{recommendedActionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RecommendedActionAutoGeneratedInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("advisorName") String advisorName,
            @PathParam("recommendedActionName") String recommendedActionName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/advisors/{advisorName}/recommendedActions"
                + "/{recommendedActionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RecommendedActionAutoGeneratedInner>> update(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("advisorName") String advisorName,
            @PathParam("recommendedActionName") String recommendedActionName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") RecommendedActionAutoGeneratedInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Database Recommended Actions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<RecommendedActionAutoGeneratedInner>>> listByDatabaseAdvisorWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, String advisorName) {
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByDatabaseAdvisor(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            advisorName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Database Recommended Actions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<RecommendedActionAutoGeneratedInner>>> listByDatabaseAdvisorWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, String advisorName, Context context) {
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByDatabaseAdvisor(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                advisorName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Database Recommended Actions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<RecommendedActionAutoGeneratedInner>> listByDatabaseAdvisorAsync(
        String resourceGroupName, String serverName, String databaseName, String advisorName) {
        return listByDatabaseAdvisorWithResponseAsync(resourceGroupName, serverName, databaseName, advisorName)
            .flatMap(
                (Response<List<RecommendedActionAutoGeneratedInner>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Database Recommended Actions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<RecommendedActionAutoGeneratedInner> listByDatabaseAdvisor(
        String resourceGroupName, String serverName, String databaseName, String advisorName) {
        return listByDatabaseAdvisorAsync(resourceGroupName, serverName, databaseName, advisorName).block();
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Database Recommended Actions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<RecommendedActionAutoGeneratedInner>> listByDatabaseAdvisorWithResponse(
        String resourceGroupName, String serverName, String databaseName, String advisorName, Context context) {
        return listByDatabaseAdvisorWithResponseAsync(resourceGroupName, serverName, databaseName, advisorName, context)
            .block();
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database recommended action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RecommendedActionAutoGeneratedInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName) {
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (recommendedActionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
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
                            advisorName,
                            recommendedActionName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database recommended action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RecommendedActionAutoGeneratedInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (recommendedActionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                advisorName,
                recommendedActionName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database recommended action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<RecommendedActionAutoGeneratedInner> getAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName)
            .flatMap(
                (Response<RecommendedActionAutoGeneratedInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database recommended action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RecommendedActionAutoGeneratedInner get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName) {
        return getAsync(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName).block();
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database recommended action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RecommendedActionAutoGeneratedInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        Context context) {
        return getWithResponseAsync(
                resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, context)
            .block();
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param parameters The requested recommended action resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Recommended Action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RecommendedActionAutoGeneratedInner>> updateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        RecommendedActionAutoGeneratedInner parameters) {
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (recommendedActionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            advisorName,
                            recommendedActionName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param parameters The requested recommended action resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Recommended Action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RecommendedActionAutoGeneratedInner>> updateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        RecommendedActionAutoGeneratedInner parameters,
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (recommendedActionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                advisorName,
                recommendedActionName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                parameters,
                accept,
                context);
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param parameters The requested recommended action resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Recommended Action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<RecommendedActionAutoGeneratedInner> updateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        RecommendedActionAutoGeneratedInner parameters) {
        return updateWithResponseAsync(
                resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, parameters)
            .flatMap(
                (Response<RecommendedActionAutoGeneratedInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param parameters The requested recommended action resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Recommended Action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RecommendedActionAutoGeneratedInner update(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        RecommendedActionAutoGeneratedInner parameters) {
        return updateAsync(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, parameters)
            .block();
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param parameters The requested recommended action resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Recommended Action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RecommendedActionAutoGeneratedInner> updateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        RecommendedActionAutoGeneratedInner parameters,
        Context context) {
        return updateWithResponseAsync(
                resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, parameters, context)
            .block();
    }
}
