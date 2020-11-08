/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.implementation;

import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Microsoft.DelegatedNetwork REST API operation definition.
 */
public class OperationInner {
    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Origin of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * Gets or sets a value indicating whether the operation is a data action
     * or not.
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /**
     * Operation properties display.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * Properties of the operation.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get origin of the operation.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set origin of the operation.
     *
     * @param origin the origin value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get gets or sets a value indicating whether the operation is a data action or not.
     *
     * @return the isDataAction value
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set gets or sets a value indicating whether the operation is a data action or not.
     *
     * @param isDataAction the isDataAction value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get operation properties display.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set operation properties display.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get properties of the operation.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set properties of the operation.
     *
     * @param properties the properties value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

}
