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
 * The localized display information for this particular operation or action.
 */
public class OperationDisplay {
    /**
     * Operation resource provider name.
     */
    @JsonProperty(value = "provider", required = true)
    private String provider;

    /**
     * Resource on which the operation is performed.
     */
    @JsonProperty(value = "resource", required = true)
    private String resource;

    /**
     * Human-readable, friendly name for the operation.
     */
    @JsonProperty(value = "operation", required = true)
    private String operation;

    /**
     * Operation description.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Get operation resource provider name.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set operation resource provider name.
     *
     * @param provider the provider value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get resource on which the operation is performed.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set resource on which the operation is performed.
     *
     * @param resource the resource value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get human-readable, friendly name for the operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set human-readable, friendly name for the operation.
     *
     * @param operation the operation value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get operation description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set operation description.
     *
     * @param description the description value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
