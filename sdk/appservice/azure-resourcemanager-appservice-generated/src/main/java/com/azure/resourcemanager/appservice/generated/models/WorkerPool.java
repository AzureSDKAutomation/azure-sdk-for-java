// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Worker pool of an App Service Environment. */
@Fluent
public final class WorkerPool {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkerPool.class);

    /*
     * Worker size ID for referencing this worker pool.
     */
    @JsonProperty(value = "workerSizeId")
    private Integer workerSizeId;

    /*
     * Shared or dedicated app hosting.
     */
    @JsonProperty(value = "computeMode")
    private ComputeModeOptions computeMode;

    /*
     * VM size of the worker pool instances.
     */
    @JsonProperty(value = "workerSize")
    private String workerSize;

    /*
     * Number of instances in the worker pool.
     */
    @JsonProperty(value = "workerCount")
    private Integer workerCount;

    /*
     * Names of all instances in the worker pool (read only).
     */
    @JsonProperty(value = "instanceNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> instanceNames;

    /**
     * Get the workerSizeId property: Worker size ID for referencing this worker pool.
     *
     * @return the workerSizeId value.
     */
    public Integer workerSizeId() {
        return this.workerSizeId;
    }

    /**
     * Set the workerSizeId property: Worker size ID for referencing this worker pool.
     *
     * @param workerSizeId the workerSizeId value to set.
     * @return the WorkerPool object itself.
     */
    public WorkerPool withWorkerSizeId(Integer workerSizeId) {
        this.workerSizeId = workerSizeId;
        return this;
    }

    /**
     * Get the computeMode property: Shared or dedicated app hosting.
     *
     * @return the computeMode value.
     */
    public ComputeModeOptions computeMode() {
        return this.computeMode;
    }

    /**
     * Set the computeMode property: Shared or dedicated app hosting.
     *
     * @param computeMode the computeMode value to set.
     * @return the WorkerPool object itself.
     */
    public WorkerPool withComputeMode(ComputeModeOptions computeMode) {
        this.computeMode = computeMode;
        return this;
    }

    /**
     * Get the workerSize property: VM size of the worker pool instances.
     *
     * @return the workerSize value.
     */
    public String workerSize() {
        return this.workerSize;
    }

    /**
     * Set the workerSize property: VM size of the worker pool instances.
     *
     * @param workerSize the workerSize value to set.
     * @return the WorkerPool object itself.
     */
    public WorkerPool withWorkerSize(String workerSize) {
        this.workerSize = workerSize;
        return this;
    }

    /**
     * Get the workerCount property: Number of instances in the worker pool.
     *
     * @return the workerCount value.
     */
    public Integer workerCount() {
        return this.workerCount;
    }

    /**
     * Set the workerCount property: Number of instances in the worker pool.
     *
     * @param workerCount the workerCount value to set.
     * @return the WorkerPool object itself.
     */
    public WorkerPool withWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
        return this;
    }

    /**
     * Get the instanceNames property: Names of all instances in the worker pool (read only).
     *
     * @return the instanceNames value.
     */
    public List<String> instanceNames() {
        return this.instanceNames;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
