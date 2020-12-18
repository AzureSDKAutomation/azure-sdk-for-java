// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

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
import com.azure.resourcemanager.logic.fluent.WorkflowRunActionRepetitionsRequestHistoriesClient;
import com.azure.resourcemanager.logic.fluent.models.RequestHistoryInner;
import com.azure.resourcemanager.logic.models.RequestHistoryListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * WorkflowRunActionRepetitionsRequestHistoriesClient.
 */
public final class WorkflowRunActionRepetitionsRequestHistoriesClientImpl
    implements WorkflowRunActionRepetitionsRequestHistoriesClient {
    private final ClientLogger logger = new ClientLogger(WorkflowRunActionRepetitionsRequestHistoriesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final WorkflowRunActionRepetitionsRequestHistoriesService service;

    /** The service client containing this operation class. */
    private final LogicManagementClientImpl client;

    /**
     * Initializes an instance of WorkflowRunActionRepetitionsRequestHistoriesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    WorkflowRunActionRepetitionsRequestHistoriesClientImpl(LogicManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    WorkflowRunActionRepetitionsRequestHistoriesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for LogicManagementClientWorkflowRunActionRepetitionsRequestHistories to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "LogicManagementClien")
    private interface WorkflowRunActionRepetitionsRequestHistoriesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows"
                + "/{workflowName}/runs/{runName}/actions/{actionName}/repetitions/{repetitionName}/requestHistories")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RequestHistoryListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workflowName") String workflowName,
            @PathParam("runName") String runName,
            @PathParam("actionName") String actionName,
            @PathParam("repetitionName") String repetitionName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows"
                + "/{workflowName}/runs/{runName}/actions/{actionName}/repetitions/{repetitionName}/requestHistories"
                + "/{requestHistoryName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RequestHistoryInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workflowName") String workflowName,
            @PathParam("runName") String runName,
            @PathParam("actionName") String actionName,
            @PathParam("repetitionName") String repetitionName,
            @PathParam("requestHistoryName") String requestHistoryName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RequestHistoryListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow request histories.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RequestHistoryInner>> listSinglePageAsync(
        String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
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
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (runName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runName is required and cannot be null."));
        }
        if (actionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter actionName is required and cannot be null."));
        }
        if (repetitionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter repetitionName is required and cannot be null."));
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
                            workflowName,
                            runName,
                            actionName,
                            repetitionName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<RequestHistoryInner>>map(
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
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow request histories.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RequestHistoryInner>> listSinglePageAsync(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
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
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (runName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runName is required and cannot be null."));
        }
        if (actionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter actionName is required and cannot be null."));
        }
        if (repetitionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter repetitionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workflowName,
                runName,
                actionName,
                repetitionName,
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
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow request histories.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RequestHistoryInner> listAsync(
        String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, workflowName, runName, actionName, repetitionName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow request histories.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RequestHistoryInner> listAsync(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, workflowName, runName, actionName, repetitionName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow request histories.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RequestHistoryInner> list(
        String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
        return new PagedIterable<>(listAsync(resourceGroupName, workflowName, runName, actionName, repetitionName));
    }

    /**
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow request histories.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RequestHistoryInner> list(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        Context context) {
        return new PagedIterable<>(
            listAsync(resourceGroupName, workflowName, runName, actionName, repetitionName, context));
    }

    /**
     * Gets a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param requestHistoryName The request history name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run repetition request history.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RequestHistoryInner>> getWithResponseAsync(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        String requestHistoryName) {
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
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (runName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runName is required and cannot be null."));
        }
        if (actionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter actionName is required and cannot be null."));
        }
        if (repetitionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter repetitionName is required and cannot be null."));
        }
        if (requestHistoryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter requestHistoryName is required and cannot be null."));
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
                            workflowName,
                            runName,
                            actionName,
                            repetitionName,
                            requestHistoryName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param requestHistoryName The request history name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run repetition request history.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RequestHistoryInner>> getWithResponseAsync(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        String requestHistoryName,
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
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (runName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runName is required and cannot be null."));
        }
        if (actionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter actionName is required and cannot be null."));
        }
        if (repetitionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter repetitionName is required and cannot be null."));
        }
        if (requestHistoryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter requestHistoryName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workflowName,
                runName,
                actionName,
                repetitionName,
                requestHistoryName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param requestHistoryName The request history name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run repetition request history.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<RequestHistoryInner> getAsync(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        String requestHistoryName) {
        return getWithResponseAsync(
                resourceGroupName, workflowName, runName, actionName, repetitionName, requestHistoryName)
            .flatMap(
                (Response<RequestHistoryInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param requestHistoryName The request history name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run repetition request history.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RequestHistoryInner get(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        String requestHistoryName) {
        return getAsync(resourceGroupName, workflowName, runName, actionName, repetitionName, requestHistoryName)
            .block();
    }

    /**
     * Gets a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param requestHistoryName The request history name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run repetition request history.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RequestHistoryInner> getWithResponse(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        String requestHistoryName,
        Context context) {
        return getWithResponseAsync(
                resourceGroupName, workflowName, runName, actionName, repetitionName, requestHistoryName, context)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow request histories.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RequestHistoryInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<RequestHistoryInner>>map(
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
     * @return the list of workflow request histories.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RequestHistoryInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
