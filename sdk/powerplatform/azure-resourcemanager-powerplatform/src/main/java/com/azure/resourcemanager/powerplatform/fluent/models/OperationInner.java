// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.powerplatform.models.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PowerPlatform REST API operation. */
@JsonFlatten
@Fluent
public class OperationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationInner.class);

    /*
     * Operation name: For ex.
     * providers/Microsoft.PowerPlatform/enterprisePolicies/write or read
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Indicates whether the operation is a data action
     */
    @JsonProperty(value = "isDataAction")
    private String isDataAction;

    /*
     * Provider, Resource, Operation and description values.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * Service provider: Microsoft.PowerPlatform
     */
    @JsonProperty(value = "properties.statusCode")
    private String statusCode;

    /**
     * Get the name property: Operation name: For ex. providers/Microsoft.PowerPlatform/enterprisePolicies/write or
     * read.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name: For ex. providers/Microsoft.PowerPlatform/enterprisePolicies/write or
     * read.
     *
     * @param name the name value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation is a data action.
     *
     * @return the isDataAction value.
     */
    public String isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation is a data action.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withIsDataAction(String isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the display property: Provider, Resource, Operation and description values.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Provider, Resource, Operation and description values.
     *
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the statusCode property: Service provider: Microsoft.PowerPlatform.
     *
     * @return the statusCode value.
     */
    public String statusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode property: Service provider: Microsoft.PowerPlatform.
     *
     * @param statusCode the statusCode value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
