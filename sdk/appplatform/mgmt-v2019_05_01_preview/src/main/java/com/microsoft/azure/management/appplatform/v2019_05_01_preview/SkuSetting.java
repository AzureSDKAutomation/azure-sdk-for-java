/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Supported Sku settings of Azure Spring Cloud.
 */
public class SkuSetting {
    /**
     * Name of the Sku.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Tier of the Sku.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * Locations of the Sku.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /**
     * Required features of the Sku.
     */
    @JsonProperty(value = "requiredFeatures")
    private List<String> requiredFeatures;

    /**
     * Capacity of the SKU.
     */
    @JsonProperty(value = "capacity")
    private SkuCapacity capacity;

    /**
     * Get name of the Sku.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the Sku.
     *
     * @param name the name value to set
     * @return the SkuSetting object itself.
     */
    public SkuSetting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get tier of the Sku.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set tier of the Sku.
     *
     * @param tier the tier value to set
     * @return the SkuSetting object itself.
     */
    public SkuSetting withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get locations of the Sku.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set locations of the Sku.
     *
     * @param locations the locations value to set
     * @return the SkuSetting object itself.
     */
    public SkuSetting withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get required features of the Sku.
     *
     * @return the requiredFeatures value
     */
    public List<String> requiredFeatures() {
        return this.requiredFeatures;
    }

    /**
     * Set required features of the Sku.
     *
     * @param requiredFeatures the requiredFeatures value to set
     * @return the SkuSetting object itself.
     */
    public SkuSetting withRequiredFeatures(List<String> requiredFeatures) {
        this.requiredFeatures = requiredFeatures;
        return this;
    }

    /**
     * Get capacity of the SKU.
     *
     * @return the capacity value
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set capacity of the SKU.
     *
     * @param capacity the capacity value to set
     * @return the SkuSetting object itself.
     */
    public SkuSetting withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

}
