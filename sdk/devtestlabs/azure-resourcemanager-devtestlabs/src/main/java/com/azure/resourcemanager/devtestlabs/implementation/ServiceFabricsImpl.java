// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.fluent.ServiceFabricsClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.ApplicableScheduleInner;
import com.azure.resourcemanager.devtestlabs.fluent.models.ServiceFabricInner;
import com.azure.resourcemanager.devtestlabs.models.ApplicableSchedule;
import com.azure.resourcemanager.devtestlabs.models.ServiceFabric;
import com.azure.resourcemanager.devtestlabs.models.ServiceFabrics;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServiceFabricsImpl implements ServiceFabrics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceFabricsImpl.class);

    private final ServiceFabricsClient innerClient;

    private final DevTestLabsManager serviceManager;

    public ServiceFabricsImpl(ServiceFabricsClient innerClient, DevTestLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ServiceFabric> list(String resourceGroupName, String labName, String username) {
        PagedIterable<ServiceFabricInner> inner = this.serviceClient().list(resourceGroupName, labName, username);
        return Utils.mapPage(inner, inner1 -> new ServiceFabricImpl(inner1, this.manager()));
    }

    public PagedIterable<ServiceFabric> list(
        String resourceGroupName,
        String labName,
        String username,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context) {
        PagedIterable<ServiceFabricInner> inner =
            this.serviceClient().list(resourceGroupName, labName, username, expand, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new ServiceFabricImpl(inner1, this.manager()));
    }

    public ServiceFabric get(String resourceGroupName, String labName, String username, String name) {
        ServiceFabricInner inner = this.serviceClient().get(resourceGroupName, labName, username, name);
        if (inner != null) {
            return new ServiceFabricImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServiceFabric> getWithResponse(
        String resourceGroupName, String labName, String username, String name, String expand, Context context) {
        Response<ServiceFabricInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, labName, username, name, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceFabricImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String labName, String username, String name) {
        this.serviceClient().delete(resourceGroupName, labName, username, name);
    }

    public void delete(String resourceGroupName, String labName, String username, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, labName, username, name, context);
    }

    public ApplicableSchedule listApplicableSchedules(
        String resourceGroupName, String labName, String username, String name) {
        ApplicableScheduleInner inner =
            this.serviceClient().listApplicableSchedules(resourceGroupName, labName, username, name);
        if (inner != null) {
            return new ApplicableScheduleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicableSchedule> listApplicableSchedulesWithResponse(
        String resourceGroupName, String labName, String username, String name, Context context) {
        Response<ApplicableScheduleInner> inner =
            this
                .serviceClient()
                .listApplicableSchedulesWithResponse(resourceGroupName, labName, username, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicableScheduleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void start(String resourceGroupName, String labName, String username, String name) {
        this.serviceClient().start(resourceGroupName, labName, username, name);
    }

    public void start(String resourceGroupName, String labName, String username, String name, Context context) {
        this.serviceClient().start(resourceGroupName, labName, username, name, context);
    }

    public void stop(String resourceGroupName, String labName, String username, String name) {
        this.serviceClient().stop(resourceGroupName, labName, username, name);
    }

    public void stop(String resourceGroupName, String labName, String username, String name, Context context) {
        this.serviceClient().stop(resourceGroupName, labName, username, name, context);
    }

    public ServiceFabric getById(String id) {
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
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "servicefabrics");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'servicefabrics'.", id)));
        }
        String localExpand = null;
        return this.getWithResponse(resourceGroupName, labName, username, name, localExpand, Context.NONE).getValue();
    }

    public Response<ServiceFabric> getByIdWithResponse(String id, String expand, Context context) {
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
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "servicefabrics");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'servicefabrics'.", id)));
        }
        return this.getWithResponse(resourceGroupName, labName, username, name, expand, context);
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
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "servicefabrics");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'servicefabrics'.", id)));
        }
        this.delete(resourceGroupName, labName, username, name, Context.NONE);
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
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "servicefabrics");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'servicefabrics'.", id)));
        }
        this.delete(resourceGroupName, labName, username, name, context);
    }

    private ServiceFabricsClient serviceClient() {
        return this.innerClient;
    }

    private DevTestLabsManager manager() {
        return this.serviceManager;
    }

    public ServiceFabricImpl define(String name) {
        return new ServiceFabricImpl(name, this.manager());
    }
}
