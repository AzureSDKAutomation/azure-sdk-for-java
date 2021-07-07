// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.ScopeMapInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of a request to list scope maps for a container registry. */
@Fluent
public final class ScopeMapListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScopeMapListResult.class);

    /*
     * The list of scope maps. Since this list may be incomplete, the nextLink
     * field should be used to request the next list of scope maps.
     */
    @JsonProperty(value = "value")
    private List<ScopeMapInner> value;

    /*
     * The URI that can be used to request the next list of scope maps.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of scope maps. Since this list may be incomplete, the nextLink field should be
     * used to request the next list of scope maps.
     *
     * @return the value value.
     */
    public List<ScopeMapInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of scope maps. Since this list may be incomplete, the nextLink field should be
     * used to request the next list of scope maps.
     *
     * @param value the value value to set.
     * @return the ScopeMapListResult object itself.
     */
    public ScopeMapListResult withValue(List<ScopeMapInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next list of scope maps.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next list of scope maps.
     *
     * @param nextLink the nextLink value to set.
     * @return the ScopeMapListResult object itself.
     */
    public ScopeMapListResult withNextLink(String nextLink) {
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
