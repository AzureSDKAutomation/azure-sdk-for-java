/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Map of destination location to service location.
 */
public class DestinationToServiceLocationMap {
    /**
     * Location of the destination.
     */
    @JsonProperty(value = "destinationLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String destinationLocation;

    /**
     * Location of the service.
     */
    @JsonProperty(value = "serviceLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceLocation;

    /**
     * Get location of the destination.
     *
     * @return the destinationLocation value
     */
    public String destinationLocation() {
        return this.destinationLocation;
    }

    /**
     * Get location of the service.
     *
     * @return the serviceLocation value
     */
    public String serviceLocation() {
        return this.serviceLocation;
    }

}
