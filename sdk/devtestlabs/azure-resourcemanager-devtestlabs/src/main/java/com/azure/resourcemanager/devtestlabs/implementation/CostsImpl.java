// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.fluent.CostsClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.LabCostInner;
import com.azure.resourcemanager.devtestlabs.models.Costs;
import com.azure.resourcemanager.devtestlabs.models.LabCost;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CostsImpl implements Costs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CostsImpl.class);

    private final CostsClient innerClient;

    private final DevTestLabsManager serviceManager;

    public CostsImpl(CostsClient innerClient, DevTestLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LabCost get(String resourceGroupName, String labName, String name) {
        LabCostInner inner = this.serviceClient().get(resourceGroupName, labName, name);
        if (inner != null) {
            return new LabCostImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LabCost> getWithResponse(
        String resourceGroupName, String labName, String name, String expand, Context context) {
        Response<LabCostInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, labName, name, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LabCostImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LabCost getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "costs");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'costs'.", id)));
        }
        String localExpand = null;
        return this.getWithResponse(resourceGroupName, labName, name, localExpand, Context.NONE).getValue();
    }

    public Response<LabCost> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "costs");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'costs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, labName, name, expand, context);
    }

    private CostsClient serviceClient() {
        return this.innerClient;
    }

    private DevTestLabsManager manager() {
        return this.serviceManager;
    }

    public LabCostImpl define(String name) {
        return new LabCostImpl(name, this.manager());
    }
}
