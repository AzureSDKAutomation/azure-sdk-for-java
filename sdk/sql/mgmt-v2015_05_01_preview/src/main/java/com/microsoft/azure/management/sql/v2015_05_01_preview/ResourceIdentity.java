/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Active Directory identity configuration for a resource.
 */
public class ResourceIdentity {
    /**
     * The Azure Active Directory principal id.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /**
     * The identity type. Set this to 'SystemAssigned' in order to
     * automatically create and assign an Azure Active Directory principal for
     * the resource. Possible values include: 'None', 'SystemAssigned',
     * 'UserAssigned'.
     */
    @JsonProperty(value = "type")
    private IdentityTypeWithNone type;

    /**
     * The Azure Active Directory tenant id.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /**
     * Get the Azure Active Directory principal id.
     *
     * @return the principalId value
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the identity type. Set this to 'SystemAssigned' in order to automatically create and assign an Azure Active Directory principal for the resource. Possible values include: 'None', 'SystemAssigned', 'UserAssigned'.
     *
     * @return the type value
     */
    public IdentityTypeWithNone type() {
        return this.type;
    }

    /**
     * Set the identity type. Set this to 'SystemAssigned' in order to automatically create and assign an Azure Active Directory principal for the resource. Possible values include: 'None', 'SystemAssigned', 'UserAssigned'.
     *
     * @param type the type value to set
     * @return the ResourceIdentity object itself.
     */
    public ResourceIdentity withType(IdentityTypeWithNone type) {
        this.type = type;
        return this;
    }

    /**
     * Get the Azure Active Directory tenant id.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

}
