/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.RecoveryServicesProviderProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Provider details.
 */
public class RecoveryServicesProviderInner extends ProxyResource {
    /**
     * Provider properties.
     */
    @JsonProperty(value = "properties")
    private RecoveryServicesProviderProperties properties;

    /**
     * Resource Location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get provider properties.
     *
     * @return the properties value
     */
    public RecoveryServicesProviderProperties properties() {
        return this.properties;
    }

    /**
     * Set provider properties.
     *
     * @param properties the properties value to set
     * @return the RecoveryServicesProviderInner object itself.
     */
    public RecoveryServicesProviderInner withProperties(RecoveryServicesProviderProperties properties) {
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
     * @return the RecoveryServicesProviderInner object itself.
     */
    public RecoveryServicesProviderInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
