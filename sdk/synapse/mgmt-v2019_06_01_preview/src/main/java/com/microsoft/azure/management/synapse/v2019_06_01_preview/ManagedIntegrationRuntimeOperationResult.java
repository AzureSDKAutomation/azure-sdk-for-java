/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of managed integration runtime operation result.
 */
public class ManagedIntegrationRuntimeOperationResult {
    /**
     * The operation type. Could be start or stop.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The start time of the operation.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * The operation result.
     */
    @JsonProperty(value = "result", access = JsonProperty.Access.WRITE_ONLY)
    private String result;

    /**
     * The error code.
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private String errorCode;

    /**
     * Managed integration runtime error parameters.
     */
    @JsonProperty(value = "parameters", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> parameters;

    /**
     * The activity id for the operation request.
     */
    @JsonProperty(value = "activityId", access = JsonProperty.Access.WRITE_ONLY)
    private String activityId;

    /**
     * Get the operation type. Could be start or stop.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the start time of the operation.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the operation result.
     *
     * @return the result value
     */
    public String result() {
        return this.result;
    }

    /**
     * Get the error code.
     *
     * @return the errorCode value
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Get managed integration runtime error parameters.
     *
     * @return the parameters value
     */
    public List<String> parameters() {
        return this.parameters;
    }

    /**
     * Get the activity id for the operation request.
     *
     * @return the activityId value
     */
    public String activityId() {
        return this.activityId;
    }

}
