// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

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
import com.azure.resourcemanager.providerhub.fluent.CustomRolloutsClient;
import com.azure.resourcemanager.providerhub.fluent.models.CustomRolloutInner;
import com.azure.resourcemanager.providerhub.models.CustomRolloutArrayResponseWithContinuation;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CustomRolloutsClient. */
public final class CustomRolloutsClientImpl implements CustomRolloutsClient {
    private final ClientLogger logger = new ClientLogger(CustomRolloutsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final CustomRolloutsService service;

    /** The service client containing this operation class. */
    private final ProviderHubImpl client;

    /**
     * Initializes an instance of CustomRolloutsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CustomRolloutsClientImpl(ProviderHubImpl client) {
        this.service =
            RestProxy.create(CustomRolloutsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ProviderHubCustomRollouts to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ProviderHubCustomRol")
    private interface CustomRolloutsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ProviderHub/providerRegistrations/{providerNamespace}"
                + "/customRollouts/{rolloutName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CustomRolloutInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("providerNamespace") String providerNamespace,
            @PathParam("rolloutName") String rolloutName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ProviderHub/providerRegistrations/{providerNamespace}"
                + "/customRollouts/{rolloutName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CustomRolloutInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("providerNamespace") String providerNamespace,
            @PathParam("rolloutName") String rolloutName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CustomRolloutInner properties,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ProviderHub/providerRegistrations/{providerNamespace}"
                + "/customRollouts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CustomRolloutArrayResponseWithContinuation>> listByProviderRegistration(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("providerNamespace") String providerNamespace,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CustomRolloutArrayResponseWithContinuation>> listByProviderRegistrationNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the custom rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the custom rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CustomRolloutInner>> getWithResponseAsync(String providerNamespace, String rolloutName) {
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
        if (providerNamespace == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter providerNamespace is required and cannot be null."));
        }
        if (rolloutName == null) {
            return Mono.error(new IllegalArgumentException("Parameter rolloutName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            providerNamespace,
                            rolloutName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the custom rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the custom rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CustomRolloutInner>> getWithResponseAsync(
        String providerNamespace, String rolloutName, Context context) {
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
        if (providerNamespace == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter providerNamespace is required and cannot be null."));
        }
        if (rolloutName == null) {
            return Mono.error(new IllegalArgumentException("Parameter rolloutName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                providerNamespace,
                rolloutName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets the custom rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the custom rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CustomRolloutInner> getAsync(String providerNamespace, String rolloutName) {
        return getWithResponseAsync(providerNamespace, rolloutName)
            .flatMap(
                (Response<CustomRolloutInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the custom rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the custom rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CustomRolloutInner get(String providerNamespace, String rolloutName) {
        return getAsync(providerNamespace, rolloutName).block();
    }

    /**
     * Gets the custom rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the custom rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CustomRolloutInner> getWithResponse(String providerNamespace, String rolloutName, Context context) {
        return getWithResponseAsync(providerNamespace, rolloutName, context).block();
    }

    /**
     * Creates or updates the rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param properties The custom rollout properties supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CustomRolloutInner>> createOrUpdateWithResponseAsync(
        String providerNamespace, String rolloutName, CustomRolloutInner properties) {
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
        if (providerNamespace == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter providerNamespace is required and cannot be null."));
        }
        if (rolloutName == null) {
            return Mono.error(new IllegalArgumentException("Parameter rolloutName is required and cannot be null."));
        }
        if (properties == null) {
            return Mono.error(new IllegalArgumentException("Parameter properties is required and cannot be null."));
        } else {
            properties.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            providerNamespace,
                            rolloutName,
                            this.client.getApiVersion(),
                            properties,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates or updates the rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param properties The custom rollout properties supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CustomRolloutInner>> createOrUpdateWithResponseAsync(
        String providerNamespace, String rolloutName, CustomRolloutInner properties, Context context) {
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
        if (providerNamespace == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter providerNamespace is required and cannot be null."));
        }
        if (rolloutName == null) {
            return Mono.error(new IllegalArgumentException("Parameter rolloutName is required and cannot be null."));
        }
        if (properties == null) {
            return Mono.error(new IllegalArgumentException("Parameter properties is required and cannot be null."));
        } else {
            properties.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                providerNamespace,
                rolloutName,
                this.client.getApiVersion(),
                properties,
                accept,
                context);
    }

    /**
     * Creates or updates the rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param properties The custom rollout properties supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CustomRolloutInner> createOrUpdateAsync(
        String providerNamespace, String rolloutName, CustomRolloutInner properties) {
        return createOrUpdateWithResponseAsync(providerNamespace, rolloutName, properties)
            .flatMap(
                (Response<CustomRolloutInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates the rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param properties The custom rollout properties supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CustomRolloutInner createOrUpdate(
        String providerNamespace, String rolloutName, CustomRolloutInner properties) {
        return createOrUpdateAsync(providerNamespace, rolloutName, properties).block();
    }

    /**
     * Creates or updates the rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param properties The custom rollout properties supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CustomRolloutInner> createOrUpdateWithResponse(
        String providerNamespace, String rolloutName, CustomRolloutInner properties, Context context) {
        return createOrUpdateWithResponseAsync(providerNamespace, rolloutName, properties, context).block();
    }

    /**
     * Gets the list of the custom rollouts for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the custom rollouts for the given provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CustomRolloutInner>> listByProviderRegistrationSinglePageAsync(
        String providerNamespace) {
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
        if (providerNamespace == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter providerNamespace is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByProviderRegistration(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            providerNamespace,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<CustomRolloutInner>>map(
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
     * Gets the list of the custom rollouts for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the custom rollouts for the given provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CustomRolloutInner>> listByProviderRegistrationSinglePageAsync(
        String providerNamespace, Context context) {
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
        if (providerNamespace == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter providerNamespace is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByProviderRegistration(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                providerNamespace,
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
     * Gets the list of the custom rollouts for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the custom rollouts for the given provider.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CustomRolloutInner> listByProviderRegistrationAsync(String providerNamespace) {
        return new PagedFlux<>(
            () -> listByProviderRegistrationSinglePageAsync(providerNamespace),
            nextLink -> listByProviderRegistrationNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of the custom rollouts for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the custom rollouts for the given provider.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CustomRolloutInner> listByProviderRegistrationAsync(String providerNamespace, Context context) {
        return new PagedFlux<>(
            () -> listByProviderRegistrationSinglePageAsync(providerNamespace, context),
            nextLink -> listByProviderRegistrationNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the list of the custom rollouts for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the custom rollouts for the given provider.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CustomRolloutInner> listByProviderRegistration(String providerNamespace) {
        return new PagedIterable<>(listByProviderRegistrationAsync(providerNamespace));
    }

    /**
     * Gets the list of the custom rollouts for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the custom rollouts for the given provider.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CustomRolloutInner> listByProviderRegistration(String providerNamespace, Context context) {
        return new PagedIterable<>(listByProviderRegistrationAsync(providerNamespace, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CustomRolloutInner>> listByProviderRegistrationNextSinglePageAsync(String nextLink) {
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
                context -> service.listByProviderRegistrationNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<CustomRolloutInner>>map(
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
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CustomRolloutInner>> listByProviderRegistrationNextSinglePageAsync(
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
            .listByProviderRegistrationNext(nextLink, this.client.getEndpoint(), accept, context)
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
