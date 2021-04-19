// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.portal.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
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
import com.azure.resourcemanager.portal.fluent.TenantConfigurationsClient;
import com.azure.resourcemanager.portal.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.portal.models.ConfigurationList;
import com.azure.resourcemanager.portal.models.ConfigurationName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TenantConfigurationsClient. */
public final class TenantConfigurationsClientImpl implements TenantConfigurationsClient {
    private final ClientLogger logger = new ClientLogger(TenantConfigurationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final TenantConfigurationsService service;

    /** The service client containing this operation class. */
    private final PortalImpl client;

    /**
     * Initializes an instance of TenantConfigurationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TenantConfigurationsClientImpl(PortalImpl client) {
        this.service =
            RestProxy
                .create(TenantConfigurationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PortalTenantConfigurations to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PortalTenantConfigur")
    private interface TenantConfigurationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Portal/tenantConfigurations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ConfigurationList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Portal/tenantConfigurations/{configurationName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ConfigurationInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("configurationName") ConfigurationName configurationName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put("/providers/Microsoft.Portal/tenantConfigurations/{configurationName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ConfigurationInner>> create(
            @HostParam("$host") String endpoint,
            @PathParam("configurationName") ConfigurationName configurationName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ConfigurationInner tenantConfiguration,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Delete("/providers/Microsoft.Portal/tenantConfigurations/{configurationName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String endpoint,
            @PathParam("configurationName") ConfigurationName configurationName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ConfigurationList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets list of the tenant configurations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the tenant configurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ConfigurationInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context))
            .<PagedResponse<ConfigurationInner>>map(
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
     * Gets list of the tenant configurations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the tenant configurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ConfigurationInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context)
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
     * Gets list of the tenant configurations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the tenant configurations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ConfigurationInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets list of the tenant configurations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the tenant configurations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ConfigurationInner> listAsync(Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets list of the tenant configurations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the tenant configurations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ConfigurationInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Gets list of the tenant configurations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the tenant configurations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ConfigurationInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Gets the tenant configuration.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the tenant configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationInner>> getWithResponseAsync(ConfigurationName configurationName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (configurationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(), configurationName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the tenant configuration.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the tenant configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationInner>> getWithResponseAsync(
        ConfigurationName configurationName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (configurationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), configurationName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets the tenant configuration.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the tenant configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ConfigurationInner> getAsync(ConfigurationName configurationName) {
        return getWithResponseAsync(configurationName)
            .flatMap(
                (Response<ConfigurationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the tenant configuration.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the tenant configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationInner get(ConfigurationName configurationName) {
        return getAsync(configurationName).block();
    }

    /**
     * Gets the tenant configuration.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the tenant configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ConfigurationInner> getWithResponse(ConfigurationName configurationName, Context context) {
        return getWithResponseAsync(configurationName, context).block();
    }

    /**
     * Create the tenant configuration. If configuration already exists - update it. User has to be a Tenant Admin for
     * this operation.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @param tenantConfiguration The parameters required to create or update tenant configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationInner>> createWithResponseAsync(
        ConfigurationName configurationName, ConfigurationInner tenantConfiguration) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (configurationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationName is required and cannot be null."));
        }
        if (tenantConfiguration == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter tenantConfiguration is required and cannot be null."));
        } else {
            tenantConfiguration.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getEndpoint(),
                            configurationName,
                            this.client.getApiVersion(),
                            tenantConfiguration,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create the tenant configuration. If configuration already exists - update it. User has to be a Tenant Admin for
     * this operation.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @param tenantConfiguration The parameters required to create or update tenant configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationInner>> createWithResponseAsync(
        ConfigurationName configurationName, ConfigurationInner tenantConfiguration, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (configurationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationName is required and cannot be null."));
        }
        if (tenantConfiguration == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter tenantConfiguration is required and cannot be null."));
        } else {
            tenantConfiguration.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .create(
                this.client.getEndpoint(),
                configurationName,
                this.client.getApiVersion(),
                tenantConfiguration,
                accept,
                context);
    }

    /**
     * Create the tenant configuration. If configuration already exists - update it. User has to be a Tenant Admin for
     * this operation.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @param tenantConfiguration The parameters required to create or update tenant configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ConfigurationInner> createAsync(
        ConfigurationName configurationName, ConfigurationInner tenantConfiguration) {
        return createWithResponseAsync(configurationName, tenantConfiguration)
            .flatMap(
                (Response<ConfigurationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Create the tenant configuration. If configuration already exists - update it. User has to be a Tenant Admin for
     * this operation.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @param tenantConfiguration The parameters required to create or update tenant configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationInner create(ConfigurationName configurationName, ConfigurationInner tenantConfiguration) {
        return createAsync(configurationName, tenantConfiguration).block();
    }

    /**
     * Create the tenant configuration. If configuration already exists - update it. User has to be a Tenant Admin for
     * this operation.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @param tenantConfiguration The parameters required to create or update tenant configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ConfigurationInner> createWithResponse(
        ConfigurationName configurationName, ConfigurationInner tenantConfiguration, Context context) {
        return createWithResponseAsync(configurationName, tenantConfiguration, context).block();
    }

    /**
     * Delete the tenant configuration. User has to be a Tenant Admin for this operation.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(ConfigurationName configurationName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (configurationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getEndpoint(), configurationName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Delete the tenant configuration. User has to be a Tenant Admin for this operation.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(ConfigurationName configurationName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (configurationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .delete(this.client.getEndpoint(), configurationName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Delete the tenant configuration. User has to be a Tenant Admin for this operation.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(ConfigurationName configurationName) {
        return deleteWithResponseAsync(configurationName).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete the tenant configuration. User has to be a Tenant Admin for this operation.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(ConfigurationName configurationName) {
        deleteAsync(configurationName).block();
    }

    /**
     * Delete the tenant configuration. User has to be a Tenant Admin for this operation.
     *
     * @param configurationName The configuration name. Value must be 'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(ConfigurationName configurationName, Context context) {
        return deleteWithResponseAsync(configurationName, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of tenant configurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ConfigurationInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<ConfigurationInner>>map(
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
     * @return list of tenant configurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ConfigurationInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
