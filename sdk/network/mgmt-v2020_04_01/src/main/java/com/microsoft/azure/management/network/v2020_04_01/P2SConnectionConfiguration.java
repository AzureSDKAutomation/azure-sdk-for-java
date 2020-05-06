/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * P2SConnectionConfiguration Resource.
 */
@JsonFlatten
public class P2SConnectionConfiguration extends SubResource {
    /**
     * The reference to the address space resource which represents Address
     * space for P2S VpnClient.
     */
    @JsonProperty(value = "properties.vpnClientAddressPool")
    private AddressSpace vpnClientAddressPool;

    /**
     * The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     */
    @JsonProperty(value = "properties.routingConfiguration")
    private RoutingConfiguration routingConfiguration;

    /**
     * The provisioning state of the P2SConnectionConfiguration resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the reference to the address space resource which represents Address space for P2S VpnClient.
     *
     * @return the vpnClientAddressPool value
     */
    public AddressSpace vpnClientAddressPool() {
        return this.vpnClientAddressPool;
    }

    /**
     * Set the reference to the address space resource which represents Address space for P2S VpnClient.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set
     * @return the P2SConnectionConfiguration object itself.
     */
    public P2SConnectionConfiguration withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        this.vpnClientAddressPool = vpnClientAddressPool;
        return this;
    }

    /**
     * Get the Routing Configuration indicating the associated and propagated route tables on this connection.
     *
     * @return the routingConfiguration value
     */
    public RoutingConfiguration routingConfiguration() {
        return this.routingConfiguration;
    }

    /**
     * Set the Routing Configuration indicating the associated and propagated route tables on this connection.
     *
     * @param routingConfiguration the routingConfiguration value to set
     * @return the P2SConnectionConfiguration object itself.
     */
    public P2SConnectionConfiguration withRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }

    /**
     * Get the provisioning state of the P2SConnectionConfiguration resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the P2SConnectionConfiguration object itself.
     */
    public P2SConnectionConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
