/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The object that represents the operation.
 */
public class OperationDisplay {
    /**
     * Service provider: Microsoft.ResourceProvider.
     */
    @JsonProperty(value = "Provider")
    private String provider;

    /**
     * Resource on which the operation is performed: Profile, endpoint, etc.
     */
    @JsonProperty(value = "Resource")
    private String resource;

    /**
     * Operation type: Read, write, delete, etc.
     */
    @JsonProperty(value = "Operation")
    private String operation;

    /**
     * Description of operation.
     */
    @JsonProperty(value = "Description")
    private String description;

    /**
     * Get service provider: Microsoft.ResourceProvider.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set service provider: Microsoft.ResourceProvider.
     *
     * @param provider the provider value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get resource on which the operation is performed: Profile, endpoint, etc.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set resource on which the operation is performed: Profile, endpoint, etc.
     *
     * @param resource the resource value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get operation type: Read, write, delete, etc.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set operation type: Read, write, delete, etc.
     *
     * @param operation the operation value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get description of operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of operation.
     *
     * @param description the description value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
