/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2018_02_14_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A rule governing the accessibility of a vault from a specific virtual
 * network.
 */
public class VirtualNetworkRule {
    /**
     * Full resource id of a vnet subnet, such as
     * '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get full resource id of a vnet subnet, such as '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set full resource id of a vnet subnet, such as '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     *
     * @param id the id value to set
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withId(String id) {
        this.id = id;
        return this;
    }

}
