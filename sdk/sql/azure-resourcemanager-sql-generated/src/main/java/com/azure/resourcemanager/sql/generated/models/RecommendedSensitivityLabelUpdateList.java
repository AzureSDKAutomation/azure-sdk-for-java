// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of recommended sensitivity label update operations. */
@Fluent
public final class RecommendedSensitivityLabelUpdateList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecommendedSensitivityLabelUpdateList.class);

    /*
     * The operations property.
     */
    @JsonProperty(value = "operations")
    private List<RecommendedSensitivityLabelUpdate> operations;

    /**
     * Get the operations property: The operations property.
     *
     * @return the operations value.
     */
    public List<RecommendedSensitivityLabelUpdate> operations() {
        return this.operations;
    }

    /**
     * Set the operations property: The operations property.
     *
     * @param operations the operations value to set.
     * @return the RecommendedSensitivityLabelUpdateList object itself.
     */
    public RecommendedSensitivityLabelUpdateList withOperations(List<RecommendedSensitivityLabelUpdate> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operations() != null) {
            operations().forEach(e -> e.validate());
        }
    }
}
