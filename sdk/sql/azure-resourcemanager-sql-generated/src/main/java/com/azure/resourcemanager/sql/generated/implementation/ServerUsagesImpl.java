// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.ServerUsagesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerUsageInner;
import com.azure.resourcemanager.sql.generated.models.ServerUsage;
import com.azure.resourcemanager.sql.generated.models.ServerUsages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServerUsagesImpl implements ServerUsages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerUsagesImpl.class);

    private final ServerUsagesClient innerClient;

    private final SqlManager serviceManager;

    public ServerUsagesImpl(ServerUsagesClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ServerUsage> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServerUsageInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServerUsageImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerUsage> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerUsageInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServerUsageImpl(inner1, this.manager()));
    }

    private ServerUsagesClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
