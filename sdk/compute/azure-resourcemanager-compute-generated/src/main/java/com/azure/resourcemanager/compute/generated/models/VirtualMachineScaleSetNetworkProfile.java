// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machine scale set network profile. */
@Fluent
public final class VirtualMachineScaleSetNetworkProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetNetworkProfile.class);

    /*
     * A reference to a load balancer probe used to determine the health of an
     * instance in the virtual machine scale set. The reference will be in the
     * form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}'.
     */
    @JsonProperty(value = "healthProbe")
    private ApiEntityReference healthProbe;

    /*
     * The list of network configurations.
     */
    @JsonProperty(value = "networkInterfaceConfigurations")
    private List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations;

    /*
     * specifies the Microsoft.Network API version used when creating
     * networking resources in the Network Interface Configurations for Virtual
     * Machine Scale Set with orchestration mode 'Flexible'
     */
    @JsonProperty(value = "networkApiVersion")
    private NetworkApiVersion networkApiVersion;

    /**
     * Get the healthProbe property: A reference to a load balancer probe used to determine the health of an instance in
     * the virtual machine scale set. The reference will be in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}'.
     *
     * @return the healthProbe value.
     */
    public ApiEntityReference healthProbe() {
        return this.healthProbe;
    }

    /**
     * Set the healthProbe property: A reference to a load balancer probe used to determine the health of an instance in
     * the virtual machine scale set. The reference will be in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}'.
     *
     * @param healthProbe the healthProbe value to set.
     * @return the VirtualMachineScaleSetNetworkProfile object itself.
     */
    public VirtualMachineScaleSetNetworkProfile withHealthProbe(ApiEntityReference healthProbe) {
        this.healthProbe = healthProbe;
        return this;
    }

    /**
     * Get the networkInterfaceConfigurations property: The list of network configurations.
     *
     * @return the networkInterfaceConfigurations value.
     */
    public List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations() {
        return this.networkInterfaceConfigurations;
    }

    /**
     * Set the networkInterfaceConfigurations property: The list of network configurations.
     *
     * @param networkInterfaceConfigurations the networkInterfaceConfigurations value to set.
     * @return the VirtualMachineScaleSetNetworkProfile object itself.
     */
    public VirtualMachineScaleSetNetworkProfile withNetworkInterfaceConfigurations(
        List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations) {
        this.networkInterfaceConfigurations = networkInterfaceConfigurations;
        return this;
    }

    /**
     * Get the networkApiVersion property: specifies the Microsoft.Network API version used when creating networking
     * resources in the Network Interface Configurations for Virtual Machine Scale Set with orchestration mode
     * 'Flexible'.
     *
     * @return the networkApiVersion value.
     */
    public NetworkApiVersion networkApiVersion() {
        return this.networkApiVersion;
    }

    /**
     * Set the networkApiVersion property: specifies the Microsoft.Network API version used when creating networking
     * resources in the Network Interface Configurations for Virtual Machine Scale Set with orchestration mode
     * 'Flexible'.
     *
     * @param networkApiVersion the networkApiVersion value to set.
     * @return the VirtualMachineScaleSetNetworkProfile object itself.
     */
    public VirtualMachineScaleSetNetworkProfile withNetworkApiVersion(NetworkApiVersion networkApiVersion) {
        this.networkApiVersion = networkApiVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (healthProbe() != null) {
            healthProbe().validate();
        }
        if (networkInterfaceConfigurations() != null) {
            networkInterfaceConfigurations().forEach(e -> e.validate());
        }
    }
}
