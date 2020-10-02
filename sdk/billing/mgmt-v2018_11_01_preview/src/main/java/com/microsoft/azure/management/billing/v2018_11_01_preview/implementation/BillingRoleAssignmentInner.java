/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * a role assignment.
 */
@JsonFlatten
public class BillingRoleAssignmentInner extends ProxyResource {
    /**
     * the date the role assignment is created.
     */
    @JsonProperty(value = "properties.createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private String createdOn;

    /**
     * the creator's tenant Id.
     */
    @JsonProperty(value = "properties.createdByPrincipalTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String createdByPrincipalTenantId;

    /**
     * the creator's principal Id.
     */
    @JsonProperty(value = "properties.createdByPrincipalId", access = JsonProperty.Access.WRITE_ONLY)
    private String createdByPrincipalId;

    /**
     * the name of the role assignment.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String billingRoleAssignmentName;

    /**
     * The user's principal id that the role gets assigned to.
     */
    @JsonProperty(value = "properties.principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The role definition id.
     */
    @JsonProperty(value = "properties.roleDefinitionName", access = JsonProperty.Access.WRITE_ONLY)
    private String roleDefinitionName;

    /**
     * The scope the role get assigned to.
     */
    @JsonProperty(value = "properties.scope", access = JsonProperty.Access.WRITE_ONLY)
    private String scope;

    /**
     * Get the date the role assignment is created.
     *
     * @return the createdOn value
     */
    public String createdOn() {
        return this.createdOn;
    }

    /**
     * Get the creator's tenant Id.
     *
     * @return the createdByPrincipalTenantId value
     */
    public String createdByPrincipalTenantId() {
        return this.createdByPrincipalTenantId;
    }

    /**
     * Get the creator's principal Id.
     *
     * @return the createdByPrincipalId value
     */
    public String createdByPrincipalId() {
        return this.createdByPrincipalId;
    }

    /**
     * Get the name of the role assignment.
     *
     * @return the billingRoleAssignmentName value
     */
    public String billingRoleAssignmentName() {
        return this.billingRoleAssignmentName;
    }

    /**
     * Get the user's principal id that the role gets assigned to.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the role definition id.
     *
     * @return the roleDefinitionName value
     */
    public String roleDefinitionName() {
        return this.roleDefinitionName;
    }

    /**
     * Get the scope the role get assigned to.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

}
