/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subscription trial availability.
 */
public class Trial {
    /**
     * Trial status. Possible values include: 'TrialAvailable', 'TrialUsed',
     * 'TrialDisabled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Number of trial hosts available.
     */
    @JsonProperty(value = "availableHosts", access = JsonProperty.Access.WRITE_ONLY)
    private Integer availableHosts;

    /**
     * Get trial status. Possible values include: 'TrialAvailable', 'TrialUsed', 'TrialDisabled'.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get number of trial hosts available.
     *
     * @return the availableHosts value
     */
    public Integer availableHosts() {
        return this.availableHosts;
    }

}
