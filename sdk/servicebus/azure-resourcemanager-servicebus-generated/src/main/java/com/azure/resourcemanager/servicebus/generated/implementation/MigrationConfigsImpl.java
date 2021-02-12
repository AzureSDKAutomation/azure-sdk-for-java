// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.ServiceBusManager;
import com.azure.resourcemanager.servicebus.generated.fluent.MigrationConfigsClient;
import com.azure.resourcemanager.servicebus.generated.fluent.models.MigrationConfigPropertiesInner;
import com.azure.resourcemanager.servicebus.generated.models.MigrationConfigProperties;
import com.azure.resourcemanager.servicebus.generated.models.MigrationConfigs;
import com.azure.resourcemanager.servicebus.generated.models.MigrationConfigurationName;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MigrationConfigsImpl implements MigrationConfigs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrationConfigsImpl.class);

    private final MigrationConfigsClient innerClient;

    private final ServiceBusManager serviceManager;

    public MigrationConfigsImpl(MigrationConfigsClient innerClient, ServiceBusManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MigrationConfigProperties> list(String resourceGroupName, String namespaceName) {
        PagedIterable<MigrationConfigPropertiesInner> inner =
            this.serviceClient().list(resourceGroupName, namespaceName);
        return Utils.mapPage(inner, inner1 -> new MigrationConfigPropertiesImpl(inner1, this.manager()));
    }

    public PagedIterable<MigrationConfigProperties> list(
        String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<MigrationConfigPropertiesInner> inner =
            this.serviceClient().list(resourceGroupName, namespaceName, context);
        return Utils.mapPage(inner, inner1 -> new MigrationConfigPropertiesImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String namespaceName, MigrationConfigurationName configName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, configName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, namespaceName, configName, context);
    }

    public MigrationConfigProperties get(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName) {
        MigrationConfigPropertiesInner inner = this.serviceClient().get(resourceGroupName, namespaceName, configName);
        if (inner != null) {
            return new MigrationConfigPropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MigrationConfigProperties> getWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context) {
        Response<MigrationConfigPropertiesInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, namespaceName, configName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MigrationConfigPropertiesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void completeMigration(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName) {
        this.serviceClient().completeMigration(resourceGroupName, namespaceName, configName);
    }

    public Response<Void> completeMigrationWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context) {
        return this
            .serviceClient()
            .completeMigrationWithResponse(resourceGroupName, namespaceName, configName, context);
    }

    public void revert(String resourceGroupName, String namespaceName, MigrationConfigurationName configName) {
        this.serviceClient().revert(resourceGroupName, namespaceName, configName);
    }

    public Response<Void> revertWithResponse(
        String resourceGroupName, String namespaceName, MigrationConfigurationName configName, Context context) {
        return this.serviceClient().revertWithResponse(resourceGroupName, namespaceName, configName, context);
    }

    public MigrationConfigProperties getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        MigrationConfigurationName configName =
            MigrationConfigurationName.fromString(Utils.getValueFromIdByName(id, "migrationConfigurations"));
        if (configName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'migrationConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, configName, Context.NONE).getValue();
    }

    public Response<MigrationConfigProperties> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        MigrationConfigurationName configName =
            MigrationConfigurationName.fromString(Utils.getValueFromIdByName(id, "migrationConfigurations"));
        if (configName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'migrationConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, configName, context);
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
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        MigrationConfigurationName configName =
            MigrationConfigurationName.fromString(Utils.getValueFromIdByName(id, "migrationConfigurations"));
        if (configName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'migrationConfigurations'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, namespaceName, configName, Context.NONE).getValue();
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
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        MigrationConfigurationName configName =
            MigrationConfigurationName.fromString(Utils.getValueFromIdByName(id, "migrationConfigurations"));
        if (configName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'migrationConfigurations'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, namespaceName, configName, context);
    }

    private MigrationConfigsClient serviceClient() {
        return this.innerClient;
    }

    private ServiceBusManager manager() {
        return this.serviceManager;
    }

    public MigrationConfigPropertiesImpl define(MigrationConfigurationName name) {
        return new MigrationConfigPropertiesImpl(name, this.manager());
    }
}
