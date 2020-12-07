// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationProfileInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkSecurityGroupInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointInner;
import com.azure.resourcemanager.network.generated.fluent.models.RouteTableInner;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.Delegation;
import com.azure.resourcemanager.network.generated.models.IpConfiguration;
import com.azure.resourcemanager.network.generated.models.IpConfigurationProfile;
import com.azure.resourcemanager.network.generated.models.NetworkSecurityGroup;
import com.azure.resourcemanager.network.generated.models.PrivateEndpoint;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.ResourceNavigationLink;
import com.azure.resourcemanager.network.generated.models.RouteTable;
import com.azure.resourcemanager.network.generated.models.ServiceAssociationLink;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPolicy;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPropertiesFormat;
import com.azure.resourcemanager.network.generated.models.Subnet;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class SubnetImpl implements Subnet {
    private SubnetInner innerObject;

    private final NetworkManager serviceManager;

    public SubnetImpl(SubnetInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String addressPrefix() {
        return this.innerModel().addressPrefix();
    }

    public List<String> addressPrefixes() {
        List<String> inner = this.innerModel().addressPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkSecurityGroup networkSecurityGroup() {
        NetworkSecurityGroupInner inner = this.innerModel().networkSecurityGroup();
        if (inner != null) {
            return new NetworkSecurityGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public RouteTable routeTable() {
        RouteTableInner inner = this.innerModel().routeTable();
        if (inner != null) {
            return new RouteTableImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SubResource natGateway() {
        return this.innerModel().natGateway();
    }

    public List<ServiceEndpointPropertiesFormat> serviceEndpoints() {
        List<ServiceEndpointPropertiesFormat> inner = this.innerModel().serviceEndpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ServiceEndpointPolicy> serviceEndpointPolicies() {
        List<ServiceEndpointPolicyInner> inner = this.innerModel().serviceEndpointPolicies();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ServiceEndpointPolicyImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrivateEndpoint> privateEndpoints() {
        List<PrivateEndpointInner> inner = this.innerModel().privateEndpoints();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<IpConfiguration> ipConfigurations() {
        List<IpConfigurationInner> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new IpConfigurationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<IpConfigurationProfile> ipConfigurationProfiles() {
        List<IpConfigurationProfileInner> inner = this.innerModel().ipConfigurationProfiles();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new IpConfigurationProfileImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> ipAllocations() {
        List<SubResource> inner = this.innerModel().ipAllocations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ResourceNavigationLink> resourceNavigationLinks() {
        List<ResourceNavigationLink> inner = this.innerModel().resourceNavigationLinks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ServiceAssociationLink> serviceAssociationLinks() {
        List<ServiceAssociationLink> inner = this.innerModel().serviceAssociationLinks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Delegation> delegations() {
        List<Delegation> inner = this.innerModel().delegations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String purpose() {
        return this.innerModel().purpose();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String privateEndpointNetworkPolicies() {
        return this.innerModel().privateEndpointNetworkPolicies();
    }

    public String privateLinkServiceNetworkPolicies() {
        return this.innerModel().privateLinkServiceNetworkPolicies();
    }

    public SubnetInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
