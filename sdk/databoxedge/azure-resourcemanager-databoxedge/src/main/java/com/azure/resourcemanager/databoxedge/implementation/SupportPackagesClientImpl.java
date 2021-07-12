// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

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
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.databoxedge.fluent.SupportPackagesClient;
import com.azure.resourcemanager.databoxedge.models.TriggerSupportPackageRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SupportPackagesClient. */
public final class SupportPackagesClientImpl implements SupportPackagesClient {
    private final ClientLogger logger = new ClientLogger(SupportPackagesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final SupportPackagesService service;

    /** The service client containing this operation class. */
    private final DataBoxEdgeManagementClientImpl client;

    /**
     * Initializes an instance of SupportPackagesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SupportPackagesClientImpl(DataBoxEdgeManagementClientImpl client) {
        this.service =
            RestProxy.create(SupportPackagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataBoxEdgeManagementClientSupportPackages to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataBoxEdgeManagemen")
    private interface SupportPackagesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBoxEdge"
                + "/dataBoxEdgeDevices/{deviceName}/triggerSupportPackage")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> triggerSupportPackage(
            @HostParam("$host") String endpoint,
            @PathParam("deviceName") String deviceName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") TriggerSupportPackageRequest triggerSupportPackageRequest,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> triggerSupportPackageWithResponseAsync(
        String deviceName, String resourceGroupName, TriggerSupportPackageRequest triggerSupportPackageRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (deviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceName is required and cannot be null."));
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
        if (triggerSupportPackageRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter triggerSupportPackageRequest is required and cannot be null."));
        } else {
            triggerSupportPackageRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .triggerSupportPackage(
                            this.client.getEndpoint(),
                            deviceName,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            this.client.getApiVersion(),
                            triggerSupportPackageRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> triggerSupportPackageWithResponseAsync(
        String deviceName,
        String resourceGroupName,
        TriggerSupportPackageRequest triggerSupportPackageRequest,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (deviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceName is required and cannot be null."));
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
        if (triggerSupportPackageRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter triggerSupportPackageRequest is required and cannot be null."));
        } else {
            triggerSupportPackageRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .triggerSupportPackage(
                this.client.getEndpoint(),
                deviceName,
                this.client.getSubscriptionId(),
                resourceGroupName,
                this.client.getApiVersion(),
                triggerSupportPackageRequest,
                accept,
                context);
    }

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<Void>, Void> beginTriggerSupportPackageAsync(
        String deviceName, String resourceGroupName, TriggerSupportPackageRequest triggerSupportPackageRequest) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            triggerSupportPackageWithResponseAsync(deviceName, resourceGroupName, triggerSupportPackageRequest);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, Context.NONE);
    }

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<Void>, Void> beginTriggerSupportPackageAsync(
        String deviceName,
        String resourceGroupName,
        TriggerSupportPackageRequest triggerSupportPackageRequest,
        Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            triggerSupportPackageWithResponseAsync(
                deviceName, resourceGroupName, triggerSupportPackageRequest, context);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, context);
    }

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<Void>, Void> beginTriggerSupportPackage(
        String deviceName, String resourceGroupName, TriggerSupportPackageRequest triggerSupportPackageRequest) {
        return beginTriggerSupportPackageAsync(deviceName, resourceGroupName, triggerSupportPackageRequest)
            .getSyncPoller();
    }

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<Void>, Void> beginTriggerSupportPackage(
        String deviceName,
        String resourceGroupName,
        TriggerSupportPackageRequest triggerSupportPackageRequest,
        Context context) {
        return beginTriggerSupportPackageAsync(deviceName, resourceGroupName, triggerSupportPackageRequest, context)
            .getSyncPoller();
    }

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> triggerSupportPackageAsync(
        String deviceName, String resourceGroupName, TriggerSupportPackageRequest triggerSupportPackageRequest) {
        return beginTriggerSupportPackageAsync(deviceName, resourceGroupName, triggerSupportPackageRequest)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> triggerSupportPackageAsync(
        String deviceName,
        String resourceGroupName,
        TriggerSupportPackageRequest triggerSupportPackageRequest,
        Context context) {
        return beginTriggerSupportPackageAsync(deviceName, resourceGroupName, triggerSupportPackageRequest, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void triggerSupportPackage(
        String deviceName, String resourceGroupName, TriggerSupportPackageRequest triggerSupportPackageRequest) {
        triggerSupportPackageAsync(deviceName, resourceGroupName, triggerSupportPackageRequest).block();
    }

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void triggerSupportPackage(
        String deviceName,
        String resourceGroupName,
        TriggerSupportPackageRequest triggerSupportPackageRequest,
        Context context) {
        triggerSupportPackageAsync(deviceName, resourceGroupName, triggerSupportPackageRequest, context).block();
    }
}
