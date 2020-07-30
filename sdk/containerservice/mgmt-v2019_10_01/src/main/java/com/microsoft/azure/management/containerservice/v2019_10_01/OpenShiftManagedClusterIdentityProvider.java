/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the configuration of the identity providers to be used in the
 * OpenShift cluster.
 */
public class OpenShiftManagedClusterIdentityProvider {
    /**
     * Name of the provider.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Configuration of the provider.
     */
    @JsonProperty(value = "provider")
    private OpenShiftManagedClusterBaseIdentityProvider provider;

    /**
     * Get name of the provider.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the provider.
     *
     * @param name the name value to set
     * @return the OpenShiftManagedClusterIdentityProvider object itself.
     */
    public OpenShiftManagedClusterIdentityProvider withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get configuration of the provider.
     *
     * @return the provider value
     */
    public OpenShiftManagedClusterBaseIdentityProvider provider() {
        return this.provider;
    }

    /**
     * Set configuration of the provider.
     *
     * @param provider the provider value to set
     * @return the OpenShiftManagedClusterIdentityProvider object itself.
     */
    public OpenShiftManagedClusterIdentityProvider withProvider(OpenShiftManagedClusterBaseIdentityProvider provider) {
        this.provider = provider;
        return this;
    }

}
