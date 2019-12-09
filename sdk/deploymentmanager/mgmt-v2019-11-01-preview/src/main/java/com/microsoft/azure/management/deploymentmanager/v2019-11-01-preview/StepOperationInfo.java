/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019-11-01-preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Detailed information of a specific step run.
 */
public class StepOperationInfo {
    /**
     * The name of the ARM deployment initiated as part of the step.
     */
    @JsonProperty(value = "deploymentName", access = JsonProperty.Access.WRITE_ONLY)
    private String deploymentName;

    /**
     * Unique identifier to track the request for ARM-based resources.
     */
    @JsonProperty(value = "correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /**
     * Start time of the action in UTC.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * End time of the action in UTC.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * Last time in UTC this operation was updated.
     */
    @JsonProperty(value = "lastUpdatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdatedTime;

    /**
     * The errors, if any, for the action.
     */
    @JsonProperty(value = "error")
    private CloudErrorBody error;

    /**
     * Get the name of the ARM deployment initiated as part of the step.
     *
     * @return the deploymentName value
     */
    public String deploymentName() {
        return this.deploymentName;
    }

    /**
     * Get unique identifier to track the request for ARM-based resources.
     *
     * @return the correlationId value
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Get start time of the action in UTC.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get end time of the action in UTC.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get last time in UTC this operation was updated.
     *
     * @return the lastUpdatedTime value
     */
    public DateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Get the errors, if any, for the action.
     *
     * @return the error value
     */
    public CloudErrorBody error() {
        return this.error;
    }

    /**
     * Set the errors, if any, for the action.
     *
     * @param error the error value to set
     * @return the StepOperationInfo object itself.
     */
    public StepOperationInfo withError(CloudErrorBody error) {
        this.error = error;
        return this;
    }

}
