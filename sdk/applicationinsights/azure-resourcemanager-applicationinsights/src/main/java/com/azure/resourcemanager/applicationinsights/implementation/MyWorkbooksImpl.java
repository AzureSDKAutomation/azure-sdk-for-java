// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.fluent.MyWorkbooksClient;
import com.azure.resourcemanager.applicationinsights.fluent.models.MyWorkbookInner;
import com.azure.resourcemanager.applicationinsights.models.CategoryType;
import com.azure.resourcemanager.applicationinsights.models.MyWorkbook;
import com.azure.resourcemanager.applicationinsights.models.MyWorkbooks;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

public final class MyWorkbooksImpl implements MyWorkbooks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MyWorkbooksImpl.class);

    private final MyWorkbooksClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    public MyWorkbooksImpl(
        MyWorkbooksClient innerClient,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MyWorkbook> listByResourceGroup(String resourceGroupName, CategoryType category) {
        PagedIterable<MyWorkbookInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, category);
        return Utils.mapPage(inner, inner1 -> new MyWorkbookImpl(inner1, this.manager()));
    }

    public PagedIterable<MyWorkbook> listByResourceGroup(
        String resourceGroupName, CategoryType category, List<String> tags, Boolean canFetchContent, Context context) {
        PagedIterable<MyWorkbookInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, category, tags, canFetchContent, context);
        return Utils.mapPage(inner, inner1 -> new MyWorkbookImpl(inner1, this.manager()));
    }

    public PagedIterable<MyWorkbook> list(CategoryType category) {
        PagedIterable<MyWorkbookInner> inner = this.serviceClient().list(category);
        return Utils.mapPage(inner, inner1 -> new MyWorkbookImpl(inner1, this.manager()));
    }

    public PagedIterable<MyWorkbook> list(
        CategoryType category, List<String> tags, Boolean canFetchContent, Context context) {
        PagedIterable<MyWorkbookInner> inner = this.serviceClient().list(category, tags, canFetchContent, context);
        return Utils.mapPage(inner, inner1 -> new MyWorkbookImpl(inner1, this.manager()));
    }

    public MyWorkbook getByResourceGroup(String resourceGroupName, String resourceName) {
        MyWorkbookInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new MyWorkbookImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MyWorkbook> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<MyWorkbookInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MyWorkbookImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String resourceName) {
        this.serviceClient().delete(resourceGroupName, resourceName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, context);
    }

    public MyWorkbook getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "myWorkbooks");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'myWorkbooks'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<MyWorkbook> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "myWorkbooks");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'myWorkbooks'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
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
        String resourceName = Utils.getValueFromIdByName(id, "myWorkbooks");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'myWorkbooks'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
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
        String resourceName = Utils.getValueFromIdByName(id, "myWorkbooks");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'myWorkbooks'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, resourceName, context);
    }

    private MyWorkbooksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    public MyWorkbookImpl define(String name) {
        return new MyWorkbookImpl(name, this.manager());
    }
}
