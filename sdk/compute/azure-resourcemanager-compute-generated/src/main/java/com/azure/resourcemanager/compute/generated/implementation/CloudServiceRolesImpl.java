// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.CloudServiceRolesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.CloudServiceRoleInner;
import com.azure.resourcemanager.compute.generated.models.CloudServiceRole;
import com.azure.resourcemanager.compute.generated.models.CloudServiceRoles;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CloudServiceRolesImpl implements CloudServiceRoles {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudServiceRolesImpl.class);

    private final CloudServiceRolesClient innerClient;

    private final ComputeManager serviceManager;

    public CloudServiceRolesImpl(CloudServiceRolesClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CloudServiceRole get(String roleName, String resourceGroupName, String cloudServiceName) {
        CloudServiceRoleInner inner = this.serviceClient().get(roleName, resourceGroupName, cloudServiceName);
        if (inner != null) {
            return new CloudServiceRoleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CloudServiceRole> getWithResponse(
        String roleName, String resourceGroupName, String cloudServiceName, Context context) {
        Response<CloudServiceRoleInner> inner =
            this.serviceClient().getWithResponse(roleName, resourceGroupName, cloudServiceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CloudServiceRoleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<CloudServiceRole> list(String resourceGroupName, String cloudServiceName) {
        PagedIterable<CloudServiceRoleInner> inner = this.serviceClient().list(resourceGroupName, cloudServiceName);
        return Utils.mapPage(inner, inner1 -> new CloudServiceRoleImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudServiceRole> list(String resourceGroupName, String cloudServiceName, Context context) {
        PagedIterable<CloudServiceRoleInner> inner =
            this.serviceClient().list(resourceGroupName, cloudServiceName, context);
        return Utils.mapPage(inner, inner1 -> new CloudServiceRoleImpl(inner1, this.manager()));
    }

    private CloudServiceRolesClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
