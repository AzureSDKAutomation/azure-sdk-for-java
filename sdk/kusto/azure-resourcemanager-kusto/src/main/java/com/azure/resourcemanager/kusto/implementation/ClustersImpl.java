// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.fluent.ClustersClient;
import com.azure.resourcemanager.kusto.fluent.models.AzureResourceSkuInner;
import com.azure.resourcemanager.kusto.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.kusto.fluent.models.ClusterInner;
import com.azure.resourcemanager.kusto.fluent.models.DiagnoseVirtualNetworkResultInner;
import com.azure.resourcemanager.kusto.fluent.models.FollowerDatabaseDefinitionInner;
import com.azure.resourcemanager.kusto.fluent.models.LanguageExtensionInner;
import com.azure.resourcemanager.kusto.fluent.models.SkuDescriptionInner;
import com.azure.resourcemanager.kusto.models.AzureResourceSku;
import com.azure.resourcemanager.kusto.models.CheckNameResult;
import com.azure.resourcemanager.kusto.models.Cluster;
import com.azure.resourcemanager.kusto.models.ClusterCheckNameRequest;
import com.azure.resourcemanager.kusto.models.Clusters;
import com.azure.resourcemanager.kusto.models.DiagnoseVirtualNetworkResult;
import com.azure.resourcemanager.kusto.models.FollowerDatabaseDefinition;
import com.azure.resourcemanager.kusto.models.LanguageExtension;
import com.azure.resourcemanager.kusto.models.LanguageExtensionsList;
import com.azure.resourcemanager.kusto.models.SkuDescription;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ClustersImpl implements Clusters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClustersImpl.class);

    private final ClustersClient innerClient;

    private final KustoManager serviceManager;

    public ClustersImpl(ClustersClient innerClient, KustoManager serviceManager) {
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

    public void delete(String resourceGroupName, String clusterName) {
        this.serviceClient().delete(resourceGroupName, clusterName);
    }

    public void delete(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, context);
    }

    public void stop(String resourceGroupName, String clusterName) {
        this.serviceClient().stop(resourceGroupName, clusterName);
    }

    public void stop(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().stop(resourceGroupName, clusterName, context);
    }

    public void start(String resourceGroupName, String clusterName) {
        this.serviceClient().start(resourceGroupName, clusterName);
    }

    public void start(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().start(resourceGroupName, clusterName, context);
    }

    public PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases(
        String resourceGroupName, String clusterName) {
        PagedIterable<FollowerDatabaseDefinitionInner> inner =
            this.serviceClient().listFollowerDatabases(resourceGroupName, clusterName);
        return inner.mapPage(inner1 -> new FollowerDatabaseDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases(
        String resourceGroupName, String clusterName, Context context) {
        PagedIterable<FollowerDatabaseDefinitionInner> inner =
            this.serviceClient().listFollowerDatabases(resourceGroupName, clusterName, context);
        return inner.mapPage(inner1 -> new FollowerDatabaseDefinitionImpl(inner1, this.manager()));
    }

    public void detachFollowerDatabases(
        String resourceGroupName, String clusterName, FollowerDatabaseDefinitionInner followerDatabaseToRemove) {
        this.serviceClient().detachFollowerDatabases(resourceGroupName, clusterName, followerDatabaseToRemove);
    }

    public void detachFollowerDatabases(
        String resourceGroupName,
        String clusterName,
        FollowerDatabaseDefinitionInner followerDatabaseToRemove,
        Context context) {
        this.serviceClient().detachFollowerDatabases(resourceGroupName, clusterName, followerDatabaseToRemove, context);
    }

    public DiagnoseVirtualNetworkResult diagnoseVirtualNetwork(String resourceGroupName, String clusterName) {
        DiagnoseVirtualNetworkResultInner inner =
            this.serviceClient().diagnoseVirtualNetwork(resourceGroupName, clusterName);
        if (inner != null) {
            return new DiagnoseVirtualNetworkResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DiagnoseVirtualNetworkResult diagnoseVirtualNetwork(
        String resourceGroupName, String clusterName, Context context) {
        DiagnoseVirtualNetworkResultInner inner =
            this.serviceClient().diagnoseVirtualNetwork(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new DiagnoseVirtualNetworkResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Cluster> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> list() {
        PagedIterable<ClusterInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> list(Context context) {
        PagedIterable<ClusterInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<SkuDescription> listSkus() {
        PagedIterable<SkuDescriptionInner> inner = this.serviceClient().listSkus();
        return inner.mapPage(inner1 -> new SkuDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<SkuDescription> listSkus(Context context) {
        PagedIterable<SkuDescriptionInner> inner = this.serviceClient().listSkus(context);
        return inner.mapPage(inner1 -> new SkuDescriptionImpl(inner1, this.manager()));
    }

    public CheckNameResult checkNameAvailability(String location, ClusterCheckNameRequest clusterName) {
        CheckNameResultInner inner = this.serviceClient().checkNameAvailability(location, clusterName);
        if (inner != null) {
            return new CheckNameResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameResult> checkNameAvailabilityWithResponse(
        String location, ClusterCheckNameRequest clusterName, Context context) {
        Response<CheckNameResultInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(location, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AzureResourceSku> listSkusByResource(String resourceGroupName, String clusterName) {
        PagedIterable<AzureResourceSkuInner> inner =
            this.serviceClient().listSkusByResource(resourceGroupName, clusterName);
        return inner.mapPage(inner1 -> new AzureResourceSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureResourceSku> listSkusByResource(
        String resourceGroupName, String clusterName, Context context) {
        PagedIterable<AzureResourceSkuInner> inner =
            this.serviceClient().listSkusByResource(resourceGroupName, clusterName, context);
        return inner.mapPage(inner1 -> new AzureResourceSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<LanguageExtension> listLanguageExtensions(String resourceGroupName, String clusterName) {
        PagedIterable<LanguageExtensionInner> inner =
            this.serviceClient().listLanguageExtensions(resourceGroupName, clusterName);
        return inner.mapPage(inner1 -> new LanguageExtensionImpl(inner1, this.manager()));
    }

    public PagedIterable<LanguageExtension> listLanguageExtensions(
        String resourceGroupName, String clusterName, Context context) {
        PagedIterable<LanguageExtensionInner> inner =
            this.serviceClient().listLanguageExtensions(resourceGroupName, clusterName, context);
        return inner.mapPage(inner1 -> new LanguageExtensionImpl(inner1, this.manager()));
    }

    public void addLanguageExtensions(
        String resourceGroupName, String clusterName, LanguageExtensionsList languageExtensionsToAdd) {
        this.serviceClient().addLanguageExtensions(resourceGroupName, clusterName, languageExtensionsToAdd);
    }

    public void addLanguageExtensions(
        String resourceGroupName, String clusterName, LanguageExtensionsList languageExtensionsToAdd, Context context) {
        this.serviceClient().addLanguageExtensions(resourceGroupName, clusterName, languageExtensionsToAdd, context);
    }

    public void removeLanguageExtensions(
        String resourceGroupName, String clusterName, LanguageExtensionsList languageExtensionsToRemove) {
        this.serviceClient().removeLanguageExtensions(resourceGroupName, clusterName, languageExtensionsToRemove);
    }

    public void removeLanguageExtensions(
        String resourceGroupName,
        String clusterName,
        LanguageExtensionsList languageExtensionsToRemove,
        Context context) {
        this
            .serviceClient()
            .removeLanguageExtensions(resourceGroupName, clusterName, languageExtensionsToRemove, context);
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

    private KustoManager manager() {
        return this.serviceManager;
    }

    public ClusterImpl define(String name) {
        return new ClusterImpl(name, this.manager());
    }
}
