/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.workloadmonitor.v2020-01-13-preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * error details.
 * Details about the error.
 */
public class DefaultErrorError {
    /**
     * Service-defined error code. This code serves as a sub-status for the
     * HTTP error code specified in the response.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Human-readable representation of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get service-defined error code. This code serves as a sub-status for the HTTP error code specified in the response.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set service-defined error code. This code serves as a sub-status for the HTTP error code specified in the response.
     *
     * @param code the code value to set
     * @return the DefaultErrorError object itself.
     */
    public DefaultErrorError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get human-readable representation of the error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set human-readable representation of the error.
     *
     * @param message the message value to set
     * @return the DefaultErrorError object itself.
     */
    public DefaultErrorError withMessage(String message) {
        this.message = message;
        return this;
    }

}
