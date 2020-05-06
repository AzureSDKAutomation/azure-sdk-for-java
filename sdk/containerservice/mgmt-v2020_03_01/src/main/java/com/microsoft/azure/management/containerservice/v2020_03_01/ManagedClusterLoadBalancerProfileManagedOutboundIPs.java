/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Desired managed outbound IPs for the cluster load balancer.
 */
public class ManagedClusterLoadBalancerProfileManagedOutboundIPs {
    /**
     * Desired number of outbound IP created/managed by Azure for the cluster
     * load balancer. Allowed values must be in the range of 1 to 100
     * (inclusive). The default value is 1.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Get desired number of outbound IP created/managed by Azure for the cluster load balancer. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set desired number of outbound IP created/managed by Azure for the cluster load balancer. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     *
     * @param count the count value to set
     * @return the ManagedClusterLoadBalancerProfileManagedOutboundIPs object itself.
     */
    public ManagedClusterLoadBalancerProfileManagedOutboundIPs withCount(Integer count) {
        this.count = count;
        return this;
    }

}
