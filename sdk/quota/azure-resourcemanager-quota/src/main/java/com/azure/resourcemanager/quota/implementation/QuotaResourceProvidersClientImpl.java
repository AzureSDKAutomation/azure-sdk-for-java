// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
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
import com.azure.resourcemanager.quota.fluent.QuotaResourceProvidersClient;
import com.azure.resourcemanager.quota.fluent.models.ResourceProvidersListInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in QuotaResourceProvidersClient. */
public final class QuotaResourceProvidersClientImpl implements QuotaResourceProvidersClient {
    private final ClientLogger logger = new ClientLogger(QuotaResourceProvidersClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final QuotaResourceProvidersService service;

    /** The service client containing this operation class. */
    private final AzureQuotaExtensionApiImpl client;

    /**
     * Initializes an instance of QuotaResourceProvidersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    QuotaResourceProvidersClientImpl(AzureQuotaExtensionApiImpl client) {
        this.service =
            RestProxy
                .create(QuotaResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureQuotaExtensionApiQuotaResourceProviders to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureQuotaExtensionA")
    private interface QuotaResourceProvidersService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Quota/quotaLimitProviders")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ResourceProvidersListInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the list of current resource providers supported by the Microsoft.Quota resource provider. For each resource
     * provider, the resource templates the resource provider supports are be provided. For each resource template, the
     * resource dimensions are listed. The resource dimensions are the name-value pairs in the resource URI.
     * Example: Microsoft.Compute Resource Provider The URI template is
     * '/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{locationId}/quotaBucket'. The actual
     * dimensions vary depending on the resource provider. The resource dimensions are
     * {subscriptions},{locations},{quotaBucket}.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of current resource providers supported by the Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ResourceProvidersListInner>> listWithResponseAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the list of current resource providers supported by the Microsoft.Quota resource provider. For each resource
     * provider, the resource templates the resource provider supports are be provided. For each resource template, the
     * resource dimensions are listed. The resource dimensions are the name-value pairs in the resource URI.
     * Example: Microsoft.Compute Resource Provider The URI template is
     * '/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{locationId}/quotaBucket'. The actual
     * dimensions vary depending on the resource provider. The resource dimensions are
     * {subscriptions},{locations},{quotaBucket}.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of current resource providers supported by the Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ResourceProvidersListInner>> listWithResponseAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets the list of current resource providers supported by the Microsoft.Quota resource provider. For each resource
     * provider, the resource templates the resource provider supports are be provided. For each resource template, the
     * resource dimensions are listed. The resource dimensions are the name-value pairs in the resource URI.
     * Example: Microsoft.Compute Resource Provider The URI template is
     * '/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{locationId}/quotaBucket'. The actual
     * dimensions vary depending on the resource provider. The resource dimensions are
     * {subscriptions},{locations},{quotaBucket}.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of current resource providers supported by the Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ResourceProvidersListInner> listAsync() {
        return listWithResponseAsync()
            .flatMap(
                (Response<ResourceProvidersListInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the list of current resource providers supported by the Microsoft.Quota resource provider. For each resource
     * provider, the resource templates the resource provider supports are be provided. For each resource template, the
     * resource dimensions are listed. The resource dimensions are the name-value pairs in the resource URI.
     * Example: Microsoft.Compute Resource Provider The URI template is
     * '/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{locationId}/quotaBucket'. The actual
     * dimensions vary depending on the resource provider. The resource dimensions are
     * {subscriptions},{locations},{quotaBucket}.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of current resource providers supported by the Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceProvidersListInner list() {
        return listAsync().block();
    }

    /**
     * Gets the list of current resource providers supported by the Microsoft.Quota resource provider. For each resource
     * provider, the resource templates the resource provider supports are be provided. For each resource template, the
     * resource dimensions are listed. The resource dimensions are the name-value pairs in the resource URI.
     * Example: Microsoft.Compute Resource Provider The URI template is
     * '/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{locationId}/quotaBucket'. The actual
     * dimensions vary depending on the resource provider. The resource dimensions are
     * {subscriptions},{locations},{quotaBucket}.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of current resource providers supported by the Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ResourceProvidersListInner> listWithResponse(Context context) {
        return listWithResponseAsync(context).block();
    }
}
