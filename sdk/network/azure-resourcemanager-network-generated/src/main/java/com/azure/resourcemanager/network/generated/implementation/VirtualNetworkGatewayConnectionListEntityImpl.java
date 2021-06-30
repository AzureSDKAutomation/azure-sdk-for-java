// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayConnectionListEntityInner;
import com.azure.resourcemanager.network.generated.models.IpsecPolicy;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TrafficSelectorPolicy;
import com.azure.resourcemanager.network.generated.models.TunnelConnectionHealth;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkConnectionGatewayReference;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionListEntity;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionMode;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionStatus;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionType;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualNetworkGatewayConnectionListEntityImpl implements VirtualNetworkGatewayConnectionListEntity {
    private VirtualNetworkGatewayConnectionListEntityInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    VirtualNetworkGatewayConnectionListEntityImpl(
        VirtualNetworkGatewayConnectionListEntityInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
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

    public String etag() {
        return this.innerModel().etag();
    }

    public String authorizationKey() {
        return this.innerModel().authorizationKey();
    }

    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway1() {
        return this.innerModel().virtualNetworkGateway1();
    }

    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway2() {
        return this.innerModel().virtualNetworkGateway2();
    }

    public VirtualNetworkConnectionGatewayReference localNetworkGateway2() {
        return this.innerModel().localNetworkGateway2();
    }

    public VirtualNetworkGatewayConnectionType connectionType() {
        return this.innerModel().connectionType();
    }

    public VirtualNetworkGatewayConnectionProtocol connectionProtocol() {
        return this.innerModel().connectionProtocol();
    }

    public Integer routingWeight() {
        return this.innerModel().routingWeight();
    }

    public VirtualNetworkGatewayConnectionMode connectionMode() {
        return this.innerModel().connectionMode();
    }

    public String sharedKey() {
        return this.innerModel().sharedKey();
    }

    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.innerModel().connectionStatus();
    }

    public List<TunnelConnectionHealth> tunnelConnectionStatus() {
        List<TunnelConnectionHealth> inner = this.innerModel().tunnelConnectionStatus();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Long egressBytesTransferred() {
        return this.innerModel().egressBytesTransferred();
    }

    public Long ingressBytesTransferred() {
        return this.innerModel().ingressBytesTransferred();
    }

    public SubResource peer() {
        return this.innerModel().peer();
    }

    public Boolean enableBgp() {
        return this.innerModel().enableBgp();
    }

    public Boolean usePolicyBasedTrafficSelectors() {
        return this.innerModel().usePolicyBasedTrafficSelectors();
    }

    public List<IpsecPolicy> ipsecPolicies() {
        List<IpsecPolicy> inner = this.innerModel().ipsecPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<TrafficSelectorPolicy> trafficSelectorPolicies() {
        List<TrafficSelectorPolicy> inner = this.innerModel().trafficSelectorPolicies();
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

    public Boolean expressRouteGatewayBypass() {
        return this.innerModel().expressRouteGatewayBypass();
    }

    public String id() {
        return this.innerModel().id();
    }

    public VirtualNetworkGatewayConnectionListEntityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
