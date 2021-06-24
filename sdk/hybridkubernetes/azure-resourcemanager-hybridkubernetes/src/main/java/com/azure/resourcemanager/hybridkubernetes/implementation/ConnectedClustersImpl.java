// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridkubernetes.fluent.ConnectedClustersClient;
import com.azure.resourcemanager.hybridkubernetes.fluent.models.ConnectedClusterInner;
import com.azure.resourcemanager.hybridkubernetes.fluent.models.CredentialResultsInner;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedCluster;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedClusters;
import com.azure.resourcemanager.hybridkubernetes.models.CredentialResults;
import com.azure.resourcemanager.hybridkubernetes.models.ListClusterUserCredentialsProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ConnectedClustersImpl implements ConnectedClusters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectedClustersImpl.class);

    private final ConnectedClustersClient innerClient;

    private final com.azure.resourcemanager.hybridkubernetes.HybridKubernetesManager serviceManager;

    public ConnectedClustersImpl(
        ConnectedClustersClient innerClient,
        com.azure.resourcemanager.hybridkubernetes.HybridKubernetesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ConnectedCluster getByResourceGroup(String resourceGroupName, String clusterName) {
        ConnectedClusterInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, clusterName);
        if (inner != null) {
            return new ConnectedClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConnectedCluster> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<ConnectedClusterInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConnectedClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String clusterName) {
        this.serviceClient().delete(resourceGroupName, clusterName);
    }

    public void delete(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, context);
    }

    public CredentialResults listClusterUserCredentials(
        String resourceGroupName, String clusterName, ListClusterUserCredentialsProperties properties) {
        CredentialResultsInner inner =
            this.serviceClient().listClusterUserCredentials(resourceGroupName, clusterName, properties);
        if (inner != null) {
            return new CredentialResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CredentialResults> listClusterUserCredentialsWithResponse(
        String resourceGroupName,
        String clusterName,
        ListClusterUserCredentialsProperties properties,
        Context context) {
        Response<CredentialResultsInner> inner =
            this
                .serviceClient()
                .listClusterUserCredentialsWithResponse(resourceGroupName, clusterName, properties, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CredentialResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ConnectedCluster> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ConnectedClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ConnectedClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<ConnectedCluster> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ConnectedClusterInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ConnectedClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<ConnectedCluster> list() {
        PagedIterable<ConnectedClusterInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ConnectedClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<ConnectedCluster> list(Context context) {
        PagedIterable<ConnectedClusterInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ConnectedClusterImpl(inner1, this.manager()));
    }

    public ConnectedCluster getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "connectedClusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedClusters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, clusterName, Context.NONE).getValue();
    }

    public Response<ConnectedCluster> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "connectedClusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedClusters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, clusterName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "connectedClusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedClusters'.", id)));
        }
        this.delete(resourceGroupName, clusterName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "connectedClusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedClusters'.", id)));
        }
        this.delete(resourceGroupName, clusterName, context);
    }

    private ConnectedClustersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridkubernetes.HybridKubernetesManager manager() {
        return this.serviceManager;
    }

    public ConnectedClusterImpl define(String name) {
        return new ConnectedClusterImpl(name, this.manager());
    }
}
