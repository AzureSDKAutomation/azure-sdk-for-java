// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.fluent.ClustersClient;
import com.azure.resourcemanager.hdinsight.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.hdinsight.fluent.models.ClusterInner;
import com.azure.resourcemanager.hdinsight.fluent.models.GatewaySettingsInner;
import com.azure.resourcemanager.hdinsight.models.AsyncOperationResult;
import com.azure.resourcemanager.hdinsight.models.AutoscaleConfigurationUpdateParameter;
import com.azure.resourcemanager.hdinsight.models.Cluster;
import com.azure.resourcemanager.hdinsight.models.ClusterDiskEncryptionParameters;
import com.azure.resourcemanager.hdinsight.models.ClusterResizeParameters;
import com.azure.resourcemanager.hdinsight.models.Clusters;
import com.azure.resourcemanager.hdinsight.models.ExecuteScriptActionParameters;
import com.azure.resourcemanager.hdinsight.models.GatewaySettings;
import com.azure.resourcemanager.hdinsight.models.RoleName;
import com.azure.resourcemanager.hdinsight.models.UpdateClusterIdentityCertificateParameters;
import com.azure.resourcemanager.hdinsight.models.UpdateGatewaySettingsParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ClustersImpl implements Clusters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClustersImpl.class);

    private final ClustersClient innerClient;

    private final HDInsightManager serviceManager;

    public ClustersImpl(ClustersClient innerClient, HDInsightManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String clusterName) {
        this.serviceClient().delete(resourceGroupName, clusterName);
    }

    public void delete(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, context);
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

    public PagedIterable<Cluster> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public void resize(
        String resourceGroupName, String clusterName, RoleName roleName, ClusterResizeParameters parameters) {
        this.serviceClient().resize(resourceGroupName, clusterName, roleName, parameters);
    }

    public void resize(
        String resourceGroupName,
        String clusterName,
        RoleName roleName,
        ClusterResizeParameters parameters,
        Context context) {
        this.serviceClient().resize(resourceGroupName, clusterName, roleName, parameters, context);
    }

    public void updateAutoScaleConfiguration(
        String resourceGroupName,
        String clusterName,
        RoleName roleName,
        AutoscaleConfigurationUpdateParameter parameters) {
        this.serviceClient().updateAutoScaleConfiguration(resourceGroupName, clusterName, roleName, parameters);
    }

    public void updateAutoScaleConfiguration(
        String resourceGroupName,
        String clusterName,
        RoleName roleName,
        AutoscaleConfigurationUpdateParameter parameters,
        Context context) {
        this
            .serviceClient()
            .updateAutoScaleConfiguration(resourceGroupName, clusterName, roleName, parameters, context);
    }

    public PagedIterable<Cluster> list() {
        PagedIterable<ClusterInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> list(Context context) {
        PagedIterable<ClusterInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public void rotateDiskEncryptionKey(
        String resourceGroupName, String clusterName, ClusterDiskEncryptionParameters parameters) {
        this.serviceClient().rotateDiskEncryptionKey(resourceGroupName, clusterName, parameters);
    }

    public void rotateDiskEncryptionKey(
        String resourceGroupName, String clusterName, ClusterDiskEncryptionParameters parameters, Context context) {
        this.serviceClient().rotateDiskEncryptionKey(resourceGroupName, clusterName, parameters, context);
    }

    public GatewaySettings getGatewaySettings(String resourceGroupName, String clusterName) {
        GatewaySettingsInner inner = this.serviceClient().getGatewaySettings(resourceGroupName, clusterName);
        if (inner != null) {
            return new GatewaySettingsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GatewaySettings> getGatewaySettingsWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<GatewaySettingsInner> inner =
            this.serviceClient().getGatewaySettingsWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GatewaySettingsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void updateGatewaySettings(
        String resourceGroupName, String clusterName, UpdateGatewaySettingsParameters parameters) {
        this.serviceClient().updateGatewaySettings(resourceGroupName, clusterName, parameters);
    }

    public void updateGatewaySettings(
        String resourceGroupName, String clusterName, UpdateGatewaySettingsParameters parameters, Context context) {
        this.serviceClient().updateGatewaySettings(resourceGroupName, clusterName, parameters, context);
    }

    public AsyncOperationResult getAzureAsyncOperationStatus(
        String resourceGroupName, String clusterName, String operationId) {
        AsyncOperationResultInner inner =
            this.serviceClient().getAzureAsyncOperationStatus(resourceGroupName, clusterName, operationId);
        if (inner != null) {
            return new AsyncOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AsyncOperationResult> getAzureAsyncOperationStatusWithResponse(
        String resourceGroupName, String clusterName, String operationId, Context context) {
        Response<AsyncOperationResultInner> inner =
            this
                .serviceClient()
                .getAzureAsyncOperationStatusWithResponse(resourceGroupName, clusterName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AsyncOperationResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void updateIdentityCertificate(
        String resourceGroupName, String clusterName, UpdateClusterIdentityCertificateParameters parameters) {
        this.serviceClient().updateIdentityCertificate(resourceGroupName, clusterName, parameters);
    }

    public void updateIdentityCertificate(
        String resourceGroupName,
        String clusterName,
        UpdateClusterIdentityCertificateParameters parameters,
        Context context) {
        this.serviceClient().updateIdentityCertificate(resourceGroupName, clusterName, parameters, context);
    }

    public void executeScriptActions(
        String resourceGroupName, String clusterName, ExecuteScriptActionParameters parameters) {
        this.serviceClient().executeScriptActions(resourceGroupName, clusterName, parameters);
    }

    public void executeScriptActions(
        String resourceGroupName, String clusterName, ExecuteScriptActionParameters parameters, Context context) {
        this.serviceClient().executeScriptActions(resourceGroupName, clusterName, parameters, context);
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
        this.delete(resourceGroupName, clusterName, Context.NONE);
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        this.delete(resourceGroupName, clusterName, context);
    }

    private ClustersClient serviceClient() {
        return this.innerClient;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }

    public ClusterImpl define(String name) {
        return new ClusterImpl(name, this.manager());
    }
}
