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
import com.azure.resourcemanager.logic.fluent.WorkflowTriggerHistoriesClient;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerHistoryInner;
import com.azure.resourcemanager.logic.models.WorkflowTriggerHistories;
import com.azure.resourcemanager.logic.models.WorkflowTriggerHistory;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WorkflowTriggerHistoriesImpl implements WorkflowTriggerHistories {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkflowTriggerHistoriesImpl.class);

    private final WorkflowTriggerHistoriesClient innerClient;

    private final LogicManager serviceManager;

    public WorkflowTriggerHistoriesImpl(WorkflowTriggerHistoriesClient innerClient, LogicManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WorkflowTriggerHistory> list(
        String resourceGroupName, String workflowName, String triggerName) {
        PagedIterable<WorkflowTriggerHistoryInner> inner =
            this.serviceClient().list(resourceGroupName, workflowName, triggerName);
        return Utils.mapPage(inner, inner1 -> new WorkflowTriggerHistoryImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkflowTriggerHistory> list(
        String resourceGroupName,
        String workflowName,
        String triggerName,
        Integer top,
        String filter,
        Context context) {
        PagedIterable<WorkflowTriggerHistoryInner> inner =
            this.serviceClient().list(resourceGroupName, workflowName, triggerName, top, filter, context);
        return Utils.mapPage(inner, inner1 -> new WorkflowTriggerHistoryImpl(inner1, this.manager()));
    }

    public WorkflowTriggerHistory get(
        String resourceGroupName, String workflowName, String triggerName, String historyName) {
        WorkflowTriggerHistoryInner inner =
            this.serviceClient().get(resourceGroupName, workflowName, triggerName, historyName);
        if (inner != null) {
            return new WorkflowTriggerHistoryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkflowTriggerHistory> getWithResponse(
        String resourceGroupName, String workflowName, String triggerName, String historyName, Context context) {
        Response<WorkflowTriggerHistoryInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workflowName, triggerName, historyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkflowTriggerHistoryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void resubmit(String resourceGroupName, String workflowName, String triggerName, String historyName) {
        this.serviceClient().resubmit(resourceGroupName, workflowName, triggerName, historyName);
    }

    public Response<Void> resubmitWithResponse(
        String resourceGroupName, String workflowName, String triggerName, String historyName, Context context) {
        return this
            .serviceClient()
            .resubmitWithResponse(resourceGroupName, workflowName, triggerName, historyName, context);
    }

    private WorkflowTriggerHistoriesClient serviceClient() {
        return this.innerClient;
    }

    private LogicManager manager() {
        return this.serviceManager;
    }
}
