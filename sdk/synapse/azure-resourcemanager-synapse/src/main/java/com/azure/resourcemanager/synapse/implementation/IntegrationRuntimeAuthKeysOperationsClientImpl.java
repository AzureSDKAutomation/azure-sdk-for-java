// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.synapse.fluent.IntegrationRuntimeAuthKeysOperationsClient;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeAuthKeysInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeRegenerateKeyParameters;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * IntegrationRuntimeAuthKeysOperationsClient.
 */
public final class IntegrationRuntimeAuthKeysOperationsClientImpl
    implements IntegrationRuntimeAuthKeysOperationsClient {
    private final ClientLogger logger = new ClientLogger(IntegrationRuntimeAuthKeysOperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final IntegrationRuntimeAuthKeysOperationsService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationRuntimeAuthKeysOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IntegrationRuntimeAuthKeysOperationsClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    IntegrationRuntimeAuthKeysOperationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientIntegrationRuntimeAuthKeysOperations to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    private interface IntegrationRuntimeAuthKeysOperationsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/regenerateAuthKey")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IntegrationRuntimeAuthKeysInner>> regenerate(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("integrationRuntimeName") String integrationRuntimeName,
            @BodyParam("application/json") IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/listAuthKeys")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IntegrationRuntimeAuthKeysInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("integrationRuntimeName") String integrationRuntimeName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Regenerate the authentication key for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param regenerateKeyParameters The parameters for regenerating integration runtime authentication key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IntegrationRuntimeAuthKeysInner>> regenerateWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters) {
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
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        if (regenerateKeyParameters == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter regenerateKeyParameters is required and cannot be null."));
        } else {
            regenerateKeyParameters.validate();
        }
        final String apiVersion = "2021-04-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .regenerate(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            integrationRuntimeName,
                            regenerateKeyParameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Regenerate the authentication key for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param regenerateKeyParameters The parameters for regenerating integration runtime authentication key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IntegrationRuntimeAuthKeysInner>> regenerateWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters,
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
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        if (regenerateKeyParameters == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter regenerateKeyParameters is required and cannot be null."));
        } else {
            regenerateKeyParameters.validate();
        }
        final String apiVersion = "2021-04-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .regenerate(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                integrationRuntimeName,
                regenerateKeyParameters,
                accept,
                context);
    }

    /**
     * Regenerate the authentication key for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param regenerateKeyParameters The parameters for regenerating integration runtime authentication key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<IntegrationRuntimeAuthKeysInner> regenerateAsync(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters) {
        return regenerateWithResponseAsync(
                resourceGroupName, workspaceName, integrationRuntimeName, regenerateKeyParameters)
            .flatMap(
                (Response<IntegrationRuntimeAuthKeysInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Regenerate the authentication key for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param regenerateKeyParameters The parameters for regenerating integration runtime authentication key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IntegrationRuntimeAuthKeysInner regenerate(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters) {
        return regenerateAsync(resourceGroupName, workspaceName, integrationRuntimeName, regenerateKeyParameters)
            .block();
    }

    /**
     * Regenerate the authentication key for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param regenerateKeyParameters The parameters for regenerating integration runtime authentication key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<IntegrationRuntimeAuthKeysInner> regenerateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters,
        Context context) {
        return regenerateWithResponseAsync(
                resourceGroupName, workspaceName, integrationRuntimeName, regenerateKeyParameters, context)
            .block();
    }

    /**
     * List authentication keys in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IntegrationRuntimeAuthKeysInner>> listWithResponseAsync(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
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
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        final String apiVersion = "2021-04-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            integrationRuntimeName,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * List authentication keys in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IntegrationRuntimeAuthKeysInner>> listWithResponseAsync(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
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
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        final String apiVersion = "2021-04-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                integrationRuntimeName,
                accept,
                context);
    }

    /**
     * List authentication keys in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<IntegrationRuntimeAuthKeysInner> listAsync(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return listWithResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName)
            .flatMap(
                (Response<IntegrationRuntimeAuthKeysInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * List authentication keys in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IntegrationRuntimeAuthKeysInner list(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return listAsync(resourceGroupName, workspaceName, integrationRuntimeName).block();
    }

    /**
     * List authentication keys in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<IntegrationRuntimeAuthKeysInner> listWithResponse(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        return listWithResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, context).block();
    }
}
