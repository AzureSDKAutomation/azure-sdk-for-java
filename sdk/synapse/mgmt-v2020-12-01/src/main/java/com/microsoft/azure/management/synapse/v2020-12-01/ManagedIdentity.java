/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The workspace managed identity.
 */
public class ManagedIdentity {
    /**
     * The principal ID of the workspace managed identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The tenant ID of the workspace managed identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /**
     * The type of managed identity for the workspace. Possible values include:
     * 'None', 'SystemAssigned'.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /**
     * Get the principal ID of the workspace managed identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenant ID of the workspace managed identity.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type of managed identity for the workspace. Possible values include: 'None', 'SystemAssigned'.
     *
     * @return the type value
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type of managed identity for the workspace. Possible values include: 'None', 'SystemAssigned'.
     *
     * @param type the type value to set
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

}
