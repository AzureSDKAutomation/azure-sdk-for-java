/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Upstream auth settings.
 */
public class UpstreamAuthSettings {
    /**
     * Gets or sets the type of auth. None or ManagedIdentity is supported now.
     * Possible values include: 'None', 'ManagedIdentity'.
     */
    @JsonProperty(value = "type")
    private UpstreamAuthType type;

    /**
     * Gets or sets the managed identity settings. It's required if the auth
     * type is set to ManagedIdentity.
     */
    @JsonProperty(value = "managedIdentity")
    private ManagedIdentitySettings managedIdentity;

    /**
     * Get gets or sets the type of auth. None or ManagedIdentity is supported now. Possible values include: 'None', 'ManagedIdentity'.
     *
     * @return the type value
     */
    public UpstreamAuthType type() {
        return this.type;
    }

    /**
     * Set gets or sets the type of auth. None or ManagedIdentity is supported now. Possible values include: 'None', 'ManagedIdentity'.
     *
     * @param type the type value to set
     * @return the UpstreamAuthSettings object itself.
     */
    public UpstreamAuthSettings withType(UpstreamAuthType type) {
        this.type = type;
        return this;
    }

    /**
     * Get gets or sets the managed identity settings. It's required if the auth type is set to ManagedIdentity.
     *
     * @return the managedIdentity value
     */
    public ManagedIdentitySettings managedIdentity() {
        return this.managedIdentity;
    }

    /**
     * Set gets or sets the managed identity settings. It's required if the auth type is set to ManagedIdentity.
     *
     * @param managedIdentity the managedIdentity value to set
     * @return the UpstreamAuthSettings object itself.
     */
    public UpstreamAuthSettings withManagedIdentity(ManagedIdentitySettings managedIdentity) {
        this.managedIdentity = managedIdentity;
        return this;
    }

}
