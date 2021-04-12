// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managementgroups.fluent.models.EntityInfoInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the result of the request to view entities. */
@Fluent
public final class EntityListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EntityListResult.class);

    /*
     * The list of entities.
     */
    @JsonProperty(value = "value")
    private List<EntityInfoInner> value;

    /*
     * Total count of records that match the filter
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Integer count;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of entities.
     *
     * @return the value value.
     */
    public List<EntityInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of entities.
     *
     * @param value the value value to set.
     * @return the EntityListResult object itself.
     */
    public EntityListResult withValue(List<EntityInfoInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the count property: Total count of records that match the filter.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
