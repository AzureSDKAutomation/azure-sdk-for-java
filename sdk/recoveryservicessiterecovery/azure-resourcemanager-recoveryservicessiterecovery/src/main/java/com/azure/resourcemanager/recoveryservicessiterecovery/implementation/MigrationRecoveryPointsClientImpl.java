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
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.MigrationRecoveryPointsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.MigrationRecoveryPointInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrationRecoveryPointCollection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MigrationRecoveryPointsClient. */
public final class MigrationRecoveryPointsClientImpl implements MigrationRecoveryPointsClient {
    private final ClientLogger logger = new ClientLogger(MigrationRecoveryPointsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final MigrationRecoveryPointsService service;

    /** The service client containing this operation class. */
    private final SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of MigrationRecoveryPointsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MigrationRecoveryPointsClientImpl(SiteRecoveryManagementClientImpl client) {
        this.service =
            RestProxy
                .create(MigrationRecoveryPointsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SiteRecoveryManagementClientMigrationRecoveryPoints to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SiteRecoveryManageme")
    private interface MigrationRecoveryPointsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationFabrics/{fabricName}/replicationProtectionContainers"
                + "/{protectionContainerName}/replicationMigrationItems/{migrationItemName}/migrationRecoveryPoints")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MigrationRecoveryPointCollection>> listByReplicationMigrationItems(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("protectionContainerName") String protectionContainerName,
            @PathParam("migrationItemName") String migrationItemName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationFabrics/{fabricName}/replicationProtectionContainers"
                + "/{protectionContainerName}/replicationMigrationItems/{migrationItemName}/migrationRecoveryPoints"
                + "/{migrationRecoveryPointName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MigrationRecoveryPointInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("protectionContainerName") String protectionContainerName,
            @PathParam("migrationItemName") String migrationItemName,
            @PathParam("migrationRecoveryPointName") String migrationRecoveryPointName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MigrationRecoveryPointCollection>> listByReplicationMigrationItemsNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the recovery points for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the recovery points for a migration item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MigrationRecoveryPointInner>> listByReplicationMigrationItemsSinglePageAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName) {
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
        if (migrationItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter migrationItemName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByReplicationMigrationItems(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            fabricName,
                            protectionContainerName,
                            migrationItemName,
                            accept,
                            context))
            .<PagedResponse<MigrationRecoveryPointInner>>map(
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
     * Gets the recovery points for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the recovery points for a migration item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MigrationRecoveryPointInner>> listByReplicationMigrationItemsSinglePageAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
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
        if (migrationItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter migrationItemName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByReplicationMigrationItems(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                resourceName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                fabricName,
                protectionContainerName,
                migrationItemName,
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
     * Gets the recovery points for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the recovery points for a migration item.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<MigrationRecoveryPointInner> listByReplicationMigrationItemsAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName) {
        return new PagedFlux<>(
            () ->
                listByReplicationMigrationItemsSinglePageAsync(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName),
            nextLink -> listByReplicationMigrationItemsNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the recovery points for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the recovery points for a migration item.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<MigrationRecoveryPointInner> listByReplicationMigrationItemsAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        Context context) {
        return new PagedFlux<>(
            () ->
                listByReplicationMigrationItemsSinglePageAsync(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName, context),
            nextLink -> listByReplicationMigrationItemsNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the recovery points for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the recovery points for a migration item.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MigrationRecoveryPointInner> listByReplicationMigrationItems(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName) {
        return new PagedIterable<>(
            listByReplicationMigrationItemsAsync(
                resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName));
    }

    /**
     * Gets the recovery points for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the recovery points for a migration item.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MigrationRecoveryPointInner> listByReplicationMigrationItems(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        Context context) {
        return new PagedIterable<>(
            listByReplicationMigrationItemsAsync(
                resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName, context));
    }

    /**
     * Gets a recovery point for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param migrationRecoveryPointName The migration recovery point name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recovery point for a migration item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MigrationRecoveryPointInner>> getWithResponseAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String migrationRecoveryPointName) {
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
        if (migrationItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter migrationItemName is required and cannot be null."));
        }
        if (migrationRecoveryPointName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter migrationRecoveryPointName is required and cannot be null."));
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
                            migrationItemName,
                            migrationRecoveryPointName,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a recovery point for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param migrationRecoveryPointName The migration recovery point name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recovery point for a migration item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MigrationRecoveryPointInner>> getWithResponseAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String migrationRecoveryPointName,
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
        if (migrationItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter migrationItemName is required and cannot be null."));
        }
        if (migrationRecoveryPointName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter migrationRecoveryPointName is required and cannot be null."));
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
                migrationItemName,
                migrationRecoveryPointName,
                accept,
                context);
    }

    /**
     * Gets a recovery point for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param migrationRecoveryPointName The migration recovery point name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recovery point for a migration item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<MigrationRecoveryPointInner> getAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String migrationRecoveryPointName) {
        return getWithResponseAsync(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                migrationItemName,
                migrationRecoveryPointName)
            .flatMap(
                (Response<MigrationRecoveryPointInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a recovery point for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param migrationRecoveryPointName The migration recovery point name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recovery point for a migration item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MigrationRecoveryPointInner get(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String migrationRecoveryPointName) {
        return getAsync(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                migrationItemName,
                migrationRecoveryPointName)
            .block();
    }

    /**
     * Gets a recovery point for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param migrationRecoveryPointName The migration recovery point name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recovery point for a migration item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MigrationRecoveryPointInner> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String migrationRecoveryPointName,
        Context context) {
        return getWithResponseAsync(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                migrationItemName,
                migrationRecoveryPointName,
                context)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of migration recovery points.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MigrationRecoveryPointInner>> listByReplicationMigrationItemsNextSinglePageAsync(
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
                    service.listByReplicationMigrationItemsNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<MigrationRecoveryPointInner>>map(
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
     * @return collection of migration recovery points.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MigrationRecoveryPointInner>> listByReplicationMigrationItemsNextSinglePageAsync(
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
            .listByReplicationMigrationItemsNext(nextLink, this.client.getEndpoint(), accept, context)
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
