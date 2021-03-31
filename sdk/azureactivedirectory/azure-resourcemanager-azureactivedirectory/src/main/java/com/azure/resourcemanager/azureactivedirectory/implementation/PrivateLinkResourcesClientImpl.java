// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureactivedirectory.implementation;

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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azureactivedirectory.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.azureactivedirectory.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.azureactivedirectory.models.PrivateLinkResourceListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public final class PrivateLinkResourcesClientImpl implements PrivateLinkResourcesClient {
    private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PrivateLinkResourcesService service;

    /** The service client containing this operation class. */
    private final AzureactivedirectoryImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateLinkResourcesClientImpl(AzureactivedirectoryImpl client) {
        this.service =
            RestProxy
                .create(PrivateLinkResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureactivedirectoryPrivateLinkResources to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "Azureactivedirectory")
    private interface PrivateLinkResourcesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.aadiam"
                + "/privateLinkForAzureAd/{policyName}/privateLinkResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceListResult>> listByPrivateLinkPolicy(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("policyName") String policyName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.aadiam"
                + "/privateLinkForAzureAd/{policyName}/privateLinkResources/{groupName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("policyName") String policyName,
            @PathParam("groupName") String groupName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceListResult>> listByPrivateLinkPolicyNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the private link resources that need to be created for a policy of AzureAD.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param policyName The name of the private link policy in Azure AD.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a policy of AzureAD.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByPrivateLinkPolicySinglePageAsync(
        String resourceGroupName, String policyName) {
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
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        final String apiVersion = "2020-03-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByPrivateLinkPolicy(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            policyName,
                            apiVersion,
                            accept,
                            context))
            .<PagedResponse<PrivateLinkResourceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the private link resources that need to be created for a policy of AzureAD.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param policyName The name of the private link policy in Azure AD.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a policy of AzureAD.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByPrivateLinkPolicySinglePageAsync(
        String resourceGroupName, String policyName, Context context) {
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
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        final String apiVersion = "2020-03-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByPrivateLinkPolicy(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                policyName,
                apiVersion,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Gets the private link resources that need to be created for a policy of AzureAD.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param policyName The name of the private link policy in Azure AD.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a policy of AzureAD.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PrivateLinkResourceInner> listByPrivateLinkPolicyAsync(
        String resourceGroupName, String policyName) {
        return new PagedFlux<>(
            () -> listByPrivateLinkPolicySinglePageAsync(resourceGroupName, policyName),
            nextLink -> listByPrivateLinkPolicyNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the private link resources that need to be created for a policy of AzureAD.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param policyName The name of the private link policy in Azure AD.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a policy of AzureAD.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PrivateLinkResourceInner> listByPrivateLinkPolicyAsync(
        String resourceGroupName, String policyName, Context context) {
        return new PagedFlux<>(
            () -> listByPrivateLinkPolicySinglePageAsync(resourceGroupName, policyName, context),
            nextLink -> listByPrivateLinkPolicyNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the private link resources that need to be created for a policy of AzureAD.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param policyName The name of the private link policy in Azure AD.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a policy of AzureAD.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkResourceInner> listByPrivateLinkPolicy(
        String resourceGroupName, String policyName) {
        return new PagedIterable<>(listByPrivateLinkPolicyAsync(resourceGroupName, policyName));
    }

    /**
     * Gets the private link resources that need to be created for a policy of AzureAD.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param policyName The name of the private link policy in Azure AD.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a policy of AzureAD.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkResourceInner> listByPrivateLinkPolicy(
        String resourceGroupName, String policyName, Context context) {
        return new PagedIterable<>(listByPrivateLinkPolicyAsync(resourceGroupName, policyName, context));
    }

    /**
     * Gets the private link resources that need to be created for a policy of AzureAD.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param policyName The name of the private link policy in Azure AD.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a policy of AzureAD.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceInner>> getWithResponseAsync(
        String resourceGroupName, String policyName, String groupName) {
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
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        final String apiVersion = "2020-03-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            policyName,
                            groupName,
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the private link resources that need to be created for a policy of AzureAD.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param policyName The name of the private link policy in Azure AD.
     * @param groupName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a policy of AzureAD.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceInner>> getWithResponseAsync(
        String resourceGroupName, String policyName, String groupName, Context context) {
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
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        final String apiVersion = "2020-03-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                policyName,
                groupName,
                apiVersion,
                accept,
                context);
    }

    /**
     * Gets the private link resources that need to be created for a policy of AzureAD.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param policyName The name of the private link policy in Azure AD.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a policy of AzureAD.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateLinkResourceInner> getAsync(String resourceGroupName, String policyName, String groupName) {
        return getWithResponseAsync(resourceGroupName, policyName, groupName)
            .flatMap(
                (Response<PrivateLinkResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the private link resources that need to be created for a policy of AzureAD.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param policyName The name of the private link policy in Azure AD.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a policy of AzureAD.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkResourceInner get(String resourceGroupName, String policyName, String groupName) {
        return getAsync(resourceGroupName, policyName, groupName).block();
    }

    /**
     * Gets the private link resources that need to be created for a policy of AzureAD.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param policyName The name of the private link policy in Azure AD.
     * @param groupName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a policy of AzureAD.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateLinkResourceInner> getWithResponse(
        String resourceGroupName, String policyName, String groupName, Context context) {
        return getWithResponseAsync(resourceGroupName, policyName, groupName, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByPrivateLinkPolicyNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listByPrivateLinkPolicyNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<PrivateLinkResourceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByPrivateLinkPolicyNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByPrivateLinkPolicyNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
