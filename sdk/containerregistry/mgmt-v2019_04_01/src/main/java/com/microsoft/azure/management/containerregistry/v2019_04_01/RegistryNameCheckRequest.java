/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A request to check whether a container registry name is available.
 */
public class RegistryNameCheckRequest {
    /**
     * The name of the container registry.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The resource type of the container registry. This field must be set to
     * 'Microsoft.ContainerRegistry/registries'.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of RegistryNameCheckRequest class.
     * @param name the name of the container registry.
     */
    public RegistryNameCheckRequest() {
        type = "Microsoft.ContainerRegistry/registries";
    }

    /**
     * Get the name of the container registry.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the container registry.
     *
     * @param name the name value to set
     * @return the RegistryNameCheckRequest object itself.
     */
    public RegistryNameCheckRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resource type of the container registry. This field must be set to 'Microsoft.ContainerRegistry/registries'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the resource type of the container registry. This field must be set to 'Microsoft.ContainerRegistry/registries'.
     *
     * @param type the type value to set
     * @return the RegistryNameCheckRequest object itself.
     */
    public RegistryNameCheckRequest withType(String type) {
        this.type = type;
        return this;
    }

}
