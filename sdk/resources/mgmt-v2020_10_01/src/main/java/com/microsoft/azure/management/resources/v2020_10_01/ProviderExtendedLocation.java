/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The provider extended location.
 */
public class ProviderExtendedLocation {
    /**
     * The azure location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The extended location type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The extended locations for the azure location.
     */
    @JsonProperty(value = "extendedLocations")
    private List<String> extendedLocations;

    /**
     * Get the azure location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the azure location.
     *
     * @param location the location value to set
     * @return the ProviderExtendedLocation object itself.
     */
    public ProviderExtendedLocation withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the extended location type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the extended location type.
     *
     * @param type the type value to set
     * @return the ProviderExtendedLocation object itself.
     */
    public ProviderExtendedLocation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the extended locations for the azure location.
     *
     * @return the extendedLocations value
     */
    public List<String> extendedLocations() {
        return this.extendedLocations;
    }

    /**
     * Set the extended locations for the azure location.
     *
     * @param extendedLocations the extendedLocations value to set
     * @return the ProviderExtendedLocation object itself.
     */
    public ProviderExtendedLocation withExtendedLocations(List<String> extendedLocations) {
        this.extendedLocations = extendedLocations;
        return this;
    }

}
