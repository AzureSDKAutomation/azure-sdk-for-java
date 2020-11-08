/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * controller details.
 */
public class ControllerDetails {
    /**
     * controller arm resource id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get controller arm resource id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set controller arm resource id.
     *
     * @param id the id value to set
     * @return the ControllerDetails object itself.
     */
    public ControllerDetails withId(String id) {
        this.id = id;
        return this;
    }

}
