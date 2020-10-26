/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile of the managed cluster load balancer.
 */
public class ManagedClusterLoadBalancerProfile {
    /**
     * Desired managed outbound IPs for the cluster load balancer.
     */
    @JsonProperty(value = "managedOutboundIPs")
    private ManagedClusterLoadBalancerProfileManagedOutboundIPs managedOutboundIPs;

    /**
     * Desired outbound IP Prefix resources for the cluster load balancer.
     */
    @JsonProperty(value = "outboundIPPrefixes")
    private ManagedClusterLoadBalancerProfileOutboundIPPrefixes outboundIPPrefixes;

    /**
     * Desired outbound IP resources for the cluster load balancer.
     */
    @JsonProperty(value = "outboundIPs")
    private ManagedClusterLoadBalancerProfileOutboundIPs outboundIPs;

    /**
     * The effective outbound IP resources of the cluster load balancer.
     */
    @JsonProperty(value = "effectiveOutboundIPs")
    private List<ResourceReference> effectiveOutboundIPs;

    /**
     * Desired number of allocated SNAT ports per VM. Allowed values must be in
     * the range of 0 to 64000 (inclusive). The default value is 0 which
     * results in Azure dynamically allocating ports.
     */
    @JsonProperty(value = "allocatedOutboundPorts")
    private Integer allocatedOutboundPorts;

    /**
     * Desired outbound flow idle timeout in minutes. Allowed values must be in
     * the range of 4 to 120 (inclusive). The default value is 30 minutes.
     */
    @JsonProperty(value = "idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * Get desired managed outbound IPs for the cluster load balancer.
     *
     * @return the managedOutboundIPs value
     */
    public ManagedClusterLoadBalancerProfileManagedOutboundIPs managedOutboundIPs() {
        return this.managedOutboundIPs;
    }

    /**
     * Set desired managed outbound IPs for the cluster load balancer.
     *
     * @param managedOutboundIPs the managedOutboundIPs value to set
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withManagedOutboundIPs(ManagedClusterLoadBalancerProfileManagedOutboundIPs managedOutboundIPs) {
        this.managedOutboundIPs = managedOutboundIPs;
        return this;
    }

    /**
     * Get desired outbound IP Prefix resources for the cluster load balancer.
     *
     * @return the outboundIPPrefixes value
     */
    public ManagedClusterLoadBalancerProfileOutboundIPPrefixes outboundIPPrefixes() {
        return this.outboundIPPrefixes;
    }

    /**
     * Set desired outbound IP Prefix resources for the cluster load balancer.
     *
     * @param outboundIPPrefixes the outboundIPPrefixes value to set
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withOutboundIPPrefixes(ManagedClusterLoadBalancerProfileOutboundIPPrefixes outboundIPPrefixes) {
        this.outboundIPPrefixes = outboundIPPrefixes;
        return this;
    }

    /**
     * Get desired outbound IP resources for the cluster load balancer.
     *
     * @return the outboundIPs value
     */
    public ManagedClusterLoadBalancerProfileOutboundIPs outboundIPs() {
        return this.outboundIPs;
    }

    /**
     * Set desired outbound IP resources for the cluster load balancer.
     *
     * @param outboundIPs the outboundIPs value to set
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withOutboundIPs(ManagedClusterLoadBalancerProfileOutboundIPs outboundIPs) {
        this.outboundIPs = outboundIPs;
        return this;
    }

    /**
     * Get the effective outbound IP resources of the cluster load balancer.
     *
     * @return the effectiveOutboundIPs value
     */
    public List<ResourceReference> effectiveOutboundIPs() {
        return this.effectiveOutboundIPs;
    }

    /**
     * Set the effective outbound IP resources of the cluster load balancer.
     *
     * @param effectiveOutboundIPs the effectiveOutboundIPs value to set
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withEffectiveOutboundIPs(List<ResourceReference> effectiveOutboundIPs) {
        this.effectiveOutboundIPs = effectiveOutboundIPs;
        return this;
    }

    /**
     * Get desired number of allocated SNAT ports per VM. Allowed values must be in the range of 0 to 64000 (inclusive). The default value is 0 which results in Azure dynamically allocating ports.
     *
     * @return the allocatedOutboundPorts value
     */
    public Integer allocatedOutboundPorts() {
        return this.allocatedOutboundPorts;
    }

    /**
     * Set desired number of allocated SNAT ports per VM. Allowed values must be in the range of 0 to 64000 (inclusive). The default value is 0 which results in Azure dynamically allocating ports.
     *
     * @param allocatedOutboundPorts the allocatedOutboundPorts value to set
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withAllocatedOutboundPorts(Integer allocatedOutboundPorts) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
        return this;
    }

    /**
     * Get desired outbound flow idle timeout in minutes. Allowed values must be in the range of 4 to 120 (inclusive). The default value is 30 minutes.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set desired outbound flow idle timeout in minutes. Allowed values must be in the range of 4 to 120 (inclusive). The default value is 30 minutes.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

}
