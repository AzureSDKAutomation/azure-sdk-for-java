/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifications of the Dimension of metrics.
 */
public class MetricDimension {
    /**
     * Name of the dimension.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Localized friendly display name of the dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Internal name of the dimension.
     */
    @JsonProperty(value = "internalName")
    private String internalName;

    /**
     * To be exported to shoe box.
     */
    @JsonProperty(value = "toBeExportedForShoebox")
    private Boolean toBeExportedForShoebox;

    /**
     * Get name of the dimension.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the dimension.
     *
     * @param name the name value to set
     * @return the MetricDimension object itself.
     */
    public MetricDimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get localized friendly display name of the dimension.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set localized friendly display name of the dimension.
     *
     * @param displayName the displayName value to set
     * @return the MetricDimension object itself.
     */
    public MetricDimension withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get internal name of the dimension.
     *
     * @return the internalName value
     */
    public String internalName() {
        return this.internalName;
    }

    /**
     * Set internal name of the dimension.
     *
     * @param internalName the internalName value to set
     * @return the MetricDimension object itself.
     */
    public MetricDimension withInternalName(String internalName) {
        this.internalName = internalName;
        return this;
    }

    /**
     * Get to be exported to shoe box.
     *
     * @return the toBeExportedForShoebox value
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set to be exported to shoe box.
     *
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set
     * @return the MetricDimension object itself.
     */
    public MetricDimension withToBeExportedForShoebox(Boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
        return this;
    }

}
