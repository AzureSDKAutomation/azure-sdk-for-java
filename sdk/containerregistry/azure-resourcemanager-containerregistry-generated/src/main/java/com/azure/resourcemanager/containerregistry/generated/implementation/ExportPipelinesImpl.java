// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.fluent.ExportPipelinesClient;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.ExportPipelineInner;
import com.azure.resourcemanager.containerregistry.generated.models.ExportPipeline;
import com.azure.resourcemanager.containerregistry.generated.models.ExportPipelines;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExportPipelinesImpl implements ExportPipelines {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportPipelinesImpl.class);

    private final ExportPipelinesClient innerClient;

    private final com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager;

    public ExportPipelinesImpl(
        ExportPipelinesClient innerClient,
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ExportPipeline get(String resourceGroupName, String registryName, String exportPipelineName) {
        ExportPipelineInner inner = this.serviceClient().get(resourceGroupName, registryName, exportPipelineName);
        if (inner != null) {
            return new ExportPipelineImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExportPipeline> getWithResponse(
        String resourceGroupName, String registryName, String exportPipelineName, Context context) {
        Response<ExportPipelineInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, registryName, exportPipelineName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExportPipelineImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String registryName, String exportPipelineName) {
        this.serviceClient().delete(resourceGroupName, registryName, exportPipelineName);
    }

    public void delete(String resourceGroupName, String registryName, String exportPipelineName, Context context) {
        this.serviceClient().delete(resourceGroupName, registryName, exportPipelineName, context);
    }

    public PagedIterable<ExportPipeline> list(String resourceGroupName, String registryName) {
        PagedIterable<ExportPipelineInner> inner = this.serviceClient().list(resourceGroupName, registryName);
        return Utils.mapPage(inner, inner1 -> new ExportPipelineImpl(inner1, this.manager()));
    }

    public PagedIterable<ExportPipeline> list(String resourceGroupName, String registryName, Context context) {
        PagedIterable<ExportPipelineInner> inner = this.serviceClient().list(resourceGroupName, registryName, context);
        return Utils.mapPage(inner, inner1 -> new ExportPipelineImpl(inner1, this.manager()));
    }

    public ExportPipeline getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String exportPipelineName = Utils.getValueFromIdByName(id, "exportPipelines");
        if (exportPipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'exportPipelines'.", id)));
        }
        return this.getWithResponse(resourceGroupName, registryName, exportPipelineName, Context.NONE).getValue();
    }

    public Response<ExportPipeline> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String exportPipelineName = Utils.getValueFromIdByName(id, "exportPipelines");
        if (exportPipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'exportPipelines'.", id)));
        }
        return this.getWithResponse(resourceGroupName, registryName, exportPipelineName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String exportPipelineName = Utils.getValueFromIdByName(id, "exportPipelines");
        if (exportPipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'exportPipelines'.", id)));
        }
        this.delete(resourceGroupName, registryName, exportPipelineName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String exportPipelineName = Utils.getValueFromIdByName(id, "exportPipelines");
        if (exportPipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'exportPipelines'.", id)));
        }
        this.delete(resourceGroupName, registryName, exportPipelineName, context);
    }

    private ExportPipelinesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager() {
        return this.serviceManager;
    }

    public ExportPipelineImpl define(String name) {
        return new ExportPipelineImpl(name, this.manager());
    }
}
