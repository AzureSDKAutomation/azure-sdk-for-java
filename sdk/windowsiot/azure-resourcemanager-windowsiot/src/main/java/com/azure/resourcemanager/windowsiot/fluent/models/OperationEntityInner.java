// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.windowsiot.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.windowsiot.models.OperationDisplayInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The operation supported by Azure Data Catalog Service. */
@Fluent
public final class OperationEntityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationEntityInner.class);

    /*
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The operation supported by Azure Data Catalog Service.
     */
    @JsonProperty(value = "display")
    private OperationDisplayInfo display;

    /*
     * Indicates whether the operation is a data action
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set.
     * @return the OperationEntityInner object itself.
     */
    public OperationEntityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The operation supported by Azure Data Catalog Service.
     *
     * @return the display value.
     */
    public OperationDisplayInfo display() {
        return this.display;
    }

    /**
     * Set the display property: The operation supported by Azure Data Catalog Service.
     *
     * @param display the display value to set.
     * @return the OperationEntityInner object itself.
     */
    public OperationEntityInner withDisplay(OperationDisplayInfo display) {
        this.display = display;
        return this;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation is a data action.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation is a data action.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the OperationEntityInner object itself.
     */
    public OperationEntityInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
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
