/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Management group name availability check parameters.
 */
public class CheckNameAvailabilityRequest {
    /**
     * the name to check for availability.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * fully qualified resource type which includes provider namespace.
     * Possible values include: 'Microsoft.Management/managementGroups'.
     */
    @JsonProperty(value = "type")
    private Type type;

    /**
     * Get the name to check for availability.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name to check for availability.
     *
     * @param name the name value to set
     * @return the CheckNameAvailabilityRequest object itself.
     */
    public CheckNameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get fully qualified resource type which includes provider namespace. Possible values include: 'Microsoft.Management/managementGroups'.
     *
     * @return the type value
     */
    public Type type() {
        return this.type;
    }

    /**
     * Set fully qualified resource type which includes provider namespace. Possible values include: 'Microsoft.Management/managementGroups'.
     *
     * @param type the type value to set
     * @return the CheckNameAvailabilityRequest object itself.
     */
    public CheckNameAvailabilityRequest withType(Type type) {
        this.type = type;
        return this;
    }

}
