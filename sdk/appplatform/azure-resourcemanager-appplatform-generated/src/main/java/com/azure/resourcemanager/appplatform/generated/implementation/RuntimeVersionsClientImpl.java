// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.implementation;

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
import com.azure.resourcemanager.appplatform.generated.fluent.RuntimeVersionsClient;
import com.azure.resourcemanager.appplatform.generated.fluent.models.AvailableRuntimeVersionsInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RuntimeVersionsClient. */
public final class RuntimeVersionsClientImpl implements RuntimeVersionsClient {
    private final ClientLogger logger = new ClientLogger(RuntimeVersionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RuntimeVersionsService service;

    /** The service client containing this operation class. */
    private final AppPlatformManagementClientImpl client;

    /**
     * Initializes an instance of RuntimeVersionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RuntimeVersionsClientImpl(AppPlatformManagementClientImpl client) {
        this.service =
            RestProxy.create(RuntimeVersionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AppPlatformManagementClientRuntimeVersions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AppPlatformManagemen")
    private interface RuntimeVersionsService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.AppPlatform/runtimeVersions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AvailableRuntimeVersionsInner>> listRuntimeVersions(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists all of the available runtime versions supported by Microsoft.AppPlatform provider.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AvailableRuntimeVersionsInner>> listRuntimeVersionsWithResponseAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listRuntimeVersions(this.client.getEndpoint(), this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists all of the available runtime versions supported by Microsoft.AppPlatform provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AvailableRuntimeVersionsInner>> listRuntimeVersionsWithResponseAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listRuntimeVersions(this.client.getEndpoint(), this.client.getApiVersion(), accept, context);
    }

    /**
     * Lists all of the available runtime versions supported by Microsoft.AppPlatform provider.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AvailableRuntimeVersionsInner> listRuntimeVersionsAsync() {
        return listRuntimeVersionsWithResponseAsync()
            .flatMap(
                (Response<AvailableRuntimeVersionsInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists all of the available runtime versions supported by Microsoft.AppPlatform provider.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AvailableRuntimeVersionsInner listRuntimeVersions() {
        return listRuntimeVersionsAsync().block();
    }

    /**
     * Lists all of the available runtime versions supported by Microsoft.AppPlatform provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AvailableRuntimeVersionsInner> listRuntimeVersionsWithResponse(Context context) {
        return listRuntimeVersionsWithResponseAsync(context).block();
    }
}
