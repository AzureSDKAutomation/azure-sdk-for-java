/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for the container service agent pool.
 */
public class ManagedClusterAgentPoolProfile extends ManagedClusterAgentPoolProfileProperties {
    /**
     * Unique name of the agent pool profile in the context of the subscription
     * and resource group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get unique name of the agent pool profile in the context of the subscription and resource group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set unique name of the agent pool profile in the context of the subscription and resource group.
     *
     * @param name the name value to set
     * @return the ManagedClusterAgentPoolProfile object itself.
     */
    public ManagedClusterAgentPoolProfile withName(String name) {
        this.name = name;
        return this;
    }

}
