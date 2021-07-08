// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabric.fluent.ClustersClient;
import com.azure.resourcemanager.servicefabric.fluent.models.ClusterInner;
import com.azure.resourcemanager.servicefabric.fluent.models.ClusterListResultInner;
import com.azure.resourcemanager.servicefabric.fluent.models.UpgradableVersionPathResultInner;
import com.azure.resourcemanager.servicefabric.models.Cluster;
import com.azure.resourcemanager.servicefabric.models.ClusterListResult;
import com.azure.resourcemanager.servicefabric.models.Clusters;
import com.azure.resourcemanager.servicefabric.models.UpgradableVersionPathResult;
import com.azure.resourcemanager.servicefabric.models.UpgradableVersionsDescription;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ClustersImpl implements Clusters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClustersImpl.class);

    private final ClustersClient innerClient;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    public ClustersImpl(
        ClustersClient innerClient, com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Cluster getByResourceGroup(String resourceGroupName, String clusterName) {
        ClusterInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, clusterName);
        if (inner != null) {
            return new ClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Cluster> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<ClusterInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String clusterName) {
        this.serviceClient().delete(resourceGroupName, clusterName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String clusterName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, clusterName, context);
    }

    public ClusterListResult listByResourceGroup(String resourceGroupName) {
        ClusterListResultInner inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        if (inner != null) {
            return new ClusterListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ClusterListResult> listByResourceGroupWithResponse(String resourceGroupName, Context context) {
        Response<ClusterListResultInner> inner =
            this.serviceClient().listByResourceGroupWithResponse(resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ClusterListResult list() {
        ClusterListResultInner inner = this.serviceClient().list();
        if (inner != null) {
            return new ClusterListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ClusterListResult> listWithResponse(Context context) {
        Response<ClusterListResultInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public UpgradableVersionPathResult listUpgradableVersions(String resourceGroupName, String clusterName) {
        UpgradableVersionPathResultInner inner =
            this.serviceClient().listUpgradableVersions(resourceGroupName, clusterName);
        if (inner != null) {
            return new UpgradableVersionPathResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<UpgradableVersionPathResult> listUpgradableVersionsWithResponse(
        String resourceGroupName,
        String clusterName,
        UpgradableVersionsDescription versionsDescription,
        Context context) {
        Response<UpgradableVersionPathResultInner> inner =
            this
                .serviceClient()
                .listUpgradableVersionsWithResponse(resourceGroupName, clusterName, versionsDescription, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UpgradableVersionPathResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Cluster getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, clusterName, Context.NONE).getValue();
    }

    public Response<Cluster> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, clusterName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, clusterName, context);
    }

    private ClustersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }

    public ClusterImpl define(String name) {
        return new ClusterImpl(name, this.manager());
    }
}
