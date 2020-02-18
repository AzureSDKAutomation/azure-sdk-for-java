/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridkubernetes.v2019_09_01_privatepreview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity for the virtual machine.
 */
public class ConnectedClusterIdentity {
    /**
     * The principal id of connected cluster identity. This property will only
     * be provided for a system assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The tenant id associated with the connected cluster. This property will
     * only be provided for a system assigned identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * The type of identity used for the connected cluster. The type
     * 'SystemAssigned includes a system created identity. The type 'None' will
     * remove any identities from the virtual machine. Possible values include:
     * 'SystemAssigned', 'None'.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /**
     * Get the principal id of connected cluster identity. This property will only be provided for a system assigned identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenant id associated with the connected cluster. This property will only be provided for a system assigned identity.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type of identity used for the connected cluster. The type 'SystemAssigned includes a system created identity. The type 'None' will remove any identities from the virtual machine. Possible values include: 'SystemAssigned', 'None'.
     *
     * @return the type value
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type of identity used for the connected cluster. The type 'SystemAssigned includes a system created identity. The type 'None' will remove any identities from the virtual machine. Possible values include: 'SystemAssigned', 'None'.
     *
     * @param type the type value to set
     * @return the ConnectedClusterIdentity object itself.
     */
    public ConnectedClusterIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

}
