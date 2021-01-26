// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.providerhub.fluent.models.CheckinManifestInfoInner;
import com.azure.resourcemanager.providerhub.fluent.models.ResourceProviderManifestAutoGeneratedInner;
import com.azure.resourcemanager.providerhub.fluent.models.ResourceProviderManifestInner;
import com.azure.resourcemanager.providerhub.models.ErrorAutoGeneratedException;
import com.azure.resourcemanager.providerhub.models.ErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    private final ClientLogger logger = new ClientLogger(ResourceProvidersClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ResourceProvidersService service;

    /** The service client containing this operation class. */
    private final ProviderhubImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(ProviderhubImpl client) {
        this.service =
            RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ProviderhubResourceProviders to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ProviderhubResourceP")
    private interface ResourceProvidersService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ProviderHub/providerRegistrations/{providerNamespace}"
                + "/generateManifest")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<ResourceProviderManifestInner>> generateManifest(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("providerNamespace") String providerNamespace,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ProviderHub/providerRegistrations/{providerNamespace}"
                + "/checkinManifest")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<CheckinManifestInfoInner>> checkinManifest(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("providerNamespace") String providerNamespace,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ProviderHub/providerRegistrations/{providerNamespace}"
                + "/generateManifest")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorAutoGeneratedException.class)
        Mono<Response<ResourceProviderManifestAutoGeneratedInner>> generateManifest(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("providerNamespace") String providerNamespace,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ProviderHub/providerRegistrations/{providerNamespace}"
                + "/checkinManifest")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorAutoGeneratedException.class)
        Mono<Response<CheckinManifestInfoInner>> checkinManifest(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("providerNamespace") String providerNamespace,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ResourceProviderManifestInner>> generateManifestWithResponseAsync(String providerNamespace) {
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
        final String apiVersion = "2020-11-20";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .generateManifest(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            providerNamespace,
                            apiVersion,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ResourceProviderManifestInner>> generateManifestWithResponseAsync(
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
        final String apiVersion = "2020-11-20";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .generateManifest(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                providerNamespace,
                apiVersion,
                accept,
                context);
    }

    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ResourceProviderManifestInner> generateManifestAsync(String providerNamespace) {
        return generateManifestWithResponseAsync(providerNamespace)
            .flatMap(
                (Response<ResourceProviderManifestInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceProviderManifestInner generateManifest(String providerNamespace) {
        return generateManifestAsync(providerNamespace).block();
    }

    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ResourceProviderManifestInner> generateManifestWithResponse(
        String providerNamespace, Context context) {
        return generateManifestWithResponseAsync(providerNamespace, context).block();
    }

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckinManifestInfoInner>> checkinManifestWithResponseAsync(String providerNamespace) {
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
        final String apiVersion = "2020-11-20";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkinManifest(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            providerNamespace,
                            apiVersion,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckinManifestInfoInner>> checkinManifestWithResponseAsync(
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
        final String apiVersion = "2020-11-20";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkinManifest(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                providerNamespace,
                apiVersion,
                accept,
                context);
    }

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckinManifestInfoInner> checkinManifestAsync(String providerNamespace) {
        return checkinManifestWithResponseAsync(providerNamespace)
            .flatMap(
                (Response<CheckinManifestInfoInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckinManifestInfoInner checkinManifest(String providerNamespace) {
        return checkinManifestAsync(providerNamespace).block();
    }

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckinManifestInfoInner> checkinManifestWithResponse(String providerNamespace, Context context) {
        return checkinManifestWithResponseAsync(providerNamespace, context).block();
    }

    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ResourceProviderManifestAutoGeneratedInner>> generateManifestWithResponseAsync(
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
        final String apiVersion = "2021-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .generateManifest(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            providerNamespace,
                            apiVersion,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ResourceProviderManifestAutoGeneratedInner>> generateManifestWithResponseAsync(
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
        final String apiVersion = "2021-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .generateManifest(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                providerNamespace,
                apiVersion,
                accept,
                context);
    }

    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ResourceProviderManifestAutoGeneratedInner> generateManifestAsync(String providerNamespace) {
        return generateManifestWithResponseAsync(providerNamespace)
            .flatMap(
                (Response<ResourceProviderManifestAutoGeneratedInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceProviderManifestAutoGeneratedInner generateManifest(String providerNamespace) {
        return generateManifestAsync(providerNamespace).block();
    }

    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ResourceProviderManifestAutoGeneratedInner> generateManifestWithResponse(
        String providerNamespace, Context context) {
        return generateManifestWithResponseAsync(providerNamespace, context).block();
    }

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckinManifestInfoInner>> checkinManifestWithResponseAsync(String providerNamespace) {
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
        final String apiVersion = "2021-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkinManifest(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            providerNamespace,
                            apiVersion,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckinManifestInfoInner>> checkinManifestWithResponseAsync(
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
        final String apiVersion = "2021-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkinManifest(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                providerNamespace,
                apiVersion,
                accept,
                context);
    }

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckinManifestInfoInner> checkinManifestAsync(String providerNamespace) {
        return checkinManifestWithResponseAsync(providerNamespace)
            .flatMap(
                (Response<CheckinManifestInfoInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckinManifestInfoInner checkinManifest(String providerNamespace) {
        return checkinManifestAsync(providerNamespace).block();
    }

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckinManifestInfoInner> checkinManifestWithResponse(String providerNamespace, Context context) {
        return checkinManifestWithResponseAsync(providerNamespace, context).block();
    }
}
