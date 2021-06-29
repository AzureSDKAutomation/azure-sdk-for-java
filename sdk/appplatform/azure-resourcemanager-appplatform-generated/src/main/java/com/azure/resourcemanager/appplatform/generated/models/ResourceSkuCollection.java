// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appplatform.generated.fluent.models.ResourceSkuInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Object that includes an array of Azure Spring Cloud SKU and a possible link for next set. */
@Fluent
public final class ResourceSkuCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceSkuCollection.class);

    /*
     * Collection of resource SKU
     */
    @JsonProperty(value = "value")
    private List<ResourceSkuInner> value;

    /*
     * URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Collection of resource SKU.
     *
     * @return the value value.
     */
    public List<ResourceSkuInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resource SKU.
     *
     * @param value the value value to set.
     * @return the ResourceSkuCollection object itself.
     */
    public ResourceSkuCollection withValue(List<ResourceSkuInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL client should use to fetch the next page (per server side paging). It's null for
     * now, added for future use.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL client should use to fetch the next page (per server side paging). It's null for
     * now, added for future use.
     *
     * @param nextLink the nextLink value to set.
     * @return the ResourceSkuCollection object itself.
     */
    public ResourceSkuCollection withNextLink(String nextLink) {
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
