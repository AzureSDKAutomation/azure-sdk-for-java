// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadmonitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The localized display information for this particular operation or action. */
@Fluent
public final class OperationDisplay {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationDisplay.class);

    /*
     * Operation resource provider name.
     */
    @JsonProperty(value = "provider", required = true)
    private String provider;

    /*
     * Resource on which the operation is performed.
     */
    @JsonProperty(value = "resource", required = true)
    private String resource;

    /*
     * Human-readable, friendly name for the operation.
     */
    @JsonProperty(value = "operation", required = true)
    private String operation;

    /*
     * Operation description.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Get the provider property: Operation resource provider name.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Operation resource provider name.
     *
     * @param provider the provider value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Resource on which the operation is performed.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource on which the operation is performed.
     *
     * @param resource the resource value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Human-readable, friendly name for the operation.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Human-readable, friendly name for the operation.
     *
     * @param operation the operation value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Operation description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Operation description.
     *
     * @param description the description value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (provider() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property provider in model OperationDisplay"));
        }
        if (resource() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property resource in model OperationDisplay"));
        }
        if (operation() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property operation in model OperationDisplay"));
        }
        if (description() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property description in model OperationDisplay"));
        }
    }
}
