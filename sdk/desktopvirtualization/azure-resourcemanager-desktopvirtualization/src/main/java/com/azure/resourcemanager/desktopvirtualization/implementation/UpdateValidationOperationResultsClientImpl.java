// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

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
import com.azure.resourcemanager.desktopvirtualization.fluent.UpdateValidationOperationResultsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.HostPoolUpdateValidationResponseInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in UpdateValidationOperationResultsClient.
 */
public final class UpdateValidationOperationResultsClientImpl implements UpdateValidationOperationResultsClient {
    private final ClientLogger logger = new ClientLogger(UpdateValidationOperationResultsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final UpdateValidationOperationResultsService service;

    /** The service client containing this operation class. */
    private final DesktopVirtualizationApiClientImpl client;

    /**
     * Initializes an instance of UpdateValidationOperationResultsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    UpdateValidationOperationResultsClientImpl(DesktopVirtualizationApiClientImpl client) {
        this.service =
            RestProxy
                .create(
                    UpdateValidationOperationResultsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DesktopVirtualizationApiClientUpdateValidationOperationResults to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DesktopVirtualizatio")
    private interface UpdateValidationOperationResultsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.DesktopVirtualization/hostPools/{hostPoolName}/updateValidationOperationResults"
                + "/{operationResultId}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<HostPoolUpdateValidationResponseInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("hostPoolName") String hostPoolName,
            @PathParam("operationResultId") String operationResultId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Operation status of a validate hostpool update.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param operationResultId The Guid of the operation result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return errors and warnings returned by hostpool update validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<HostPoolUpdateValidationResponseInner>> getWithResponseAsync(
        String resourceGroupName, String hostPoolName, String operationResultId) {
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
        if (hostPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter hostPoolName is required and cannot be null."));
        }
        if (operationResultId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter operationResultId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            hostPoolName,
                            operationResultId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Operation status of a validate hostpool update.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param operationResultId The Guid of the operation result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return errors and warnings returned by hostpool update validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<HostPoolUpdateValidationResponseInner>> getWithResponseAsync(
        String resourceGroupName, String hostPoolName, String operationResultId, Context context) {
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
        if (hostPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter hostPoolName is required and cannot be null."));
        }
        if (operationResultId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter operationResultId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                hostPoolName,
                operationResultId,
                accept,
                context);
    }

    /**
     * Operation status of a validate hostpool update.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param operationResultId The Guid of the operation result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return errors and warnings returned by hostpool update validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<HostPoolUpdateValidationResponseInner> getAsync(
        String resourceGroupName, String hostPoolName, String operationResultId) {
        return getWithResponseAsync(resourceGroupName, hostPoolName, operationResultId)
            .flatMap(
                (Response<HostPoolUpdateValidationResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Operation status of a validate hostpool update.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param operationResultId The Guid of the operation result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return errors and warnings returned by hostpool update validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public HostPoolUpdateValidationResponseInner get(
        String resourceGroupName, String hostPoolName, String operationResultId) {
        return getAsync(resourceGroupName, hostPoolName, operationResultId).block();
    }

    /**
     * Operation status of a validate hostpool update.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param operationResultId The Guid of the operation result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return errors and warnings returned by hostpool update validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<HostPoolUpdateValidationResponseInner> getWithResponse(
        String resourceGroupName, String hostPoolName, String operationResultId, Context context) {
        return getWithResponseAsync(resourceGroupName, hostPoolName, operationResultId, context).block();
    }
}
