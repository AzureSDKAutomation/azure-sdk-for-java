// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.network.generated.fluent.InboundSecurityRuleOperationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.InboundSecurityRuleInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in InboundSecurityRuleOperationsClient. */
public final class InboundSecurityRuleOperationsClientImpl implements InboundSecurityRuleOperationsClient {
    private final ClientLogger logger = new ClientLogger(InboundSecurityRuleOperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final InboundSecurityRuleOperationsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of InboundSecurityRuleOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    InboundSecurityRuleOperationsClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    InboundSecurityRuleOperationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientInboundSecurityRuleOperations to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface InboundSecurityRuleOperationsService {
        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/networkVirtualAppliances/{networkVirtualApplianceName}/inboundSecurityRules/{ruleCollectionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("networkVirtualApplianceName") String networkVirtualApplianceName,
            @PathParam("ruleCollectionName") String ruleCollectionName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") InboundSecurityRuleInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nVA Inbound Security Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String networkVirtualApplianceName,
        String ruleCollectionName,
        InboundSecurityRuleInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkVirtualApplianceName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter networkVirtualApplianceName is required and cannot be null."));
        }
        if (ruleCollectionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter ruleCollectionName is required and cannot be null."));
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
        final String apiVersion = "2021-02-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            networkVirtualApplianceName,
                            ruleCollectionName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nVA Inbound Security Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String networkVirtualApplianceName,
        String ruleCollectionName,
        InboundSecurityRuleInner parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkVirtualApplianceName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter networkVirtualApplianceName is required and cannot be null."));
        }
        if (ruleCollectionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter ruleCollectionName is required and cannot be null."));
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
        final String apiVersion = "2021-02-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                resourceGroupName,
                networkVirtualApplianceName,
                ruleCollectionName,
                apiVersion,
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nVA Inbound Security Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<InboundSecurityRuleInner>, InboundSecurityRuleInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String networkVirtualApplianceName,
        String ruleCollectionName,
        InboundSecurityRuleInner parameters) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            createOrUpdateWithResponseAsync(
                resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters);
        return this
            .client
            .<InboundSecurityRuleInner, InboundSecurityRuleInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                InboundSecurityRuleInner.class,
                InboundSecurityRuleInner.class,
                Context.NONE);
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nVA Inbound Security Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<InboundSecurityRuleInner>, InboundSecurityRuleInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String networkVirtualApplianceName,
        String ruleCollectionName,
        InboundSecurityRuleInner parameters,
        Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            createOrUpdateWithResponseAsync(
                resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters, context);
        return this
            .client
            .<InboundSecurityRuleInner, InboundSecurityRuleInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                InboundSecurityRuleInner.class,
                InboundSecurityRuleInner.class,
                context);
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nVA Inbound Security Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<InboundSecurityRuleInner>, InboundSecurityRuleInner> beginCreateOrUpdate(
        String resourceGroupName,
        String networkVirtualApplianceName,
        String ruleCollectionName,
        InboundSecurityRuleInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters)
            .getSyncPoller();
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nVA Inbound Security Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<InboundSecurityRuleInner>, InboundSecurityRuleInner> beginCreateOrUpdate(
        String resourceGroupName,
        String networkVirtualApplianceName,
        String ruleCollectionName,
        InboundSecurityRuleInner parameters,
        Context context) {
        return beginCreateOrUpdateAsync(
                resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters, context)
            .getSyncPoller();
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nVA Inbound Security Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<InboundSecurityRuleInner> createOrUpdateAsync(
        String resourceGroupName,
        String networkVirtualApplianceName,
        String ruleCollectionName,
        InboundSecurityRuleInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nVA Inbound Security Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<InboundSecurityRuleInner> createOrUpdateAsync(
        String resourceGroupName,
        String networkVirtualApplianceName,
        String ruleCollectionName,
        InboundSecurityRuleInner parameters,
        Context context) {
        return beginCreateOrUpdateAsync(
                resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nVA Inbound Security Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InboundSecurityRuleInner createOrUpdate(
        String resourceGroupName,
        String networkVirtualApplianceName,
        String ruleCollectionName,
        InboundSecurityRuleInner parameters) {
        return createOrUpdateAsync(resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters)
            .block();
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nVA Inbound Security Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InboundSecurityRuleInner createOrUpdate(
        String resourceGroupName,
        String networkVirtualApplianceName,
        String ruleCollectionName,
        InboundSecurityRuleInner parameters,
        Context context) {
        return createOrUpdateAsync(
                resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters, context)
            .block();
    }
}
