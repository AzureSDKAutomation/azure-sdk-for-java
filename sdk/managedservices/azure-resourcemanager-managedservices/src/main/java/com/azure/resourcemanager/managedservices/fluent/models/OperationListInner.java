// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managedservices.models.Operation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of the operations. */
@Immutable
public final class OperationListInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationListInner.class);

    /*
     * The list of Microsoft.ManagedServices operations.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<Operation> value;

    /**
     * Get the value property: The list of Microsoft.ManagedServices operations.
     *
     * @return the value value.
     */
    public List<Operation> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
