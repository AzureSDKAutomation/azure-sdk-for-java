/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Name and Type of the Resource.
 */
public class ResourceName {
    /**
     * Name of the resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The type of the resource.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Get name of the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the resource.
     *
     * @param name the name value to set
     * @return the ResourceName object itself.
     */
    public ResourceName withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the resource.
     *
     * @param type the type value to set
     * @return the ResourceName object itself.
     */
    public ResourceName withType(String type) {
        this.type = type;
        return this;
    }

}
