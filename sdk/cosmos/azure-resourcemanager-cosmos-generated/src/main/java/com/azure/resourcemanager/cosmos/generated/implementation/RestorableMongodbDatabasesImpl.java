// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.RestorableMongodbDatabasesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableMongodbDatabaseGetResultInner;
import com.azure.resourcemanager.cosmos.generated.models.RestorableMongodbDatabaseGetResult;
import com.azure.resourcemanager.cosmos.generated.models.RestorableMongodbDatabases;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RestorableMongodbDatabasesImpl implements RestorableMongodbDatabases {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableMongodbDatabasesImpl.class);

    private final RestorableMongodbDatabasesClient innerClient;

    private final CosmosDBManager serviceManager;

    public RestorableMongodbDatabasesImpl(
        RestorableMongodbDatabasesClient innerClient, CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RestorableMongodbDatabaseGetResult> list(String location, String instanceId) {
        PagedIterable<RestorableMongodbDatabaseGetResultInner> inner = this.serviceClient().list(location, instanceId);
        return Utils.mapPage(inner, inner1 -> new RestorableMongodbDatabaseGetResultImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableMongodbDatabaseGetResult> list(String location, String instanceId, Context context) {
        PagedIterable<RestorableMongodbDatabaseGetResultInner> inner =
            this.serviceClient().list(location, instanceId, context);
        return Utils.mapPage(inner, inner1 -> new RestorableMongodbDatabaseGetResultImpl(inner1, this.manager()));
    }

    private RestorableMongodbDatabasesClient serviceClient() {
        return this.innerClient;
    }

    private CosmosDBManager manager() {
        return this.serviceManager;
    }
}
