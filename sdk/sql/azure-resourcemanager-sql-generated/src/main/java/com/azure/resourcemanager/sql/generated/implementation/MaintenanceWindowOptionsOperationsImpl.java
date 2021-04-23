// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.MaintenanceWindowOptionsOperationsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.MaintenanceWindowOptionsInner;
import com.azure.resourcemanager.sql.generated.models.MaintenanceWindowOptions;
import com.azure.resourcemanager.sql.generated.models.MaintenanceWindowOptionsOperations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MaintenanceWindowOptionsOperationsImpl implements MaintenanceWindowOptionsOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MaintenanceWindowOptionsOperationsImpl.class);

    private final MaintenanceWindowOptionsOperationsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public MaintenanceWindowOptionsOperationsImpl(
        MaintenanceWindowOptionsOperationsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public MaintenanceWindowOptions get(
        String resourceGroupName, String serverName, String databaseName, String maintenanceWindowOptionsName) {
        MaintenanceWindowOptionsInner inner =
            this.serviceClient().get(resourceGroupName, serverName, databaseName, maintenanceWindowOptionsName);
        if (inner != null) {
            return new MaintenanceWindowOptionsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MaintenanceWindowOptions> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String maintenanceWindowOptionsName,
        Context context) {
        Response<MaintenanceWindowOptionsInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serverName, databaseName, maintenanceWindowOptionsName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MaintenanceWindowOptionsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private MaintenanceWindowOptionsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
