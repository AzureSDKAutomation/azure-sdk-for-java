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
import com.azure.resourcemanager.monitor.generated.fluent.MetricAlertsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricAlertResourceInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricAlertsQuotaInner;
import com.azure.resourcemanager.monitor.generated.models.MetricAlertResource;
import com.azure.resourcemanager.monitor.generated.models.MetricAlerts;
import com.azure.resourcemanager.monitor.generated.models.MetricAlertsQuota;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MetricAlertsImpl implements MetricAlerts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricAlertsImpl.class);

    private final MetricAlertsClient innerClient;

    private final MonitorManager serviceManager;

    public MetricAlertsImpl(MetricAlertsClient innerClient, MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MetricAlertResource> list() {
        PagedIterable<MetricAlertResourceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new MetricAlertResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricAlertResource> list(Context context) {
        PagedIterable<MetricAlertResourceInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new MetricAlertResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricAlertResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<MetricAlertResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new MetricAlertResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricAlertResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<MetricAlertResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new MetricAlertResourceImpl(inner1, this.manager()));
    }

    public MetricAlertResource getByResourceGroup(String resourceGroupName, String ruleName) {
        MetricAlertResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, ruleName);
        if (inner != null) {
            return new MetricAlertResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MetricAlertResource> getByResourceGroupWithResponse(
        String resourceGroupName, String ruleName, Context context) {
        Response<MetricAlertResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, ruleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MetricAlertResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String ruleName) {
        this.serviceClient().delete(resourceGroupName, ruleName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String ruleName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, ruleName, context);
    }

    public MetricAlertsQuota getQuota(String resourceGroupName, String ruleName) {
        MetricAlertsQuotaInner inner = this.serviceClient().getQuota(resourceGroupName, ruleName);
        if (inner != null) {
            return new MetricAlertsQuotaImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MetricAlertsQuota> getQuotaWithResponse(
        String resourceGroupName, String ruleName, Context context) {
        Response<MetricAlertsQuotaInner> inner =
            this.serviceClient().getQuotaWithResponse(resourceGroupName, ruleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MetricAlertsQuotaImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MetricAlertResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "metricAlerts");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metricAlerts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, ruleName, Context.NONE).getValue();
    }

    public Response<MetricAlertResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "metricAlerts");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metricAlerts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, ruleName, context);
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
        String ruleName = Utils.getValueFromIdByName(id, "metricAlerts");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metricAlerts'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, ruleName, Context.NONE).getValue();
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
        String ruleName = Utils.getValueFromIdByName(id, "metricAlerts");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metricAlerts'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, ruleName, context);
    }

    private MetricAlertsClient serviceClient() {
        return this.innerClient;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }

    public MetricAlertResourceImpl define(String name) {
        return new MetricAlertResourceImpl(name, this.manager());
    }
}
