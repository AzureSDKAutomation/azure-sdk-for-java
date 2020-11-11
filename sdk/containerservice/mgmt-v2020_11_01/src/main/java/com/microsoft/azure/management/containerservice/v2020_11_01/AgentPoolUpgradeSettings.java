/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings for upgrading an agentpool.
 */
public class AgentPoolUpgradeSettings {
    /**
     * Count or percentage of additional nodes to be added during upgrade. If
     * empty uses AKS default.
     */
    @JsonProperty(value = "maxSurge")
    private String maxSurge;

    /**
     * Get count or percentage of additional nodes to be added during upgrade. If empty uses AKS default.
     *
     * @return the maxSurge value
     */
    public String maxSurge() {
        return this.maxSurge;
    }

    /**
     * Set count or percentage of additional nodes to be added during upgrade. If empty uses AKS default.
     *
     * @param maxSurge the maxSurge value to set
     * @return the AgentPoolUpgradeSettings object itself.
     */
    public AgentPoolUpgradeSettings withMaxSurge(String maxSurge) {
        this.maxSurge = maxSurge;
        return this;
    }

}
