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
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupOperationStatusesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.OperationStatusInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BackupOperationStatusesClient. */
public final class BackupOperationStatusesClientImpl implements BackupOperationStatusesClient {
    private final ClientLogger logger = new ClientLogger(BackupOperationStatusesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final BackupOperationStatusesService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupOperationStatusesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BackupOperationStatusesClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service =
            RestProxy
                .create(BackupOperationStatusesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientBackupOperationStatuses to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface BackupOperationStatusesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupOperations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationStatusInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("operationId") String operationId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Fetches the status of an operation such as triggering a backup, restore. The status can be in progress, completed
     * or failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations
     * create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusInner>> getWithResponseAsync(
        String vaultName, String resourceGroupName, String operationId) {
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
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String apiVersion = "2021-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            vaultName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            operationId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Fetches the status of an operation such as triggering a backup, restore. The status can be in progress, completed
     * or failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations
     * create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusInner>> getWithResponseAsync(
        String vaultName, String resourceGroupName, String operationId, Context context) {
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
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String apiVersion = "2021-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                vaultName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                operationId,
                accept,
                context);
    }

    /**
     * Fetches the status of an operation such as triggering a backup, restore. The status can be in progress, completed
     * or failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations
     * create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusInner> getAsync(String vaultName, String resourceGroupName, String operationId) {
        return getWithResponseAsync(vaultName, resourceGroupName, operationId)
            .flatMap(
                (Response<OperationStatusInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Fetches the status of an operation such as triggering a backup, restore. The status can be in progress, completed
     * or failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations
     * create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatusInner get(String vaultName, String resourceGroupName, String operationId) {
        return getAsync(vaultName, resourceGroupName, operationId).block();
    }

    /**
     * Fetches the status of an operation such as triggering a backup, restore. The status can be in progress, completed
     * or failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations
     * create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OperationStatusInner> getWithResponse(
        String vaultName, String resourceGroupName, String operationId, Context context) {
        return getWithResponseAsync(vaultName, resourceGroupName, operationId, context).block();
    }
}
