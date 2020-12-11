// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectionContainerMappingInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Protection container mapping collection class. */
@Fluent
public final class ProtectionContainerMappingCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtectionContainerMappingCollection.class);

    /*
     * List of container mappings.
     */
    @JsonProperty(value = "value")
    private List<ProtectionContainerMappingInner> value;

    /*
     * Link to fetch rest of the data.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of container mappings.
     *
     * @return the value value.
     */
    public List<ProtectionContainerMappingInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of container mappings.
     *
     * @param value the value value to set.
     * @return the ProtectionContainerMappingCollection object itself.
     */
    public ProtectionContainerMappingCollection withValue(List<ProtectionContainerMappingInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to fetch rest of the data.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to fetch rest of the data.
     *
     * @param nextLink the nextLink value to set.
     * @return the ProtectionContainerMappingCollection object itself.
     */
    public ProtectionContainerMappingCollection withNextLink(String nextLink) {
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
