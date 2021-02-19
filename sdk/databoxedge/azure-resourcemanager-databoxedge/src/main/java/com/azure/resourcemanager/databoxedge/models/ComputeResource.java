// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Compute infrastructure Resource. */
@Fluent
public final class ComputeResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ComputeResource.class);

    /*
     * Processor count
     */
    @JsonProperty(value = "processorCount", required = true)
    private int processorCount;

    /*
     * Memory in GB
     */
    @JsonProperty(value = "memoryInGB", required = true)
    private long memoryInGB;

    /**
     * Get the processorCount property: Processor count.
     *
     * @return the processorCount value.
     */
    public int processorCount() {
        return this.processorCount;
    }

    /**
     * Set the processorCount property: Processor count.
     *
     * @param processorCount the processorCount value to set.
     * @return the ComputeResource object itself.
     */
    public ComputeResource withProcessorCount(int processorCount) {
        this.processorCount = processorCount;
        return this;
    }

    /**
     * Get the memoryInGB property: Memory in GB.
     *
     * @return the memoryInGB value.
     */
    public long memoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Set the memoryInGB property: Memory in GB.
     *
     * @param memoryInGB the memoryInGB value to set.
     * @return the ComputeResource object itself.
     */
    public ComputeResource withMemoryInGB(long memoryInGB) {
        this.memoryInGB = memoryInGB;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
