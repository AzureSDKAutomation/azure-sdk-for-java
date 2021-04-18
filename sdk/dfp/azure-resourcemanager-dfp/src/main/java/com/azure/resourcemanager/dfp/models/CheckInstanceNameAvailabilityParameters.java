// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dfp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of DFP instance name request body. */
@Fluent
public final class CheckInstanceNameAvailabilityParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckInstanceNameAvailabilityParameters.class);

    /*
     * Name for checking availability.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource type of DFP instance.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name property: Name for checking availability.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name for checking availability.
     *
     * @param name the name value to set.
     * @return the CheckInstanceNameAvailabilityParameters object itself.
     */
    public CheckInstanceNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type of DFP instance.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type of DFP instance.
     *
     * @param type the type value to set.
     * @return the CheckInstanceNameAvailabilityParameters object itself.
     */
    public CheckInstanceNameAvailabilityParameters withType(String type) {
        this.type = type;
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
