/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExpressRoutePorts Location Bandwidths.
 * Real-time inventory of available ExpressRoute port bandwidths.
 */
public class ExpressRoutePortsLocationBandwidths {
    /**
     * Bandwidth descriptive name.
     */
    @JsonProperty(value = "offerName", access = JsonProperty.Access.WRITE_ONLY)
    private String offerName;

    /**
     * Bandwidth value in Gbps.
     */
    @JsonProperty(value = "valueInGbps", access = JsonProperty.Access.WRITE_ONLY)
    private Integer valueInGbps;

    /**
     * Get bandwidth descriptive name.
     *
     * @return the offerName value
     */
    public String offerName() {
        return this.offerName;
    }

    /**
     * Get bandwidth value in Gbps.
     *
     * @return the valueInGbps value
     */
    public Integer valueInGbps() {
        return this.valueInGbps;
    }

}
