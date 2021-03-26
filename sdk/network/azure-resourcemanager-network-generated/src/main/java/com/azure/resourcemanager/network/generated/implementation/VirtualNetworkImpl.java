// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkPeeringInner;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.DhcpOptions;
import com.azure.resourcemanager.network.generated.models.ExtendedLocation;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.Subnet;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.VirtualNetwork;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkBgpCommunities;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPeering;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VirtualNetworkImpl implements VirtualNetwork, VirtualNetwork.Definition, VirtualNetwork.Update {
    private VirtualNetworkInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public AddressSpace addressSpace() {
        return this.innerModel().addressSpace();
    }

    public DhcpOptions dhcpOptions() {
        return this.innerModel().dhcpOptions();
    }

    public Integer flowTimeoutInMinutes() {
        return this.innerModel().flowTimeoutInMinutes();
    }

    public List<Subnet> subnets() {
        List<SubnetInner> inner = this.innerModel().subnets();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner.stream().map(inner1 -> new SubnetImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<VirtualNetworkPeering> virtualNetworkPeerings() {
        List<VirtualNetworkPeeringInner> inner = this.innerModel().virtualNetworkPeerings();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualNetworkPeeringImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean enableDdosProtection() {
        return this.innerModel().enableDdosProtection();
    }

    public Boolean enableVmProtection() {
        return this.innerModel().enableVmProtection();
    }

    public SubResource ddosProtectionPlan() {
        return this.innerModel().ddosProtectionPlan();
    }

    public VirtualNetworkBgpCommunities bgpCommunities() {
        return this.innerModel().bgpCommunities();
    }

    public List<SubResource> ipAllocations() {
        List<SubResource> inner = this.innerModel().ipAllocations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String id() {
        return this.innerModel().id();
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

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualNetworkName;

    private TagsObject updateParameters;

    public VirtualNetworkImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualNetwork create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .createOrUpdate(resourceGroupName, virtualNetworkName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetwork create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .createOrUpdate(resourceGroupName, virtualNetworkName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new VirtualNetworkInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkName = name;
    }

    public VirtualNetworkImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public VirtualNetwork apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .updateTagsWithResponse(resourceGroupName, virtualNetworkName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetwork apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .updateTagsWithResponse(resourceGroupName, virtualNetworkName, updateParameters, context)
                .getValue();
        return this;
    }

    VirtualNetworkImpl(
        VirtualNetworkInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualNetworkName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworks");
    }

    public VirtualNetwork refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetwork refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworks()
                .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkName, localExpand, context)
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
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public VirtualNetworkImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public VirtualNetworkImpl withAddressSpace(AddressSpace addressSpace) {
        this.innerModel().withAddressSpace(addressSpace);
        return this;
    }

    public VirtualNetworkImpl withDhcpOptions(DhcpOptions dhcpOptions) {
        this.innerModel().withDhcpOptions(dhcpOptions);
        return this;
    }

    public VirtualNetworkImpl withFlowTimeoutInMinutes(Integer flowTimeoutInMinutes) {
        this.innerModel().withFlowTimeoutInMinutes(flowTimeoutInMinutes);
        return this;
    }

    public VirtualNetworkImpl withSubnets(List<SubnetInner> subnets) {
        this.innerModel().withSubnets(subnets);
        return this;
    }

    public VirtualNetworkImpl withVirtualNetworkPeerings(List<VirtualNetworkPeeringInner> virtualNetworkPeerings) {
        this.innerModel().withVirtualNetworkPeerings(virtualNetworkPeerings);
        return this;
    }

    public VirtualNetworkImpl withEnableDdosProtection(Boolean enableDdosProtection) {
        this.innerModel().withEnableDdosProtection(enableDdosProtection);
        return this;
    }

    public VirtualNetworkImpl withEnableVmProtection(Boolean enableVmProtection) {
        this.innerModel().withEnableVmProtection(enableVmProtection);
        return this;
    }

    public VirtualNetworkImpl withDdosProtectionPlan(SubResource ddosProtectionPlan) {
        this.innerModel().withDdosProtectionPlan(ddosProtectionPlan);
        return this;
    }

    public VirtualNetworkImpl withBgpCommunities(VirtualNetworkBgpCommunities bgpCommunities) {
        this.innerModel().withBgpCommunities(bgpCommunities);
        return this;
    }

    public VirtualNetworkImpl withIpAllocations(List<SubResource> ipAllocations) {
        this.innerModel().withIpAllocations(ipAllocations);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
