/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile of network configuration.
 */
public class ContainerServiceNetworkProfile {
    /**
     * Network plugin used for building Kubernetes network. Possible values
     * include: 'azure', 'kubenet'.
     */
    @JsonProperty(value = "networkPlugin")
    private NetworkPlugin networkPlugin;

    /**
     * Network policy used for building Kubernetes network. Possible values
     * include: 'calico', 'azure'.
     */
    @JsonProperty(value = "networkPolicy")
    private NetworkPolicy networkPolicy;

    /**
     * Network mode used for building Kubernetes network. Possible values
     * include: 'transparent', 'bridge'.
     */
    @JsonProperty(value = "networkMode")
    private NetworkMode networkMode;

    /**
     * A CIDR notation IP range from which to assign pod IPs when kubenet is
     * used.
     */
    @JsonProperty(value = "podCidr")
    private String podCidr;

    /**
     * A CIDR notation IP range from which to assign service cluster IPs. It
     * must not overlap with any Subnet IP ranges.
     */
    @JsonProperty(value = "serviceCidr")
    private String serviceCidr;

    /**
     * An IP address assigned to the Kubernetes DNS service. It must be within
     * the Kubernetes service address range specified in serviceCidr.
     */
    @JsonProperty(value = "dnsServiceIP")
    private String dnsServiceIP;

    /**
     * A CIDR notation IP range assigned to the Docker bridge network. It must
     * not overlap with any Subnet IP ranges or the Kubernetes service address
     * range.
     */
    @JsonProperty(value = "dockerBridgeCidr")
    private String dockerBridgeCidr;

    /**
     * The outbound (egress) routing method. Possible values include:
     * 'loadBalancer', 'userDefinedRouting'.
     */
    @JsonProperty(value = "outboundType")
    private OutboundType outboundType;

    /**
     * The load balancer sku for the managed cluster. Possible values include:
     * 'standard', 'basic'.
     */
    @JsonProperty(value = "loadBalancerSku")
    private LoadBalancerSku loadBalancerSku;

    /**
     * Profile of the cluster load balancer.
     */
    @JsonProperty(value = "loadBalancerProfile")
    private ManagedClusterLoadBalancerProfile loadBalancerProfile;

    /**
     * Get network plugin used for building Kubernetes network. Possible values include: 'azure', 'kubenet'.
     *
     * @return the networkPlugin value
     */
    public NetworkPlugin networkPlugin() {
        return this.networkPlugin;
    }

    /**
     * Set network plugin used for building Kubernetes network. Possible values include: 'azure', 'kubenet'.
     *
     * @param networkPlugin the networkPlugin value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withNetworkPlugin(NetworkPlugin networkPlugin) {
        this.networkPlugin = networkPlugin;
        return this;
    }

    /**
     * Get network policy used for building Kubernetes network. Possible values include: 'calico', 'azure'.
     *
     * @return the networkPolicy value
     */
    public NetworkPolicy networkPolicy() {
        return this.networkPolicy;
    }

    /**
     * Set network policy used for building Kubernetes network. Possible values include: 'calico', 'azure'.
     *
     * @param networkPolicy the networkPolicy value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withNetworkPolicy(NetworkPolicy networkPolicy) {
        this.networkPolicy = networkPolicy;
        return this;
    }

    /**
     * Get network mode used for building Kubernetes network. Possible values include: 'transparent', 'bridge'.
     *
     * @return the networkMode value
     */
    public NetworkMode networkMode() {
        return this.networkMode;
    }

    /**
     * Set network mode used for building Kubernetes network. Possible values include: 'transparent', 'bridge'.
     *
     * @param networkMode the networkMode value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withNetworkMode(NetworkMode networkMode) {
        this.networkMode = networkMode;
        return this;
    }

    /**
     * Get a CIDR notation IP range from which to assign pod IPs when kubenet is used.
     *
     * @return the podCidr value
     */
    public String podCidr() {
        return this.podCidr;
    }

    /**
     * Set a CIDR notation IP range from which to assign pod IPs when kubenet is used.
     *
     * @param podCidr the podCidr value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withPodCidr(String podCidr) {
        this.podCidr = podCidr;
        return this;
    }

    /**
     * Get a CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any Subnet IP ranges.
     *
     * @return the serviceCidr value
     */
    public String serviceCidr() {
        return this.serviceCidr;
    }

    /**
     * Set a CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any Subnet IP ranges.
     *
     * @param serviceCidr the serviceCidr value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }

    /**
     * Get an IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service address range specified in serviceCidr.
     *
     * @return the dnsServiceIP value
     */
    public String dnsServiceIP() {
        return this.dnsServiceIP;
    }

    /**
     * Set an IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service address range specified in serviceCidr.
     *
     * @param dnsServiceIP the dnsServiceIP value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withDnsServiceIP(String dnsServiceIP) {
        this.dnsServiceIP = dnsServiceIP;
        return this;
    }

    /**
     * Get a CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes service address range.
     *
     * @return the dockerBridgeCidr value
     */
    public String dockerBridgeCidr() {
        return this.dockerBridgeCidr;
    }

    /**
     * Set a CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes service address range.
     *
     * @param dockerBridgeCidr the dockerBridgeCidr value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withDockerBridgeCidr(String dockerBridgeCidr) {
        this.dockerBridgeCidr = dockerBridgeCidr;
        return this;
    }

    /**
     * Get the outbound (egress) routing method. Possible values include: 'loadBalancer', 'userDefinedRouting'.
     *
     * @return the outboundType value
     */
    public OutboundType outboundType() {
        return this.outboundType;
    }

    /**
     * Set the outbound (egress) routing method. Possible values include: 'loadBalancer', 'userDefinedRouting'.
     *
     * @param outboundType the outboundType value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withOutboundType(OutboundType outboundType) {
        this.outboundType = outboundType;
        return this;
    }

    /**
     * Get the load balancer sku for the managed cluster. Possible values include: 'standard', 'basic'.
     *
     * @return the loadBalancerSku value
     */
    public LoadBalancerSku loadBalancerSku() {
        return this.loadBalancerSku;
    }

    /**
     * Set the load balancer sku for the managed cluster. Possible values include: 'standard', 'basic'.
     *
     * @param loadBalancerSku the loadBalancerSku value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withLoadBalancerSku(LoadBalancerSku loadBalancerSku) {
        this.loadBalancerSku = loadBalancerSku;
        return this;
    }

    /**
     * Get profile of the cluster load balancer.
     *
     * @return the loadBalancerProfile value
     */
    public ManagedClusterLoadBalancerProfile loadBalancerProfile() {
        return this.loadBalancerProfile;
    }

    /**
     * Set profile of the cluster load balancer.
     *
     * @param loadBalancerProfile the loadBalancerProfile value to set
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withLoadBalancerProfile(ManagedClusterLoadBalancerProfile loadBalancerProfile) {
        this.loadBalancerProfile = loadBalancerProfile;
        return this;
    }

}
