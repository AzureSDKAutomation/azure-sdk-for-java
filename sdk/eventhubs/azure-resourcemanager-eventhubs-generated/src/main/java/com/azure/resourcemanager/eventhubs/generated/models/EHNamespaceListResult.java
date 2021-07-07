// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.EHNamespaceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of the List Namespace operation. */
@Fluent
public final class EHNamespaceListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EHNamespaceListResult.class);

    /*
     * Result of the List Namespace operation
     */
    @JsonProperty(value = "value")
    private List<EHNamespaceInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete
     * list of namespaces.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the List Namespace operation.
     *
     * @return the value value.
     */
    public List<EHNamespaceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Namespace operation.
     *
     * @param value the value value to set.
     * @return the EHNamespaceListResult object itself.
     */
    public EHNamespaceListResult withValue(List<EHNamespaceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * namespaces.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * namespaces.
     *
     * @param nextLink the nextLink value to set.
     * @return the EHNamespaceListResult object itself.
     */
    public EHNamespaceListResult withNextLink(String nextLink) {
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
