/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2020_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of error response.
 */
public class CloudErrorBody {
    /**
     * The error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * The error message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * The target of the particular error.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /**
     * A list of additional details about the error.
     */
    @JsonProperty(value = "details")
    private List<CloudErrorBody> details;

    /**
     * Get the error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the target of the particular error.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Get a list of additional details about the error.
     *
     * @return the details value
     */
    public List<CloudErrorBody> details() {
        return this.details;
    }

    /**
     * Set a list of additional details about the error.
     *
     * @param details the details value to set
     * @return the CloudErrorBody object itself.
     */
    public CloudErrorBody withDetails(List<CloudErrorBody> details) {
        this.details = details;
        return this;
    }

}
