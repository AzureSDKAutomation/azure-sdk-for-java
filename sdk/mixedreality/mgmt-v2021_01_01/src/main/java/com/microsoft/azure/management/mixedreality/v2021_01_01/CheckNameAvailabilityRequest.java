/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2021_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Check Name Availability Request.
 */
public class CheckNameAvailabilityRequest {
    /**
     * Resource Name To Verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Fully qualified resource type which includes provider namespace.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Get resource Name To Verify.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource Name To Verify.
     *
     * @param name the name value to set
     * @return the CheckNameAvailabilityRequest object itself.
     */
    public CheckNameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get fully qualified resource type which includes provider namespace.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set fully qualified resource type which includes provider namespace.
     *
     * @param type the type value to set
     * @return the CheckNameAvailabilityRequest object itself.
     */
    public CheckNameAvailabilityRequest withType(String type) {
        this.type = type;
        return this;
    }

}