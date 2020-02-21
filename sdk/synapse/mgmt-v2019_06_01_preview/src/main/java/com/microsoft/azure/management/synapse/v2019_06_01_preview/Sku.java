/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sku.
 * SQL pool SKU.
 */
public class Sku {
    /**
     * The service tier.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * The SKU name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the service tier.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the service tier.
     *
     * @param tier the tier value to set
     * @return the Sku object itself.
     */
    public Sku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the SKU name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the SKU name.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

}
