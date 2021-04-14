// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error details for when validation fails. */
@Fluent
public final class ValidateResponseError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidateResponseError.class);

    /*
     * Validation error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Validation error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: Validation error code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Validation error code.
     *
     * @param code the code value to set.
     * @return the ValidateResponseError object itself.
     */
    public ValidateResponseError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Validation error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Validation error message.
     *
     * @param message the message value to set.
     * @return the ValidateResponseError object itself.
     */
    public ValidateResponseError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
