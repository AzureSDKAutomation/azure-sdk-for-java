// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationSecurityGroupInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.ApplicationSecurityGroup;
import com.azure.resourcemanager.network.generated.models.CustomDnsConfigPropertiesFormat;
import com.azure.resourcemanager.network.generated.models.ExtendedLocation;
import com.azure.resourcemanager.network.generated.models.NetworkInterface;
import com.azure.resourcemanager.network.generated.models.PrivateEndpoint;
import com.azure.resourcemanager.network.generated.models.PrivateEndpointIpConfiguration;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServiceConnection;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.Subnet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class PrivateEndpointImpl implements PrivateEndpoint, PrivateEndpoint.Definition, PrivateEndpoint.Update {
    private PrivateEndpointInner innerObject;

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

    public Subnet subnet() {
        SubnetInner inner = this.innerModel().subnet();
        if (inner != null) {
            return new SubnetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<NetworkInterface> networkInterfaces() {
        List<NetworkInterfaceInner> inner = this.innerModel().networkInterfaces();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new NetworkInterfaceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<PrivateLinkServiceConnection> privateLinkServiceConnections() {
        List<PrivateLinkServiceConnection> inner = this.innerModel().privateLinkServiceConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections() {
        List<PrivateLinkServiceConnection> inner = this.innerModel().manualPrivateLinkServiceConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<CustomDnsConfigPropertiesFormat> customDnsConfigs() {
        List<CustomDnsConfigPropertiesFormat> inner = this.innerModel().customDnsConfigs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationSecurityGroup> applicationSecurityGroups() {
        List<ApplicationSecurityGroupInner> inner = this.innerModel().applicationSecurityGroups();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ApplicationSecurityGroupImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrivateEndpointIpConfiguration> ipConfigurations() {
        List<PrivateEndpointIpConfiguration> inner = this.innerModel().ipConfigurations();
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

    public PrivateEndpointInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String privateEndpointName;

    public PrivateEndpointImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public PrivateEndpoint create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .createOrUpdate(resourceGroupName, privateEndpointName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpoint create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .createOrUpdate(resourceGroupName, privateEndpointName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new PrivateEndpointInner();
        this.serviceManager = serviceManager;
        this.privateEndpointName = name;
    }

    public PrivateEndpointImpl update() {
        return this;
    }

    public PrivateEndpoint apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .createOrUpdate(resourceGroupName, privateEndpointName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpoint apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .createOrUpdate(resourceGroupName, privateEndpointName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointImpl(
        PrivateEndpointInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.privateEndpointName = Utils.getValueFromIdByName(innerObject.id(), "privateEndpoints");
    }

    public PrivateEndpoint refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .getByResourceGroupWithResponse(resourceGroupName, privateEndpointName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpoint refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpoints()
                .getByResourceGroupWithResponse(resourceGroupName, privateEndpointName, localExpand, context)
                .getValue();
        return this;
    }

    public PrivateEndpointImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PrivateEndpointImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PrivateEndpointImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public PrivateEndpointImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public PrivateEndpointImpl withSubnet(SubnetInner subnet) {
        this.innerModel().withSubnet(subnet);
        return this;
    }

    public PrivateEndpointImpl withPrivateLinkServiceConnections(
        List<PrivateLinkServiceConnection> privateLinkServiceConnections) {
        this.innerModel().withPrivateLinkServiceConnections(privateLinkServiceConnections);
        return this;
    }

    public PrivateEndpointImpl withManualPrivateLinkServiceConnections(
        List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections) {
        this.innerModel().withManualPrivateLinkServiceConnections(manualPrivateLinkServiceConnections);
        return this;
    }

    public PrivateEndpointImpl withCustomDnsConfigs(List<CustomDnsConfigPropertiesFormat> customDnsConfigs) {
        this.innerModel().withCustomDnsConfigs(customDnsConfigs);
        return this;
    }

    public PrivateEndpointImpl withApplicationSecurityGroups(
        List<ApplicationSecurityGroupInner> applicationSecurityGroups) {
        this.innerModel().withApplicationSecurityGroups(applicationSecurityGroups);
        return this;
    }

    public PrivateEndpointImpl withIpConfigurations(List<PrivateEndpointIpConfiguration> ipConfigurations) {
        this.innerModel().withIpConfigurations(ipConfigurations);
        return this;
    }
}
