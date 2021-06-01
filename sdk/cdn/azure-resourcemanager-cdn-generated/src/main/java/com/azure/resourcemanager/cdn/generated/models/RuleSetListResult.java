// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.fluent.models.RuleSetInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list rule sets. It contains a list of rule set objects and a URL link to get the next set of
 * results.
 */
@Fluent
public final class RuleSetListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuleSetListResult.class);

    /*
     * List of AzureFrontDoor rule sets within a profile.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<RuleSetInner> value;

    /*
     * URL to get the next set of rule set objects if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of AzureFrontDoor rule sets within a profile.
     *
     * @return the value value.
     */
    public List<RuleSetInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of rule set objects if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of rule set objects if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the RuleSetListResult object itself.
     */
    public RuleSetListResult withNextLink(String nextLink) {
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
