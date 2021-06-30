// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.CloudServicesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.CloudServiceInner;
import com.azure.resourcemanager.compute.generated.fluent.models.CloudServiceInstanceViewInner;
import com.azure.resourcemanager.compute.generated.models.CloudService;
import com.azure.resourcemanager.compute.generated.models.CloudServiceInstanceView;
import com.azure.resourcemanager.compute.generated.models.CloudServices;
import com.azure.resourcemanager.compute.generated.models.RoleInstances;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CloudServicesImpl implements CloudServices {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudServicesImpl.class);

    private final CloudServicesClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public CloudServicesImpl(
        CloudServicesClient innerClient, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String cloudServiceName) {
        this.serviceClient().delete(resourceGroupName, cloudServiceName);
    }

    public void delete(String resourceGroupName, String cloudServiceName, Context context) {
        this.serviceClient().delete(resourceGroupName, cloudServiceName, context);
    }

    public CloudService getByResourceGroup(String resourceGroupName, String cloudServiceName) {
        CloudServiceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, cloudServiceName);
        if (inner != null) {
            return new CloudServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CloudService> getByResourceGroupWithResponse(
        String resourceGroupName, String cloudServiceName, Context context) {
        Response<CloudServiceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, cloudServiceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CloudServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CloudServiceInstanceView getInstanceView(String resourceGroupName, String cloudServiceName) {
        CloudServiceInstanceViewInner inner = this.serviceClient().getInstanceView(resourceGroupName, cloudServiceName);
        if (inner != null) {
            return new CloudServiceInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CloudServiceInstanceView> getInstanceViewWithResponse(
        String resourceGroupName, String cloudServiceName, Context context) {
        Response<CloudServiceInstanceViewInner> inner =
            this.serviceClient().getInstanceViewWithResponse(resourceGroupName, cloudServiceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CloudServiceInstanceViewImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<CloudService> list() {
        PagedIterable<CloudServiceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new CloudServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudService> list(Context context) {
        PagedIterable<CloudServiceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new CloudServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudService> listByResourceGroup(String resourceGroupName) {
        PagedIterable<CloudServiceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new CloudServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudService> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<CloudServiceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new CloudServiceImpl(inner1, this.manager()));
    }

    public void start(String resourceGroupName, String cloudServiceName) {
        this.serviceClient().start(resourceGroupName, cloudServiceName);
    }

    public void start(String resourceGroupName, String cloudServiceName, Context context) {
        this.serviceClient().start(resourceGroupName, cloudServiceName, context);
    }

    public void powerOff(String resourceGroupName, String cloudServiceName) {
        this.serviceClient().powerOff(resourceGroupName, cloudServiceName);
    }

    public void powerOff(String resourceGroupName, String cloudServiceName, Context context) {
        this.serviceClient().powerOff(resourceGroupName, cloudServiceName, context);
    }

    public void restart(String resourceGroupName, String cloudServiceName, RoleInstances parameters) {
        this.serviceClient().restart(resourceGroupName, cloudServiceName, parameters);
    }

    public void restart(String resourceGroupName, String cloudServiceName) {
        this.serviceClient().restart(resourceGroupName, cloudServiceName);
    }

    public void restart(String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context) {
        this.serviceClient().restart(resourceGroupName, cloudServiceName, parameters, context);
    }

    public void reimage(String resourceGroupName, String cloudServiceName, RoleInstances parameters) {
        this.serviceClient().reimage(resourceGroupName, cloudServiceName, parameters);
    }

    public void reimage(String resourceGroupName, String cloudServiceName) {
        this.serviceClient().reimage(resourceGroupName, cloudServiceName);
    }

    public void reimage(String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context) {
        this.serviceClient().reimage(resourceGroupName, cloudServiceName, parameters, context);
    }

    public void rebuild(String resourceGroupName, String cloudServiceName, RoleInstances parameters) {
        this.serviceClient().rebuild(resourceGroupName, cloudServiceName, parameters);
    }

    public void rebuild(String resourceGroupName, String cloudServiceName) {
        this.serviceClient().rebuild(resourceGroupName, cloudServiceName);
    }

    public void rebuild(String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context) {
        this.serviceClient().rebuild(resourceGroupName, cloudServiceName, parameters, context);
    }

    public void deleteInstances(String resourceGroupName, String cloudServiceName, RoleInstances parameters) {
        this.serviceClient().deleteInstances(resourceGroupName, cloudServiceName, parameters);
    }

    public void deleteInstances(String resourceGroupName, String cloudServiceName) {
        this.serviceClient().deleteInstances(resourceGroupName, cloudServiceName);
    }

    public void deleteInstances(
        String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context) {
        this.serviceClient().deleteInstances(resourceGroupName, cloudServiceName, parameters, context);
    }

    public CloudService getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudServiceName = Utils.getValueFromIdByName(id, "cloudServices");
        if (cloudServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'cloudServices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, cloudServiceName, Context.NONE).getValue();
    }

    public Response<CloudService> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudServiceName = Utils.getValueFromIdByName(id, "cloudServices");
        if (cloudServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'cloudServices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, cloudServiceName, context);
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
        String cloudServiceName = Utils.getValueFromIdByName(id, "cloudServices");
        if (cloudServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'cloudServices'.", id)));
        }
        this.delete(resourceGroupName, cloudServiceName, Context.NONE);
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
        String cloudServiceName = Utils.getValueFromIdByName(id, "cloudServices");
        if (cloudServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'cloudServices'.", id)));
        }
        this.delete(resourceGroupName, cloudServiceName, context);
    }

    private CloudServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public CloudServiceImpl define(String name) {
        return new CloudServiceImpl(name, this.manager());
    }
}
