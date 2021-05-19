// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

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
import com.azure.resourcemanager.desktopvirtualization.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.PrivateLinkResourceListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public final class PrivateLinkResourcesClientImpl implements PrivateLinkResourcesClient {
    private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PrivateLinkResourcesService service;

    /** The service client containing this operation class. */
    private final DesktopVirtualizationApiClientImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateLinkResourcesClientImpl(DesktopVirtualizationApiClientImpl client) {
        this.service =
            RestProxy
                .create(PrivateLinkResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DesktopVirtualizationApiClientPrivateLinkResources to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DesktopVirtualizatio")
    private interface PrivateLinkResourcesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.DesktopVirtualization/hostPools/{hostPoolName}/privateLinkResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceListResultInner>> listByHostPool(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("hostPoolName") String hostPoolName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.DesktopVirtualization/workspaces/{workspaceName}/privateLinkResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceListResultInner>> listByWorkspace(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List the private link resources available for this hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceListResultInner>> listByHostPoolWithResponseAsync(
        String resourceGroupName, String hostPoolName) {
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
        if (hostPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter hostPoolName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByHostPool(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            hostPoolName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List the private link resources available for this hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceListResultInner>> listByHostPoolWithResponseAsync(
        String resourceGroupName, String hostPoolName, Context context) {
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
        if (hostPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter hostPoolName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByHostPool(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                hostPoolName,
                accept,
                context);
    }

    /**
     * List the private link resources available for this hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateLinkResourceListResultInner> listByHostPoolAsync(
        String resourceGroupName, String hostPoolName) {
        return listByHostPoolWithResponseAsync(resourceGroupName, hostPoolName)
            .flatMap(
                (Response<PrivateLinkResourceListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * List the private link resources available for this hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkResourceListResultInner listByHostPool(String resourceGroupName, String hostPoolName) {
        return listByHostPoolAsync(resourceGroupName, hostPoolName).block();
    }

    /**
     * List the private link resources available for this hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateLinkResourceListResultInner> listByHostPoolWithResponse(
        String resourceGroupName, String hostPoolName, Context context) {
        return listByHostPoolWithResponseAsync(resourceGroupName, hostPoolName, context).block();
    }

    /**
     * List the private link resources available for this workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceListResultInner>> listByWorkspaceWithResponseAsync(
        String resourceGroupName, String workspaceName) {
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
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByWorkspace(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List the private link resources available for this workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceListResultInner>> listByWorkspaceWithResponseAsync(
        String resourceGroupName, String workspaceName, Context context) {
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
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByWorkspace(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                accept,
                context);
    }

    /**
     * List the private link resources available for this workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateLinkResourceListResultInner> listByWorkspaceAsync(
        String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithResponseAsync(resourceGroupName, workspaceName)
            .flatMap(
                (Response<PrivateLinkResourceListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * List the private link resources available for this workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkResourceListResultInner listByWorkspace(String resourceGroupName, String workspaceName) {
        return listByWorkspaceAsync(resourceGroupName, workspaceName).block();
    }

    /**
     * List the private link resources available for this workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateLinkResourceListResultInner> listByWorkspaceWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        return listByWorkspaceWithResponseAsync(resourceGroupName, workspaceName, context).block();
    }
}
