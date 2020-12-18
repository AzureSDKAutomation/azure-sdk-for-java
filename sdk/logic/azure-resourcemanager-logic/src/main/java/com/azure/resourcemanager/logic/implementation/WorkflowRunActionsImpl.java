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
import com.azure.resourcemanager.logic.fluent.WorkflowRunActionsClient;
import com.azure.resourcemanager.logic.fluent.models.WorkflowRunActionInner;
import com.azure.resourcemanager.logic.models.ExpressionRoot;
import com.azure.resourcemanager.logic.models.WorkflowRunAction;
import com.azure.resourcemanager.logic.models.WorkflowRunActions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WorkflowRunActionsImpl implements WorkflowRunActions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkflowRunActionsImpl.class);

    private final WorkflowRunActionsClient innerClient;

    private final LogicManager serviceManager;

    public WorkflowRunActionsImpl(WorkflowRunActionsClient innerClient, LogicManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WorkflowRunAction> list(String resourceGroupName, String workflowName, String runName) {
        PagedIterable<WorkflowRunActionInner> inner =
            this.serviceClient().list(resourceGroupName, workflowName, runName);
        return inner.mapPage(inner1 -> new WorkflowRunActionImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkflowRunAction> list(
        String resourceGroupName, String workflowName, String runName, Integer top, String filter, Context context) {
        PagedIterable<WorkflowRunActionInner> inner =
            this.serviceClient().list(resourceGroupName, workflowName, runName, top, filter, context);
        return inner.mapPage(inner1 -> new WorkflowRunActionImpl(inner1, this.manager()));
    }

    public WorkflowRunAction get(String resourceGroupName, String workflowName, String runName, String actionName) {
        WorkflowRunActionInner inner = this.serviceClient().get(resourceGroupName, workflowName, runName, actionName);
        if (inner != null) {
            return new WorkflowRunActionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkflowRunAction> getWithResponse(
        String resourceGroupName, String workflowName, String runName, String actionName, Context context) {
        Response<WorkflowRunActionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workflowName, runName, actionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkflowRunActionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ExpressionRoot> listExpressionTraces(
        String resourceGroupName, String workflowName, String runName, String actionName) {
        return this.serviceClient().listExpressionTraces(resourceGroupName, workflowName, runName, actionName);
    }

    public PagedIterable<ExpressionRoot> listExpressionTraces(
        String resourceGroupName, String workflowName, String runName, String actionName, Context context) {
        return this.serviceClient().listExpressionTraces(resourceGroupName, workflowName, runName, actionName, context);
    }

    private WorkflowRunActionsClient serviceClient() {
        return this.innerClient;
    }

    private LogicManager manager() {
        return this.serviceManager;
    }
}
