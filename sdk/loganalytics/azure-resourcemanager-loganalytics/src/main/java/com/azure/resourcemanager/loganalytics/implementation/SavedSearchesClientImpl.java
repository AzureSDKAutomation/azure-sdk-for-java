// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.fluent.SavedSearchesClient;
import com.azure.resourcemanager.loganalytics.fluent.models.SavedSearchInner;
import com.azure.resourcemanager.loganalytics.fluent.models.SavedSearchesListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SavedSearchesClient. */
public final class SavedSearchesClientImpl implements SavedSearchesClient {
    private final ClientLogger logger = new ClientLogger(SavedSearchesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final SavedSearchesService service;

    /** The service client containing this operation class. */
    private final OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of SavedSearchesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SavedSearchesClientImpl(OperationalInsightsManagementClientImpl client) {
        this.service =
            RestProxy.create(SavedSearchesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for OperationalInsightsManagementClientSavedSearches to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "OperationalInsightsM")
    private interface SavedSearchesService {
        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights"
                + "/workspaces/{workspaceName}/savedSearches/{savedSearchId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("savedSearchId") String savedSearchId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights"
                + "/workspaces/{workspaceName}/savedSearches/{savedSearchId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SavedSearchInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("savedSearchId") String savedSearchId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") SavedSearchInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights"
                + "/workspaces/{workspaceName}/savedSearches/{savedSearchId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SavedSearchInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("savedSearchId") String savedSearchId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights"
                + "/workspaces/{workspaceName}/savedSearches")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SavedSearchesListResultInner>> listByWorkspace(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Deletes the specified saved search in a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String workspaceName, String savedSearchId) {
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
        if (savedSearchId == null) {
            return Mono.error(new IllegalArgumentException("Parameter savedSearchId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            savedSearchId,
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes the specified saved search in a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String workspaceName, String savedSearchId, Context context) {
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
        if (savedSearchId == null) {
            return Mono.error(new IllegalArgumentException("Parameter savedSearchId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        context = this.client.mergeContext(context);
        return service
            .delete(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                savedSearchId,
                apiVersion,
                context);
    }

    /**
     * Deletes the specified saved search in a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceGroupName, String workspaceName, String savedSearchId) {
        return deleteWithResponseAsync(resourceGroupName, workspaceName, savedSearchId)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified saved search in a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String workspaceName, String savedSearchId) {
        deleteAsync(resourceGroupName, workspaceName, savedSearchId).block();
    }

    /**
     * Deletes the specified saved search in a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String savedSearchId, Context context) {
        return deleteWithResponseAsync(resourceGroupName, workspaceName, savedSearchId, context).block();
    }

    /**
     * Creates or updates a saved search for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param parameters The parameters required to save a search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value object for saved search results.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SavedSearchInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String workspaceName, String savedSearchId, SavedSearchInner parameters) {
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
        if (savedSearchId == null) {
            return Mono.error(new IllegalArgumentException("Parameter savedSearchId is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            savedSearchId,
                            apiVersion,
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates a saved search for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param parameters The parameters required to save a search.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value object for saved search results.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SavedSearchInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String savedSearchId,
        SavedSearchInner parameters,
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
        if (savedSearchId == null) {
            return Mono.error(new IllegalArgumentException("Parameter savedSearchId is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                savedSearchId,
                apiVersion,
                parameters,
                accept,
                context);
    }

    /**
     * Creates or updates a saved search for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param parameters The parameters required to save a search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value object for saved search results.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SavedSearchInner> createOrUpdateAsync(
        String resourceGroupName, String workspaceName, String savedSearchId, SavedSearchInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, workspaceName, savedSearchId, parameters)
            .flatMap(
                (Response<SavedSearchInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates a saved search for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param parameters The parameters required to save a search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value object for saved search results.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SavedSearchInner createOrUpdate(
        String resourceGroupName, String workspaceName, String savedSearchId, SavedSearchInner parameters) {
        return createOrUpdateAsync(resourceGroupName, workspaceName, savedSearchId, parameters).block();
    }

    /**
     * Creates or updates a saved search for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param parameters The parameters required to save a search.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value object for saved search results.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SavedSearchInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String savedSearchId,
        SavedSearchInner parameters,
        Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, workspaceName, savedSearchId, parameters, context)
            .block();
    }

    /**
     * Gets the specified saved search for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified saved search for a given workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SavedSearchInner>> getWithResponseAsync(
        String resourceGroupName, String workspaceName, String savedSearchId) {
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
        if (savedSearchId == null) {
            return Mono.error(new IllegalArgumentException("Parameter savedSearchId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            savedSearchId,
                            apiVersion,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the specified saved search for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified saved search for a given workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SavedSearchInner>> getWithResponseAsync(
        String resourceGroupName, String workspaceName, String savedSearchId, Context context) {
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
        if (savedSearchId == null) {
            return Mono.error(new IllegalArgumentException("Parameter savedSearchId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                savedSearchId,
                apiVersion,
                accept,
                context);
    }

    /**
     * Gets the specified saved search for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified saved search for a given workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SavedSearchInner> getAsync(String resourceGroupName, String workspaceName, String savedSearchId) {
        return getWithResponseAsync(resourceGroupName, workspaceName, savedSearchId)
            .flatMap(
                (Response<SavedSearchInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified saved search for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified saved search for a given workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SavedSearchInner get(String resourceGroupName, String workspaceName, String savedSearchId) {
        return getAsync(resourceGroupName, workspaceName, savedSearchId).block();
    }

    /**
     * Gets the specified saved search for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param savedSearchId The id of the saved search.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified saved search for a given workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SavedSearchInner> getWithResponse(
        String resourceGroupName, String workspaceName, String savedSearchId, Context context) {
        return getWithResponseAsync(resourceGroupName, workspaceName, savedSearchId, context).block();
    }

    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the saved searches for a given Log Analytics Workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SavedSearchesListResultInner>> listByWorkspaceWithResponseAsync(
        String resourceGroupName, String workspaceName) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByWorkspace(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            workspaceName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the saved searches for a given Log Analytics Workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SavedSearchesListResultInner>> listByWorkspaceWithResponseAsync(
        String resourceGroupName, String workspaceName, Context context) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByWorkspace(
                this.client.getEndpoint(),
                resourceGroupName,
                workspaceName,
                apiVersion,
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the saved searches for a given Log Analytics Workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SavedSearchesListResultInner> listByWorkspaceAsync(String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithResponseAsync(resourceGroupName, workspaceName)
            .flatMap(
                (Response<SavedSearchesListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the saved searches for a given Log Analytics Workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SavedSearchesListResultInner listByWorkspace(String resourceGroupName, String workspaceName) {
        return listByWorkspaceAsync(resourceGroupName, workspaceName).block();
    }

    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the saved searches for a given Log Analytics Workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SavedSearchesListResultInner> listByWorkspaceWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        return listByWorkspaceWithResponseAsync(resourceGroupName, workspaceName, context).block();
    }
}
