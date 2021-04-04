// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The extended location. */
@Fluent
public final class ExtendedLocation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExtendedLocation.class);

    /*
     * The extended location type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The extended location name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the type property: The extended location type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The extended location type.
     *
     * @param type the type value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The extended location name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The extended location name.
     *
     * @param name the name value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withName(String name) {
        this.name = name;
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
