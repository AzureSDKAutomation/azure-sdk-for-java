// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.portal.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.portal.fluent.models.ResourceProviderOperationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Results of the request to list operations. */
@Fluent
public final class ResourceProviderOperationList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProviderOperationList.class);

    /*
     * List of operations supported by this resource provider.
     */
    @JsonProperty(value = "value")
    private List<ResourceProviderOperationInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of operations supported by this resource provider.
     *
     * @return the value value.
     */
    public List<ResourceProviderOperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of operations supported by this resource provider.
     *
     * @param value the value value to set.
     * @return the ResourceProviderOperationList object itself.
     */
    public ResourceProviderOperationList withValue(List<ResourceProviderOperationInner> value) {
        this.value = value;
        return this;
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
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ResourceProviderOperationList object itself.
     */
    public ResourceProviderOperationList withNextLink(String nextLink) {
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
