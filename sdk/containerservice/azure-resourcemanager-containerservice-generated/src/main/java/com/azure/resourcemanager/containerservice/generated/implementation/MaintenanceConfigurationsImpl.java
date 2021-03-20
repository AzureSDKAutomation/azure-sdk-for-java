// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.generated.fluent.MaintenanceConfigurationsClient;
import com.azure.resourcemanager.containerservice.generated.fluent.models.MaintenanceConfigurationInner;
import com.azure.resourcemanager.containerservice.generated.models.MaintenanceConfiguration;
import com.azure.resourcemanager.containerservice.generated.models.MaintenanceConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MaintenanceConfigurationsImpl implements MaintenanceConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MaintenanceConfigurationsImpl.class);

    private final MaintenanceConfigurationsClient innerClient;

    private final com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager;

    public MaintenanceConfigurationsImpl(
        MaintenanceConfigurationsClient innerClient,
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MaintenanceConfiguration> listByManagedCluster(String resourceGroupName, String resourceName) {
        PagedIterable<MaintenanceConfigurationInner> inner =
            this.serviceClient().listByManagedCluster(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new MaintenanceConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<MaintenanceConfiguration> listByManagedCluster(
        String resourceGroupName, String resourceName, Context context) {
        PagedIterable<MaintenanceConfigurationInner> inner =
            this.serviceClient().listByManagedCluster(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new MaintenanceConfigurationImpl(inner1, this.manager()));
    }

    public MaintenanceConfiguration get(String resourceGroupName, String resourceName, String configName) {
        MaintenanceConfigurationInner inner = this.serviceClient().get(resourceGroupName, resourceName, configName);
        if (inner != null) {
            return new MaintenanceConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MaintenanceConfiguration> getWithResponse(
        String resourceGroupName, String resourceName, String configName, Context context) {
        Response<MaintenanceConfigurationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, configName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MaintenanceConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String resourceName, String configName) {
        this.serviceClient().delete(resourceGroupName, resourceName, configName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, String configName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, configName, context);
    }

    public MaintenanceConfiguration getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "managedClusters");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String configName = Utils.getValueFromIdByName(id, "maintenanceConfigurations");
        if (configName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'maintenanceConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, configName, Context.NONE).getValue();
    }

    public Response<MaintenanceConfiguration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "managedClusters");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String configName = Utils.getValueFromIdByName(id, "maintenanceConfigurations");
        if (configName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'maintenanceConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, configName, context);
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
        String resourceName = Utils.getValueFromIdByName(id, "managedClusters");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String configName = Utils.getValueFromIdByName(id, "maintenanceConfigurations");
        if (configName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'maintenanceConfigurations'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, resourceName, configName, Context.NONE).getValue();
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
        String resourceName = Utils.getValueFromIdByName(id, "managedClusters");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String configName = Utils.getValueFromIdByName(id, "maintenanceConfigurations");
        if (configName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'maintenanceConfigurations'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, resourceName, configName, context);
    }

    private MaintenanceConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager() {
        return this.serviceManager;
    }

    public MaintenanceConfigurationImpl define(String name) {
        return new MaintenanceConfigurationImpl(name, this.manager());
    }
}
