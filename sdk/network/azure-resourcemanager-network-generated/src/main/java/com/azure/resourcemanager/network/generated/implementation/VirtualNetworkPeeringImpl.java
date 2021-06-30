// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkPeeringInner;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.SyncRemoteAddressSpace;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkBgpCommunities;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPeering;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPeeringLevel;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPeeringState;

public final class VirtualNetworkPeeringImpl
    implements VirtualNetworkPeering, VirtualNetworkPeering.Definition, VirtualNetworkPeering.Update {
    private VirtualNetworkPeeringInner innerObject;

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

    public Boolean allowVirtualNetworkAccess() {
        return this.innerModel().allowVirtualNetworkAccess();
    }

    public Boolean allowForwardedTraffic() {
        return this.innerModel().allowForwardedTraffic();
    }

    public Boolean allowGatewayTransit() {
        return this.innerModel().allowGatewayTransit();
    }

    public Boolean useRemoteGateways() {
        return this.innerModel().useRemoteGateways();
    }

    public SubResource remoteVirtualNetwork() {
        return this.innerModel().remoteVirtualNetwork();
    }

    public AddressSpace remoteAddressSpace() {
        return this.innerModel().remoteAddressSpace();
    }

    public AddressSpace remoteVirtualNetworkAddressSpace() {
        return this.innerModel().remoteVirtualNetworkAddressSpace();
    }

    public VirtualNetworkBgpCommunities remoteBgpCommunities() {
        return this.innerModel().remoteBgpCommunities();
    }

    public VirtualNetworkPeeringState peeringState() {
        return this.innerModel().peeringState();
    }

    public VirtualNetworkPeeringLevel peeringSyncLevel() {
        return this.innerModel().peeringSyncLevel();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean doNotVerifyRemoteGateways() {
        return this.innerModel().doNotVerifyRemoteGateways();
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public VirtualNetworkPeeringInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualNetworkName;

    private String virtualNetworkPeeringName;

    private SyncRemoteAddressSpace createSyncRemoteAddressSpace;

    private SyncRemoteAddressSpace updateSyncRemoteAddressSpace;

    public VirtualNetworkPeeringImpl withExistingVirtualNetwork(String resourceGroupName, String virtualNetworkName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualNetworkName = virtualNetworkName;
        return this;
    }

    public VirtualNetworkPeering create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkPeerings()
                .createOrUpdate(
                    resourceGroupName,
                    virtualNetworkName,
                    virtualNetworkPeeringName,
                    this.innerModel(),
                    createSyncRemoteAddressSpace,
                    Context.NONE);
        return this;
    }

    public VirtualNetworkPeering create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkPeerings()
                .createOrUpdate(
                    resourceGroupName,
                    virtualNetworkName,
                    virtualNetworkPeeringName,
                    this.innerModel(),
                    createSyncRemoteAddressSpace,
                    context);
        return this;
    }

    VirtualNetworkPeeringImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new VirtualNetworkPeeringInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkPeeringName = name;
        this.createSyncRemoteAddressSpace = null;
    }

    public VirtualNetworkPeeringImpl update() {
        this.updateSyncRemoteAddressSpace = null;
        return this;
    }

    public VirtualNetworkPeering apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkPeerings()
                .createOrUpdate(
                    resourceGroupName,
                    virtualNetworkName,
                    virtualNetworkPeeringName,
                    this.innerModel(),
                    updateSyncRemoteAddressSpace,
                    Context.NONE);
        return this;
    }

    public VirtualNetworkPeering apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkPeerings()
                .createOrUpdate(
                    resourceGroupName,
                    virtualNetworkName,
                    virtualNetworkPeeringName,
                    this.innerModel(),
                    updateSyncRemoteAddressSpace,
                    context);
        return this;
    }

    VirtualNetworkPeeringImpl(
        VirtualNetworkPeeringInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualNetworkName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworks");
        this.virtualNetworkPeeringName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkPeerings");
    }

    public VirtualNetworkPeering refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkPeerings()
                .getWithResponse(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkPeering refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkPeerings()
                .getWithResponse(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, context)
                .getValue();
        return this;
    }

    public VirtualNetworkPeeringImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public VirtualNetworkPeeringImpl withType(String type) {
        this.innerModel().withType(type);
        return this;
    }

    public VirtualNetworkPeeringImpl withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess) {
        this.innerModel().withAllowVirtualNetworkAccess(allowVirtualNetworkAccess);
        return this;
    }

    public VirtualNetworkPeeringImpl withAllowForwardedTraffic(Boolean allowForwardedTraffic) {
        this.innerModel().withAllowForwardedTraffic(allowForwardedTraffic);
        return this;
    }

    public VirtualNetworkPeeringImpl withAllowGatewayTransit(Boolean allowGatewayTransit) {
        this.innerModel().withAllowGatewayTransit(allowGatewayTransit);
        return this;
    }

    public VirtualNetworkPeeringImpl withUseRemoteGateways(Boolean useRemoteGateways) {
        this.innerModel().withUseRemoteGateways(useRemoteGateways);
        return this;
    }

    public VirtualNetworkPeeringImpl withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        this.innerModel().withRemoteVirtualNetwork(remoteVirtualNetwork);
        return this;
    }

    public VirtualNetworkPeeringImpl withRemoteAddressSpace(AddressSpace remoteAddressSpace) {
        this.innerModel().withRemoteAddressSpace(remoteAddressSpace);
        return this;
    }

    public VirtualNetworkPeeringImpl withRemoteVirtualNetworkAddressSpace(
        AddressSpace remoteVirtualNetworkAddressSpace) {
        this.innerModel().withRemoteVirtualNetworkAddressSpace(remoteVirtualNetworkAddressSpace);
        return this;
    }

    public VirtualNetworkPeeringImpl withRemoteBgpCommunities(VirtualNetworkBgpCommunities remoteBgpCommunities) {
        this.innerModel().withRemoteBgpCommunities(remoteBgpCommunities);
        return this;
    }

    public VirtualNetworkPeeringImpl withPeeringState(VirtualNetworkPeeringState peeringState) {
        this.innerModel().withPeeringState(peeringState);
        return this;
    }

    public VirtualNetworkPeeringImpl withPeeringSyncLevel(VirtualNetworkPeeringLevel peeringSyncLevel) {
        this.innerModel().withPeeringSyncLevel(peeringSyncLevel);
        return this;
    }

    public VirtualNetworkPeeringImpl withDoNotVerifyRemoteGateways(Boolean doNotVerifyRemoteGateways) {
        this.innerModel().withDoNotVerifyRemoteGateways(doNotVerifyRemoteGateways);
        return this;
    }

    public VirtualNetworkPeeringImpl withSyncRemoteAddressSpace(SyncRemoteAddressSpace syncRemoteAddressSpace) {
        if (isInCreateMode()) {
            this.createSyncRemoteAddressSpace = syncRemoteAddressSpace;
            return this;
        } else {
            this.updateSyncRemoteAddressSpace = syncRemoteAddressSpace;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
