/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error description and code explaining why resource name is invalid.
 */
public class ErrorDefinition {
    /**
     * Description of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Code of the error.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Get description of the error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set description of the error.
     *
     * @param message the message value to set
     * @return the ErrorDefinition object itself.
     */
    public ErrorDefinition withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get code of the error.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set code of the error.
     *
     * @param code the code value to set
     * @return the ErrorDefinition object itself.
     */
    public ErrorDefinition withCode(String code) {
        this.code = code;
        return this;
    }

}
