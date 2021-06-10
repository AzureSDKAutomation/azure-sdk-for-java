// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

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
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationProtectableItemsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectableItemInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectableItemCollection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ReplicationProtectableItemsClient. */
public final class ReplicationProtectableItemsClientImpl implements ReplicationProtectableItemsClient {
    private final ClientLogger logger = new ClientLogger(ReplicationProtectableItemsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ReplicationProtectableItemsService service;

    /** The service client containing this operation class. */
    private final SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of ReplicationProtectableItemsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ReplicationProtectableItemsClientImpl(SiteRecoveryManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ReplicationProtectableItemsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SiteRecoveryManagementClientReplicationProtectableItems to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SiteRecoveryManageme")
    private interface ReplicationProtectableItemsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationFabrics/{fabricName}/replicationProtectionContainers"
                + "/{protectionContainerName}/replicationProtectableItems")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProtectableItemCollection>> listByReplicationProtectionContainers(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("protectionContainerName") String protectionContainerName,
            @QueryParam("$filter") String filter,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationFabrics/{fabricName}/replicationProtectionContainers"
                + "/{protectionContainerName}/replicationProtectableItems/{protectableItemName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProtectableItemInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("protectionContainerName") String protectionContainerName,
            @PathParam("protectableItemName") String protectableItemName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProtectableItemCollection>> listByReplicationProtectionContainersNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists the protectable items in a protection container.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protectable item collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProtectableItemInner>> listByReplicationProtectionContainersSinglePageAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
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
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (protectionContainerName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter protectionContainerName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByReplicationProtectionContainers(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            fabricName,
                            protectionContainerName,
                            filter,
                            accept,
                            context))
            .<PagedResponse<ProtectableItemInner>>map(
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
     * Lists the protectable items in a protection container.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protectable item collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProtectableItemInner>> listByReplicationProtectionContainersSinglePageAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String filter,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
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
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (protectionContainerName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter protectionContainerName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByReplicationProtectionContainers(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                resourceName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                fabricName,
                protectionContainerName,
                filter,
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
     * Lists the protectable items in a protection container.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protectable item collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ProtectableItemInner> listByReplicationProtectionContainersAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String filter) {
        return new PagedFlux<>(
            () ->
                listByReplicationProtectionContainersSinglePageAsync(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, filter),
            nextLink -> listByReplicationProtectionContainersNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the protectable items in a protection container.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protectable item collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ProtectableItemInner> listByReplicationProtectionContainersAsync(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName) {
        final String filter = null;
        return new PagedFlux<>(
            () ->
                listByReplicationProtectionContainersSinglePageAsync(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, filter),
            nextLink -> listByReplicationProtectionContainersNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the protectable items in a protection container.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protectable item collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ProtectableItemInner> listByReplicationProtectionContainersAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String filter,
        Context context) {
        return new PagedFlux<>(
            () ->
                listByReplicationProtectionContainersSinglePageAsync(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, filter, context),
            nextLink -> listByReplicationProtectionContainersNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the protectable items in a protection container.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protectable item collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProtectableItemInner> listByReplicationProtectionContainers(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName) {
        final String filter = null;
        return new PagedIterable<>(
            listByReplicationProtectionContainersAsync(
                resourceName, resourceGroupName, fabricName, protectionContainerName, filter));
    }

    /**
     * Lists the protectable items in a protection container.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protectable item collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProtectableItemInner> listByReplicationProtectionContainers(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String filter,
        Context context) {
        return new PagedIterable<>(
            listByReplicationProtectionContainersAsync(
                resourceName, resourceGroupName, fabricName, protectionContainerName, filter, context));
    }

    /**
     * The operation to get the details of a protectable item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param protectableItemName Protectable item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProtectableItemInner>> getWithResponseAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String protectableItemName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
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
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (protectionContainerName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter protectionContainerName is required and cannot be null."));
        }
        if (protectableItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter protectableItemName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            fabricName,
                            protectionContainerName,
                            protectableItemName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * The operation to get the details of a protectable item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param protectableItemName Protectable item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProtectableItemInner>> getWithResponseAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String protectableItemName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
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
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (protectionContainerName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter protectionContainerName is required and cannot be null."));
        }
        if (protectableItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter protectableItemName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                resourceName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                fabricName,
                protectionContainerName,
                protectableItemName,
                accept,
                context);
    }

    /**
     * The operation to get the details of a protectable item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param protectableItemName Protectable item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ProtectableItemInner> getAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String protectableItemName) {
        return getWithResponseAsync(
                resourceName, resourceGroupName, fabricName, protectionContainerName, protectableItemName)
            .flatMap(
                (Response<ProtectableItemInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * The operation to get the details of a protectable item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param protectableItemName Protectable item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProtectableItemInner get(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String protectableItemName) {
        return getAsync(resourceName, resourceGroupName, fabricName, protectionContainerName, protectableItemName)
            .block();
    }

    /**
     * The operation to get the details of a protectable item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param protectableItemName Protectable item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ProtectableItemInner> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String protectableItemName,
        Context context) {
        return getWithResponseAsync(
                resourceName, resourceGroupName, fabricName, protectionContainerName, protectableItemName, context)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protectable item collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProtectableItemInner>> listByReplicationProtectionContainersNextSinglePageAsync(
        String nextLink) {
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
                context ->
                    service
                        .listByReplicationProtectionContainersNext(
                            nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<ProtectableItemInner>>map(
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
     * @return protectable item collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProtectableItemInner>> listByReplicationProtectionContainersNextSinglePageAsync(
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
            .listByReplicationProtectionContainersNext(nextLink, this.client.getEndpoint(), accept, context)
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
