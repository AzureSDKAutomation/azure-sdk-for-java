// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.OperationsClient;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.OperationInner;
import com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException;
import com.azure.resourcemanager.deviceprovisioningservices.models.OperationListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OperationsClient. */
public final class OperationsClientImpl implements OperationsClient {
    private final ClientLogger logger = new ClientLogger(OperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final OperationsService service;

    /** The service client containing this operation class. */
    private final IotDpsClientImpl client;

    /**
     * Initializes an instance of OperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OperationsClientImpl(IotDpsClientImpl client) {
        this.service =
            RestProxy.create(OperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for IotDpsClientOperations to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "IotDpsClientOperatio")
    private interface OperationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Devices/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorDetailsException.class)
        Mono<Response<OperationListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorDetailsException.class)
        Mono<Response<OperationListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists all of the available Microsoft.Devices REST API operations.
     *
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list provisioning service operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationInner>> listSinglePageAsync() {
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
            .<PagedResponse<OperationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists all of the available Microsoft.Devices REST API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list provisioning service operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context)
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
     * Lists all of the available Microsoft.Devices REST API operations.
     *
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list provisioning service operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<OperationInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all of the available Microsoft.Devices REST API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list provisioning service operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<OperationInner> listAsync(Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists all of the available Microsoft.Devices REST API operations.
     *
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list provisioning service operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OperationInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Lists all of the available Microsoft.Devices REST API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list provisioning service operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OperationInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list provisioning service operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<OperationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list provisioning service operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
