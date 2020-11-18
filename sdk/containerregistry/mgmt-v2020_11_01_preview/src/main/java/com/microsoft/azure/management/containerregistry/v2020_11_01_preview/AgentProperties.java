/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that determine the run agent configuration.
 */
public class AgentProperties {
    /**
     * The CPU configuration in terms of number of cores required for the run.
     */
    @JsonProperty(value = "cpu")
    private Integer cpu;

    /**
     * Get the CPU configuration in terms of number of cores required for the run.
     *
     * @return the cpu value
     */
    public Integer cpu() {
        return this.cpu;
    }

    /**
     * Set the CPU configuration in terms of number of cores required for the run.
     *
     * @param cpu the cpu value to set
     * @return the AgentProperties object itself.
     */
    public AgentProperties withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

}
