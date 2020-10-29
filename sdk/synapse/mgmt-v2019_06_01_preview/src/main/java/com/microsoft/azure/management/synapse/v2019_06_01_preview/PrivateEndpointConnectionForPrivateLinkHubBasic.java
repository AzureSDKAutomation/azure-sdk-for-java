/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Private Endpoint Connection For Private Link Hub - Basic.
 */
public class PrivateEndpointConnectionForPrivateLinkHubBasic {
    /**
     * identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointConnectionProperties properties;

    /**
     * Get identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public PrivateEndpointConnectionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the PrivateEndpointConnectionForPrivateLinkHubBasic object itself.
     */
    public PrivateEndpointConnectionForPrivateLinkHubBasic withProperties(PrivateEndpointConnectionProperties properties) {
        this.properties = properties;
        return this;
    }

}
