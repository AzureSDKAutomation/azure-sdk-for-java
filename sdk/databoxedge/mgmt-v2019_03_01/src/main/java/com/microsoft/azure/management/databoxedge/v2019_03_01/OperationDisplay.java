/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation display properties.
 */
public class OperationDisplay {
    /**
     * Provider name.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * The type of resource in which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Operation to be performed on the resource.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Description of the operation to be performed.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get provider name.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set provider name.
     *
     * @param provider the provider value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the type of resource in which the operation is performed.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the type of resource in which the operation is performed.
     *
     * @param resource the resource value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get operation to be performed on the resource.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set operation to be performed on the resource.
     *
     * @param operation the operation value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get description of the operation to be performed.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the operation to be performed.
     *
     * @param description the description value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
