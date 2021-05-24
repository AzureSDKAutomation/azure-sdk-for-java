// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.RestorableSqlDatabasesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableSqlDatabaseGetResultInner;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlDatabaseGetResult;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlDatabases;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RestorableSqlDatabasesImpl implements RestorableSqlDatabases {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableSqlDatabasesImpl.class);

    private final RestorableSqlDatabasesClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public RestorableSqlDatabasesImpl(
        RestorableSqlDatabasesClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RestorableSqlDatabaseGetResult> list(String location, String instanceId) {
        PagedIterable<RestorableSqlDatabaseGetResultInner> inner = this.serviceClient().list(location, instanceId);
        return Utils.mapPage(inner, inner1 -> new RestorableSqlDatabaseGetResultImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableSqlDatabaseGetResult> list(String location, String instanceId, Context context) {
        PagedIterable<RestorableSqlDatabaseGetResultInner> inner =
            this.serviceClient().list(location, instanceId, context);
        return Utils.mapPage(inner, inner1 -> new RestorableSqlDatabaseGetResultImpl(inner1, this.manager()));
    }

    private RestorableSqlDatabasesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
