// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The object that represents the operation. */
@Immutable
public final class OperationDisplay {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationDisplay.class);

    /*
     * Service provider: Microsoft.HealthcareApis
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /*
     * Resource Type: Services
     */
    @JsonProperty(value = "resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /*
     * Name of the operation
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /*
     * Friendly description for the operation,
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the provider property: Service provider: Microsoft.HealthcareApis.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the resource property: Resource Type: Services.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get the operation property: Name of the operation.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the description property: Friendly description for the operation,.
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
