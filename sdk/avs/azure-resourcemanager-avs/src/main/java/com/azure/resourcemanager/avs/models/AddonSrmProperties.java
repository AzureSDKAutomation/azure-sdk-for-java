// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an SRM addon that may be updated. */
@Fluent
public class AddonSrmProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AddonSrmProperties.class);

    /*
     * The SRM license
     */
    @JsonProperty(value = "licenseKey")
    private String licenseKey;

    /**
     * Get the licenseKey property: The SRM license.
     *
     * @return the licenseKey value.
     */
    public String licenseKey() {
        return this.licenseKey;
    }

    /**
     * Set the licenseKey property: The SRM license.
     *
     * @param licenseKey the licenseKey value to set.
     * @return the AddonSrmProperties object itself.
     */
    public AddonSrmProperties withLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
