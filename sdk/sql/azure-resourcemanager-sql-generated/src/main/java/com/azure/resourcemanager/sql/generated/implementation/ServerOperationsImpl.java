// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ServerOperationsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerOperationInner;
import com.azure.resourcemanager.sql.generated.models.ServerOperation;
import com.azure.resourcemanager.sql.generated.models.ServerOperations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServerOperationsImpl implements ServerOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerOperationsImpl.class);

    private final ServerOperationsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ServerOperationsImpl(
        ServerOperationsClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ServerOperation> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServerOperationInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServerOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerOperation> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerOperationInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServerOperationImpl(inner1, this.manager()));
    }

    private ServerOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
