// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.models.DataVersion;
import com.azure.resourcemanager.machinelearningservices.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Resource Manager resource envelope. */
@Fluent
public final class DataVersionResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataVersionResourceInner.class);

    /*
     * Details of an DatasetDto
     */
    @JsonProperty(value = "properties", required = true)
    private DataVersion properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: Details of an DatasetDto.
     *
     * @return the properties value.
     */
    public DataVersion properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Details of an DatasetDto.
     *
     * @param properties the properties value to set.
     * @return the DataVersionResourceInner object itself.
     */
    public DataVersionResourceInner withProperties(DataVersion properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model DataVersionResourceInner"));
        } else {
            properties().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
