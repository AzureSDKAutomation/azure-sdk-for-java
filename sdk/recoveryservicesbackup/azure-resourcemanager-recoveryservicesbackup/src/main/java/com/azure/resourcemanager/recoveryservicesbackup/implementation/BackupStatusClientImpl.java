// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupStatusClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupStatusResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupStatusRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BackupStatusClient. */
public final class BackupStatusClientImpl implements BackupStatusClient {
    private final ClientLogger logger = new ClientLogger(BackupStatusClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final BackupStatusService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupStatusClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BackupStatusClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service =
            RestProxy.create(BackupStatusService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientBackupStatus to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface BackupStatusService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/Subscriptions/{subscriptionId}/providers/Microsoft.RecoveryServices/locations/{azureRegion}/backupStatus")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<BackupStatusResponseInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("azureRegion") String azureRegion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") BackupStatusRequest parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get the container backup status.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Container Backup Status Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the container backup status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BackupStatusResponseInner>> getWithResponseAsync(
        String azureRegion, BackupStatusRequest parameters) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2017-07-01";
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
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the container backup status.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Container Backup Status Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the container backup status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BackupStatusResponseInner>> getWithResponseAsync(
        String azureRegion, BackupStatusRequest parameters, Context context) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2017-07-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                azureRegion,
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Get the container backup status.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Container Backup Status Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the container backup status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<BackupStatusResponseInner> getAsync(String azureRegion, BackupStatusRequest parameters) {
        return getWithResponseAsync(azureRegion, parameters)
            .flatMap(
                (Response<BackupStatusResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get the container backup status.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Container Backup Status Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the container backup status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BackupStatusResponseInner get(String azureRegion, BackupStatusRequest parameters) {
        return getAsync(azureRegion, parameters).block();
    }

    /**
     * Get the container backup status.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Container Backup Status Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the container backup status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BackupStatusResponseInner> getWithResponse(
        String azureRegion, BackupStatusRequest parameters, Context context) {
        return getWithResponseAsync(azureRegion, parameters, context).block();
    }
}
