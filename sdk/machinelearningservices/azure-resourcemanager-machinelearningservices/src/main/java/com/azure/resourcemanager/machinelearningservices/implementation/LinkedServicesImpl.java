// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.MachinelearningservicesManager;
import com.azure.resourcemanager.machinelearningservices.fluent.LinkedServicesClient;
import com.azure.resourcemanager.machinelearningservices.fluent.models.LinkedServiceListInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.LinkedServiceResponseInner;
import com.azure.resourcemanager.machinelearningservices.models.LinkedServiceList;
import com.azure.resourcemanager.machinelearningservices.models.LinkedServiceResponse;
import com.azure.resourcemanager.machinelearningservices.models.LinkedServices;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LinkedServicesImpl implements LinkedServices {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinkedServicesImpl.class);

    private final LinkedServicesClient innerClient;

    private final MachinelearningservicesManager serviceManager;

    public LinkedServicesImpl(LinkedServicesClient innerClient, MachinelearningservicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LinkedServiceList list(String resourceGroupName, String workspaceName) {
        LinkedServiceListInner inner = this.serviceClient().list(resourceGroupName, workspaceName);
        if (inner != null) {
            return new LinkedServiceListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LinkedServiceList> listWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        Response<LinkedServiceListInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LinkedServiceListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LinkedServiceResponse get(String resourceGroupName, String workspaceName, String linkName) {
        LinkedServiceResponseInner inner = this.serviceClient().get(resourceGroupName, workspaceName, linkName);
        if (inner != null) {
            return new LinkedServiceResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LinkedServiceResponse> getWithResponse(
        String resourceGroupName, String workspaceName, String linkName, Context context) {
        Response<LinkedServiceResponseInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, linkName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LinkedServiceResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String workspaceName, String linkName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, linkName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String linkName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workspaceName, linkName, context);
    }

    public LinkedServiceResponse getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String linkName = Utils.getValueFromIdByName(id, "linkedServices");
        if (linkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'linkedServices'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, linkName, Context.NONE).getValue();
    }

    public Response<LinkedServiceResponse> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String linkName = Utils.getValueFromIdByName(id, "linkedServices");
        if (linkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'linkedServices'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, linkName, context);
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
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String linkName = Utils.getValueFromIdByName(id, "linkedServices");
        if (linkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'linkedServices'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, workspaceName, linkName, Context.NONE).getValue();
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
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String linkName = Utils.getValueFromIdByName(id, "linkedServices");
        if (linkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'linkedServices'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, workspaceName, linkName, context);
    }

    private LinkedServicesClient serviceClient() {
        return this.innerClient;
    }

    private MachinelearningservicesManager manager() {
        return this.serviceManager;
    }

    public LinkedServiceResponseImpl define(String name) {
        return new LinkedServiceResponseImpl(name, this.manager());
    }
}
