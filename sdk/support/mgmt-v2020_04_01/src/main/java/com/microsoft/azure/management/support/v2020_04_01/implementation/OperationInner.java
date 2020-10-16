/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01.implementation;

import com.microsoft.azure.management.support.v2020_04_01.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The operation supported by Microsoft Support resource provider.
 */
public class OperationInner {
    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Indicates whether the operation applies to data-plane.
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /**
     * The object that describes the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * Get operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get indicates whether the operation applies to data-plane.
     *
     * @return the isDataAction value
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set indicates whether the operation applies to data-plane.
     *
     * @param isDataAction the isDataAction value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the object that describes the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the object that describes the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

}
