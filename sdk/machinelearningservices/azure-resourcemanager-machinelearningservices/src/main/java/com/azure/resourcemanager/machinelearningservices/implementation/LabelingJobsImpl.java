// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.MachinelearningservicesManager;
import com.azure.resourcemanager.machinelearningservices.fluent.LabelingJobsClient;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ExportSummaryResourceInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.LabelingJobResourceInner;
import com.azure.resourcemanager.machinelearningservices.models.ExportFormatType;
import com.azure.resourcemanager.machinelearningservices.models.ExportSummaryResource;
import com.azure.resourcemanager.machinelearningservices.models.LabelingJobResource;
import com.azure.resourcemanager.machinelearningservices.models.LabelingJobs;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.UUID;

public final class LabelingJobsImpl implements LabelingJobs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LabelingJobsImpl.class);

    private final LabelingJobsClient innerClient;

    private final MachinelearningservicesManager serviceManager;

    public LabelingJobsImpl(LabelingJobsClient innerClient, MachinelearningservicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LabelingJobResource get(String id, String resourceGroupName, String workspaceName) {
        LabelingJobResourceInner inner = this.serviceClient().get(id, resourceGroupName, workspaceName);
        if (inner != null) {
            return new LabelingJobResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LabelingJobResource> getWithResponse(
        String id,
        String resourceGroupName,
        String workspaceName,
        Boolean includeJobInstructions,
        Boolean includeLabelCategories,
        Context context) {
        Response<LabelingJobResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    id, resourceGroupName, workspaceName, includeJobInstructions, includeLabelCategories, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LabelingJobResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String id, String resourceGroupName, String workspaceName) {
        this.serviceClient().delete(id, resourceGroupName, workspaceName);
    }

    public Response<Void> deleteWithResponse(
        String id, String resourceGroupName, String workspaceName, Context context) {
        return this.serviceClient().deleteWithResponse(id, resourceGroupName, workspaceName, context);
    }

    public PagedIterable<LabelingJobResource> list(String resourceGroupName, String workspaceName) {
        PagedIterable<LabelingJobResourceInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return inner.mapPage(inner1 -> new LabelingJobResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LabelingJobResource> list(
        String resourceGroupName, String workspaceName, String skiptoken, Integer count, Context context) {
        PagedIterable<LabelingJobResourceInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, skiptoken, count, context);
        return inner.mapPage(inner1 -> new LabelingJobResourceImpl(inner1, this.manager()));
    }

    public void pause(String id, String resourceGroupName, String workspaceName) {
        this.serviceClient().pause(id, resourceGroupName, workspaceName);
    }

    public Response<Void> pauseWithResponse(
        String id, String resourceGroupName, String workspaceName, Context context) {
        return this.serviceClient().pauseWithResponse(id, resourceGroupName, workspaceName, context);
    }

    public void resume(String id, String resourceGroupName, String workspaceName) {
        this.serviceClient().resume(id, resourceGroupName, workspaceName);
    }

    public Response<Void> resumeWithResponse(
        String id, String resourceGroupName, String workspaceName, Context context) {
        return this.serviceClient().resumeWithResponse(id, resourceGroupName, workspaceName, context);
    }

    public void exportLabels(String id, String resourceGroupName, String workspaceName) {
        this.serviceClient().exportLabels(id, resourceGroupName, workspaceName);
    }

    public Response<Void> exportLabelsWithResponse(
        String id, String resourceGroupName, String workspaceName, ExportFormatType body, Context context) {
        return this.serviceClient().exportLabelsWithResponse(id, resourceGroupName, workspaceName, body, context);
    }

    public ExportSummaryResource getExportSummary(
        String id, UUID exportId, String resourceGroupName, String workspaceName) {
        ExportSummaryResourceInner inner =
            this.serviceClient().getExportSummary(id, exportId, resourceGroupName, workspaceName);
        if (inner != null) {
            return new ExportSummaryResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExportSummaryResource> getExportSummaryWithResponse(
        String id, UUID exportId, String resourceGroupName, String workspaceName, Context context) {
        Response<ExportSummaryResourceInner> inner =
            this.serviceClient().getExportSummaryWithResponse(id, exportId, resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExportSummaryResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LabelingJobResource getById(String id) {
        String varId = Utils.getValueFromIdByName(id, "labelingJobs");
        if (varId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labelingJobs'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        Boolean localIncludeJobInstructions = null;
        Boolean localIncludeLabelCategories = null;
        return this
            .getWithResponse(
                varId,
                resourceGroupName,
                workspaceName,
                localIncludeJobInstructions,
                localIncludeLabelCategories,
                Context.NONE)
            .getValue();
    }

    public Response<LabelingJobResource> getByIdWithResponse(
        String id, Boolean includeJobInstructions, Boolean includeLabelCategories, Context context) {
        String varId = Utils.getValueFromIdByName(id, "labelingJobs");
        if (varId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labelingJobs'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        return this
            .getWithResponse(
                varId, resourceGroupName, workspaceName, includeJobInstructions, includeLabelCategories, context);
    }

    public void deleteById(String id) {
        String varId = Utils.getValueFromIdByName(id, "labelingJobs");
        if (varId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labelingJobs'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        this.deleteWithResponse(varId, resourceGroupName, workspaceName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String varId = Utils.getValueFromIdByName(id, "labelingJobs");
        if (varId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labelingJobs'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        return this.deleteWithResponse(varId, resourceGroupName, workspaceName, context);
    }

    private LabelingJobsClient serviceClient() {
        return this.innerClient;
    }

    private MachinelearningservicesManager manager() {
        return this.serviceManager;
    }

    public LabelingJobResourceImpl define(String name) {
        return new LabelingJobResourceImpl(name, this.manager());
    }
}
