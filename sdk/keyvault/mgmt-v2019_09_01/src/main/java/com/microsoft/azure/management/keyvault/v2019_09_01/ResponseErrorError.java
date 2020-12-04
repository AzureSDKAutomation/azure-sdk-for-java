/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error response from Key Vault resource provider.
 */
public class ResponseErrorError {
    /**
     * Error code. This is a mnemonic that can be consumed programmatically.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * User friendly error message. The message is typically localized and may
     * vary with service version.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get error code. This is a mnemonic that can be consumed programmatically.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set error code. This is a mnemonic that can be consumed programmatically.
     *
     * @param code the code value to set
     * @return the ResponseErrorError object itself.
     */
    public ResponseErrorError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get user friendly error message. The message is typically localized and may vary with service version.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set user friendly error message. The message is typically localized and may vary with service version.
     *
     * @param message the message value to set
     * @return the ResponseErrorError object itself.
     */
    public ResponseErrorError withMessage(String message) {
        this.message = message;
        return this;
    }

}
