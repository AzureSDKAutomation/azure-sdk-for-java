/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data flow properties for managed integration runtime.
 */
public class IntegrationRuntimeDataFlowProperties {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Compute type of the cluster which will execute data flow job. Possible
     * values include: 'General', 'MemoryOptimized', 'ComputeOptimized'.
     */
    @JsonProperty(value = "computeType")
    private DataFlowComputeType computeType;

    /**
     * Core count of the cluster which will execute data flow job. Supported
     * values are: 8, 16, 32, 48, 80, 144 and 272.
     */
    @JsonProperty(value = "coreCount")
    private Integer coreCount;

    /**
     * Time to live (in minutes) setting of the cluster which will execute data
     * flow job.
     */
    @JsonProperty(value = "timeToLive")
    private Integer timeToLive;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get compute type of the cluster which will execute data flow job. Possible values include: 'General', 'MemoryOptimized', 'ComputeOptimized'.
     *
     * @return the computeType value
     */
    public DataFlowComputeType computeType() {
        return this.computeType;
    }

    /**
     * Set compute type of the cluster which will execute data flow job. Possible values include: 'General', 'MemoryOptimized', 'ComputeOptimized'.
     *
     * @param computeType the computeType value to set
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withComputeType(DataFlowComputeType computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * Get core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     *
     * @return the coreCount value
     */
    public Integer coreCount() {
        return this.coreCount;
    }

    /**
     * Set core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     *
     * @param coreCount the coreCount value to set
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
        return this;
    }

    /**
     * Get time to live (in minutes) setting of the cluster which will execute data flow job.
     *
     * @return the timeToLive value
     */
    public Integer timeToLive() {
        return this.timeToLive;
    }

    /**
     * Set time to live (in minutes) setting of the cluster which will execute data flow job.
     *
     * @param timeToLive the timeToLive value to set
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

}
