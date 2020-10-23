/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The cost of the SKU.
 */
public class SKUCost {
    /**
     * The meter id.
     */
    @JsonProperty(value = "meterId", access = JsonProperty.Access.WRITE_ONLY)
    private String meterId;

    /**
     * The quantity.
     */
    @JsonProperty(value = "quantity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer quantity;

    /**
     * The extended unit.
     */
    @JsonProperty(value = "extendedUnit", access = JsonProperty.Access.WRITE_ONLY)
    private String extendedUnit;

    /**
     * Get the meter id.
     *
     * @return the meterId value
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Get the quantity.
     *
     * @return the quantity value
     */
    public Integer quantity() {
        return this.quantity;
    }

    /**
     * Get the extended unit.
     *
     * @return the extendedUnit value
     */
    public String extendedUnit() {
        return this.extendedUnit;
    }

}
