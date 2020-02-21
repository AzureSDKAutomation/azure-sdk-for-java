/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.OperationDisplayDefinition;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.OperationServiceSpecificationDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The definition of a container registry operation.
 */
@JsonFlatten
public class OperationDefinitionInner {
    /**
     * The origin information of the container registry operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The display information for the container registry operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplayDefinition display;

    /**
     * The definition of Azure Monitoring service.
     */
    @JsonProperty(value = "properties.serviceSpecification")
    private OperationServiceSpecificationDefinition serviceSpecification;

    /**
     * Get the origin information of the container registry operation.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin information of the container registry operation.
     *
     * @param origin the origin value to set
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withOrigin(String origin) {
        this.origin = origin;
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
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display information for the container registry operation.
     *
     * @return the display value
     */
    public OperationDisplayDefinition display() {
        return this.display;
    }

    /**
     * Set the display information for the container registry operation.
     *
     * @param display the display value to set
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withDisplay(OperationDisplayDefinition display) {
        this.display = display;
        return this;
    }

    /**
     * Get the definition of Azure Monitoring service.
     *
     * @return the serviceSpecification value
     */
    public OperationServiceSpecificationDefinition serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the definition of Azure Monitoring service.
     *
     * @param serviceSpecification the serviceSpecification value to set
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withServiceSpecification(OperationServiceSpecificationDefinition serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

}
