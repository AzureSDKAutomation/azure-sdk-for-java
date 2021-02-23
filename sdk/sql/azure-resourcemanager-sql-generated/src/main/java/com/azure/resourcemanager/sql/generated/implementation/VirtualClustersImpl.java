// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.VirtualClustersClient;
import com.azure.resourcemanager.sql.generated.fluent.models.VirtualClusterInner;
import com.azure.resourcemanager.sql.generated.models.VirtualCluster;
import com.azure.resourcemanager.sql.generated.models.VirtualClusterUpdate;
import com.azure.resourcemanager.sql.generated.models.VirtualClusters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualClustersImpl implements VirtualClusters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualClustersImpl.class);

    private final VirtualClustersClient innerClient;

    private final SqlManager serviceManager;

    public VirtualClustersImpl(VirtualClustersClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<VirtualCluster> list() {
        PagedIterable<VirtualClusterInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new VirtualClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualCluster> list(Context context) {
        PagedIterable<VirtualClusterInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new VirtualClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualCluster> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new VirtualClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualCluster> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualClusterImpl(inner1, this.manager()));
    }

    public VirtualCluster getByResourceGroup(String resourceGroupName, String virtualClusterName) {
        VirtualClusterInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, virtualClusterName);
        if (inner != null) {
            return new VirtualClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualCluster> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualClusterName, Context context) {
        Response<VirtualClusterInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, virtualClusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String virtualClusterName) {
        this.serviceClient().delete(resourceGroupName, virtualClusterName);
    }

    public void delete(String resourceGroupName, String virtualClusterName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualClusterName, context);
    }

    public VirtualCluster update(String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters) {
        VirtualClusterInner inner = this.serviceClient().update(resourceGroupName, virtualClusterName, parameters);
        if (inner != null) {
            return new VirtualClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualCluster update(
        String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters, Context context) {
        VirtualClusterInner inner =
            this.serviceClient().update(resourceGroupName, virtualClusterName, parameters, context);
        if (inner != null) {
            return new VirtualClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private VirtualClustersClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
