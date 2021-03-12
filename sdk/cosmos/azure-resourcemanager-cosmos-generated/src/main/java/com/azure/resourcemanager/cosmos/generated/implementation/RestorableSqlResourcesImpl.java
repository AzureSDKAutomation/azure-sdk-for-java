// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.RestorableSqlResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseRestoreResourceInner;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseRestoreResource;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RestorableSqlResourcesImpl implements RestorableSqlResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableSqlResourcesImpl.class);

    private final RestorableSqlResourcesClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public RestorableSqlResourcesImpl(
        RestorableSqlResourcesClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DatabaseRestoreResource> list(String location, String instanceId) {
        PagedIterable<DatabaseRestoreResourceInner> inner = this.serviceClient().list(location, instanceId);
        return Utils.mapPage(inner, inner1 -> new DatabaseRestoreResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseRestoreResource> list(
        String location, String instanceId, String restoreLocation, String restoreTimestampInUtc, Context context) {
        PagedIterable<DatabaseRestoreResourceInner> inner =
            this.serviceClient().list(location, instanceId, restoreLocation, restoreTimestampInUtc, context);
        return Utils.mapPage(inner, inner1 -> new DatabaseRestoreResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseRestoreResource> list(String location, String instanceId) {
        PagedIterable<DatabaseRestoreResourceInner> inner = this.serviceClient().list(location, instanceId);
        return Utils.mapPage(inner, inner1 -> new DatabaseRestoreResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseRestoreResource> list(
        String location, String instanceId, String restoreLocation, String restoreTimestampInUtc, Context context) {
        PagedIterable<DatabaseRestoreResourceInner> inner =
            this.serviceClient().list(location, instanceId, restoreLocation, restoreTimestampInUtc, context);
        return Utils.mapPage(inner, inner1 -> new DatabaseRestoreResourceImpl(inner1, this.manager()));
    }

    private RestorableSqlResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
