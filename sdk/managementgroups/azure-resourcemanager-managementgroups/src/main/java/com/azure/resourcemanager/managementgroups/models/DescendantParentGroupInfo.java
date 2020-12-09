// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ID of the parent management group. */
@Fluent
public final class DescendantParentGroupInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DescendantParentGroupInfo.class);

    /*
     * The fully qualified ID for the parent management group.  For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The fully qualified ID for the parent management group. For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The fully qualified ID for the parent management group. For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @param id the id value to set.
     * @return the DescendantParentGroupInfo object itself.
     */
    public DescendantParentGroupInfo withId(String id) {
        this.id = id;
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
