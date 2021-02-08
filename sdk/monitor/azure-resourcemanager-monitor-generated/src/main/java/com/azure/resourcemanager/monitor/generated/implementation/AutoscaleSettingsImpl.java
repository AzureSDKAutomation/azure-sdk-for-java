// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.AutoscaleSettingsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.AutoscaleSettingResourceInner;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleSettingResource;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AutoscaleSettingsImpl implements AutoscaleSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoscaleSettingsImpl.class);

    private final AutoscaleSettingsClient innerClient;

    private final MonitorManager serviceManager;

    public AutoscaleSettingsImpl(AutoscaleSettingsClient innerClient, MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AutoscaleSettingResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AutoscaleSettingResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new AutoscaleSettingResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AutoscaleSettingResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AutoscaleSettingResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new AutoscaleSettingResourceImpl(inner1, this.manager()));
    }

    public void deleteByResourceGroup(String resourceGroupName, String autoscaleSettingName) {
        this.serviceClient().delete(resourceGroupName, autoscaleSettingName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String autoscaleSettingName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, autoscaleSettingName, context);
    }

    public AutoscaleSettingResource getByResourceGroup(String resourceGroupName, String autoscaleSettingName) {
        AutoscaleSettingResourceInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, autoscaleSettingName);
        if (inner != null) {
            return new AutoscaleSettingResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AutoscaleSettingResource> getByResourceGroupWithResponse(
        String resourceGroupName, String autoscaleSettingName, Context context) {
        Response<AutoscaleSettingResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, autoscaleSettingName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AutoscaleSettingResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AutoscaleSettingResource> list() {
        PagedIterable<AutoscaleSettingResourceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new AutoscaleSettingResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AutoscaleSettingResource> list(Context context) {
        PagedIterable<AutoscaleSettingResourceInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new AutoscaleSettingResourceImpl(inner1, this.manager()));
    }

    public AutoscaleSettingResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String autoscaleSettingName = Utils.getValueFromIdByName(id, "autoscalesettings");
        if (autoscaleSettingName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'autoscalesettings'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, autoscaleSettingName, Context.NONE).getValue();
    }

    public Response<AutoscaleSettingResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String autoscaleSettingName = Utils.getValueFromIdByName(id, "autoscalesettings");
        if (autoscaleSettingName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'autoscalesettings'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, autoscaleSettingName, context);
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
        String autoscaleSettingName = Utils.getValueFromIdByName(id, "autoscalesettings");
        if (autoscaleSettingName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'autoscalesettings'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, autoscaleSettingName, Context.NONE).getValue();
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
        String autoscaleSettingName = Utils.getValueFromIdByName(id, "autoscalesettings");
        if (autoscaleSettingName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'autoscalesettings'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, autoscaleSettingName, context);
    }

    private AutoscaleSettingsClient serviceClient() {
        return this.innerClient;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }

    public AutoscaleSettingResourceImpl define(String name) {
        return new AutoscaleSettingResourceImpl(name, this.manager());
    }
}