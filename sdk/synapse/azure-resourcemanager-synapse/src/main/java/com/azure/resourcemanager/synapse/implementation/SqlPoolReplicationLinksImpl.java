// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.SqlPoolReplicationLinksClient;
import com.azure.resourcemanager.synapse.fluent.models.ReplicationLinkInner;
import com.azure.resourcemanager.synapse.models.ReplicationLink;
import com.azure.resourcemanager.synapse.models.SqlPoolReplicationLinks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SqlPoolReplicationLinksImpl implements SqlPoolReplicationLinks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolReplicationLinksImpl.class);

    private final SqlPoolReplicationLinksClient innerClient;

    private final SynapseManager serviceManager;

    public SqlPoolReplicationLinksImpl(SqlPoolReplicationLinksClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ReplicationLink> list(String resourceGroupName, String workspaceName, String sqlPoolName) {
        PagedIterable<ReplicationLinkInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, sqlPoolName);
        return inner.mapPage(inner1 -> new ReplicationLinkImpl(inner1, this.manager()));
    }

    public PagedIterable<ReplicationLink> list(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        PagedIterable<ReplicationLinkInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, sqlPoolName, context);
        return inner.mapPage(inner1 -> new ReplicationLinkImpl(inner1, this.manager()));
    }

    public ReplicationLink getByName(
        String resourceGroupName, String workspaceName, String sqlPoolName, String linkId) {
        ReplicationLinkInner inner =
            this.serviceClient().getByName(resourceGroupName, workspaceName, sqlPoolName, linkId);
        if (inner != null) {
            return new ReplicationLinkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ReplicationLink> getByNameWithResponse(
        String resourceGroupName, String workspaceName, String sqlPoolName, String linkId, Context context) {
        Response<ReplicationLinkInner> inner =
            this.serviceClient().getByNameWithResponse(resourceGroupName, workspaceName, sqlPoolName, linkId, context);
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

    private SqlPoolReplicationLinksClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
