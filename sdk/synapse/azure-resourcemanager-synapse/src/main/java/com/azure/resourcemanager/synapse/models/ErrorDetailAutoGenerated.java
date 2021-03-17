// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error details. */
@Fluent
public final class ErrorDetailAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ErrorDetailAutoGenerated.class);

    /*
     * Error message
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Error code
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Error target
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Get the message property: Error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Error message.
     *
     * @param message the message value to set.
     * @return the ErrorDetailAutoGenerated object itself.
     */
    public ErrorDetailAutoGenerated withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Error code.
     *
     * @param code the code value to set.
     * @return the ErrorDetailAutoGenerated object itself.
     */
    public ErrorDetailAutoGenerated withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the target property: Error target.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: Error target.
     *
     * @param target the target value to set.
     * @return the ErrorDetailAutoGenerated object itself.
     */
    public ErrorDetailAutoGenerated withTarget(String target) {
        this.target = target;
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
