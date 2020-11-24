/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters that describes a set of credentials that will be used when a
 * run is invoked.
 */
public class Credentials {
    /**
     * Describes the credential parameters for accessing the source registry.
     */
    @JsonProperty(value = "sourceRegistry")
    private SourceRegistryCredentials sourceRegistry;

    /**
     * Describes the credential parameters for accessing other custom
     * registries. The key
     * for the dictionary item will be the registry login server
     * (myregistry.azurecr.io) and
     * the value of the item will be the registry credentials for accessing the
     * registry.
     */
    @JsonProperty(value = "customRegistries")
    private Map<String, CustomRegistryCredentials> customRegistries;

    /**
     * Get describes the credential parameters for accessing the source registry.
     *
     * @return the sourceRegistry value
     */
    public SourceRegistryCredentials sourceRegistry() {
        return this.sourceRegistry;
    }

    /**
     * Set describes the credential parameters for accessing the source registry.
     *
     * @param sourceRegistry the sourceRegistry value to set
     * @return the Credentials object itself.
     */
    public Credentials withSourceRegistry(SourceRegistryCredentials sourceRegistry) {
        this.sourceRegistry = sourceRegistry;
        return this;
    }

    /**
     * Get describes the credential parameters for accessing other custom registries. The key
     for the dictionary item will be the registry login server (myregistry.azurecr.io) and
     the value of the item will be the registry credentials for accessing the registry.
     *
     * @return the customRegistries value
     */
    public Map<String, CustomRegistryCredentials> customRegistries() {
        return this.customRegistries;
    }

    /**
     * Set describes the credential parameters for accessing other custom registries. The key
     for the dictionary item will be the registry login server (myregistry.azurecr.io) and
     the value of the item will be the registry credentials for accessing the registry.
     *
     * @param customRegistries the customRegistries value to set
     * @return the Credentials object itself.
     */
    public Credentials withCustomRegistries(Map<String, CustomRegistryCredentials> customRegistries) {
        this.customRegistries = customRegistries;
        return this;
    }

}
