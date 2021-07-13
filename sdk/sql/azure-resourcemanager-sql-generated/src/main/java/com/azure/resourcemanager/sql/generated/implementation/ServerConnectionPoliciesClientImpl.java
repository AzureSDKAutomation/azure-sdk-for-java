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
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.sql.generated.fluent.ServerConnectionPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerConnectionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.ConnectionPolicyName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ServerConnectionPoliciesClient. */
public final class ServerConnectionPoliciesClientImpl implements ServerConnectionPoliciesClient {
    private final ClientLogger logger = new ClientLogger(ServerConnectionPoliciesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ServerConnectionPoliciesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of ServerConnectionPoliciesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServerConnectionPoliciesClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(ServerConnectionPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientServerConnectionPolicies to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientS")
    private interface ServerConnectionPoliciesService {
        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/connectionPolicies/{connectionPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServerConnectionPolicyInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("connectionPolicyName") ConnectionPolicyName connectionPolicyName,
            @BodyParam("application/json") ServerConnectionPolicyInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/connectionPolicies/{connectionPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServerConnectionPolicyInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("connectionPolicyName") ConnectionPolicyName connectionPolicyName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Creates or updates the server's connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param parameters The required parameters for updating a secure connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerConnectionPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        ConnectionPolicyName connectionPolicyName,
        ServerConnectionPolicyInner parameters) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (connectionPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter connectionPolicyName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2014-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            connectionPolicyName,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates or updates the server's connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param parameters The required parameters for updating a secure connection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerConnectionPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        ConnectionPolicyName connectionPolicyName,
        ServerConnectionPolicyInner parameters,
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (connectionPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter connectionPolicyName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2014-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                connectionPolicyName,
                parameters,
                accept,
                context);
    }

    /**
     * Creates or updates the server's connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param parameters The required parameters for updating a secure connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServerConnectionPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        ConnectionPolicyName connectionPolicyName,
        ServerConnectionPolicyInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, connectionPolicyName, parameters)
            .flatMap(
                (Response<ServerConnectionPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates the server's connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param parameters The required parameters for updating a secure connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerConnectionPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        ConnectionPolicyName connectionPolicyName,
        ServerConnectionPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, connectionPolicyName, parameters).block();
    }

    /**
     * Creates or updates the server's connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param parameters The required parameters for updating a secure connection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ServerConnectionPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        ConnectionPolicyName connectionPolicyName,
        ServerConnectionPolicyInner parameters,
        Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, connectionPolicyName, parameters, context)
            .block();
    }

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerConnectionPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (connectionPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter connectionPolicyName is required and cannot be null."));
        }
        final String apiVersion = "2014-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            connectionPolicyName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServerConnectionPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName, Context context) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (connectionPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter connectionPolicyName is required and cannot be null."));
        }
        final String apiVersion = "2014-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                connectionPolicyName,
                accept,
                context);
    }

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServerConnectionPolicyInner> getAsync(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName) {
        return getWithResponseAsync(resourceGroupName, serverName, connectionPolicyName)
            .flatMap(
                (Response<ServerConnectionPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerConnectionPolicyInner get(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName) {
        return getAsync(resourceGroupName, serverName, connectionPolicyName).block();
    }

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ServerConnectionPolicyInner> getWithResponse(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName, Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, connectionPolicyName, context).block();
    }
}
