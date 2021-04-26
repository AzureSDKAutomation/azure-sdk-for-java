// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.DedicatedHostGroupInner;
import com.azure.resourcemanager.compute.generated.models.DedicatedHostGroup;
import com.azure.resourcemanager.compute.generated.models.DedicatedHostGroupInstanceView;
import com.azure.resourcemanager.compute.generated.models.DedicatedHostGroupUpdate;
import com.azure.resourcemanager.compute.generated.models.InstanceViewTypes;
import com.azure.resourcemanager.compute.generated.models.SubResourceReadOnly;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DedicatedHostGroupImpl
    implements DedicatedHostGroup, DedicatedHostGroup.Definition, DedicatedHostGroup.Update {
    private DedicatedHostGroupInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

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

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Integer platformFaultDomainCount() {
        return this.innerModel().platformFaultDomainCount();
    }

    public List<SubResourceReadOnly> hosts() {
        List<SubResourceReadOnly> inner = this.innerModel().hosts();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DedicatedHostGroupInstanceView instanceView() {
        return this.innerModel().instanceView();
    }

    public Boolean supportAutomaticPlacement() {
        return this.innerModel().supportAutomaticPlacement();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DedicatedHostGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String hostGroupName;

    private DedicatedHostGroupUpdate updateParameters;

    public DedicatedHostGroupImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DedicatedHostGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHostGroups()
                .createOrUpdateWithResponse(resourceGroupName, hostGroupName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DedicatedHostGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHostGroups()
                .createOrUpdateWithResponse(resourceGroupName, hostGroupName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DedicatedHostGroupImpl(String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new DedicatedHostGroupInner();
        this.serviceManager = serviceManager;
        this.hostGroupName = name;
    }

    public DedicatedHostGroupImpl update() {
        this.updateParameters = new DedicatedHostGroupUpdate();
        return this;
    }

    public DedicatedHostGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHostGroups()
                .updateWithResponse(resourceGroupName, hostGroupName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public DedicatedHostGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHostGroups()
                .updateWithResponse(resourceGroupName, hostGroupName, updateParameters, context)
                .getValue();
        return this;
    }

    DedicatedHostGroupImpl(
        DedicatedHostGroupInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.hostGroupName = Utils.getValueFromIdByName(innerObject.id(), "hostGroups");
    }

    public DedicatedHostGroup refresh() {
        InstanceViewTypes localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHostGroups()
                .getByResourceGroupWithResponse(resourceGroupName, hostGroupName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public DedicatedHostGroup refresh(Context context) {
        InstanceViewTypes localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDedicatedHostGroups()
                .getByResourceGroupWithResponse(resourceGroupName, hostGroupName, localExpand, context)
                .getValue();
        return this;
    }

    public DedicatedHostGroupImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DedicatedHostGroupImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DedicatedHostGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public DedicatedHostGroupImpl withZones(List<String> zones) {
        if (isInCreateMode()) {
            this.innerModel().withZones(zones);
            return this;
        } else {
            this.updateParameters.withZones(zones);
            return this;
        }
    }

    public DedicatedHostGroupImpl withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        if (isInCreateMode()) {
            this.innerModel().withPlatformFaultDomainCount(platformFaultDomainCount);
            return this;
        } else {
            this.updateParameters.withPlatformFaultDomainCount(platformFaultDomainCount);
            return this;
        }
    }

    public DedicatedHostGroupImpl withSupportAutomaticPlacement(Boolean supportAutomaticPlacement) {
        if (isInCreateMode()) {
            this.innerModel().withSupportAutomaticPlacement(supportAutomaticPlacement);
            return this;
        } else {
            this.updateParameters.withSupportAutomaticPlacement(supportAutomaticPlacement);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
