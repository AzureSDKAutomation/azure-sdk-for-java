// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureactivedirectory.implementation;

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
import com.azure.resourcemanager.azureactivedirectory.fluent.OperationsClient;
import com.azure.resourcemanager.azureactivedirectory.fluent.models.OperationsDiscoveryCollectionInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OperationsClient. */
public final class OperationsClientImpl implements OperationsClient {
    private final ClientLogger logger = new ClientLogger(OperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final OperationsService service;

    /** The service client containing this operation class. */
    private final AzureactivedirectoryImpl client;

    /**
     * Initializes an instance of OperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OperationsClientImpl(AzureactivedirectoryImpl client) {
        this.service =
            RestProxy.create(OperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureactivedirectoryOperations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "Azureactivedirectory")
    private interface OperationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/microsoft.aadiam/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationsDiscoveryCollectionInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Operation to return the list of available operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of ClientDiscovery details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationsDiscoveryCollectionInner>> listWithResponseAsync() {
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
     * Operation to return the list of available operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of ClientDiscovery details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationsDiscoveryCollectionInner>> listWithResponseAsync(Context context) {
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
     * Operation to return the list of available operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of ClientDiscovery details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationsDiscoveryCollectionInner> listAsync() {
        return listWithResponseAsync()
            .flatMap(
                (Response<OperationsDiscoveryCollectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Operation to return the list of available operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of ClientDiscovery details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationsDiscoveryCollectionInner list() {
        return listAsync().block();
    }

    /**
     * Operation to return the list of available operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of ClientDiscovery details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OperationsDiscoveryCollectionInner> listWithResponse(Context context) {
        return listWithResponseAsync(context).block();
    }
}
