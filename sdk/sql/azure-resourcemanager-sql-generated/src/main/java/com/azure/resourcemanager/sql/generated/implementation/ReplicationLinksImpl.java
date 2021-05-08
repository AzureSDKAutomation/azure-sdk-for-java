// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ReplicationLinksClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ReplicationLinkInner;
import com.azure.resourcemanager.sql.generated.models.ReplicationLink;
import com.azure.resourcemanager.sql.generated.models.ReplicationLinks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReplicationLinksImpl implements ReplicationLinks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationLinksImpl.class);

    private final ReplicationLinksClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ReplicationLinksImpl(
        ReplicationLinksClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ReplicationLink> listByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        PagedIterable<ReplicationLinkInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName);
        return Utils.mapPage(inner, inner1 -> new ReplicationLinkImpl(inner1, this.manager()));
    }

    public PagedIterable<ReplicationLink> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        PagedIterable<ReplicationLinkInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new ReplicationLinkImpl(inner1, this.manager()));
    }

    public ReplicationLink get(
        String resourceGroupName, String serverName, String databaseName, String replicationLinkName) {
        ReplicationLinkInner inner =
            this.serviceClient().get(resourceGroupName, serverName, databaseName, replicationLinkName);
        if (inner != null) {
            return new ReplicationLinkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ReplicationLink> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, String replicationLinkName, Context context) {
        Response<ReplicationLinkInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serverName, databaseName, replicationLinkName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ReplicationLinkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ReplicationLink> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ReplicationLinkInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ReplicationLinkImpl(inner1, this.manager()));
    }

    public PagedIterable<ReplicationLink> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<ReplicationLinkInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ReplicationLinkImpl(inner1, this.manager()));
    }

    private ReplicationLinksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
