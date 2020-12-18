// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.resourcemanager.recoveryservicesbackup.fluent.RestoresClient;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreRequestResource;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RestoresClient. */
public final class RestoresClientImpl implements RestoresClient {
    private final ClientLogger logger = new ClientLogger(RestoresClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RestoresService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of RestoresClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RestoresClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service = RestProxy.create(RestoresService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientRestores to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface RestoresService {
        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/protectedItems"
                + "/{protectedItemName}/recoveryPoints/{recoveryPointId}/restore")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> trigger(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("containerName") String containerName,
            @PathParam("protectedItemName") String protectedItemName,
            @PathParam("recoveryPointId") String recoveryPointId,
            @BodyParam("application/json") RestoreRequestResource parameters,
            Context context);
    }

    /**
     * Restores the specified backed up data. This is an asynchronous operation. To know the status of this API call,
     * use GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item to be restored.
     * @param recoveryPointId Recovery point ID which represents the backed up data to be restored.
     * @param parameters resource restore request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> triggerWithResponseAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        RestoreRequestResource parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (protectedItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter protectedItemName is required and cannot be null."));
        }
        if (recoveryPointId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recoveryPointId is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-10-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .trigger(
                            this.client.getEndpoint(),
                            apiVersion,
                            vaultName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            fabricName,
                            containerName,
                            protectedItemName,
                            recoveryPointId,
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Restores the specified backed up data. This is an asynchronous operation. To know the status of this API call,
     * use GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item to be restored.
     * @param recoveryPointId Recovery point ID which represents the backed up data to be restored.
     * @param parameters resource restore request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> triggerWithResponseAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        RestoreRequestResource parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (protectedItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter protectedItemName is required and cannot be null."));
        }
        if (recoveryPointId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recoveryPointId is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-10-01";
        context = this.client.mergeContext(context);
        return service
            .trigger(
                this.client.getEndpoint(),
                apiVersion,
                vaultName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                fabricName,
                containerName,
                protectedItemName,
                recoveryPointId,
                parameters,
                context);
    }

    /**
     * Restores the specified backed up data. This is an asynchronous operation. To know the status of this API call,
     * use GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item to be restored.
     * @param recoveryPointId Recovery point ID which represents the backed up data to be restored.
     * @param parameters resource restore request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> triggerAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        RestoreRequestResource parameters) {
        return triggerWithResponseAsync(
                vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId, parameters)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Restores the specified backed up data. This is an asynchronous operation. To know the status of this API call,
     * use GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item to be restored.
     * @param recoveryPointId Recovery point ID which represents the backed up data to be restored.
     * @param parameters resource restore request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void trigger(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        RestoreRequestResource parameters) {
        triggerAsync(
                vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId, parameters)
            .block();
    }

    /**
     * Restores the specified backed up data. This is an asynchronous operation. To know the status of this API call,
     * use GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item to be restored.
     * @param recoveryPointId Recovery point ID which represents the backed up data to be restored.
     * @param parameters resource restore request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> triggerWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        RestoreRequestResource parameters,
        Context context) {
        return triggerWithResponseAsync(
                vaultName,
                resourceGroupName,
                fabricName,
                containerName,
                protectedItemName,
                recoveryPointId,
                parameters,
                context)
            .block();
    }
}
