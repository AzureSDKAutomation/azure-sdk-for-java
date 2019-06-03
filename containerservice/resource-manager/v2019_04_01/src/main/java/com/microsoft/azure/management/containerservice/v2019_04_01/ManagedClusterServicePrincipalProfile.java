/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a service principal identity for the cluster to use for
 * manipulating Azure APIs.
 */
public class ManagedClusterServicePrincipalProfile {
    /**
     * The ID for the service principal.
     */
    @JsonProperty(value = "clientId", required = true)
    private String clientId;

    /**
     * The secret password associated with the service principal in plain text.
     */
    @JsonProperty(value = "secret")
    private String secret;

    /**
     * Get the ID for the service principal.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the ID for the service principal.
     *
     * @param clientId the clientId value to set
     * @return the ManagedClusterServicePrincipalProfile object itself.
     */
    public ManagedClusterServicePrincipalProfile withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the secret password associated with the service principal in plain text.
     *
     * @return the secret value
     */
    public String secret() {
        return this.secret;
    }

    /**
     * Set the secret password associated with the service principal in plain text.
     *
     * @param secret the secret value to set
     * @return the ManagedClusterServicePrincipalProfile object itself.
     */
    public ManagedClusterServicePrincipalProfile withSecret(String secret) {
        this.secret = secret;
        return this;
    }

}
