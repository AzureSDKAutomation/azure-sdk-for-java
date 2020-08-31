/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_04_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Kubernetes add-on profile for a managed cluster.
 */
public class ManagedClusterAddonProfile {
    /**
     * Whether the add-on is enabled or not.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * Key-value pairs for configuring an add-on.
     */
    @JsonProperty(value = "config")
    private Map<String, String> config;

    /**
     * Information of user assigned identity used by this add-on.
     */
    @JsonProperty(value = "identity", access = JsonProperty.Access.WRITE_ONLY)
    private ManagedClusterAddonProfileIdentity identity;

    /**
     * Get whether the add-on is enabled or not.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set whether the add-on is enabled or not.
     *
     * @param enabled the enabled value to set
     * @return the ManagedClusterAddonProfile object itself.
     */
    public ManagedClusterAddonProfile withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get key-value pairs for configuring an add-on.
     *
     * @return the config value
     */
    public Map<String, String> config() {
        return this.config;
    }

    /**
     * Set key-value pairs for configuring an add-on.
     *
     * @param config the config value to set
     * @return the ManagedClusterAddonProfile object itself.
     */
    public ManagedClusterAddonProfile withConfig(Map<String, String> config) {
        this.config = config;
        return this;
    }

    /**
     * Get information of user assigned identity used by this add-on.
     *
     * @return the identity value
     */
    public ManagedClusterAddonProfileIdentity identity() {
        return this.identity;
    }

}
