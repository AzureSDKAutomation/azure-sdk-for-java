// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureactivedirectory.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azureactivedirectory.fluent.AzureADMetricsClient;
import com.azure.resourcemanager.azureactivedirectory.fluent.models.AzureADMetricsConfigInner;
import com.azure.resourcemanager.azureactivedirectory.models.AzureADMetrics;
import com.azure.resourcemanager.azureactivedirectory.models.AzureADMetricsConfig;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AzureADMetricsImpl implements AzureADMetrics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureADMetricsImpl.class);

    private final AzureADMetricsClient innerClient;

    private final com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager serviceManager;

    public AzureADMetricsImpl(
        AzureADMetricsClient innerClient,
        com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AzureADMetricsConfig getByResourceGroup(String resourceGroupName, String azureADMetricsName) {
        AzureADMetricsConfigInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, azureADMetricsName);
        if (inner != null) {
            return new AzureADMetricsConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AzureADMetricsConfig> getByResourceGroupWithResponse(
        String resourceGroupName, String azureADMetricsName, Context context) {
        Response<AzureADMetricsConfigInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, azureADMetricsName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AzureADMetricsConfigImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String azureADMetricsName) {
        this.serviceClient().delete(resourceGroupName, azureADMetricsName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String azureADMetricsName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, azureADMetricsName, context);
    }

    public PagedIterable<AzureADMetricsConfig> list() {
        PagedIterable<AzureADMetricsConfigInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AzureADMetricsConfigImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureADMetricsConfig> list(Context context) {
        PagedIterable<AzureADMetricsConfigInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AzureADMetricsConfigImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureADMetricsConfig> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AzureADMetricsConfigInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AzureADMetricsConfigImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureADMetricsConfig> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AzureADMetricsConfigInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AzureADMetricsConfigImpl(inner1, this.manager()));
    }

    public AzureADMetricsConfig getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String azureADMetricsName = Utils.getValueFromIdByName(id, "azureADMetrics");
        if (azureADMetricsName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'azureADMetrics'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, azureADMetricsName, Context.NONE).getValue();
    }

    public Response<AzureADMetricsConfig> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String azureADMetricsName = Utils.getValueFromIdByName(id, "azureADMetrics");
        if (azureADMetricsName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'azureADMetrics'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, azureADMetricsName, context);
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
        String azureADMetricsName = Utils.getValueFromIdByName(id, "azureADMetrics");
        if (azureADMetricsName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'azureADMetrics'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, azureADMetricsName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String azureADMetricsName = Utils.getValueFromIdByName(id, "azureADMetrics");
        if (azureADMetricsName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'azureADMetrics'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, azureADMetricsName, context);
    }

    private AzureADMetricsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager manager() {
        return this.serviceManager;
    }

    public AzureADMetricsConfigImpl define(String name) {
        return new AzureADMetricsConfigImpl(name, this.manager());
    }
}
