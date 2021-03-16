// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.RestorableDroppedManagedDatabasesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.RestorableDroppedManagedDatabaseInner;
import com.azure.resourcemanager.sql.generated.models.RestorableDroppedManagedDatabase;
import com.azure.resourcemanager.sql.generated.models.RestorableDroppedManagedDatabases;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RestorableDroppedManagedDatabasesImpl implements RestorableDroppedManagedDatabases {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableDroppedManagedDatabasesImpl.class);

    private final RestorableDroppedManagedDatabasesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public RestorableDroppedManagedDatabasesImpl(
        RestorableDroppedManagedDatabasesClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RestorableDroppedManagedDatabase> listByInstance(
        String resourceGroupName, String managedInstanceName) {
        PagedIterable<RestorableDroppedManagedDatabaseInner> inner =
            this.serviceClient().listByInstance(resourceGroupName, managedInstanceName);
        return Utils.mapPage(inner, inner1 -> new RestorableDroppedManagedDatabaseImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableDroppedManagedDatabase> listByInstance(
        String resourceGroupName, String managedInstanceName, Context context) {
        PagedIterable<RestorableDroppedManagedDatabaseInner> inner =
            this.serviceClient().listByInstance(resourceGroupName, managedInstanceName, context);
        return Utils.mapPage(inner, inner1 -> new RestorableDroppedManagedDatabaseImpl(inner1, this.manager()));
    }

    public RestorableDroppedManagedDatabase get(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId) {
        RestorableDroppedManagedDatabaseInner inner =
            this.serviceClient().get(resourceGroupName, managedInstanceName, restorableDroppedDatabaseId);
        if (inner != null) {
            return new RestorableDroppedManagedDatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RestorableDroppedManagedDatabase> getWithResponse(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId, Context context) {
        Response<RestorableDroppedManagedDatabaseInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, managedInstanceName, restorableDroppedDatabaseId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RestorableDroppedManagedDatabaseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private RestorableDroppedManagedDatabasesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
