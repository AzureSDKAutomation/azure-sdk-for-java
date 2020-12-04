/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.attestation.v2020_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PrivateLinkConnectionItemPropertiesPrivateEndpoint model.
 */
public class PrivateLinkConnectionItemPropertiesPrivateEndpoint {
    /**
     * Identifier for the endpoint.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get identifier for the endpoint.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set identifier for the endpoint.
     *
     * @param id the id value to set
     * @return the PrivateLinkConnectionItemPropertiesPrivateEndpoint object itself.
     */
    public PrivateLinkConnectionItemPropertiesPrivateEndpoint withId(String id) {
        this.id = id;
        return this;
    }

}
