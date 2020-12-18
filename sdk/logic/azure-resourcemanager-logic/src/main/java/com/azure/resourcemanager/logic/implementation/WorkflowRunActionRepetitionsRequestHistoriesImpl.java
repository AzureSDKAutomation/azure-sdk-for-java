// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.fluent.WorkflowRunActionRepetitionsRequestHistoriesClient;
import com.azure.resourcemanager.logic.fluent.models.RequestHistoryInner;
import com.azure.resourcemanager.logic.models.RequestHistory;
import com.azure.resourcemanager.logic.models.WorkflowRunActionRepetitionsRequestHistories;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WorkflowRunActionRepetitionsRequestHistoriesImpl
    implements WorkflowRunActionRepetitionsRequestHistories {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(WorkflowRunActionRepetitionsRequestHistoriesImpl.class);

    private final WorkflowRunActionRepetitionsRequestHistoriesClient innerClient;

    private final LogicManager serviceManager;

    public WorkflowRunActionRepetitionsRequestHistoriesImpl(
        WorkflowRunActionRepetitionsRequestHistoriesClient innerClient, LogicManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RequestHistory> list(
        String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
        PagedIterable<RequestHistoryInner> inner =
            this.serviceClient().list(resourceGroupName, workflowName, runName, actionName, repetitionName);
        return inner.mapPage(inner1 -> new RequestHistoryImpl(inner1, this.manager()));
    }

    public PagedIterable<RequestHistory> list(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        Context context) {
        PagedIterable<RequestHistoryInner> inner =
            this.serviceClient().list(resourceGroupName, workflowName, runName, actionName, repetitionName, context);
        return inner.mapPage(inner1 -> new RequestHistoryImpl(inner1, this.manager()));
    }

    public RequestHistory get(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        String requestHistoryName) {
        RequestHistoryInner inner =
            this
                .serviceClient()
                .get(resourceGroupName, workflowName, runName, actionName, repetitionName, requestHistoryName);
        if (inner != null) {
            return new RequestHistoryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RequestHistory> getWithResponse(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        String requestHistoryName,
        Context context) {
        Response<RequestHistoryInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, workflowName, runName, actionName, repetitionName, requestHistoryName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RequestHistoryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private WorkflowRunActionRepetitionsRequestHistoriesClient serviceClient() {
        return this.innerClient;
    }

    private LogicManager manager() {
        return this.serviceManager;
    }
}
