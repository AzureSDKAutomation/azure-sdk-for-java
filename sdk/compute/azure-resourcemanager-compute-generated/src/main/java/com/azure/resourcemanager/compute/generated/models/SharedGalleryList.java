// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.SharedGalleryInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List Shared Galleries operation response. */
@Fluent
public final class SharedGalleryList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharedGalleryList.class);

    /*
     * A list of shared galleries.
     */
    @JsonProperty(value = "value", required = true)
    private List<SharedGalleryInner> value;

    /*
     * The uri to fetch the next page of shared galleries. Call ListNext() with
     * this to fetch the next page of shared galleries.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of shared galleries.
     *
     * @return the value value.
     */
    public List<SharedGalleryInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of shared galleries.
     *
     * @param value the value value to set.
     * @return the SharedGalleryList object itself.
     */
    public SharedGalleryList withValue(List<SharedGalleryInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of shared galleries. Call ListNext() with this to fetch
     * the next page of shared galleries.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of shared galleries. Call ListNext() with this to fetch
     * the next page of shared galleries.
     *
     * @param nextLink the nextLink value to set.
     * @return the SharedGalleryList object itself.
     */
    public SharedGalleryList withNextLink(String nextLink) {
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
                    new IllegalArgumentException("Missing required property value in model SharedGalleryList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
