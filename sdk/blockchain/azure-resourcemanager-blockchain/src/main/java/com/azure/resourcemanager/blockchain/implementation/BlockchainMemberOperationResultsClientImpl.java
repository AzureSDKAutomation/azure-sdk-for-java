// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.blockchain.implementation;

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
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.blockchain.fluent.BlockchainMemberOperationResultsClient;
import com.azure.resourcemanager.blockchain.fluent.models.OperationResultInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in BlockchainMemberOperationResultsClient.
 */
public final class BlockchainMemberOperationResultsClientImpl implements BlockchainMemberOperationResultsClient {
    private final ClientLogger logger = new ClientLogger(BlockchainMemberOperationResultsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final BlockchainMemberOperationResultsService service;

    /** The service client containing this operation class. */
    private final BlockchainManagementClientImpl client;

    /**
     * Initializes an instance of BlockchainMemberOperationResultsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BlockchainMemberOperationResultsClientImpl(BlockchainManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    BlockchainMemberOperationResultsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BlockchainManagementClientBlockchainMemberOperationResults to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "BlockchainManagement")
    private interface BlockchainMemberOperationResultsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Blockchain/locations/{locationName}"
                + "/blockchainMemberOperationResults/{operationId}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> get(
            @HostParam("$host") String endpoint,
            @PathParam("locationName") String locationName,
            @PathParam("operationId") String operationId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> getWithResponseAsync(String locationName, String operationId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
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
                        .get(
                            this.client.getEndpoint(),
                            locationName,
                            operationId,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> getWithResponseAsync(
        String locationName, String operationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
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
            .get(
                this.client.getEndpoint(),
                locationName,
                operationId,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<OperationResultInner>, OperationResultInner> beginGetAsync(
        String locationName, String operationId) {
        Mono<Response<Flux<ByteBuffer>>> mono = getWithResponseAsync(locationName, operationId);
        return this
            .client
            .<OperationResultInner, OperationResultInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                OperationResultInner.class,
                OperationResultInner.class,
                Context.NONE);
    }

    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<OperationResultInner>, OperationResultInner> beginGetAsync(
        String locationName, String operationId, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono = getWithResponseAsync(locationName, operationId, context);
        return this
            .client
            .<OperationResultInner, OperationResultInner>getLroResult(
                mono, this.client.getHttpPipeline(), OperationResultInner.class, OperationResultInner.class, context);
    }

    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<OperationResultInner>, OperationResultInner> beginGet(
        String locationName, String operationId) {
        return beginGetAsync(locationName, operationId).getSyncPoller();
    }

    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<OperationResultInner>, OperationResultInner> beginGet(
        String locationName, String operationId, Context context) {
        return beginGetAsync(locationName, operationId, context).getSyncPoller();
    }

    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationResultInner> getAsync(String locationName, String operationId) {
        return beginGetAsync(locationName, operationId).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationResultInner> getAsync(String locationName, String operationId, Context context) {
        return beginGetAsync(locationName, operationId, context).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationResultInner get(String locationName, String operationId) {
        return getAsync(locationName, operationId).block();
    }

    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationResultInner get(String locationName, String operationId, Context context) {
        return getAsync(locationName, operationId, context).block();
    }
}
