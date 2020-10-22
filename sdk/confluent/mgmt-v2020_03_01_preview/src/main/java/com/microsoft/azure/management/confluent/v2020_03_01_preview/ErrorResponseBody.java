/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.confluent.v2020_03_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ErrorResponseBody.
 * Response body of Error.
 */
public class ErrorResponseBody {
    /**
     * Error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Error message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Error target.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /**
     * Error detail.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorResponseBody> details;

    /**
     * Get error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get error target.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Get error detail.
     *
     * @return the details value
     */
    public List<ErrorResponseBody> details() {
        return this.details;
    }

}
