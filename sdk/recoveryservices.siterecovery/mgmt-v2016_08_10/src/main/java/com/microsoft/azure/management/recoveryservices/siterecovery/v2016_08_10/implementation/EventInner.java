/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.EventProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Implements the Event class.
 */
public class EventInner extends ProxyResource {
    /**
     * Event related data.
     */
    @JsonProperty(value = "properties")
    private EventProperties properties;

    /**
     * Resource Location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get event related data.
     *
     * @return the properties value
     */
    public EventProperties properties() {
        return this.properties;
    }

    /**
     * Set event related data.
     *
     * @param properties the properties value to set
     * @return the EventInner object itself.
     */
    public EventInner withProperties(EventProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get resource Location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource Location.
     *
     * @param location the location value to set
     * @return the EventInner object itself.
     */
    public EventInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
