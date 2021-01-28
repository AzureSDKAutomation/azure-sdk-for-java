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
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionPolicyOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionPolicyResourceInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ProtectionPolicyOperationResultsClient.
 */
public final class ProtectionPolicyOperationResultsClientImpl implements ProtectionPolicyOperationResultsClient {
    private final ClientLogger logger = new ClientLogger(ProtectionPolicyOperationResultsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ProtectionPolicyOperationResultsService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ProtectionPolicyOperationResultsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ProtectionPolicyOperationResultsClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ProtectionPolicyOperationResultsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientProtectionPolicyOperationResults to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface ProtectionPolicyOperationResultsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupPolicies/{policyName}/operationResults/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProtectionPolicyResourceInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("policyName") String policyName,
            @PathParam("operationId") String operationId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProtectionPolicyResourceInner>> getWithResponseAsync(
        String vaultName, String resourceGroupName, String policyName, String operationId) {
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
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String apiVersion = "2020-12-01";
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
                            policyName,
                            operationId,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProtectionPolicyResourceInner>> getWithResponseAsync(
        String vaultName, String resourceGroupName, String policyName, String operationId, Context context) {
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
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                vaultName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                policyName,
                operationId,
                accept,
                context);
    }

    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ProtectionPolicyResourceInner> getAsync(
        String vaultName, String resourceGroupName, String policyName, String operationId) {
        return getWithResponseAsync(vaultName, resourceGroupName, policyName, operationId)
            .flatMap(
                (Response<ProtectionPolicyResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProtectionPolicyResourceInner get(
        String vaultName, String resourceGroupName, String policyName, String operationId) {
        return getAsync(vaultName, resourceGroupName, policyName, operationId).block();
    }

    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ProtectionPolicyResourceInner> getWithResponse(
        String vaultName, String resourceGroupName, String policyName, String operationId, Context context) {
        return getWithResponseAsync(vaultName, resourceGroupName, policyName, operationId, context).block();
    }
}
