/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_09_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * PeeringService provider.
 */
@JsonFlatten
public class PeeringServiceProviderInner extends ProxyResource {
    /**
     * The name of the service provider.
     */
    @JsonProperty(value = "properties.serviceProviderName")
    private String serviceProviderName;

    /**
     * Get the name of the service provider.
     *
     * @return the serviceProviderName value
     */
    public String serviceProviderName() {
        return this.serviceProviderName;
    }

    /**
     * Set the name of the service provider.
     *
     * @param serviceProviderName the serviceProviderName value to set
     * @return the PeeringServiceProviderInner object itself.
     */
    public PeeringServiceProviderInner withServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
        return this;
    }

}
