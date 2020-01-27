/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details of the error.
 */
public class ErrorDetails {
    /**
     * One of a server-defined set of error codes.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * A human-readable representation of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * A human-readable representation of the error's details.
     */
    @JsonProperty(value = "details")
    private String details;

    /**
     * Get one of a server-defined set of error codes.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set one of a server-defined set of error codes.
     *
     * @param code the code value to set
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get a human-readable representation of the error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set a human-readable representation of the error.
     *
     * @param message the message value to set
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get a human-readable representation of the error's details.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Set a human-readable representation of the error's details.
     *
     * @param details the details value to set
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withDetails(String details) {
        this.details = details;
        return this;
    }

}
