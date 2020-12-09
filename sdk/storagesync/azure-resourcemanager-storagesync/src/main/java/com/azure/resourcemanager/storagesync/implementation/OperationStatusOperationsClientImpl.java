// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagesync.fluent.OperationStatusOperationsClient;
import com.azure.resourcemanager.storagesync.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.storagesync.models.OperationStatusOperationsGetResponse;
import com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OperationStatusOperationsClient. */
public final class OperationStatusOperationsClientImpl implements OperationStatusOperationsClient {
    private final ClientLogger logger = new ClientLogger(OperationStatusOperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final OperationStatusOperationsService service;

    /** The service client containing this operation class. */
    private final MicrosoftStorageSyncImpl client;

    /**
     * Initializes an instance of OperationStatusOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OperationStatusOperationsClientImpl(MicrosoftStorageSyncImpl client) {
        this.service =
            RestProxy
                .create(
                    OperationStatusOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftStorageSyncOperationStatusOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftStorageSync")
    private interface OperationStatusOperationsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.StorageSync"
                + "/locations/{locationName}/workflows/{workflowId}/operations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageSyncApiErrorException.class)
        Mono<OperationStatusOperationsGetResponse> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("locationName") String locationName,
            @PathParam("workflowId") String workflowId,
            @PathParam("operationId") String operationId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get Operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param locationName The desired region to obtain information from.
     * @param workflowId workflow Id.
     * @param operationId operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageSyncApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusOperationsGetResponse> getWithResponseAsync(
        String resourceGroupName, String locationName, String workflowId, String operationId) {
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
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (workflowId == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowId is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            this.client.getApiVersion(),
                            locationName,
                            workflowId,
                            operationId,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get Operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param locationName The desired region to obtain information from.
     * @param workflowId workflow Id.
     * @param operationId operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageSyncApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusOperationsGetResponse> getWithResponseAsync(
        String resourceGroupName, String locationName, String workflowId, String operationId, Context context) {
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
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (workflowId == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowId is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                this.client.getApiVersion(),
                locationName,
                workflowId,
                operationId,
                accept,
                context);
    }

    /**
     * Get Operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param locationName The desired region to obtain information from.
     * @param workflowId workflow Id.
     * @param operationId operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageSyncApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusInner> getAsync(
        String resourceGroupName, String locationName, String workflowId, String operationId) {
        return getWithResponseAsync(resourceGroupName, locationName, workflowId, operationId)
            .flatMap(
                (OperationStatusOperationsGetResponse res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get Operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param locationName The desired region to obtain information from.
     * @param workflowId workflow Id.
     * @param operationId operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageSyncApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatusInner get(
        String resourceGroupName, String locationName, String workflowId, String operationId) {
        return getAsync(resourceGroupName, locationName, workflowId, operationId).block();
    }

    /**
     * Get Operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param locationName The desired region to obtain information from.
     * @param workflowId workflow Id.
     * @param operationId operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageSyncApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OperationStatusInner> getWithResponse(
        String resourceGroupName, String locationName, String workflowId, String operationId, Context context) {
        return getWithResponseAsync(resourceGroupName, locationName, workflowId, operationId, context).block();
    }
}
