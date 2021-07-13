// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PartitionUsageInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response to a list partition level usage request. */
@Immutable
public final class PartitionUsagesResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PartitionUsagesResult.class);

    /*
     * The list of partition-level usages for the database. A usage is a point
     * in time metric
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<PartitionUsageInner> value;

    /**
     * Get the value property: The list of partition-level usages for the database. A usage is a point in time metric.
     *
     * @return the value value.
     */
    public List<PartitionUsageInner> value() {
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
