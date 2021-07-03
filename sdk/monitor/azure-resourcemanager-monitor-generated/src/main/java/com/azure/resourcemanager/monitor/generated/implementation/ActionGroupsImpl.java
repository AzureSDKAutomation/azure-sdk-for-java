// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.ActionGroupsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.ActionGroupResourceInner;
import com.azure.resourcemanager.monitor.generated.models.ActionGroupResource;
import com.azure.resourcemanager.monitor.generated.models.ActionGroups;
import com.azure.resourcemanager.monitor.generated.models.EnableRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ActionGroupsImpl implements ActionGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActionGroupsImpl.class);

    private final ActionGroupsClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public ActionGroupsImpl(
        ActionGroupsClient innerClient, com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ActionGroupResource getByResourceGroup(String resourceGroupName, String actionGroupName) {
        ActionGroupResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, actionGroupName);
        if (inner != null) {
            return new ActionGroupResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ActionGroupResource> getByResourceGroupWithResponse(
        String resourceGroupName, String actionGroupName, Context context) {
        Response<ActionGroupResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, actionGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ActionGroupResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String actionGroupName) {
        this.serviceClient().delete(resourceGroupName, actionGroupName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String actionGroupName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, actionGroupName, context);
    }

    public PagedIterable<ActionGroupResource> list() {
        PagedIterable<ActionGroupResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ActionGroupResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ActionGroupResource> list(Context context) {
        PagedIterable<ActionGroupResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ActionGroupResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ActionGroupResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ActionGroupResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ActionGroupResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ActionGroupResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ActionGroupResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ActionGroupResourceImpl(inner1, this.manager()));
    }

    public void enableReceiver(String resourceGroupName, String actionGroupName, EnableRequest enableRequest) {
        this.serviceClient().enableReceiver(resourceGroupName, actionGroupName, enableRequest);
    }

    public Response<Void> enableReceiverWithResponse(
        String resourceGroupName, String actionGroupName, EnableRequest enableRequest, Context context) {
        return this
            .serviceClient()
            .enableReceiverWithResponse(resourceGroupName, actionGroupName, enableRequest, context);
    }

    public ActionGroupResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String actionGroupName = Utils.getValueFromIdByName(id, "actionGroups");
        if (actionGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'actionGroups'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, actionGroupName, Context.NONE).getValue();
    }

    public Response<ActionGroupResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String actionGroupName = Utils.getValueFromIdByName(id, "actionGroups");
        if (actionGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'actionGroups'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, actionGroupName, context);
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
        String actionGroupName = Utils.getValueFromIdByName(id, "actionGroups");
        if (actionGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'actionGroups'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, actionGroupName, Context.NONE).getValue();
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
        String actionGroupName = Utils.getValueFromIdByName(id, "actionGroups");
        if (actionGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'actionGroups'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, actionGroupName, context);
    }

    private ActionGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    public ActionGroupResourceImpl define(String name) {
        return new ActionGroupResourceImpl(name, this.manager());
    }
}
