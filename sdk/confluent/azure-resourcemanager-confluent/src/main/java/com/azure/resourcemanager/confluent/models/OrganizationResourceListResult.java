// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.confluent.fluent.models.OrganizationResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of a list operation. */
@Fluent
public final class OrganizationResourceListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrganizationResourceListResult.class);

    /*
     * Result of a list operation.
     */
    @JsonProperty(value = "value")
    private List<OrganizationResourceInner> value;

    /*
     * Link to the next set of results, if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of a list operation.
     *
     * @return the value value.
     */
    public List<OrganizationResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of a list operation.
     *
     * @param value the value value to set.
     * @return the OrganizationResourceListResult object itself.
     */
    public OrganizationResourceListResult withValue(List<OrganizationResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results, if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results, if any.
     *
     * @param nextLink the nextLink value to set.
     * @return the OrganizationResourceListResult object itself.
     */
    public OrganizationResourceListResult withNextLink(String nextLink) {
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