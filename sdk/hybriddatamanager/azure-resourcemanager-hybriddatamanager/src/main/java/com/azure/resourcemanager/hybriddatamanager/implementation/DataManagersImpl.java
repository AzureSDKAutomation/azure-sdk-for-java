// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybriddatamanager.fluent.DataManagersClient;
import com.azure.resourcemanager.hybriddatamanager.fluent.models.DataManagerInner;
import com.azure.resourcemanager.hybriddatamanager.models.DataManager;
import com.azure.resourcemanager.hybriddatamanager.models.DataManagers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataManagersImpl implements DataManagers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataManagersImpl.class);

    private final DataManagersClient innerClient;

    private final com.azure.resourcemanager.hybriddatamanager.HybridDataManager serviceManager;

    public DataManagersImpl(
        DataManagersClient innerClient, com.azure.resourcemanager.hybriddatamanager.HybridDataManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataManager> list() {
        PagedIterable<DataManagerInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DataManagerImpl(inner1, this.manager()));
    }

    public PagedIterable<DataManager> list(Context context) {
        PagedIterable<DataManagerInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new DataManagerImpl(inner1, this.manager()));
    }

    public PagedIterable<DataManager> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DataManagerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DataManagerImpl(inner1, this.manager()));
    }

    public PagedIterable<DataManager> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DataManagerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new DataManagerImpl(inner1, this.manager()));
    }

    public DataManager getByResourceGroup(String resourceGroupName, String dataManagerName) {
        DataManagerInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, dataManagerName);
        if (inner != null) {
            return new DataManagerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataManager> getByResourceGroupWithResponse(
        String resourceGroupName, String dataManagerName, Context context) {
        Response<DataManagerInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, dataManagerName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataManagerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String dataManagerName) {
        this.serviceClient().delete(resourceGroupName, dataManagerName);
    }

    public void delete(String resourceGroupName, String dataManagerName, Context context) {
        this.serviceClient().delete(resourceGroupName, dataManagerName, context);
    }

    public DataManager getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, dataManagerName, Context.NONE).getValue();
    }

    public Response<DataManager> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, dataManagerName, context);
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
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        this.delete(resourceGroupName, dataManagerName, Context.NONE);
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
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        this.delete(resourceGroupName, dataManagerName, context);
    }

    private DataManagersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager() {
        return this.serviceManager;
    }

    public DataManagerImpl define(String name) {
        return new DataManagerImpl(name, this.manager());
    }
}
