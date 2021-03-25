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
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationVaultSettingsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.VaultSettingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VaultSettingCollection;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VaultSettingCreationInput;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ReplicationVaultSettingsClient. */
public final class ReplicationVaultSettingsClientImpl implements ReplicationVaultSettingsClient {
    private final ClientLogger logger = new ClientLogger(ReplicationVaultSettingsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ReplicationVaultSettingsService service;

    /** The service client containing this operation class. */
    private final SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of ReplicationVaultSettingsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ReplicationVaultSettingsClientImpl(SiteRecoveryManagementClientImpl client) {
        this.service =
            RestProxy
                .create(ReplicationVaultSettingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SiteRecoveryManagementClientReplicationVaultSettings to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SiteRecoveryManageme")
    private interface ReplicationVaultSettingsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationVaultSettings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VaultSettingCollection>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationVaultSettings/{vaultSettingName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VaultSettingInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("vaultSettingName") String vaultSettingName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationVaultSettings/{vaultSettingName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VaultSettingInner>> create(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("vaultSettingName") String vaultSettingName,
            @BodyParam("application/json") VaultSettingCreationInput input,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VaultSettingCollection>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the list of vault setting. This includes the Migration Hub connection settings.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VaultSettingInner>> listSinglePageAsync(String resourceName, String resourceGroupName) {
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
            .<PagedResponse<VaultSettingInner>>map(
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
     * Gets the list of vault setting. This includes the Migration Hub connection settings.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VaultSettingInner>> listSinglePageAsync(
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
     * Gets the list of vault setting. This includes the Migration Hub connection settings.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of vault setting.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<VaultSettingInner> listAsync(String resourceName, String resourceGroupName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceName, resourceGroupName), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of vault setting. This includes the Migration Hub connection settings.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of vault setting.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<VaultSettingInner> listAsync(String resourceName, String resourceGroupName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceName, resourceGroupName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the list of vault setting. This includes the Migration Hub connection settings.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of vault setting.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VaultSettingInner> list(String resourceName, String resourceGroupName) {
        return new PagedIterable<>(listAsync(resourceName, resourceGroupName));
    }

    /**
     * Gets the list of vault setting. This includes the Migration Hub connection settings.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of vault setting.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VaultSettingInner> list(String resourceName, String resourceGroupName, Context context) {
        return new PagedIterable<>(listAsync(resourceName, resourceGroupName, context));
    }

    /**
     * Gets the vault setting. This includes the Migration Hub connection settings.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VaultSettingInner>> getWithResponseAsync(
        String resourceName, String resourceGroupName, String vaultSettingName) {
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
        if (vaultSettingName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter vaultSettingName is required and cannot be null."));
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
                            vaultSettingName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the vault setting. This includes the Migration Hub connection settings.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VaultSettingInner>> getWithResponseAsync(
        String resourceName, String resourceGroupName, String vaultSettingName, Context context) {
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
        if (vaultSettingName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter vaultSettingName is required and cannot be null."));
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
                vaultSettingName,
                accept,
                context);
    }

    /**
     * Gets the vault setting. This includes the Migration Hub connection settings.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VaultSettingInner> getAsync(String resourceName, String resourceGroupName, String vaultSettingName) {
        return getWithResponseAsync(resourceName, resourceGroupName, vaultSettingName)
            .flatMap(
                (Response<VaultSettingInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the vault setting. This includes the Migration Hub connection settings.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VaultSettingInner get(String resourceName, String resourceGroupName, String vaultSettingName) {
        return getAsync(resourceName, resourceGroupName, vaultSettingName).block();
    }

    /**
     * Gets the vault setting. This includes the Migration Hub connection settings.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VaultSettingInner> getWithResponse(
        String resourceName, String resourceGroupName, String vaultSettingName, Context context) {
        return getWithResponseAsync(resourceName, resourceGroupName, vaultSettingName, context).block();
    }

    /**
     * The operation to configure vault setting.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @param input Vault setting creation input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VaultSettingInner>> createWithResponseAsync(
        String resourceName, String resourceGroupName, String vaultSettingName, VaultSettingCreationInput input) {
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
        if (vaultSettingName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter vaultSettingName is required and cannot be null."));
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
                            vaultSettingName,
                            input,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * The operation to configure vault setting.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @param input Vault setting creation input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VaultSettingInner>> createWithResponseAsync(
        String resourceName,
        String resourceGroupName,
        String vaultSettingName,
        VaultSettingCreationInput input,
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
        if (vaultSettingName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter vaultSettingName is required and cannot be null."));
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
                vaultSettingName,
                input,
                accept,
                context);
    }

    /**
     * The operation to configure vault setting.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @param input Vault setting creation input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VaultSettingInner> createAsync(
        String resourceName, String resourceGroupName, String vaultSettingName, VaultSettingCreationInput input) {
        return createWithResponseAsync(resourceName, resourceGroupName, vaultSettingName, input)
            .flatMap(
                (Response<VaultSettingInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * The operation to configure vault setting.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @param input Vault setting creation input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VaultSettingInner create(
        String resourceName, String resourceGroupName, String vaultSettingName, VaultSettingCreationInput input) {
        return createAsync(resourceName, resourceGroupName, vaultSettingName, input).block();
    }

    /**
     * The operation to configure vault setting.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @param input Vault setting creation input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vault setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VaultSettingInner> createWithResponse(
        String resourceName,
        String resourceGroupName,
        String vaultSettingName,
        VaultSettingCreationInput input,
        Context context) {
        return createWithResponseAsync(resourceName, resourceGroupName, vaultSettingName, input, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vault setting collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VaultSettingInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<VaultSettingInner>>map(
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
     * @return vault setting collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VaultSettingInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
