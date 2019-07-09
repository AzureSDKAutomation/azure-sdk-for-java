/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.RecoveryPlanProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Recovery plan details.
 */
public class RecoveryPlanInner extends ProxyResource {
    /**
     * The custom details.
     */
    @JsonProperty(value = "properties")
    private RecoveryPlanProperties properties;

    /**
     * Resource Location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the custom details.
     *
     * @return the properties value
     */
    public RecoveryPlanProperties properties() {
        return this.properties;
    }

    /**
     * Set the custom details.
     *
     * @param properties the properties value to set
     * @return the RecoveryPlanInner object itself.
     */
    public RecoveryPlanInner withProperties(RecoveryPlanProperties properties) {
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
     * @return the RecoveryPlanInner object itself.
     */
    public RecoveryPlanInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
