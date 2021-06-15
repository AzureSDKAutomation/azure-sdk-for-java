// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.openai.fluent.models.ResourceSkuInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Get Skus operation response. */
@Fluent
public final class ResourceSkuListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceSkuListResult.class);

    /*
     * The list of skus available for the subscription.
     */
    @JsonProperty(value = "value", required = true)
    private List<ResourceSkuInner> value;

    /*
     * The uri to fetch the next page of Skus.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of skus available for the subscription.
     *
     * @return the value value.
     */
    public List<ResourceSkuInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of skus available for the subscription.
     *
     * @param value the value value to set.
     * @return the ResourceSkuListResult object itself.
     */
    public ResourceSkuListResult withValue(List<ResourceSkuInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Skus.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Skus.
     *
     * @param nextLink the nextLink value to set.
     * @return the ResourceSkuListResult object itself.
     */
    public ResourceSkuListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model ResourceSkuListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
