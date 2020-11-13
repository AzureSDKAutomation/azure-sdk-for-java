/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Desired outbound IP Prefix resources for the cluster load balancer.
 */
public class ManagedClusterLoadBalancerProfileOutboundIPPrefixes {
    /**
     * A list of public IP prefix resources.
     */
    @JsonProperty(value = "publicIPPrefixes")
    private List<ResourceReference> publicIPPrefixes;

    /**
     * Get a list of public IP prefix resources.
     *
     * @return the publicIPPrefixes value
     */
    public List<ResourceReference> publicIPPrefixes() {
        return this.publicIPPrefixes;
    }

    /**
     * Set a list of public IP prefix resources.
     *
     * @param publicIPPrefixes the publicIPPrefixes value to set
     * @return the ManagedClusterLoadBalancerProfileOutboundIPPrefixes object itself.
     */
    public ManagedClusterLoadBalancerProfileOutboundIPPrefixes withPublicIPPrefixes(List<ResourceReference> publicIPPrefixes) {
        this.publicIPPrefixes = publicIPPrefixes;
        return this;
    }

}
