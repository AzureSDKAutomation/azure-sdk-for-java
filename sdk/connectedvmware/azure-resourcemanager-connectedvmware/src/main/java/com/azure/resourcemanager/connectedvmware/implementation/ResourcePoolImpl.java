// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.connectedvmware.fluent.models.ResourcePoolInner;
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;
import com.azure.resourcemanager.connectedvmware.models.ResourcePatch;
import com.azure.resourcemanager.connectedvmware.models.ResourcePool;
import java.util.Collections;
import java.util.Map;

public final class ResourcePoolImpl implements ResourcePool, ResourcePool.Definition, ResourcePool.Update {
    private ResourcePoolInner innerObject;

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

    public String cpuSharesLevel() {
        return this.innerModel().cpuSharesLevel();
    }

    public Long cpuReservationMHz() {
        return this.innerModel().cpuReservationMHz();
    }

    public Long cpuLimitMHz() {
        return this.innerModel().cpuLimitMHz();
    }

    public String memSharesLevel() {
        return this.innerModel().memSharesLevel();
    }

    public Long memReservationMB() {
        return this.innerModel().memReservationMB();
    }

    public Long memLimitMB() {
        return this.innerModel().memLimitMB();
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

    public ResourcePoolInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourcePoolName;

    private ResourcePatch updateBody;

    public ResourcePoolImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ResourcePool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourcePools()
                .create(resourceGroupName, resourcePoolName, this.innerModel(), Context.NONE);
        return this;
    }

    public ResourcePool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourcePools()
                .create(resourceGroupName, resourcePoolName, this.innerModel(), context);
        return this;
    }

    ResourcePoolImpl(String name, com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager) {
        this.innerObject = new ResourcePoolInner();
        this.serviceManager = serviceManager;
        this.resourcePoolName = name;
    }

    public ResourcePoolImpl update() {
        this.updateBody = new ResourcePatch();
        return this;
    }

    public ResourcePool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourcePools()
                .updateWithResponse(resourceGroupName, resourcePoolName, updateBody, Context.NONE)
                .getValue();
        return this;
    }

    public ResourcePool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourcePools()
                .updateWithResponse(resourceGroupName, resourcePoolName, updateBody, context)
                .getValue();
        return this;
    }

    ResourcePoolImpl(
        ResourcePoolInner innerObject,
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourcePoolName = Utils.getValueFromIdByName(innerObject.id(), "resourcePools");
    }

    public ResourcePool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourcePools()
                .getByResourceGroupWithResponse(resourceGroupName, resourcePoolName, Context.NONE)
                .getValue();
        return this;
    }

    public ResourcePool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourcePools()
                .getByResourceGroupWithResponse(resourceGroupName, resourcePoolName, context)
                .getValue();
        return this;
    }

    public ResourcePoolImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ResourcePoolImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ResourcePoolImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public ResourcePoolImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public ResourcePoolImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public ResourcePoolImpl withVCenterId(String vCenterId) {
        this.innerModel().withVCenterId(vCenterId);
        return this;
    }

    public ResourcePoolImpl withMoRefId(String moRefId) {
        this.innerModel().withMoRefId(moRefId);
        return this;
    }

    public ResourcePoolImpl withInventoryItemId(String inventoryItemId) {
        this.innerModel().withInventoryItemId(inventoryItemId);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
