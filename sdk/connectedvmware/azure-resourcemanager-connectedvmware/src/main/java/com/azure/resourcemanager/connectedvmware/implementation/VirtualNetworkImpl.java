// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.connectedvmware.fluent.models.VirtualNetworkInner;
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;
import com.azure.resourcemanager.connectedvmware.models.ResourcePatch;
import com.azure.resourcemanager.connectedvmware.models.VirtualNetwork;
import java.util.Collections;
import java.util.Map;

public final class VirtualNetworkImpl implements VirtualNetwork, VirtualNetwork.Definition, VirtualNetwork.Update {
    private VirtualNetworkInner innerObject;

    private final com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String uuid() {
        return this.innerModel().uuid();
    }

    public String vCenterId() {
        return this.innerModel().vCenterId();
    }

    public String moRefId() {
        return this.innerModel().moRefId();
    }

    public String inventoryItemId() {
        return this.innerModel().inventoryItemId();
    }

    public String moName() {
        return this.innerModel().moName();
    }

    public String customResourceName() {
        return this.innerModel().customResourceName();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VirtualNetworkInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualNetworkName;

    private ResourcePatch updateBody;

    public VirtualNetworkImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualNetwork create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .create(resourceGroupName, virtualNetworkName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetwork create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .create(resourceGroupName, virtualNetworkName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkImpl(String name, com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager) {
        this.innerObject = new VirtualNetworkInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkName = name;
    }

    public VirtualNetworkImpl update() {
        this.updateBody = new ResourcePatch();
        return this;
    }

    public VirtualNetwork apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .updateWithResponse(resourceGroupName, virtualNetworkName, updateBody, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetwork apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .updateWithResponse(resourceGroupName, virtualNetworkName, updateBody, context)
                .getValue();
        return this;
    }

    VirtualNetworkImpl(
        VirtualNetworkInner innerObject,
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualNetworkName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworks");
    }

    public VirtualNetwork refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetwork refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkName, context)
                .getValue();
        return this;
    }

    public VirtualNetworkImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualNetworkImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualNetworkImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public VirtualNetworkImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public VirtualNetworkImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public VirtualNetworkImpl withVCenterId(String vCenterId) {
        this.innerModel().withVCenterId(vCenterId);
        return this;
    }

    public VirtualNetworkImpl withMoRefId(String moRefId) {
        this.innerModel().withMoRefId(moRefId);
        return this;
    }

    public VirtualNetworkImpl withInventoryItemId(String inventoryItemId) {
        this.innerModel().withInventoryItemId(inventoryItemId);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
