/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The basic information of an event.
 */
public class EventInfoInner {
    /**
     * The event ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the event ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the event ID.
     *
     * @param id the id value to set
     * @return the EventInfoInner object itself.
     */
    public EventInfoInner withId(String id) {
        this.id = id;
        return this;
    }

}
