/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingPermissionsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The properties of a role definition.
 */
@JsonFlatten
public class BillingRoleDefinitionInner extends ProxyResource {
    /**
     * The role description.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * The billingPermissions the role has.
     */
    @JsonProperty(value = "properties.permissions")
    private List<BillingPermissionsProperties> permissions;

    /**
     * The name of the role.
     */
    @JsonProperty(value = "properties.roleName", access = JsonProperty.Access.WRITE_ONLY)
    private String roleName;

    /**
     * Get the role description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the billingPermissions the role has.
     *
     * @return the permissions value
     */
    public List<BillingPermissionsProperties> permissions() {
        return this.permissions;
    }

    /**
     * Set the billingPermissions the role has.
     *
     * @param permissions the permissions value to set
     * @return the BillingRoleDefinitionInner object itself.
     */
    public BillingRoleDefinitionInner withPermissions(List<BillingPermissionsProperties> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the name of the role.
     *
     * @return the roleName value
     */
    public String roleName() {
        return this.roleName;
    }

}
