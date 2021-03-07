// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managedservices.fluent.models.MarketplaceRegistrationDefinitionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of marketplace registration definitions. */
@Immutable
public final class MarketplaceRegistrationDefinitionList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MarketplaceRegistrationDefinitionList.class);

    /*
     * List of marketplace registration definitions.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<MarketplaceRegistrationDefinitionInner> value;

    /*
     * Link to next page of marketplace registration definitions.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of marketplace registration definitions.
     *
     * @return the value value.
     */
    public List<MarketplaceRegistrationDefinitionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to next page of marketplace registration definitions.
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
