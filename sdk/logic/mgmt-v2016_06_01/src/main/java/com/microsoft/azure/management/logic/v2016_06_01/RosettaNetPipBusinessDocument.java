/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RosettaNet ProcessConfiguration business document settings.
 */
public class RosettaNetPipBusinessDocument {
    /**
     * The business document name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The business document version.
     */
    @JsonProperty(value = "version", required = true)
    private String version;

    /**
     * The business document description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the business document name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the business document name.
     *
     * @param name the name value to set
     * @return the RosettaNetPipBusinessDocument object itself.
     */
    public RosettaNetPipBusinessDocument withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the business document version.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the business document version.
     *
     * @param version the version value to set
     * @return the RosettaNetPipBusinessDocument object itself.
     */
    public RosettaNetPipBusinessDocument withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the business document description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the business document description.
     *
     * @param description the description value to set
     * @return the RosettaNetPipBusinessDocument object itself.
     */
    public RosettaNetPipBusinessDocument withDescription(String description) {
        this.description = description;
        return this;
    }

}
