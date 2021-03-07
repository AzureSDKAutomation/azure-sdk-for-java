// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network trace. */
@Fluent
public final class NetworkTraceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkTraceInner.class);

    /*
     * Local file path for the captured network trace file.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * Current status of the network trace operation, same as Operation.Status
     * (InProgress/Succeeded/Failed).
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Detailed message of a network trace operation, e.g. error message in
     * case of failure.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the path property: Local file path for the captured network trace file.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Local file path for the captured network trace file.
     *
     * @param path the path value to set.
     * @return the NetworkTraceInner object itself.
     */
    public NetworkTraceInner withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the status property: Current status of the network trace operation, same as Operation.Status
     * (InProgress/Succeeded/Failed).
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Current status of the network trace operation, same as Operation.Status
     * (InProgress/Succeeded/Failed).
     *
     * @param status the status value to set.
     * @return the NetworkTraceInner object itself.
     */
    public NetworkTraceInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the message property: Detailed message of a network trace operation, e.g. error message in case of failure.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Detailed message of a network trace operation, e.g. error message in case of failure.
     *
     * @param message the message value to set.
     * @return the NetworkTraceInner object itself.
     */
    public NetworkTraceInner withMessage(String message) {
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
