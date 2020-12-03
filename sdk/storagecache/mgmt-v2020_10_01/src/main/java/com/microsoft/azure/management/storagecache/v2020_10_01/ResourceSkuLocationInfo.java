/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource SKU location information.
 */
public class ResourceSkuLocationInfo {
    /**
     * Location where this SKU is available.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Zones if any.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Get location where this SKU is available.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location where this SKU is available.
     *
     * @param location the location value to set
     * @return the ResourceSkuLocationInfo object itself.
     */
    public ResourceSkuLocationInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get zones if any.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set zones if any.
     *
     * @param zones the zones value to set
     * @return the ResourceSkuLocationInfo object itself.
     */
    public ResourceSkuLocationInfo withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

}
