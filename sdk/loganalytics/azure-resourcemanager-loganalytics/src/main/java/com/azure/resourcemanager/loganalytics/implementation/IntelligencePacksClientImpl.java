// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.resourcemanager.loganalytics.fluent.IntelligencePacksClient;
import com.azure.resourcemanager.loganalytics.fluent.models.IntelligencePackInner;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in IntelligencePacksClient. */
public final class IntelligencePacksClientImpl implements IntelligencePacksClient {
    private final ClientLogger logger = new ClientLogger(IntelligencePacksClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final IntelligencePacksService service;

    /** The service client containing this operation class. */
    private final OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of IntelligencePacksClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IntelligencePacksClientImpl(OperationalInsightsManagementClientImpl client) {
        this.service =
            RestProxy.create(IntelligencePacksService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for OperationalInsightsManagementClientIntelligencePacks to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "OperationalInsightsM")
    private interface IntelligencePacksService {
        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights"
                + "/workspaces/{workspaceName}/intelligencePacks/{intelligencePackName}/Disable")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> disable(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("intelligencePackName") String intelligencePackName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights"
                + "/workspaces/{workspaceName}/intelligencePacks/{intelligencePackName}/Enable")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> enable(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("intelligencePackName") String intelligencePackName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights"
                + "/workspaces/{workspaceName}/intelligencePacks")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<IntelligencePackInner>>> list(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Legacy operation. Disables a Solution for a given workspace. This will break the reference of an existing
     * Solution resource if it exists.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the Solution to be disabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> disableWithResponseAsync(
        String resourceGroupName, String workspaceName, String intelligencePackName) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (intelligencePackName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter intelligencePackName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .disable(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            workspaceName,
                            intelligencePackName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Legacy operation. Disables a Solution for a given workspace. This will break the reference of an existing
     * Solution resource if it exists.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the Solution to be disabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> disableWithResponseAsync(
        String resourceGroupName, String workspaceName, String intelligencePackName, Context context) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (intelligencePackName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter intelligencePackName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .disable(
                this.client.getEndpoint(),
                resourceGroupName,
                workspaceName,
                intelligencePackName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Legacy operation. Disables a Solution for a given workspace. This will break the reference of an existing
     * Solution resource if it exists.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the Solution to be disabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> disableAsync(String resourceGroupName, String workspaceName, String intelligencePackName) {
        return disableWithResponseAsync(resourceGroupName, workspaceName, intelligencePackName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Legacy operation. Disables a Solution for a given workspace. This will break the reference of an existing
     * Solution resource if it exists.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the Solution to be disabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void disable(String resourceGroupName, String workspaceName, String intelligencePackName) {
        disableAsync(resourceGroupName, workspaceName, intelligencePackName).block();
    }

    /**
     * Legacy operation. Disables a Solution for a given workspace. This will break the reference of an existing
     * Solution resource if it exists.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the Solution to be disabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> disableWithResponse(
        String resourceGroupName, String workspaceName, String intelligencePackName, Context context) {
        return disableWithResponseAsync(resourceGroupName, workspaceName, intelligencePackName, context).block();
    }

    /**
     * Legacy operation. Enables a Solution for a given workspace. This does not create a Solution resource but has the
     * same effect.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the Solution to be enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> enableWithResponseAsync(
        String resourceGroupName, String workspaceName, String intelligencePackName) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (intelligencePackName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter intelligencePackName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .enable(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            workspaceName,
                            intelligencePackName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Legacy operation. Enables a Solution for a given workspace. This does not create a Solution resource but has the
     * same effect.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the Solution to be enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> enableWithResponseAsync(
        String resourceGroupName, String workspaceName, String intelligencePackName, Context context) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (intelligencePackName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter intelligencePackName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .enable(
                this.client.getEndpoint(),
                resourceGroupName,
                workspaceName,
                intelligencePackName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Legacy operation. Enables a Solution for a given workspace. This does not create a Solution resource but has the
     * same effect.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the Solution to be enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> enableAsync(String resourceGroupName, String workspaceName, String intelligencePackName) {
        return enableWithResponseAsync(resourceGroupName, workspaceName, intelligencePackName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Legacy operation. Enables a Solution for a given workspace. This does not create a Solution resource but has the
     * same effect.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the Solution to be enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void enable(String resourceGroupName, String workspaceName, String intelligencePackName) {
        enableAsync(resourceGroupName, workspaceName, intelligencePackName).block();
    }

    /**
     * Legacy operation. Enables a Solution for a given workspace. This does not create a Solution resource but has the
     * same effect.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param intelligencePackName The name of the Solution to be enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> enableWithResponse(
        String resourceGroupName, String workspaceName, String intelligencePackName, Context context) {
        return enableWithResponseAsync(resourceGroupName, workspaceName, intelligencePackName, context).block();
    }

    /**
     * Legacy operation. Lists all the Solutions possible and whether they are enabled or disabled for a given
     * workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of IntelligencePack.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<IntelligencePackInner>>> listWithResponseAsync(
        String resourceGroupName, String workspaceName) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
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
                        .list(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            workspaceName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Legacy operation. Lists all the Solutions possible and whether they are enabled or disabled for a given
     * workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of IntelligencePack.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<IntelligencePackInner>>> listWithResponseAsync(
        String resourceGroupName, String workspaceName, Context context) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
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
            .list(
                this.client.getEndpoint(),
                resourceGroupName,
                workspaceName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Legacy operation. Lists all the Solutions possible and whether they are enabled or disabled for a given
     * workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of IntelligencePack.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<IntelligencePackInner>> listAsync(String resourceGroupName, String workspaceName) {
        return listWithResponseAsync(resourceGroupName, workspaceName)
            .flatMap(
                (Response<List<IntelligencePackInner>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Legacy operation. Lists all the Solutions possible and whether they are enabled or disabled for a given
     * workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of IntelligencePack.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<IntelligencePackInner> list(String resourceGroupName, String workspaceName) {
        return listAsync(resourceGroupName, workspaceName).block();
    }

    /**
     * Legacy operation. Lists all the Solutions possible and whether they are enabled or disabled for a given
     * workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of IntelligencePack.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<IntelligencePackInner>> listWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        return listWithResponseAsync(resourceGroupName, workspaceName, context).block();
    }
}
