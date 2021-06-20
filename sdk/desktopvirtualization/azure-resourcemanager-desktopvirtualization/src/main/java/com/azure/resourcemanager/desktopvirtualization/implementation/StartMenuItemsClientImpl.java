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
import com.azure.resourcemanager.desktopvirtualization.fluent.StartMenuItemsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.StartMenuItemInner;
import com.azure.resourcemanager.desktopvirtualization.models.StartMenuItemList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in StartMenuItemsClient. */
public final class StartMenuItemsClientImpl implements StartMenuItemsClient {
    private final ClientLogger logger = new ClientLogger(StartMenuItemsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final StartMenuItemsService service;

    /** The service client containing this operation class. */
    private final DesktopVirtualizationApiClientImpl client;

    /**
     * Initializes an instance of StartMenuItemsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    StartMenuItemsClientImpl(DesktopVirtualizationApiClientImpl client) {
        this.service =
            RestProxy.create(StartMenuItemsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DesktopVirtualizationApiClientStartMenuItems to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DesktopVirtualizatio")
    private interface StartMenuItemsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.DesktopVirtualization/applicationGroups/{applicationGroupName}/startMenuItems")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<StartMenuItemList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("applicationGroupName") String applicationGroupName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<StartMenuItemList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List start menu items in the given application group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of StartMenuItem definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StartMenuItemInner>> listSinglePageAsync(
        String resourceGroupName, String applicationGroupName) {
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
        if (applicationGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            applicationGroupName,
                            accept,
                            context))
            .<PagedResponse<StartMenuItemInner>>map(
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
     * List start menu items in the given application group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of StartMenuItem definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StartMenuItemInner>> listSinglePageAsync(
        String resourceGroupName, String applicationGroupName, Context context) {
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
        if (applicationGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                applicationGroupName,
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
     * List start menu items in the given application group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of StartMenuItem definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<StartMenuItemInner> listAsync(String resourceGroupName, String applicationGroupName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, applicationGroupName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List start menu items in the given application group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of StartMenuItem definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<StartMenuItemInner> listAsync(
        String resourceGroupName, String applicationGroupName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, applicationGroupName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List start menu items in the given application group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of StartMenuItem definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StartMenuItemInner> list(String resourceGroupName, String applicationGroupName) {
        return new PagedIterable<>(listAsync(resourceGroupName, applicationGroupName));
    }

    /**
     * List start menu items in the given application group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of StartMenuItem definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StartMenuItemInner> list(
        String resourceGroupName, String applicationGroupName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, applicationGroupName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of StartMenuItem definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StartMenuItemInner>> listNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<StartMenuItemInner>>map(
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
     * @return list of StartMenuItem definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StartMenuItemInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
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
