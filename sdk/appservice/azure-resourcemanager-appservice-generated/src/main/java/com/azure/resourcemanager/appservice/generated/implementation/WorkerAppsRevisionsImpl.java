// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.WorkerAppsRevisionsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.WorkerAppRevisionInner;
import com.azure.resourcemanager.appservice.generated.models.WorkerAppRevision;
import com.azure.resourcemanager.appservice.generated.models.WorkerAppsRevisions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WorkerAppsRevisionsImpl implements WorkerAppsRevisions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkerAppsRevisionsImpl.class);

    private final WorkerAppsRevisionsClient innerClient;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public WorkerAppsRevisionsImpl(
        WorkerAppsRevisionsClient innerClient,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WorkerAppRevision> listRevisions(String resourceGroupName, String workerAppName) {
        PagedIterable<WorkerAppRevisionInner> inner =
            this.serviceClient().listRevisions(resourceGroupName, workerAppName);
        return Utils.mapPage(inner, inner1 -> new WorkerAppRevisionImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkerAppRevision> listRevisions(
        String resourceGroupName, String workerAppName, Context context) {
        PagedIterable<WorkerAppRevisionInner> inner =
            this.serviceClient().listRevisions(resourceGroupName, workerAppName, context);
        return Utils.mapPage(inner, inner1 -> new WorkerAppRevisionImpl(inner1, this.manager()));
    }

    public WorkerAppRevision getRevision(String resourceGroupName, String workerAppName, String name) {
        WorkerAppRevisionInner inner = this.serviceClient().getRevision(resourceGroupName, workerAppName, name);
        if (inner != null) {
            return new WorkerAppRevisionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkerAppRevision> getRevisionWithResponse(
        String resourceGroupName, String workerAppName, String name, Context context) {
        Response<WorkerAppRevisionInner> inner =
            this.serviceClient().getRevisionWithResponse(resourceGroupName, workerAppName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkerAppRevisionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void activateRevision(String resourceGroupName, String workerAppName, String name) {
        this.serviceClient().activateRevision(resourceGroupName, workerAppName, name);
    }

    public Response<Void> activateRevisionWithResponse(
        String resourceGroupName, String workerAppName, String name, Context context) {
        return this.serviceClient().activateRevisionWithResponse(resourceGroupName, workerAppName, name, context);
    }

    public void deactivateRevision(String resourceGroupName, String workerAppName, String name) {
        this.serviceClient().deactivateRevision(resourceGroupName, workerAppName, name);
    }

    public Response<Void> deactivateRevisionWithResponse(
        String resourceGroupName, String workerAppName, String name, Context context) {
        return this.serviceClient().deactivateRevisionWithResponse(resourceGroupName, workerAppName, name, context);
    }

    public void restartRevision(String resourceGroupName, String workerAppName, String name) {
        this.serviceClient().restartRevision(resourceGroupName, workerAppName, name);
    }

    public Response<Void> restartRevisionWithResponse(
        String resourceGroupName, String workerAppName, String name, Context context) {
        return this.serviceClient().restartRevisionWithResponse(resourceGroupName, workerAppName, name, context);
    }

    private WorkerAppsRevisionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
