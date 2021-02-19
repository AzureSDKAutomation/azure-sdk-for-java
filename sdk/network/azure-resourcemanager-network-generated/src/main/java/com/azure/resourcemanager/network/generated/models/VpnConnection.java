// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.VpnConnectionInner;
import java.util.List;

/** An immutable client-side representation of VpnConnection. */
public interface VpnConnection {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the remoteVpnSite property: Id of the connected vpn site.
     *
     * @return the remoteVpnSite value.
     */
    SubResource remoteVpnSite();

    /**
     * Gets the routingWeight property: Routing weight for vpn connection.
     *
     * @return the routingWeight value.
     */
    Integer routingWeight();

    /**
     * Gets the dpdTimeoutSeconds property: DPD timeout in seconds for vpn connection.
     *
     * @return the dpdTimeoutSeconds value.
     */
    Integer dpdTimeoutSeconds();

    /**
     * Gets the connectionStatus property: The connection status.
     *
     * @return the connectionStatus value.
     */
    VpnConnectionStatus connectionStatus();

    /**
     * Gets the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @return the vpnConnectionProtocolType value.
     */
    VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType();

    /**
     * Gets the ingressBytesTransferred property: Ingress bytes transferred.
     *
     * @return the ingressBytesTransferred value.
     */
    Long ingressBytesTransferred();

    /**
     * Gets the egressBytesTransferred property: Egress bytes transferred.
     *
     * @return the egressBytesTransferred value.
     */
    Long egressBytesTransferred();

    /**
     * Gets the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @return the connectionBandwidth value.
     */
    Integer connectionBandwidth();

    /**
     * Gets the sharedKey property: SharedKey for the vpn connection.
     *
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * Gets the enableBgp property: EnableBgp flag.
     *
     * @return the enableBgp value.
     */
    Boolean enableBgp();

    /**
     * Gets the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @return the usePolicyBasedTrafficSelectors value.
     */
    Boolean usePolicyBasedTrafficSelectors();

    /**
     * Gets the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value.
     */
    List<IpsecPolicy> ipsecPolicies();

    /**
     * Gets the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @return the trafficSelectorPolicies value.
     */
    List<TrafficSelectorPolicy> trafficSelectorPolicies();

    /**
     * Gets the enableRateLimiting property: EnableBgp flag.
     *
     * @return the enableRateLimiting value.
     */
    Boolean enableRateLimiting();

    /**
     * Gets the enableInternetSecurity property: Enable internet security.
     *
     * @return the enableInternetSecurity value.
     */
    Boolean enableInternetSecurity();

    /**
     * Gets the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     *
     * @return the useLocalAzureIpAddress value.
     */
    Boolean useLocalAzureIpAddress();

    /**
     * Gets the provisioningState property: The provisioning state of the VPN connection resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the vpnLinkConnections property: List of all vpn site link connections to the gateway.
     *
     * @return the vpnLinkConnections value.
     */
    List<VpnSiteLinkConnection> vpnLinkConnections();

    /**
     * Gets the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @return the routingConfiguration value.
     */
    RoutingConfiguration routingConfiguration();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VpnConnectionInner object.
     *
     * @return the inner object.
     */
    VpnConnectionInner innerModel();
}
