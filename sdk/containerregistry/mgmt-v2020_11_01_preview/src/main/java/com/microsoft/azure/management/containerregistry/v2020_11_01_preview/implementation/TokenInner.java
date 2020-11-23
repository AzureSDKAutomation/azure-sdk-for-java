/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.TokenCredentialsProperties;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.TokenStatus;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An object that represents a token for a container registry.
 */
@JsonFlatten
public class TokenInner extends ProxyResource {
    /**
     * The creation date of scope map.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * Provisioning state of the resource. Possible values include: 'Creating',
     * 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The resource ID of the scope map to which the token will be associated
     * with.
     */
    @JsonProperty(value = "properties.scopeMapId")
    private String scopeMapId;

    /**
     * The credentials that can be used for authenticating the token.
     */
    @JsonProperty(value = "properties.credentials")
    private TokenCredentialsProperties credentials;

    /**
     * The status of the token example enabled or disabled. Possible values
     * include: 'enabled', 'disabled'.
     */
    @JsonProperty(value = "properties.status")
    private TokenStatus status;

    /**
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the creation date of scope map.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get provisioning state of the resource. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resource ID of the scope map to which the token will be associated with.
     *
     * @return the scopeMapId value
     */
    public String scopeMapId() {
        return this.scopeMapId;
    }

    /**
     * Set the resource ID of the scope map to which the token will be associated with.
     *
     * @param scopeMapId the scopeMapId value to set
     * @return the TokenInner object itself.
     */
    public TokenInner withScopeMapId(String scopeMapId) {
        this.scopeMapId = scopeMapId;
        return this;
    }

    /**
     * Get the credentials that can be used for authenticating the token.
     *
     * @return the credentials value
     */
    public TokenCredentialsProperties credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials that can be used for authenticating the token.
     *
     * @param credentials the credentials value to set
     * @return the TokenInner object itself.
     */
    public TokenInner withCredentials(TokenCredentialsProperties credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the status of the token example enabled or disabled. Possible values include: 'enabled', 'disabled'.
     *
     * @return the status value
     */
    public TokenStatus status() {
        return this.status;
    }

    /**
     * Set the status of the token example enabled or disabled. Possible values include: 'enabled', 'disabled'.
     *
     * @param status the status value to set
     * @return the TokenInner object itself.
     */
    public TokenInner withStatus(TokenStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value
     */
    public SystemData systemData() {
        return this.systemData;
    }

}
