/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Managed Identity used for CMK.
 */
public class CMKIdentityDefinition {
    /**
     * The resource id of the user assigned identity to authenticate to
     * customer's key vault.
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String userAssignedIdentity;

    /**
     * Get the resource id of the user assigned identity to authenticate to customer's key vault.
     *
     * @return the userAssignedIdentity value
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the resource id of the user assigned identity to authenticate to customer's key vault.
     *
     * @param userAssignedIdentity the userAssignedIdentity value to set
     * @return the CMKIdentityDefinition object itself.
     */
    public CMKIdentityDefinition withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
        return this;
    }

}