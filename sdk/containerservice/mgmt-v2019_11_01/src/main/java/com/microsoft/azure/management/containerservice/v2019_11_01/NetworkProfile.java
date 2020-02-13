/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the OpenShift networking configuration.
 */
public class NetworkProfile {
    /**
     * CIDR for the OpenShift Vnet.
     */
    @JsonProperty(value = "vnetCidr")
    private String vnetCidr;

    /**
     * CIDR of the Vnet to peer.
     */
    @JsonProperty(value = "peerVnetId")
    private String peerVnetId;

    /**
     * ID of the Vnet created for OSA cluster.
     */
    @JsonProperty(value = "vnetId")
    private String vnetId;

    /**
     * Get cIDR for the OpenShift Vnet.
     *
     * @return the vnetCidr value
     */
    public String vnetCidr() {
        return this.vnetCidr;
    }

    /**
     * Set cIDR for the OpenShift Vnet.
     *
     * @param vnetCidr the vnetCidr value to set
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withVnetCidr(String vnetCidr) {
        this.vnetCidr = vnetCidr;
        return this;
    }

    /**
     * Get cIDR of the Vnet to peer.
     *
     * @return the peerVnetId value
     */
    public String peerVnetId() {
        return this.peerVnetId;
    }

    /**
     * Set cIDR of the Vnet to peer.
     *
     * @param peerVnetId the peerVnetId value to set
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withPeerVnetId(String peerVnetId) {
        this.peerVnetId = peerVnetId;
        return this;
    }

    /**
     * Get iD of the Vnet created for OSA cluster.
     *
     * @return the vnetId value
     */
    public String vnetId() {
        return this.vnetId;
    }

    /**
     * Set iD of the Vnet created for OSA cluster.
     *
     * @param vnetId the vnetId value to set
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withVnetId(String vnetId) {
        this.vnetId = vnetId;
        return this;
    }

}
