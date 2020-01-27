/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2019_11_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The management group resource.
 */
@JsonFlatten
public class ManagementGroupInfoInner {
    /**
     * The fully qualified ID for the management group.  For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The type of the resource. For example,
     * Microsoft.Management/managementGroups.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The name of the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "properties.tenantId")
    private String tenantId;

    /**
     * The friendly name of the management group.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Get the fully qualified ID for the management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type of the resource. For example, Microsoft.Management/managementGroups.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the name of the management group. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the AAD Tenant ID associated with the management group. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the AAD Tenant ID associated with the management group. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @param tenantId the tenantId value to set
     * @return the ManagementGroupInfoInner object itself.
     */
    public ManagementGroupInfoInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the friendly name of the management group.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the friendly name of the management group.
     *
     * @param displayName the displayName value to set
     * @return the ManagementGroupInfoInner object itself.
     */
    public ManagementGroupInfoInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
