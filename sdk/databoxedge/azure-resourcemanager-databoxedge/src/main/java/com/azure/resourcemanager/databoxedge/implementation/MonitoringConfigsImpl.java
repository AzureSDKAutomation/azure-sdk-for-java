// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.fluent.MonitoringConfigsClient;
import com.azure.resourcemanager.databoxedge.fluent.models.MonitoringMetricConfigurationInner;
import com.azure.resourcemanager.databoxedge.models.MonitoringConfigs;
import com.azure.resourcemanager.databoxedge.models.MonitoringMetricConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MonitoringConfigsImpl implements MonitoringConfigs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MonitoringConfigsImpl.class);

    private final MonitoringConfigsClient innerClient;

    private final DataBoxEdgeManager serviceManager;

    public MonitoringConfigsImpl(MonitoringConfigsClient innerClient, DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MonitoringMetricConfiguration> list(
        String deviceName, String roleName, String resourceGroupName) {
        PagedIterable<MonitoringMetricConfigurationInner> inner =
            this.serviceClient().list(deviceName, roleName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new MonitoringMetricConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<MonitoringMetricConfiguration> list(
        String deviceName, String roleName, String resourceGroupName, Context context) {
        PagedIterable<MonitoringMetricConfigurationInner> inner =
            this.serviceClient().list(deviceName, roleName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new MonitoringMetricConfigurationImpl(inner1, this.manager()));
    }

    public MonitoringMetricConfiguration get(String deviceName, String roleName, String resourceGroupName) {
        MonitoringMetricConfigurationInner inner = this.serviceClient().get(deviceName, roleName, resourceGroupName);
        if (inner != null) {
            return new MonitoringMetricConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MonitoringMetricConfiguration> getWithResponse(
        String deviceName, String roleName, String resourceGroupName, Context context) {
        Response<MonitoringMetricConfigurationInner> inner =
            this.serviceClient().getWithResponse(deviceName, roleName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MonitoringMetricConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MonitoringMetricConfiguration createOrUpdate(
        String deviceName,
        String roleName,
        String resourceGroupName,
        MonitoringMetricConfigurationInner monitoringMetricConfiguration) {
        MonitoringMetricConfigurationInner inner =
            this.serviceClient().createOrUpdate(deviceName, roleName, resourceGroupName, monitoringMetricConfiguration);
        if (inner != null) {
            return new MonitoringMetricConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MonitoringMetricConfiguration createOrUpdate(
        String deviceName,
        String roleName,
        String resourceGroupName,
        MonitoringMetricConfigurationInner monitoringMetricConfiguration,
        Context context) {
        MonitoringMetricConfigurationInner inner =
            this
                .serviceClient()
                .createOrUpdate(deviceName, roleName, resourceGroupName, monitoringMetricConfiguration, context);
        if (inner != null) {
            return new MonitoringMetricConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String deviceName, String roleName, String resourceGroupName) {
        this.serviceClient().delete(deviceName, roleName, resourceGroupName);
    }

    public void delete(String deviceName, String roleName, String resourceGroupName, Context context) {
        this.serviceClient().delete(deviceName, roleName, resourceGroupName, context);
    }

    private MonitoringConfigsClient serviceClient() {
        return this.innerClient;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
