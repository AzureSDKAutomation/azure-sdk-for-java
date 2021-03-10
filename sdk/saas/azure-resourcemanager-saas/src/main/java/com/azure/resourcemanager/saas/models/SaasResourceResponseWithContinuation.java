// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.saas.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.saas.fluent.models.SaasResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** saas resources response with continuation. */
@Fluent
public final class SaasResourceResponseWithContinuation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SaasResourceResponseWithContinuation.class);

    /*
     * the next link to query to get the remaining results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * the value of response.
     */
    @JsonProperty(value = "value")
    private List<SaasResourceInner> value;

    /**
     * Get the nextLink property: the next link to query to get the remaining results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: the next link to query to get the remaining results.
     *
     * @param nextLink the nextLink value to set.
     * @return the SaasResourceResponseWithContinuation object itself.
     */
    public SaasResourceResponseWithContinuation withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: the value of response.
     *
     * @return the value value.
     */
    public List<SaasResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the value of response.
     *
     * @param value the value value to set.
     * @return the SaasResourceResponseWithContinuation object itself.
     */
    public SaasResourceResponseWithContinuation withValue(List<SaasResourceInner> value) {
        this.value = value;
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
