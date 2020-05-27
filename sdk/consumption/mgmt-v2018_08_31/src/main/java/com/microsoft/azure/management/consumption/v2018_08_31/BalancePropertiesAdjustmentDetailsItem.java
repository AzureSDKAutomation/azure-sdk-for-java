/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_08_31;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BalancePropertiesAdjustmentDetailsItem model.
 */
public class BalancePropertiesAdjustmentDetailsItem {
    /**
     * the name of new adjustment.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * the value of new adjustment.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal value;

    /**
     * Get the name of new adjustment.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value of new adjustment.
     *
     * @return the value value
     */
    public BigDecimal value() {
        return this.value;
    }

}
