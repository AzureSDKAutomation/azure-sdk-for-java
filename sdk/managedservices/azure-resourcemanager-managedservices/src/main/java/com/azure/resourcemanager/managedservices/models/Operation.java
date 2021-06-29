// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The object that describes a single Microsoft.ManagedServices operation. */
@Immutable
public final class Operation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Operation.class);

    /*
     * The operation name with the format: {provider}/{resource}/{operation}
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The object that represents the operation.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplay display;

    /**
     * Get the name property: The operation name with the format: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: The object that represents the operation.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
