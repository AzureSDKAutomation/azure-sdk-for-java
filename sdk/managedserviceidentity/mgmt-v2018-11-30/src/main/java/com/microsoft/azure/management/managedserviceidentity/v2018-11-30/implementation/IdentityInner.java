/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedserviceidentity.v2018-11-30.implementation;

import java.util.Map;
import java.util.UUID;
import com.microsoft.azure.management.managedserviceidentity.v2018-11-30.UserAssignedIdentities;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Describes an identity resource.
 */
@JsonFlatten
public class IdentityInner extends SubResource {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

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
     * The type of resource i.e.
     * Microsoft.ManagedIdentity/userAssignedIdentities. Possible values
     * include: 'Microsoft.ManagedIdentity/userAssignedIdentities'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private UserAssignedIdentities type;

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
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the IdentityInner object itself.
     */
    public IdentityInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

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
     * Get the type of resource i.e. Microsoft.ManagedIdentity/userAssignedIdentities. Possible values include: 'Microsoft.ManagedIdentity/userAssignedIdentities'.
     *
     * @return the type value
     */
    public UserAssignedIdentities type() {
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
     * @return the IdentityInner object itself.
     */
    public IdentityInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
