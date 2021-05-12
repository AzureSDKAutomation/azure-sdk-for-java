// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operations health status in a location. */
@JsonFlatten
@Immutable
public class OperationsHealthInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsHealthInner.class);

    /*
     * Operation name for the service
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String namePropertiesName;

    /*
     * Operation health status of the service.
     */
    @JsonProperty(value = "properties.health", access = JsonProperty.Access.WRITE_ONLY)
    private String health;

    /*
     * Health status description.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the namePropertiesName property: Operation name for the service.
     *
     * @return the namePropertiesName value.
     */
    public String namePropertiesName() {
        return this.namePropertiesName;
    }

    /**
     * Get the health property: Operation health status of the service.
     *
     * @return the health value.
     */
    public String health() {
        return this.health;
    }

    /**
     * Get the description property: Health status description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
