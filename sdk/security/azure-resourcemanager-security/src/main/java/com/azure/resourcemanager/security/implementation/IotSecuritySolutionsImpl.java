// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.IotSecuritySolutionsClient;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionModelInner;
import com.azure.resourcemanager.security.models.IoTSecuritySolutionModel;
import com.azure.resourcemanager.security.models.IotSecuritySolutions;
import com.azure.resourcemanager.security.models.UpdateIotSecuritySolutionData;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IotSecuritySolutionsImpl implements IotSecuritySolutions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotSecuritySolutionsImpl.class);

    private final IotSecuritySolutionsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public IotSecuritySolutionsImpl(
        IotSecuritySolutionsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<IoTSecuritySolutionModel> list() {
        PagedIterable<IoTSecuritySolutionModelInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new IoTSecuritySolutionModelImpl(inner1, this.manager()));
    }

    public PagedIterable<IoTSecuritySolutionModel> list(String filter, Context context) {
        PagedIterable<IoTSecuritySolutionModelInner> inner = this.serviceClient().list(filter, context);
        return Utils.mapPage(inner, inner1 -> new IoTSecuritySolutionModelImpl(inner1, this.manager()));
    }

    public PagedIterable<IoTSecuritySolutionModel> listByResourceGroup(String resourceGroupName) {
        PagedIterable<IoTSecuritySolutionModelInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new IoTSecuritySolutionModelImpl(inner1, this.manager()));
    }

    public PagedIterable<IoTSecuritySolutionModel> listByResourceGroup(
        String resourceGroupName, String filter, Context context) {
        PagedIterable<IoTSecuritySolutionModelInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, context);
        return Utils.mapPage(inner, inner1 -> new IoTSecuritySolutionModelImpl(inner1, this.manager()));
    }

    public IoTSecuritySolutionModel getByResourceGroup(String resourceGroupName, String solutionName) {
        IoTSecuritySolutionModelInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, solutionName);
        if (inner != null) {
            return new IoTSecuritySolutionModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IoTSecuritySolutionModel> getByResourceGroupWithResponse(
        String resourceGroupName, String solutionName, Context context) {
        Response<IoTSecuritySolutionModelInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, solutionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IoTSecuritySolutionModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IoTSecuritySolutionModel createOrUpdate(
        String resourceGroupName, String solutionName, IoTSecuritySolutionModelInner iotSecuritySolutionData) {
        IoTSecuritySolutionModelInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, solutionName, iotSecuritySolutionData);
        if (inner != null) {
            return new IoTSecuritySolutionModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IoTSecuritySolutionModel> createOrUpdateWithResponse(
        String resourceGroupName,
        String solutionName,
        IoTSecuritySolutionModelInner iotSecuritySolutionData,
        Context context) {
        Response<IoTSecuritySolutionModelInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(resourceGroupName, solutionName, iotSecuritySolutionData, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IoTSecuritySolutionModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IoTSecuritySolutionModel update(
        String resourceGroupName, String solutionName, UpdateIotSecuritySolutionData updateIotSecuritySolutionData) {
        IoTSecuritySolutionModelInner inner =
            this.serviceClient().update(resourceGroupName, solutionName, updateIotSecuritySolutionData);
        if (inner != null) {
            return new IoTSecuritySolutionModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IoTSecuritySolutionModel> updateWithResponse(
        String resourceGroupName,
        String solutionName,
        UpdateIotSecuritySolutionData updateIotSecuritySolutionData,
        Context context) {
        Response<IoTSecuritySolutionModelInner> inner =
            this
                .serviceClient()
                .updateWithResponse(resourceGroupName, solutionName, updateIotSecuritySolutionData, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IoTSecuritySolutionModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String solutionName) {
        this.serviceClient().delete(resourceGroupName, solutionName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String solutionName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, solutionName, context);
    }

    private IotSecuritySolutionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
