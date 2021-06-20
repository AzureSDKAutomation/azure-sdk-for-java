// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datamigration.fluent.ServicesClient;
import com.azure.resourcemanager.datamigration.fluent.models.AvailableServiceSkuInner;
import com.azure.resourcemanager.datamigration.fluent.models.DataMigrationServiceInner;
import com.azure.resourcemanager.datamigration.fluent.models.DataMigrationServiceStatusResponseInner;
import com.azure.resourcemanager.datamigration.fluent.models.NameAvailabilityResponseInner;
import com.azure.resourcemanager.datamigration.models.AvailableServiceSku;
import com.azure.resourcemanager.datamigration.models.DataMigrationService;
import com.azure.resourcemanager.datamigration.models.DataMigrationServiceStatusResponse;
import com.azure.resourcemanager.datamigration.models.NameAvailabilityRequest;
import com.azure.resourcemanager.datamigration.models.NameAvailabilityResponse;
import com.azure.resourcemanager.datamigration.models.Services;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServicesImpl implements Services {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServicesImpl.class);

    private final ServicesClient innerClient;

    private final com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager;

    public ServicesImpl(
        ServicesClient innerClient, com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DataMigrationService getByResourceGroup(String groupName, String serviceName) {
        DataMigrationServiceInner inner = this.serviceClient().getByResourceGroup(groupName, serviceName);
        if (inner != null) {
            return new DataMigrationServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataMigrationService> getByResourceGroupWithResponse(
        String groupName, String serviceName, Context context) {
        Response<DataMigrationServiceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(groupName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataMigrationServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String groupName, String serviceName, Boolean deleteRunningTasks) {
        this.serviceClient().delete(groupName, serviceName, deleteRunningTasks);
    }

    public void delete(String groupName, String serviceName) {
        this.serviceClient().delete(groupName, serviceName);
    }

    public void delete(String groupName, String serviceName, Boolean deleteRunningTasks, Context context) {
        this.serviceClient().delete(groupName, serviceName, deleteRunningTasks, context);
    }

    public DataMigrationServiceStatusResponse checkStatus(String groupName, String serviceName) {
        DataMigrationServiceStatusResponseInner inner = this.serviceClient().checkStatus(groupName, serviceName);
        if (inner != null) {
            return new DataMigrationServiceStatusResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataMigrationServiceStatusResponse> checkStatusWithResponse(
        String groupName, String serviceName, Context context) {
        Response<DataMigrationServiceStatusResponseInner> inner =
            this.serviceClient().checkStatusWithResponse(groupName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataMigrationServiceStatusResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void start(String groupName, String serviceName) {
        this.serviceClient().start(groupName, serviceName);
    }

    public void start(String groupName, String serviceName, Context context) {
        this.serviceClient().start(groupName, serviceName, context);
    }

    public void stop(String groupName, String serviceName) {
        this.serviceClient().stop(groupName, serviceName);
    }

    public void stop(String groupName, String serviceName, Context context) {
        this.serviceClient().stop(groupName, serviceName, context);
    }

    public PagedIterable<AvailableServiceSku> listSkus(String groupName, String serviceName) {
        PagedIterable<AvailableServiceSkuInner> inner = this.serviceClient().listSkus(groupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new AvailableServiceSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailableServiceSku> listSkus(String groupName, String serviceName, Context context) {
        PagedIterable<AvailableServiceSkuInner> inner = this.serviceClient().listSkus(groupName, serviceName, context);
        return Utils.mapPage(inner, inner1 -> new AvailableServiceSkuImpl(inner1, this.manager()));
    }

    public NameAvailabilityResponse checkChildrenNameAvailability(
        String groupName, String serviceName, NameAvailabilityRequest parameters) {
        NameAvailabilityResponseInner inner =
            this.serviceClient().checkChildrenNameAvailability(groupName, serviceName, parameters);
        if (inner != null) {
            return new NameAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NameAvailabilityResponse> checkChildrenNameAvailabilityWithResponse(
        String groupName, String serviceName, NameAvailabilityRequest parameters, Context context) {
        Response<NameAvailabilityResponseInner> inner =
            this.serviceClient().checkChildrenNameAvailabilityWithResponse(groupName, serviceName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NameAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DataMigrationService> listByResourceGroup(String groupName) {
        PagedIterable<DataMigrationServiceInner> inner = this.serviceClient().listByResourceGroup(groupName);
        return Utils.mapPage(inner, inner1 -> new DataMigrationServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataMigrationService> listByResourceGroup(String groupName, Context context) {
        PagedIterable<DataMigrationServiceInner> inner = this.serviceClient().listByResourceGroup(groupName, context);
        return Utils.mapPage(inner, inner1 -> new DataMigrationServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataMigrationService> list() {
        PagedIterable<DataMigrationServiceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DataMigrationServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataMigrationService> list(Context context) {
        PagedIterable<DataMigrationServiceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new DataMigrationServiceImpl(inner1, this.manager()));
    }

    public NameAvailabilityResponse checkNameAvailability(String location, NameAvailabilityRequest parameters) {
        NameAvailabilityResponseInner inner = this.serviceClient().checkNameAvailability(location, parameters);
        if (inner != null) {
            return new NameAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NameAvailabilityResponse> checkNameAvailabilityWithResponse(
        String location, NameAvailabilityRequest parameters, Context context) {
        Response<NameAvailabilityResponseInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(location, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NameAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DataMigrationService getById(String id) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        return this.getByResourceGroupWithResponse(groupName, serviceName, Context.NONE).getValue();
    }

    public Response<DataMigrationService> getByIdWithResponse(String id, Context context) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        return this.getByResourceGroupWithResponse(groupName, serviceName, context);
    }

    public void deleteById(String id) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        Boolean localDeleteRunningTasks = null;
        this.delete(groupName, serviceName, localDeleteRunningTasks, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean deleteRunningTasks, Context context) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        this.delete(groupName, serviceName, deleteRunningTasks, context);
    }

    private ServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datamigration.DataMigrationManager manager() {
        return this.serviceManager;
    }

    public DataMigrationServiceImpl define(String name) {
        return new DataMigrationServiceImpl(name, this.manager());
    }
}
