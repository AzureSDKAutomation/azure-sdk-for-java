// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.fluent.models.DataVersionResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A paginated list of DataVersion entities. */
@Fluent
public final class DataVersionResourceArmPaginatedResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataVersionResourceArmPaginatedResult.class);

    /*
     * An array of objects of type DataVersion.
     */
    @JsonProperty(value = "value")
    private List<DataVersionResourceInner> value;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: An array of objects of type DataVersion.
     *
     * @return the value value.
     */
    public List<DataVersionResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of objects of type DataVersion.
     *
     * @param value the value value to set.
     * @return the DataVersionResourceArmPaginatedResult object itself.
     */
    public DataVersionResourceArmPaginatedResult withValue(List<DataVersionResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     *
     * @param nextLink the nextLink value to set.
     * @return the DataVersionResourceArmPaginatedResult object itself.
     */
    public DataVersionResourceArmPaginatedResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
