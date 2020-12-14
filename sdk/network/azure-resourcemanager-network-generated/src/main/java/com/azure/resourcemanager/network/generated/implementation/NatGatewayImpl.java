// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.NatGatewayInner;
import com.azure.resourcemanager.network.generated.models.NatGateway;
import com.azure.resourcemanager.network.generated.models.NatGatewaySku;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NatGatewayImpl implements NatGateway, NatGateway.Definition, NatGateway.Update {
    private NatGatewayInner innerObject;

    private final NetworkManager serviceManager;

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

    public NatGatewaySku sku() {
        return this.innerModel().sku();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Integer idleTimeoutInMinutes() {
        return this.innerModel().idleTimeoutInMinutes();
    }

    public List<SubResource> publicIpAddresses() {
        List<SubResource> inner = this.innerModel().publicIpAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> publicIpPrefixes() {
        List<SubResource> inner = this.innerModel().publicIpPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> subnets() {
        List<SubResource> inner = this.innerModel().subnets();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
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

    public String id() {
        return this.innerModel().id();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public NatGatewayInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String natGatewayName;

    private TagsObject updateParameters;

    public NatGatewayImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NatGateway create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNatGateways()
                .createOrUpdate(resourceGroupName, natGatewayName, this.innerModel(), Context.NONE);
        return this;
    }

    public NatGateway create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNatGateways()
                .createOrUpdate(resourceGroupName, natGatewayName, this.innerModel(), context);
        return this;
    }

    public NatGatewayImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new NatGatewayInner();
        this.serviceManager = serviceManager;
        this.natGatewayName = name;
    }

    public NatGatewayImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public NatGateway apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNatGateways()
                .updateTagsWithResponse(resourceGroupName, natGatewayName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public NatGateway apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNatGateways()
                .updateTagsWithResponse(resourceGroupName, natGatewayName, updateParameters, context)
                .getValue();
        return this;
    }

    public NatGatewayImpl(NatGatewayInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.natGatewayName = Utils.getValueFromIdByName(innerObject.id(), "natGateways");
    }

    public NatGateway refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNatGateways()
                .getByResourceGroupWithResponse(resourceGroupName, natGatewayName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public NatGateway refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNatGateways()
                .getByResourceGroupWithResponse(resourceGroupName, natGatewayName, localExpand, context)
                .getValue();
        return this;
    }

    public NatGatewayImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NatGatewayImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NatGatewayImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public NatGatewayImpl withSku(NatGatewaySku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public NatGatewayImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public NatGatewayImpl withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.innerModel().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    public NatGatewayImpl withPublicIpAddresses(List<SubResource> publicIpAddresses) {
        this.innerModel().withPublicIpAddresses(publicIpAddresses);
        return this;
    }

    public NatGatewayImpl withPublicIpPrefixes(List<SubResource> publicIpPrefixes) {
        this.innerModel().withPublicIpPrefixes(publicIpPrefixes);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
