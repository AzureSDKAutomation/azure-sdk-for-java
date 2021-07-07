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
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupOperationResultsClient;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BackupOperationResultsClient. */
public final class BackupOperationResultsClientImpl implements BackupOperationResultsClient {
    private final ClientLogger logger = new ClientLogger(BackupOperationResultsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final BackupOperationResultsService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupOperationResultsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BackupOperationResultsClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service =
            RestProxy
                .create(BackupOperationResultsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientBackupOperationResults to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface BackupOperationResultsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupOperationResults/{operationId}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> get(
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
     * Provides the status of the delete operations such as deleting backed up item. Once the operation has started, the
     * status code in the response would be Accepted. It will continue to be in this state till it reaches completion.
     * On successful completion, the status code will be OK. This method expects OperationID as an argument. OperationID
     * is part of the Location header of the operation response.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> getWithResponseAsync(String vaultName, String resourceGroupName, String operationId) {
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
     * Provides the status of the delete operations such as deleting backed up item. Once the operation has started, the
     * status code in the response would be Accepted. It will continue to be in this state till it reaches completion.
     * On successful completion, the status code will be OK. This method expects OperationID as an argument. OperationID
     * is part of the Location header of the operation response.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> getWithResponseAsync(
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
     * Provides the status of the delete operations such as deleting backed up item. Once the operation has started, the
     * status code in the response would be Accepted. It will continue to be in this state till it reaches completion.
     * On successful completion, the status code will be OK. This method expects OperationID as an argument. OperationID
     * is part of the Location header of the operation response.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> getAsync(String vaultName, String resourceGroupName, String operationId) {
        return getWithResponseAsync(vaultName, resourceGroupName, operationId)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Provides the status of the delete operations such as deleting backed up item. Once the operation has started, the
     * status code in the response would be Accepted. It will continue to be in this state till it reaches completion.
     * On successful completion, the status code will be OK. This method expects OperationID as an argument. OperationID
     * is part of the Location header of the operation response.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void get(String vaultName, String resourceGroupName, String operationId) {
        getAsync(vaultName, resourceGroupName, operationId).block();
    }

    /**
     * Provides the status of the delete operations such as deleting backed up item. Once the operation has started, the
     * status code in the response would be Accepted. It will continue to be in this state till it reaches completion.
     * On successful completion, the status code will be OK. This method expects OperationID as an argument. OperationID
     * is part of the Location header of the operation response.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getWithResponse(
        String vaultName, String resourceGroupName, String operationId, Context context) {
        return getWithResponseAsync(vaultName, resourceGroupName, operationId, context).block();
    }
}
