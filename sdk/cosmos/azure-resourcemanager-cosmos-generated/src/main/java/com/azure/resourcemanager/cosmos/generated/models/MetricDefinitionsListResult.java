// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MetricDefinitionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response to a list metric definitions request. */
@Immutable
public final class MetricDefinitionsListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricDefinitionsListResult.class);

    /*
     * The list of metric definitions for the account.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<MetricDefinitionInner> value;

    /**
     * Get the value property: The list of metric definitions for the account.
     *
     * @return the value value.
     */
    public List<MetricDefinitionInner> value() {
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
