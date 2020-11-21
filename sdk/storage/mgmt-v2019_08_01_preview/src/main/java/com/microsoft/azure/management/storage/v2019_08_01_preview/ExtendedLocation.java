/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The complex type of the extended location.
 */
public class ExtendedLocation {
    /**
     * The name of the extended location.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The type of the extended location. Possible values include: 'EdgeZone'.
     */
    @JsonProperty(value = "type")
    private ExtendedLocationTypes type;

    /**
     * Get the name of the extended location.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the extended location.
     *
     * @param name the name value to set
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of the extended location. Possible values include: 'EdgeZone'.
     *
     * @return the type value
     */
    public ExtendedLocationTypes type() {
        return this.type;
    }

    /**
     * Set the type of the extended location. Possible values include: 'EdgeZone'.
     *
     * @param type the type value to set
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withType(ExtendedLocationTypes type) {
        this.type = type;
        return this;
    }

}
