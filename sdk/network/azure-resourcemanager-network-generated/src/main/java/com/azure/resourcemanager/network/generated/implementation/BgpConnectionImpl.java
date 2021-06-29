// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.BgpConnectionInner;
import com.azure.resourcemanager.network.generated.models.BgpConnection;
import com.azure.resourcemanager.network.generated.models.HubBgpConnectionStatus;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;

public final class BgpConnectionImpl implements BgpConnection, BgpConnection.Definition, BgpConnection.Update {
    private BgpConnectionInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Long peerAsn() {
        return this.innerModel().peerAsn();
    }

    public String peerIp() {
        return this.innerModel().peerIp();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public HubBgpConnectionStatus connectionState() {
        return this.innerModel().connectionState();
    }

    public BgpConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualHubName;

    private String connectionName;

    public BgpConnectionImpl withExistingVirtualHub(String resourceGroupName, String virtualHubName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualHubName = virtualHubName;
        return this;
    }

    public BgpConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubBgpConnections()
                .createOrUpdate(resourceGroupName, virtualHubName, connectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public BgpConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubBgpConnections()
                .createOrUpdate(resourceGroupName, virtualHubName, connectionName, this.innerModel(), context);
        return this;
    }

    BgpConnectionImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new BgpConnectionInner();
        this.serviceManager = serviceManager;
        this.connectionName = name;
    }

    public BgpConnectionImpl update() {
        return this;
    }

    public BgpConnection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubBgpConnections()
                .createOrUpdate(resourceGroupName, virtualHubName, connectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public BgpConnection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubBgpConnections()
                .createOrUpdate(resourceGroupName, virtualHubName, connectionName, this.innerModel(), context);
        return this;
    }

    BgpConnectionImpl(
        BgpConnectionInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualHubName = Utils.getValueFromIdByName(innerObject.id(), "virtualHubs");
        this.connectionName = Utils.getValueFromIdByName(innerObject.id(), "bgpConnections");
    }

    public BgpConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubBgpConnections()
                .getWithResponse(resourceGroupName, virtualHubName, connectionName, Context.NONE)
                .getValue();
        return this;
    }

    public BgpConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubBgpConnections()
                .getWithResponse(resourceGroupName, virtualHubName, connectionName, context)
                .getValue();
        return this;
    }

    public BgpConnectionImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public BgpConnectionImpl withPeerAsn(Long peerAsn) {
        this.innerModel().withPeerAsn(peerAsn);
        return this;
    }

    public BgpConnectionImpl withPeerIp(String peerIp) {
        this.innerModel().withPeerIp(peerIp);
        return this;
    }
}
