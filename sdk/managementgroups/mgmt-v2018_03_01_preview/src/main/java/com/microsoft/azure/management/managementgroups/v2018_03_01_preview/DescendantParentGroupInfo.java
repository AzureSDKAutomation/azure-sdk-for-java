/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2018_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ID of the parent management group.
 */
public class DescendantParentGroupInfo {
    /**
     * The fully qualified ID for the parent management group.  For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @param id the id value to set
     * @return the DescendantParentGroupInfo object itself.
     */
    public DescendantParentGroupInfo withId(String id) {
        this.id = id;
        return this;
    }

}
