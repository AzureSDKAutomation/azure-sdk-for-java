// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.AadPropertiesOperationsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.AadPropertiesResourceInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AadPropertiesOperationsClient. */
public final class AadPropertiesOperationsClientImpl implements AadPropertiesOperationsClient {
    private final ClientLogger logger = new ClientLogger(AadPropertiesOperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final AadPropertiesOperationsService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of AadPropertiesOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AadPropertiesOperationsClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service =
            RestProxy
                .create(AadPropertiesOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientAadPropertiesOperations to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface AadPropertiesOperationsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.RecoveryServices/locations/{azureRegion}"
                + "/backupAadProperties")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AadPropertiesResourceInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("azureRegion") String azureRegion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Fetches the AAD properties from target region BCM stamp.
     *
     * @param azureRegion Azure region to hit Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AadPropertiesResourceInner>> getWithResponseAsync(String azureRegion) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (azureRegion == null) {
            return Mono.error(new IllegalArgumentException("Parameter azureRegion is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2018-12-20";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            azureRegion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Fetches the AAD properties from target region BCM stamp.
     *
     * @param azureRegion Azure region to hit Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AadPropertiesResourceInner>> getWithResponseAsync(String azureRegion, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (azureRegion == null) {
            return Mono.error(new IllegalArgumentException("Parameter azureRegion is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2018-12-20";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(this.client.getEndpoint(), apiVersion, azureRegion, this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Fetches the AAD properties from target region BCM stamp.
     *
     * @param azureRegion Azure region to hit Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AadPropertiesResourceInner> getAsync(String azureRegion) {
        return getWithResponseAsync(azureRegion)
            .flatMap(
                (Response<AadPropertiesResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Fetches the AAD properties from target region BCM stamp.
     *
     * @param azureRegion Azure region to hit Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AadPropertiesResourceInner get(String azureRegion) {
        return getAsync(azureRegion).block();
    }

    /**
     * Fetches the AAD properties from target region BCM stamp.
     *
     * @param azureRegion Azure region to hit Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AadPropertiesResourceInner> getWithResponse(String azureRegion, Context context) {
        return getWithResponseAsync(azureRegion, context).block();
    }
}
