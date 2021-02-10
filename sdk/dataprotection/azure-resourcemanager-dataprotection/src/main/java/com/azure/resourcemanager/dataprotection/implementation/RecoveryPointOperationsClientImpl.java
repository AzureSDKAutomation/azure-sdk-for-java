// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

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
import com.azure.resourcemanager.dataprotection.fluent.RecoveryPointOperationsClient;
import com.azure.resourcemanager.dataprotection.fluent.models.AzureBackupRecoveryPointResourceInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RecoveryPointOperationsClient. */
public final class RecoveryPointOperationsClientImpl implements RecoveryPointOperationsClient {
    private final ClientLogger logger = new ClientLogger(RecoveryPointOperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RecoveryPointOperationsService service;

    /** The service client containing this operation class. */
    private final DataProtectionClientImpl client;

    /**
     * Initializes an instance of RecoveryPointOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RecoveryPointOperationsClientImpl(DataProtectionClientImpl client) {
        this.service =
            RestProxy
                .create(RecoveryPointOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataProtectionClientRecoveryPointOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataProtectionClient")
    private interface RecoveryPointOperationsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataProtection"
                + "/backupVaults/{vaultName}/backupInstances/{backupInstanceName}/recoveryPoints/{recoveryPointId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AzureBackupRecoveryPointResourceInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("backupInstanceName") String backupInstanceName,
            @PathParam("recoveryPointId") String recoveryPointId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a Recovery Point using recoveryPointId for a Datasource.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param recoveryPointId The recoveryPointId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Recovery Point using recoveryPointId for a Datasource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AzureBackupRecoveryPointResourceInner>> getWithResponseAsync(
        String vaultName, String resourceGroupName, String backupInstanceName, String recoveryPointId) {
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
        if (backupInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter backupInstanceName is required and cannot be null."));
        }
        if (recoveryPointId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recoveryPointId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            vaultName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            backupInstanceName,
                            recoveryPointId,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a Recovery Point using recoveryPointId for a Datasource.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param recoveryPointId The recoveryPointId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Recovery Point using recoveryPointId for a Datasource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AzureBackupRecoveryPointResourceInner>> getWithResponseAsync(
        String vaultName,
        String resourceGroupName,
        String backupInstanceName,
        String recoveryPointId,
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
        if (backupInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter backupInstanceName is required and cannot be null."));
        }
        if (recoveryPointId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recoveryPointId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                vaultName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                backupInstanceName,
                recoveryPointId,
                accept,
                context);
    }

    /**
     * Gets a Recovery Point using recoveryPointId for a Datasource.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param recoveryPointId The recoveryPointId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Recovery Point using recoveryPointId for a Datasource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AzureBackupRecoveryPointResourceInner> getAsync(
        String vaultName, String resourceGroupName, String backupInstanceName, String recoveryPointId) {
        return getWithResponseAsync(vaultName, resourceGroupName, backupInstanceName, recoveryPointId)
            .flatMap(
                (Response<AzureBackupRecoveryPointResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a Recovery Point using recoveryPointId for a Datasource.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param recoveryPointId The recoveryPointId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Recovery Point using recoveryPointId for a Datasource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AzureBackupRecoveryPointResourceInner get(
        String vaultName, String resourceGroupName, String backupInstanceName, String recoveryPointId) {
        return getAsync(vaultName, resourceGroupName, backupInstanceName, recoveryPointId).block();
    }

    /**
     * Gets a Recovery Point using recoveryPointId for a Datasource.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param recoveryPointId The recoveryPointId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Recovery Point using recoveryPointId for a Datasource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AzureBackupRecoveryPointResourceInner> getWithResponse(
        String vaultName,
        String resourceGroupName,
        String backupInstanceName,
        String recoveryPointId,
        Context context) {
        return getWithResponseAsync(vaultName, resourceGroupName, backupInstanceName, recoveryPointId, context).block();
    }
}
