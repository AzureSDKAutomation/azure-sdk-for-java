/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.microsoft.azure.management.monitor.v2019_11_01.implementation.LocalizableStringInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a baseline metadata value.
 */
public class BaselineMetadataValue {
    /**
     * the name of the metadata.
     */
    @JsonProperty(value = "name")
    private LocalizableStringInner name;

    /**
     * the value of the metadata.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name of the metadata.
     *
     * @return the name value
     */
    public LocalizableStringInner name() {
        return this.name;
    }

    /**
     * Set the name of the metadata.
     *
     * @param name the name value to set
     * @return the BaselineMetadataValue object itself.
     */
    public BaselineMetadataValue withName(LocalizableStringInner name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of the metadata.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value of the metadata.
     *
     * @param value the value value to set
     * @return the BaselineMetadataValue object itself.
     */
    public BaselineMetadataValue withValue(String value) {
        this.value = value;
        return this;
    }

}
