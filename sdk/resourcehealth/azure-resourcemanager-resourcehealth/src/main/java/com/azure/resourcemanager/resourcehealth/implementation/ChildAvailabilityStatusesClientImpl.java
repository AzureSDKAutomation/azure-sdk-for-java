// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.implementation;

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
import com.azure.resourcemanager.resourcehealth.fluent.ChildAvailabilityStatusesClient;
import com.azure.resourcemanager.resourcehealth.fluent.models.AvailabilityStatusInner;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStatusListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ChildAvailabilityStatusesClient. */
public final class ChildAvailabilityStatusesClientImpl implements ChildAvailabilityStatusesClient {
    private final ClientLogger logger = new ClientLogger(ChildAvailabilityStatusesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ChildAvailabilityStatusesService service;

    /** The service client containing this operation class. */
    private final MicrosoftResourceHealthImpl client;

    /**
     * Initializes an instance of ChildAvailabilityStatusesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ChildAvailabilityStatusesClientImpl(MicrosoftResourceHealthImpl client) {
        this.service =
            RestProxy
                .create(
                    ChildAvailabilityStatusesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftResourceHealthChildAvailabilityStatuses to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftResourceHea")
    private interface ChildAvailabilityStatusesService {
        @Headers({"Content-Type: application/json"})
        @Get("/{resourceUri}/providers/Microsoft.ResourceHealth/childAvailabilityStatuses/current")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AvailabilityStatusInner>> getByResource(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            @QueryParam("$expand") String expand,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/{resourceUri}/providers/Microsoft.ResourceHealth/childAvailabilityStatuses")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AvailabilityStatusListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            @QueryParam("$expand") String expand,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AvailabilityStatusListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets current availability status for a single resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return current availability status for a single resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AvailabilityStatusInner>> getByResourceWithResponseAsync(
        String resourceUri, String filter, String expand) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByResource(
                            this.client.getEndpoint(),
                            resourceUri,
                            this.client.getApiVersion(),
                            filter,
                            expand,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets current availability status for a single resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return current availability status for a single resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AvailabilityStatusInner>> getByResourceWithResponseAsync(
        String resourceUri, String filter, String expand, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByResource(
                this.client.getEndpoint(), resourceUri, this.client.getApiVersion(), filter, expand, accept, context);
    }

    /**
     * Gets current availability status for a single resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return current availability status for a single resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AvailabilityStatusInner> getByResourceAsync(String resourceUri, String filter, String expand) {
        return getByResourceWithResponseAsync(resourceUri, filter, expand)
            .flatMap(
                (Response<AvailabilityStatusInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets current availability status for a single resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return current availability status for a single resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AvailabilityStatusInner> getByResourceAsync(String resourceUri) {
        final String filter = null;
        final String expand = null;
        return getByResourceWithResponseAsync(resourceUri, filter, expand)
            .flatMap(
                (Response<AvailabilityStatusInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets current availability status for a single resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return current availability status for a single resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AvailabilityStatusInner getByResource(String resourceUri) {
        final String filter = null;
        final String expand = null;
        return getByResourceAsync(resourceUri, filter, expand).block();
    }

    /**
     * Gets current availability status for a single resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return current availability status for a single resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AvailabilityStatusInner> getByResourceWithResponse(
        String resourceUri, String filter, String expand, Context context) {
        return getByResourceWithResponseAsync(resourceUri, filter, expand, context).block();
    }

    /**
     * Lists the historical availability statuses for a single child resource. Use the nextLink property in the response
     * to get the next page of availability status.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AvailabilityStatusInner>> listSinglePageAsync(
        String resourceUri, String filter, String expand) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            resourceUri,
                            this.client.getApiVersion(),
                            filter,
                            expand,
                            accept,
                            context))
            .<PagedResponse<AvailabilityStatusInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists the historical availability statuses for a single child resource. Use the nextLink property in the response
     * to get the next page of availability status.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AvailabilityStatusInner>> listSinglePageAsync(
        String resourceUri, String filter, String expand, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), resourceUri, this.client.getApiVersion(), filter, expand, accept, context)
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
     * Lists the historical availability statuses for a single child resource. Use the nextLink property in the response
     * to get the next page of availability status.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AvailabilityStatusInner> listAsync(String resourceUri, String filter, String expand) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceUri, filter, expand), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the historical availability statuses for a single child resource. Use the nextLink property in the response
     * to get the next page of availability status.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AvailabilityStatusInner> listAsync(String resourceUri) {
        final String filter = null;
        final String expand = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceUri, filter, expand), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the historical availability statuses for a single child resource. Use the nextLink property in the response
     * to get the next page of availability status.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AvailabilityStatusInner> listAsync(
        String resourceUri, String filter, String expand, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceUri, filter, expand, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the historical availability statuses for a single child resource. Use the nextLink property in the response
     * to get the next page of availability status.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailabilityStatusInner> list(String resourceUri) {
        final String filter = null;
        final String expand = null;
        return new PagedIterable<>(listAsync(resourceUri, filter, expand));
    }

    /**
     * Lists the historical availability statuses for a single child resource. Use the nextLink property in the response
     * to get the next page of availability status.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API only support one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailabilityStatusInner> list(
        String resourceUri, String filter, String expand, Context context) {
        return new PagedIterable<>(listAsync(resourceUri, filter, expand, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AvailabilityStatusInner>> listNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<AvailabilityStatusInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AvailabilityStatusInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
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
