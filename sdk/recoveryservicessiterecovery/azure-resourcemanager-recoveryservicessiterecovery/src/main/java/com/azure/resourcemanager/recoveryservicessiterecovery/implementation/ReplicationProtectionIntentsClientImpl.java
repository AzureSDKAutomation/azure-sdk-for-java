// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationProtectionIntentsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationProtectionIntentInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateProtectionIntentInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectionIntentCollection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ReplicationProtectionIntentsClient. */
public final class ReplicationProtectionIntentsClientImpl implements ReplicationProtectionIntentsClient {
    private final ClientLogger logger = new ClientLogger(ReplicationProtectionIntentsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ReplicationProtectionIntentsService service;

    /** The service client containing this operation class. */
    private final SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of ReplicationProtectionIntentsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ReplicationProtectionIntentsClientImpl(SiteRecoveryManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ReplicationProtectionIntentsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SiteRecoveryManagementClientReplicationProtectionIntents to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SiteRecoveryManageme")
    private interface ReplicationProtectionIntentsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationProtectionIntents")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReplicationProtectionIntentCollection>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationProtectionIntents/{intentObjectName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReplicationProtectionIntentInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("intentObjectName") String intentObjectName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationProtectionIntents/{intentObjectName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReplicationProtectionIntentInner>> create(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("intentObjectName") String intentObjectName,
            @BodyParam("application/json") CreateProtectionIntentInput input,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReplicationProtectionIntentCollection>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the list of ASR replication protection intent objects in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ASR replication protection intent objects in the vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReplicationProtectionIntentInner>> listSinglePageAsync(
        String resourceName, String resourceGroupName) {
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
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .<PagedResponse<ReplicationProtectionIntentInner>>map(
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
     * Gets the list of ASR replication protection intent objects in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ASR replication protection intent objects in the vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReplicationProtectionIntentInner>> listSinglePageAsync(
        String resourceName, String resourceGroupName, Context context) {
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
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                resourceName,
                resourceGroupName,
                this.client.getSubscriptionId(),
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
     * Gets the list of ASR replication protection intent objects in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ASR replication protection intent objects in the vault.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ReplicationProtectionIntentInner> listAsync(String resourceName, String resourceGroupName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceName, resourceGroupName), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of ASR replication protection intent objects in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ASR replication protection intent objects in the vault.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ReplicationProtectionIntentInner> listAsync(
        String resourceName, String resourceGroupName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceName, resourceGroupName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the list of ASR replication protection intent objects in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ASR replication protection intent objects in the vault.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ReplicationProtectionIntentInner> list(String resourceName, String resourceGroupName) {
        return new PagedIterable<>(listAsync(resourceName, resourceGroupName));
    }

    /**
     * Gets the list of ASR replication protection intent objects in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ASR replication protection intent objects in the vault.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ReplicationProtectionIntentInner> list(
        String resourceName, String resourceGroupName, Context context) {
        return new PagedIterable<>(listAsync(resourceName, resourceGroupName, context));
    }

    /**
     * Gets the details of an ASR replication protection intent.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName Replication protection intent name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR replication protection intent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicationProtectionIntentInner>> getWithResponseAsync(
        String resourceName, String resourceGroupName, String intentObjectName) {
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
        if (intentObjectName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter intentObjectName is required and cannot be null."));
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
                            intentObjectName,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the details of an ASR replication protection intent.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName Replication protection intent name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR replication protection intent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicationProtectionIntentInner>> getWithResponseAsync(
        String resourceName, String resourceGroupName, String intentObjectName, Context context) {
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
        if (intentObjectName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter intentObjectName is required and cannot be null."));
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
                intentObjectName,
                accept,
                context);
    }

    /**
     * Gets the details of an ASR replication protection intent.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName Replication protection intent name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR replication protection intent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ReplicationProtectionIntentInner> getAsync(
        String resourceName, String resourceGroupName, String intentObjectName) {
        return getWithResponseAsync(resourceName, resourceGroupName, intentObjectName)
            .flatMap(
                (Response<ReplicationProtectionIntentInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the details of an ASR replication protection intent.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName Replication protection intent name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR replication protection intent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReplicationProtectionIntentInner get(
        String resourceName, String resourceGroupName, String intentObjectName) {
        return getAsync(resourceName, resourceGroupName, intentObjectName).block();
    }

    /**
     * Gets the details of an ASR replication protection intent.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName Replication protection intent name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR replication protection intent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReplicationProtectionIntentInner> getWithResponse(
        String resourceName, String resourceGroupName, String intentObjectName, Context context) {
        return getWithResponseAsync(resourceName, resourceGroupName, intentObjectName, context).block();
    }

    /**
     * The operation to create an ASR replication protection intent item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName A name for the replication protection item.
     * @param input Create Protection Intent Input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protection intent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicationProtectionIntentInner>> createWithResponseAsync(
        String resourceName, String resourceGroupName, String intentObjectName, CreateProtectionIntentInput input) {
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
        if (intentObjectName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter intentObjectName is required and cannot be null."));
        }
        if (input == null) {
            return Mono.error(new IllegalArgumentException("Parameter input is required and cannot be null."));
        } else {
            input.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            intentObjectName,
                            input,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * The operation to create an ASR replication protection intent item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName A name for the replication protection item.
     * @param input Create Protection Intent Input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protection intent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReplicationProtectionIntentInner>> createWithResponseAsync(
        String resourceName,
        String resourceGroupName,
        String intentObjectName,
        CreateProtectionIntentInput input,
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
        if (intentObjectName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter intentObjectName is required and cannot be null."));
        }
        if (input == null) {
            return Mono.error(new IllegalArgumentException("Parameter input is required and cannot be null."));
        } else {
            input.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .create(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                resourceName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                intentObjectName,
                input,
                accept,
                context);
    }

    /**
     * The operation to create an ASR replication protection intent item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName A name for the replication protection item.
     * @param input Create Protection Intent Input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protection intent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ReplicationProtectionIntentInner> createAsync(
        String resourceName, String resourceGroupName, String intentObjectName, CreateProtectionIntentInput input) {
        return createWithResponseAsync(resourceName, resourceGroupName, intentObjectName, input)
            .flatMap(
                (Response<ReplicationProtectionIntentInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * The operation to create an ASR replication protection intent item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName A name for the replication protection item.
     * @param input Create Protection Intent Input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protection intent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReplicationProtectionIntentInner create(
        String resourceName, String resourceGroupName, String intentObjectName, CreateProtectionIntentInput input) {
        return createAsync(resourceName, resourceGroupName, intentObjectName, input).block();
    }

    /**
     * The operation to create an ASR replication protection intent item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param intentObjectName A name for the replication protection item.
     * @param input Create Protection Intent Input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protection intent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReplicationProtectionIntentInner> createWithResponse(
        String resourceName,
        String resourceGroupName,
        String intentObjectName,
        CreateProtectionIntentInput input,
        Context context) {
        return createWithResponseAsync(resourceName, resourceGroupName, intentObjectName, input, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protection intent objects collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReplicationProtectionIntentInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<ReplicationProtectionIntentInner>>map(
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
     * @return replication protection intent objects collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReplicationProtectionIntentInner>> listNextSinglePageAsync(
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
