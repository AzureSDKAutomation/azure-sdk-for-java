// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hdinsight.fluent.ConfigurationsClient;
import com.azure.resourcemanager.hdinsight.fluent.models.ClusterConfigurationsInner;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ConfigurationsClient. */
public final class ConfigurationsClientImpl implements ConfigurationsClient {
    private final ClientLogger logger = new ClientLogger(ConfigurationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ConfigurationsService service;

    /** The service client containing this operation class. */
    private final HDInsightManagementClientImpl client;

    /**
     * Initializes an instance of ConfigurationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ConfigurationsClientImpl(HDInsightManagementClientImpl client) {
        this.service =
            RestProxy.create(ConfigurationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HDInsightManagementClientConfigurations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "HDInsightManagementC")
    private interface ConfigurationsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HDInsight/clusters"
                + "/{clusterName}/configurations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ClusterConfigurationsInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("clusterName") String clusterName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HDInsight/clusters"
                + "/{clusterName}/configurations/{configurationName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> update(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("clusterName") String clusterName,
            @PathParam("configurationName") String configurationName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") Map<String, String> parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HDInsight/clusters"
                + "/{clusterName}/configurations/{configurationName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Map<String, String>>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("clusterName") String clusterName,
            @PathParam("configurationName") String configurationName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets all configuration information for an HDI cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all configuration information for an HDI cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterConfigurationsInner>> listWithResponseAsync(
        String resourceGroupName, String clusterName) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            clusterName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets all configuration information for an HDI cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all configuration information for an HDI cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterConfigurationsInner>> listWithResponseAsync(
        String resourceGroupName, String clusterName, Context context) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                clusterName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets all configuration information for an HDI cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all configuration information for an HDI cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ClusterConfigurationsInner> listAsync(String resourceGroupName, String clusterName) {
        return listWithResponseAsync(resourceGroupName, clusterName)
            .flatMap(
                (Response<ClusterConfigurationsInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets all configuration information for an HDI cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all configuration information for an HDI cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ClusterConfigurationsInner list(String resourceGroupName, String clusterName) {
        return listAsync(resourceGroupName, clusterName).block();
    }

    /**
     * Gets all configuration information for an HDI cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all configuration information for an HDI cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ClusterConfigurationsInner> listWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        return listWithResponseAsync(resourceGroupName, clusterName, context).block();
    }

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The configuration object for the specified configuration for the specified cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName, String clusterName, String configurationName, Map<String, String> parameters) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (configurationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            clusterName,
                            configurationName,
                            this.client.getApiVersion(),
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The configuration object for the specified configuration for the specified cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName,
        String clusterName,
        String configurationName,
        Map<String, String> parameters,
        Context context) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (configurationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                clusterName,
                configurationName,
                this.client.getApiVersion(),
                parameters,
                accept,
                context);
    }

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The configuration object for the specified configuration for the specified cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<Void>, Void> beginUpdateAsync(
        String resourceGroupName, String clusterName, String configurationName, Map<String, String> parameters) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            updateWithResponseAsync(resourceGroupName, clusterName, configurationName, parameters);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, Context.NONE);
    }

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The configuration object for the specified configuration for the specified cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<Void>, Void> beginUpdateAsync(
        String resourceGroupName,
        String clusterName,
        String configurationName,
        Map<String, String> parameters,
        Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            updateWithResponseAsync(resourceGroupName, clusterName, configurationName, parameters, context);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, context);
    }

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The configuration object for the specified configuration for the specified cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<Void>, Void> beginUpdate(
        String resourceGroupName, String clusterName, String configurationName, Map<String, String> parameters) {
        return beginUpdateAsync(resourceGroupName, clusterName, configurationName, parameters).getSyncPoller();
    }

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The configuration object for the specified configuration for the specified cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<Void>, Void> beginUpdate(
        String resourceGroupName,
        String clusterName,
        String configurationName,
        Map<String, String> parameters,
        Context context) {
        return beginUpdateAsync(resourceGroupName, clusterName, configurationName, parameters, context).getSyncPoller();
    }

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The configuration object for the specified configuration for the specified cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> updateAsync(
        String resourceGroupName, String clusterName, String configurationName, Map<String, String> parameters) {
        return beginUpdateAsync(resourceGroupName, clusterName, configurationName, parameters)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The configuration object for the specified configuration for the specified cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> updateAsync(
        String resourceGroupName,
        String clusterName,
        String configurationName,
        Map<String, String> parameters,
        Context context) {
        return beginUpdateAsync(resourceGroupName, clusterName, configurationName, parameters, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The configuration object for the specified configuration for the specified cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void update(
        String resourceGroupName, String clusterName, String configurationName, Map<String, String> parameters) {
        updateAsync(resourceGroupName, clusterName, configurationName, parameters).block();
    }

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The configuration object for the specified configuration for the specified cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void update(
        String resourceGroupName,
        String clusterName,
        String configurationName,
        Map<String, String> parameters,
        Context context) {
        updateAsync(resourceGroupName, clusterName, configurationName, parameters, context).block();
    }

    /**
     * The configuration object for the specified cluster. This API is not recommended and might be removed in the
     * future. Please consider using List configurations API instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration object for the specified configuration for the specified cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Map<String, String>>> getWithResponseAsync(
        String resourceGroupName, String clusterName, String configurationName) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
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
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            clusterName,
                            configurationName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * The configuration object for the specified cluster. This API is not recommended and might be removed in the
     * future. Please consider using List configurations API instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration object for the specified configuration for the specified cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Map<String, String>>> getWithResponseAsync(
        String resourceGroupName, String clusterName, String configurationName, Context context) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (configurationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                clusterName,
                configurationName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * The configuration object for the specified cluster. This API is not recommended and might be removed in the
     * future. Please consider using List configurations API instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration object for the specified configuration for the specified cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Map<String, String>> getAsync(String resourceGroupName, String clusterName, String configurationName) {
        return getWithResponseAsync(resourceGroupName, clusterName, configurationName)
            .flatMap(
                (Response<Map<String, String>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * The configuration object for the specified cluster. This API is not recommended and might be removed in the
     * future. Please consider using List configurations API instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration object for the specified configuration for the specified cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Map<String, String> get(String resourceGroupName, String clusterName, String configurationName) {
        return getAsync(resourceGroupName, clusterName, configurationName).block();
    }

    /**
     * The configuration object for the specified cluster. This API is not recommended and might be removed in the
     * future. Please consider using List configurations API instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration object for the specified configuration for the specified cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Map<String, String>> getWithResponse(
        String resourceGroupName, String clusterName, String configurationName, Context context) {
        return getWithResponseAsync(resourceGroupName, clusterName, configurationName, context).block();
    }
}
