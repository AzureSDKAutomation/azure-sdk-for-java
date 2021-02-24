// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.models.UserRuleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Security configuration user rule list result. */
@Fluent
public final class UserRuleListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserRuleListResult.class);

    /*
     * A list of user rules
     */
    @JsonProperty(value = "value")
    private List<UserRuleInner> value;

    /*
     * Gets the URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of user rules.
     *
     * @return the value value.
     */
    public List<UserRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of user rules.
     *
     * @param value the value value to set.
     * @return the UserRuleListResult object itself.
     */
    public UserRuleListResult withValue(List<UserRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the UserRuleListResult object itself.
     */
    public UserRuleListResult withNextLink(String nextLink) {
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
