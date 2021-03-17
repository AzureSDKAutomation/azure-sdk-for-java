// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

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
import com.azure.resourcemanager.synapse.fluent.SqlPoolGeoBackupPoliciesClient;
import com.azure.resourcemanager.synapse.fluent.models.GeoBackupPolicyInner;
import com.azure.resourcemanager.synapse.models.GeoBackupPolicyListResult;
import com.azure.resourcemanager.synapse.models.GeoBackupPolicyName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SqlPoolGeoBackupPoliciesClient. */
public final class SqlPoolGeoBackupPoliciesClientImpl implements SqlPoolGeoBackupPoliciesClient {
    private final ClientLogger logger = new ClientLogger(SqlPoolGeoBackupPoliciesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final SqlPoolGeoBackupPoliciesService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolGeoBackupPoliciesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SqlPoolGeoBackupPoliciesClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy
                .create(SqlPoolGeoBackupPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientSqlPoolGeoBackupPolicies to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    private interface SqlPoolGeoBackupPoliciesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/sqlPools/{sqlPoolName}/geoBackupPolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GeoBackupPolicyListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/sqlPools/{sqlPoolName}/geoBackupPolicies/{geoBackupPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GeoBackupPolicyInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName,
            @PathParam("geoBackupPolicyName") GeoBackupPolicyName geoBackupPolicyName,
            @BodyParam("application/json") GeoBackupPolicyInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/sqlPools/{sqlPoolName}/geoBackupPolicies/{geoBackupPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GeoBackupPolicyInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName,
            @PathParam("geoBackupPolicyName") GeoBackupPolicyName geoBackupPolicyName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool geo backup policies.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<GeoBackupPolicyInner>> listSinglePageAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        final String apiVersion = "2021-04-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            sqlPoolName,
                            accept,
                            context))
            .<PagedResponse<GeoBackupPolicyInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool geo backup policies.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<GeoBackupPolicyInner>> listSinglePageAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        final String apiVersion = "2021-04-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                sqlPoolName,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool geo backup policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<GeoBackupPolicyInner> listAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName));
    }

    /**
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool geo backup policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<GeoBackupPolicyInner> listAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, context));
    }

    /**
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool geo backup policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<GeoBackupPolicyInner> list(
        String resourceGroupName, String workspaceName, String sqlPoolName) {
        return new PagedIterable<>(listAsync(resourceGroupName, workspaceName, sqlPoolName));
    }

    /**
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SQL pool geo backup policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<GeoBackupPolicyInner> list(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, workspaceName, sqlPoolName, context));
    }

    /**
     * Updates a SQL Pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GeoBackupPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (geoBackupPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter geoBackupPolicyName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2021-04-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            sqlPoolName,
                            geoBackupPolicyName,
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Updates a SQL Pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GeoBackupPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters,
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (geoBackupPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter geoBackupPolicyName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2021-04-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                sqlPoolName,
                geoBackupPolicyName,
                parameters,
                accept,
                context);
    }

    /**
     * Updates a SQL Pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GeoBackupPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters) {
        return createOrUpdateWithResponseAsync(
                resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName, parameters)
            .flatMap(
                (Response<GeoBackupPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Updates a SQL Pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GeoBackupPolicyInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName, parameters)
            .block();
    }

    /**
     * Updates a SQL Pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GeoBackupPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters,
        Context context) {
        return createOrUpdateWithResponseAsync(
                resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName, parameters, context)
            .block();
    }

    /**
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified SQL pool geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GeoBackupPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName, GeoBackupPolicyName geoBackupPolicyName) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (geoBackupPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter geoBackupPolicyName is required and cannot be null."));
        }
        final String apiVersion = "2021-04-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            sqlPoolName,
                            geoBackupPolicyName,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified SQL pool geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GeoBackupPolicyInner>> getWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        GeoBackupPolicyName geoBackupPolicyName,
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (geoBackupPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter geoBackupPolicyName is required and cannot be null."));
        }
        final String apiVersion = "2021-04-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                sqlPoolName,
                geoBackupPolicyName,
                accept,
                context);
    }

    /**
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified SQL pool geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GeoBackupPolicyInner> getAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName, GeoBackupPolicyName geoBackupPolicyName) {
        return getWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName)
            .flatMap(
                (Response<GeoBackupPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified SQL pool geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GeoBackupPolicyInner get(
        String resourceGroupName, String workspaceName, String sqlPoolName, GeoBackupPolicyName geoBackupPolicyName) {
        return getAsync(resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName).block();
    }

    /**
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified SQL pool geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GeoBackupPolicyInner> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        GeoBackupPolicyName geoBackupPolicyName,
        Context context) {
        return getWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName, context)
            .block();
    }
}
