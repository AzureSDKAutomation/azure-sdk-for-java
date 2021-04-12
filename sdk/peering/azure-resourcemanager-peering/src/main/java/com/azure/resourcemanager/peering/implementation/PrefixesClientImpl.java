// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

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
import com.azure.resourcemanager.peering.fluent.PrefixesClient;
import com.azure.resourcemanager.peering.fluent.models.PeeringServicePrefixInner;
import com.azure.resourcemanager.peering.models.PeeringServicePrefixListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrefixesClient. */
public final class PrefixesClientImpl implements PrefixesClient {
    private final ClientLogger logger = new ClientLogger(PrefixesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PrefixesService service;

    /** The service client containing this operation class. */
    private final PeeringManagementClientImpl client;

    /**
     * Initializes an instance of PrefixesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrefixesClientImpl(PeeringManagementClientImpl client) {
        this.service = RestProxy.create(PrefixesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PeeringManagementClientPrefixes to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PeeringManagementCli")
    private interface PrefixesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Peering"
                + "/peeringServices/{peeringServiceName}/prefixes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PeeringServicePrefixListResult>> listByPeeringService(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("peeringServiceName") String peeringServiceName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PeeringServicePrefixListResult>> listByPeeringServiceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists the peerings prefix in the resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param peeringServiceName The peering service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of [T].
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeeringServicePrefixInner>> listByPeeringServiceSinglePageAsync(
        String resourceGroupName, String peeringServiceName) {
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
        if (peeringServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter peeringServiceName is required and cannot be null."));
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
                        .listByPeeringService(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            peeringServiceName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<PeeringServicePrefixInner>>map(
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
     * Lists the peerings prefix in the resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param peeringServiceName The peering service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of [T].
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeeringServicePrefixInner>> listByPeeringServiceSinglePageAsync(
        String resourceGroupName, String peeringServiceName, Context context) {
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
        if (peeringServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter peeringServiceName is required and cannot be null."));
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
            .listByPeeringService(
                this.client.getEndpoint(),
                resourceGroupName,
                peeringServiceName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
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
     * Lists the peerings prefix in the resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param peeringServiceName The peering service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of [T].
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PeeringServicePrefixInner> listByPeeringServiceAsync(
        String resourceGroupName, String peeringServiceName) {
        return new PagedFlux<>(
            () -> listByPeeringServiceSinglePageAsync(resourceGroupName, peeringServiceName),
            nextLink -> listByPeeringServiceNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the peerings prefix in the resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param peeringServiceName The peering service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of [T].
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PeeringServicePrefixInner> listByPeeringServiceAsync(
        String resourceGroupName, String peeringServiceName, Context context) {
        return new PagedFlux<>(
            () -> listByPeeringServiceSinglePageAsync(resourceGroupName, peeringServiceName, context),
            nextLink -> listByPeeringServiceNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the peerings prefix in the resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param peeringServiceName The peering service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of [T].
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PeeringServicePrefixInner> listByPeeringService(
        String resourceGroupName, String peeringServiceName) {
        return new PagedIterable<>(listByPeeringServiceAsync(resourceGroupName, peeringServiceName));
    }

    /**
     * Lists the peerings prefix in the resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param peeringServiceName The peering service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of [T].
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PeeringServicePrefixInner> listByPeeringService(
        String resourceGroupName, String peeringServiceName, Context context) {
        return new PagedIterable<>(listByPeeringServiceAsync(resourceGroupName, peeringServiceName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of [T].
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeeringServicePrefixInner>> listByPeeringServiceNextSinglePageAsync(String nextLink) {
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
            .withContext(
                context -> service.listByPeeringServiceNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<PeeringServicePrefixInner>>map(
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
     * @return the paginated list of [T].
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeeringServicePrefixInner>> listByPeeringServiceNextSinglePageAsync(
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
            .listByPeeringServiceNext(nextLink, this.client.getEndpoint(), accept, context)
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
