/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input of the validate probe API.
 */
public class ValidateProbeInput {
    /**
     * The probe URL to validate.
     */
    @JsonProperty(value = "probeURL", required = true)
    private String probeURL;

    /**
     * Get the probe URL to validate.
     *
     * @return the probeURL value
     */
    public String probeURL() {
        return this.probeURL;
    }

    /**
     * Set the probe URL to validate.
     *
     * @param probeURL the probeURL value to set
     * @return the ValidateProbeInput object itself.
     */
    public ValidateProbeInput withProbeURL(String probeURL) {
        this.probeURL = probeURL;
        return this;
    }

}
