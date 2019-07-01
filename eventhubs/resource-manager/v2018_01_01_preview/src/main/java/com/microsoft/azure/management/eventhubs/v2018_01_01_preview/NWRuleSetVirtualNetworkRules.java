/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response from the List namespace operation.
 */
public class NWRuleSetVirtualNetworkRules {
    /**
     * Subnet properties.
     */
    @JsonProperty(value = "subnet")
    private Subnet subnet;

    /**
     * Value that indicates whether to ignore missing Vnet Service Endpoint.
     */
    @JsonProperty(value = "ignoreMissingVnetServiceEndpoint")
    private Boolean ignoreMissingVnetServiceEndpoint;

    /**
     * Get subnet properties.
     *
     * @return the subnet value
     */
    public Subnet subnet() {
        return this.subnet;
    }

    /**
     * Set subnet properties.
     *
     * @param subnet the subnet value to set
     * @return the NWRuleSetVirtualNetworkRules object itself.
     */
    public NWRuleSetVirtualNetworkRules withSubnet(Subnet subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get value that indicates whether to ignore missing Vnet Service Endpoint.
     *
     * @return the ignoreMissingVnetServiceEndpoint value
     */
    public Boolean ignoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint;
    }

    /**
     * Set value that indicates whether to ignore missing Vnet Service Endpoint.
     *
     * @param ignoreMissingVnetServiceEndpoint the ignoreMissingVnetServiceEndpoint value to set
     * @return the NWRuleSetVirtualNetworkRules object itself.
     */
    public NWRuleSetVirtualNetworkRules withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        return this;
    }

}
