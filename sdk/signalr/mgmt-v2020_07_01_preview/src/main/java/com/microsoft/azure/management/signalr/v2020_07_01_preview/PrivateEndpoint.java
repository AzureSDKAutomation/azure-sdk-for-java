/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Private endpoint.
 */
public class PrivateEndpoint {
    /**
     * Full qualified Id of the private endpoint.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get full qualified Id of the private endpoint.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set full qualified Id of the private endpoint.
     *
     * @param id the id value to set
     * @return the PrivateEndpoint object itself.
     */
    public PrivateEndpoint withId(String id) {
        this.id = id;
        return this;
    }

}
