// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

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
import com.azure.resourcemanager.sql.generated.fluent.ManagedDatabaseSecurityEventsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.SecurityEventInner;
import com.azure.resourcemanager.sql.generated.models.SecurityEventCollection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ManagedDatabaseSecurityEventsClient. */
public final class ManagedDatabaseSecurityEventsClientImpl implements ManagedDatabaseSecurityEventsClient {
    private final ClientLogger logger = new ClientLogger(ManagedDatabaseSecurityEventsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ManagedDatabaseSecurityEventsService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedDatabaseSecurityEventsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ManagedDatabaseSecurityEventsClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ManagedDatabaseSecurityEventsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientManagedDatabaseSecurityEvents to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientM")
    private interface ManagedDatabaseSecurityEventsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/databases/{databaseName}/securityEvents")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SecurityEventCollection>> listByDatabase(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("databaseName") String databaseName,
            @QueryParam("$filter") String filter,
            @QueryParam("$skip") Integer skip,
            @QueryParam("$top") Integer top,
            @QueryParam("$skiptoken") String skiptoken,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SecurityEventCollection>> listByDatabaseNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a list of security events.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security events are retrieved.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param skiptoken An opaque token that identifies a starting point in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecurityEventInner>> listByDatabaseSinglePageAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String filter,
        Integer skip,
        Integer top,
        String skiptoken) {
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
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByDatabase(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            managedInstanceName,
                            databaseName,
                            filter,
                            skip,
                            top,
                            skiptoken,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<SecurityEventInner>>map(
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
     * Gets a list of security events.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security events are retrieved.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param skiptoken An opaque token that identifies a starting point in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecurityEventInner>> listByDatabaseSinglePageAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String filter,
        Integer skip,
        Integer top,
        String skiptoken,
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
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByDatabase(
                this.client.getEndpoint(),
                resourceGroupName,
                managedInstanceName,
                databaseName,
                filter,
                skip,
                top,
                skiptoken,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
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
     * Gets a list of security events.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security events are retrieved.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param skiptoken An opaque token that identifies a starting point in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SecurityEventInner> listByDatabaseAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String filter,
        Integer skip,
        Integer top,
        String skiptoken) {
        return new PagedFlux<>(
            () ->
                listByDatabaseSinglePageAsync(
                    resourceGroupName, managedInstanceName, databaseName, filter, skip, top, skiptoken),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of security events.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security events are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SecurityEventInner> listByDatabaseAsync(
        String resourceGroupName, String managedInstanceName, String databaseName) {
        final String filter = null;
        final Integer skip = null;
        final Integer top = null;
        final String skiptoken = null;
        return new PagedFlux<>(
            () ->
                listByDatabaseSinglePageAsync(
                    resourceGroupName, managedInstanceName, databaseName, filter, skip, top, skiptoken),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of security events.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security events are retrieved.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param skiptoken An opaque token that identifies a starting point in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SecurityEventInner> listByDatabaseAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String filter,
        Integer skip,
        Integer top,
        String skiptoken,
        Context context) {
        return new PagedFlux<>(
            () ->
                listByDatabaseSinglePageAsync(
                    resourceGroupName, managedInstanceName, databaseName, filter, skip, top, skiptoken, context),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of security events.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security events are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SecurityEventInner> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName) {
        final String filter = null;
        final Integer skip = null;
        final Integer top = null;
        final String skiptoken = null;
        return new PagedIterable<>(
            listByDatabaseAsync(resourceGroupName, managedInstanceName, databaseName, filter, skip, top, skiptoken));
    }

    /**
     * Gets a list of security events.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security events are retrieved.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param skiptoken An opaque token that identifies a starting point in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SecurityEventInner> listByDatabase(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String filter,
        Integer skip,
        Integer top,
        String skiptoken,
        Context context) {
        return new PagedIterable<>(
            listByDatabaseAsync(
                resourceGroupName, managedInstanceName, databaseName, filter, skip, top, skiptoken, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecurityEventInner>> listByDatabaseNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listByDatabaseNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<SecurityEventInner>>map(
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
     * @return a list of security events.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecurityEventInner>> listByDatabaseNextSinglePageAsync(
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
            .listByDatabaseNext(nextLink, this.client.getEndpoint(), accept, context)
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
