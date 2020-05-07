/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error properties indicate why the Logic service was not able to process the
 * incoming request. The reason is provided in the error message.
 */
public class ErrorProperties {
    /**
     * Error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Error message indicating why the operation failed.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set error code.
     *
     * @param code the code value to set
     * @return the ErrorProperties object itself.
     */
    public ErrorProperties withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get error message indicating why the operation failed.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set error message indicating why the operation failed.
     *
     * @param message the message value to set
     * @return the ErrorProperties object itself.
     */
    public ErrorProperties withMessage(String message) {
        this.message = message;
        return this;
    }

}
