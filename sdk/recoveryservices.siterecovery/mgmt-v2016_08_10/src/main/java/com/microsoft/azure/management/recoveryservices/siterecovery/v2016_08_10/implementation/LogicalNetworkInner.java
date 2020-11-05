/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.LogicalNetworkProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Logical network data model.
 */
public class LogicalNetworkInner extends ProxyResource {
    /**
     * The Logical Network Properties.
     */
    @JsonProperty(value = "properties")
    private LogicalNetworkProperties properties;

    /**
     * Resource Location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the Logical Network Properties.
     *
     * @return the properties value
     */
    public LogicalNetworkProperties properties() {
        return this.properties;
    }

    /**
     * Set the Logical Network Properties.
     *
     * @param properties the properties value to set
     * @return the LogicalNetworkInner object itself.
     */
    public LogicalNetworkInner withProperties(LogicalNetworkProperties properties) {
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
     * @return the LogicalNetworkInner object itself.
     */
    public LogicalNetworkInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
