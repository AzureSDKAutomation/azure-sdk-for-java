/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a Regional Service Resource.
 */
public class RegionalServiceResource {
    /**
     * The location of Regional Service Resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The status of the regional service.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the location of Regional Service Resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of Regional Service Resource.
     *
     * @param location the location value to set
     * @return the RegionalServiceResource object itself.
     */
    public RegionalServiceResource withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the status of the regional service.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status of the regional service.
     *
     * @param status the status value to set
     * @return the RegionalServiceResource object itself.
     */
    public RegionalServiceResource withStatus(String status) {
        this.status = status;
        return this;
    }

}
