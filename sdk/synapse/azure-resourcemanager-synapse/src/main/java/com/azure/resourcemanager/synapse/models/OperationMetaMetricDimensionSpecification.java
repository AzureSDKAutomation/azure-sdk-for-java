// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** What is this?. */
@Fluent
public final class OperationMetaMetricDimensionSpecification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationMetaMetricDimensionSpecification.class);

    /*
     * Dimension display name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Dimension unique name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Whether this metric should be exported for Shoebox
     */
    @JsonProperty(value = "toBeExportedForShoebox")
    private Boolean toBeExportedForShoebox;

    /**
     * Get the displayName property: Dimension display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Dimension display name.
     *
     * @param displayName the displayName value to set.
     * @return the OperationMetaMetricDimensionSpecification object itself.
     */
    public OperationMetaMetricDimensionSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the name property: Dimension unique name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Dimension unique name.
     *
     * @param name the name value to set.
     * @return the OperationMetaMetricDimensionSpecification object itself.
     */
    public OperationMetaMetricDimensionSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the toBeExportedForShoebox property: Whether this metric should be exported for Shoebox.
     *
     * @return the toBeExportedForShoebox value.
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set the toBeExportedForShoebox property: Whether this metric should be exported for Shoebox.
     *
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set.
     * @return the OperationMetaMetricDimensionSpecification object itself.
     */
    public OperationMetaMetricDimensionSpecification withToBeExportedForShoebox(Boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
