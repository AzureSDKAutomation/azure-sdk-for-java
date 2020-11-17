/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview.implementation;

import com.microsoft.azure.management.avs.v2020_07_17_preview.GlobalReachConnectionProvisioningState;
import com.microsoft.azure.management.avs.v2020_07_17_preview.GlobalReachConnectionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A global reach connection resource.
 */
@JsonFlatten
public class GlobalReachConnectionInner extends ProxyResource {
    /**
     * The state of the  ExpressRoute Circuit Authorization provisioning.
     * Possible values include: 'Succeeded', 'Failed', 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GlobalReachConnectionProvisioningState provisioningState;

    /**
     * The network used for global reach carved out from the original network
     * block provided for the private cloud.
     */
    @JsonProperty(value = "properties.addressPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String addressPrefix;

    /**
     * Authorization key from the peer express route used for the global reach
     * connection.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /**
     * The connection status of the global reach connection. Possible values
     * include: 'Connected', 'Connecting', 'Disconnected'.
     */
    @JsonProperty(value = "properties.circuitConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private GlobalReachConnectionStatus circuitConnectionStatus;

    /**
     * Identifier of the ExpressRoute Circuit to peer with in the global reach
     * connection.
     */
    @JsonProperty(value = "properties.peerExpressRouteCircuit")
    private String peerExpressRouteCircuit;

    /**
     * Get the state of the  ExpressRoute Circuit Authorization provisioning. Possible values include: 'Succeeded', 'Failed', 'Updating'.
     *
     * @return the provisioningState value
     */
    public GlobalReachConnectionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the network used for global reach carved out from the original network block provided for the private cloud.
     *
     * @return the addressPrefix value
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Get authorization key from the peer express route used for the global reach connection.
     *
     * @return the authorizationKey value
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set authorization key from the peer express route used for the global reach connection.
     *
     * @param authorizationKey the authorizationKey value to set
     * @return the GlobalReachConnectionInner object itself.
     */
    public GlobalReachConnectionInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the connection status of the global reach connection. Possible values include: 'Connected', 'Connecting', 'Disconnected'.
     *
     * @return the circuitConnectionStatus value
     */
    public GlobalReachConnectionStatus circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * Get identifier of the ExpressRoute Circuit to peer with in the global reach connection.
     *
     * @return the peerExpressRouteCircuit value
     */
    public String peerExpressRouteCircuit() {
        return this.peerExpressRouteCircuit;
    }

    /**
     * Set identifier of the ExpressRoute Circuit to peer with in the global reach connection.
     *
     * @param peerExpressRouteCircuit the peerExpressRouteCircuit value to set
     * @return the GlobalReachConnectionInner object itself.
     */
    public GlobalReachConnectionInner withPeerExpressRouteCircuit(String peerExpressRouteCircuit) {
        this.peerExpressRouteCircuit = peerExpressRouteCircuit;
        return this;
    }

}
