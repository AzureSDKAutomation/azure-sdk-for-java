/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_10_01.implementation;

import com.microsoft.azure.management.storagecache.v2020_10_01.ApiOperationDisplay;
import com.microsoft.azure.management.storagecache.v2020_10_01.ApiOperationPropertiesServiceSpecification;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * REST API operation description: see
 * https://github.com/Azure/azure-rest-api-specs/blob/master/documentation/openapi-authoring-automated-guidelines.md#r3023-operationsapiimplementation.
 */
@JsonFlatten
public class ApiOperationInner {
    /**
     * The object that represents the operation.
     */
    @JsonProperty(value = "display")
    private ApiOperationDisplay display;

    /**
     * Origin of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * The flag that indicates whether the operation applies to data plane.
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Specification of the all the metrics provided for a resource type.
     */
    @JsonProperty(value = "properties.serviceSpecification")
    private ApiOperationPropertiesServiceSpecification serviceSpecification;

    /**
     * Get the object that represents the operation.
     *
     * @return the display value
     */
    public ApiOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the object that represents the operation.
     *
     * @param display the display value to set
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withDisplay(ApiOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get origin of the operation.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set origin of the operation.
     *
     * @param origin the origin value to set
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the flag that indicates whether the operation applies to data plane.
     *
     * @return the isDataAction value
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the flag that indicates whether the operation applies to data plane.
     *
     * @param isDataAction the isDataAction value to set
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get specification of the all the metrics provided for a resource type.
     *
     * @return the serviceSpecification value
     */
    public ApiOperationPropertiesServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set specification of the all the metrics provided for a resource type.
     *
     * @param serviceSpecification the serviceSpecification value to set
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withServiceSpecification(ApiOperationPropertiesServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

}
