// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningcompute.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningcompute.fluent.OperationalizationClustersClient;
import com.azure.resourcemanager.machinelearningcompute.fluent.models.CheckSystemServicesUpdatesAvailableResponseInner;
import com.azure.resourcemanager.machinelearningcompute.fluent.models.OperationalizationClusterCredentialsInner;
import com.azure.resourcemanager.machinelearningcompute.fluent.models.OperationalizationClusterInner;
import com.azure.resourcemanager.machinelearningcompute.fluent.models.UpdateSystemServicesResponseInner;
import com.azure.resourcemanager.machinelearningcompute.models.CheckSystemServicesUpdatesAvailableResponse;
import com.azure.resourcemanager.machinelearningcompute.models.OperationalizationCluster;
import com.azure.resourcemanager.machinelearningcompute.models.OperationalizationClusterCredentials;
import com.azure.resourcemanager.machinelearningcompute.models.OperationalizationClusters;
import com.azure.resourcemanager.machinelearningcompute.models.UpdateSystemServicesResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationalizationClustersImpl implements OperationalizationClusters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationalizationClustersImpl.class);

    private final OperationalizationClustersClient innerClient;

    private final com.azure.resourcemanager.machinelearningcompute.MachineLearningComputeManager serviceManager;

    public OperationalizationClustersImpl(
        OperationalizationClustersClient innerClient,
        com.azure.resourcemanager.machinelearningcompute.MachineLearningComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationalizationCluster getByResourceGroup(String resourceGroupName, String clusterName) {
        OperationalizationClusterInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, clusterName);
        if (inner != null) {
            return new OperationalizationClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationalizationCluster> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<OperationalizationClusterInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationalizationClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, Boolean deleteAll) {
        this.serviceClient().delete(resourceGroupName, clusterName, deleteAll);
    }

    public void delete(String resourceGroupName, String clusterName) {
        this.serviceClient().delete(resourceGroupName, clusterName);
    }

    public void delete(String resourceGroupName, String clusterName, Boolean deleteAll, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, deleteAll, context);
    }

    public OperationalizationClusterCredentials listKeys(String resourceGroupName, String clusterName) {
        OperationalizationClusterCredentialsInner inner = this.serviceClient().listKeys(resourceGroupName, clusterName);
        if (inner != null) {
            return new OperationalizationClusterCredentialsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationalizationClusterCredentials> listKeysWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<OperationalizationClusterCredentialsInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationalizationClusterCredentialsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckSystemServicesUpdatesAvailableResponse checkSystemServicesUpdatesAvailable(
        String resourceGroupName, String clusterName) {
        CheckSystemServicesUpdatesAvailableResponseInner inner =
            this.serviceClient().checkSystemServicesUpdatesAvailable(resourceGroupName, clusterName);
        if (inner != null) {
            return new CheckSystemServicesUpdatesAvailableResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckSystemServicesUpdatesAvailableResponse> checkSystemServicesUpdatesAvailableWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<CheckSystemServicesUpdatesAvailableResponseInner> inner =
            this
                .serviceClient()
                .checkSystemServicesUpdatesAvailableWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckSystemServicesUpdatesAvailableResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public UpdateSystemServicesResponse updateSystemServices(String resourceGroupName, String clusterName) {
        UpdateSystemServicesResponseInner inner =
            this.serviceClient().updateSystemServices(resourceGroupName, clusterName);
        if (inner != null) {
            return new UpdateSystemServicesResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public UpdateSystemServicesResponse updateSystemServices(
        String resourceGroupName, String clusterName, Context context) {
        UpdateSystemServicesResponseInner inner =
            this.serviceClient().updateSystemServices(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new UpdateSystemServicesResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<OperationalizationCluster> listByResourceGroup(String resourceGroupName) {
        PagedIterable<OperationalizationClusterInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new OperationalizationClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationalizationCluster> listByResourceGroup(
        String resourceGroupName, String skiptoken, Context context) {
        PagedIterable<OperationalizationClusterInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, skiptoken, context);
        return Utils.mapPage(inner, inner1 -> new OperationalizationClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationalizationCluster> list() {
        PagedIterable<OperationalizationClusterInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new OperationalizationClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationalizationCluster> list(String skiptoken, Context context) {
        PagedIterable<OperationalizationClusterInner> inner = this.serviceClient().list(skiptoken, context);
        return Utils.mapPage(inner, inner1 -> new OperationalizationClusterImpl(inner1, this.manager()));
    }

    public OperationalizationCluster getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "operationalizationClusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'operationalizationClusters'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, clusterName, Context.NONE).getValue();
    }

    public Response<OperationalizationCluster> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "operationalizationClusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'operationalizationClusters'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, clusterName, context);
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
        String clusterName = Utils.getValueFromIdByName(id, "operationalizationClusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'operationalizationClusters'.",
                                id)));
        }
        Boolean localDeleteAll = null;
        this.delete(resourceGroupName, clusterName, localDeleteAll, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean deleteAll, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "operationalizationClusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'operationalizationClusters'.",
                                id)));
        }
        this.delete(resourceGroupName, clusterName, deleteAll, context);
    }

    private OperationalizationClustersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearningcompute.MachineLearningComputeManager manager() {
        return this.serviceManager;
    }

    public OperationalizationClusterImpl define(String name) {
        return new OperationalizationClusterImpl(name, this.manager());
    }
}
