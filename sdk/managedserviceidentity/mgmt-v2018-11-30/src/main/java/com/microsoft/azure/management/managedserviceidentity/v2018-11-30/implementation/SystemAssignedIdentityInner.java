/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedserviceidentity.v2018-11-30.implementation;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Describes a system assigned identity resource.
 */
@JsonFlatten
public class SystemAssignedIdentityInner extends SubResource {
    /**
     * The id of the tenant which the identity belongs to.
     */
    @JsonProperty(value = "properties.tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /**
     * The id of the service principal object associated with the created
     * identity.
     */
    @JsonProperty(value = "properties.principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /**
     * The id of the app associated with the identity. This is a random
     * generated UUID by MSI.
     */
    @JsonProperty(value = "properties.clientId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID clientId;

    /**
     * The ManagedServiceIdentity DataPlane URL that can be queried to obtain
     * the identity credentials.
     */
    @JsonProperty(value = "properties.clientSecretUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String clientSecretUrl;

    /**
     * The type of resource i.e. Microsoft.Compute/virtualMachineScaleSets.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The name of the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The Azure region where the resource lives.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the id of the tenant which the identity belongs to.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Get the id of the service principal object associated with the created identity.
     *
     * @return the principalId value
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the id of the app associated with the identity. This is a random generated UUID by MSI.
     *
     * @return the clientId value
     */
    public UUID clientId() {
        return this.clientId;
    }

    /**
     * Get the ManagedServiceIdentity DataPlane URL that can be queried to obtain the identity credentials.
     *
     * @return the clientSecretUrl value
     */
    public String clientSecretUrl() {
        return this.clientSecretUrl;
    }

    /**
     * Get the type of resource i.e. Microsoft.Compute/virtualMachineScaleSets.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the name of the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the Azure region where the resource lives.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the Azure region where the resource lives.
     *
     * @param location the location value to set
     * @return the SystemAssignedIdentityInner object itself.
     */
    public SystemAssignedIdentityInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
