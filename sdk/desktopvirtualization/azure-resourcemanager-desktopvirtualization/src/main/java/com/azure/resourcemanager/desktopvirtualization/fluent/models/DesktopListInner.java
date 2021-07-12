// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Desktop definitions. */
@Fluent
public final class DesktopListInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DesktopListInner.class);

    /*
     * List of Desktop definitions.
     */
    @JsonProperty(value = "value")
    private List<DesktopInner> value;

    /*
     * Link to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of Desktop definitions.
     *
     * @return the value value.
     */
    public List<DesktopInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Desktop definitions.
     *
     * @param value the value value to set.
     * @return the DesktopListInner object itself.
     */
    public DesktopListInner withValue(List<DesktopInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next page of results.
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
