// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Vpn NatRule mapping. */
@Fluent
public final class VpnNatRuleMapping {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnNatRuleMapping.class);

    /*
     * Address space for Vpn NatRule mapping.
     */
    @JsonProperty(value = "addressSpace")
    private String addressSpace;

    /**
     * Get the addressSpace property: Address space for Vpn NatRule mapping.
     *
     * @return the addressSpace value.
     */
    public String addressSpace() {
        return this.addressSpace;
    }

    /**
     * Set the addressSpace property: Address space for Vpn NatRule mapping.
     *
     * @param addressSpace the addressSpace value to set.
     * @return the VpnNatRuleMapping object itself.
     */
    public VpnNatRuleMapping withAddressSpace(String addressSpace) {
        this.addressSpace = addressSpace;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
