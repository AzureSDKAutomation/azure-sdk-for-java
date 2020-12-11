// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationNetworksClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.NetworkInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Network;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationNetworks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReplicationNetworksImpl implements ReplicationNetworks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationNetworksImpl.class);

    private final ReplicationNetworksClient innerClient;

    private final SiteRecoveryManager serviceManager;

    public ReplicationNetworksImpl(ReplicationNetworksClient innerClient, SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Network> listByReplicationFabrics(String fabricName) {
        PagedIterable<NetworkInner> inner = this.serviceClient().listByReplicationFabrics(fabricName);
        return inner.mapPage(inner1 -> new NetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<Network> listByReplicationFabrics(String fabricName, Context context) {
        PagedIterable<NetworkInner> inner = this.serviceClient().listByReplicationFabrics(fabricName, context);
        return inner.mapPage(inner1 -> new NetworkImpl(inner1, this.manager()));
    }

    public Network get(String fabricName, String networkName) {
        NetworkInner inner = this.serviceClient().get(fabricName, networkName);
        if (inner != null) {
            return new NetworkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Network> getWithResponse(String fabricName, String networkName, Context context) {
        Response<NetworkInner> inner = this.serviceClient().getWithResponse(fabricName, networkName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Network> list() {
        PagedIterable<NetworkInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new NetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<Network> list(Context context) {
        PagedIterable<NetworkInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new NetworkImpl(inner1, this.manager()));
    }

    private ReplicationNetworksClient serviceClient() {
        return this.innerClient;
    }

    private SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
