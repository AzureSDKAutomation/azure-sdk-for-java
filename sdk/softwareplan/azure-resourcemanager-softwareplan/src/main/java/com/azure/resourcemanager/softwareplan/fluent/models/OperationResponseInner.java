// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.softwareplan.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.softwareplan.models.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation response. */
@Fluent
public final class OperationResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationResponseInner.class);

    /*
     * Name of the operation
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display properties for the operation
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * Origin of the response
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * Get the name property: Name of the operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the operation.
     *
     * @param name the name value to set.
     * @return the OperationResponseInner object itself.
     */
    public OperationResponseInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: Display properties for the operation.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Display properties for the operation.
     *
     * @param display the display value to set.
     * @return the OperationResponseInner object itself.
     */
    public OperationResponseInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: Origin of the response.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Origin of the response.
     *
     * @param origin the origin value to set.
     * @return the OperationResponseInner object itself.
     */
    public OperationResponseInner withOrigin(String origin) {
        this.origin = origin;
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
