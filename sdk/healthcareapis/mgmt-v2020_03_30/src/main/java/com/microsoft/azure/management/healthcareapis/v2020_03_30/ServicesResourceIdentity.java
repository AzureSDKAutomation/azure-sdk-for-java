/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Setting indicating whether the service has a managed identity associated
 * with it.
 */
public class ServicesResourceIdentity {
    /**
     * The principal ID of the resource identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The tenant ID of the resource.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Type of identity being specified, currently SystemAssigned and None are
     * allowed. Possible values include: 'SystemAssigned', 'None'.
     */
    @JsonProperty(value = "type")
    private ManagedServiceIdentityType type;

    /**
     * Get the principal ID of the resource identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenant ID of the resource.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get type of identity being specified, currently SystemAssigned and None are allowed. Possible values include: 'SystemAssigned', 'None'.
     *
     * @return the type value
     */
    public ManagedServiceIdentityType type() {
        return this.type;
    }

    /**
     * Set type of identity being specified, currently SystemAssigned and None are allowed. Possible values include: 'SystemAssigned', 'None'.
     *
     * @param type the type value to set
     * @return the ServicesResourceIdentity object itself.
     */
    public ServicesResourceIdentity withType(ManagedServiceIdentityType type) {
        this.type = type;
        return this;
    }

}
