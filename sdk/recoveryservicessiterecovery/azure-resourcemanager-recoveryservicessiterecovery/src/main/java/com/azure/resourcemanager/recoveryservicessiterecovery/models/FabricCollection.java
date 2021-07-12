// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.FabricInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of fabric details. */
@Fluent
public final class FabricCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FabricCollection.class);

    /*
     * The fabric details.
     */
    @JsonProperty(value = "value")
    private List<FabricInner> value;

    /*
     * The value of next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The fabric details.
     *
     * @return the value value.
     */
    public List<FabricInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The fabric details.
     *
     * @param value the value value to set.
     * @return the FabricCollection object itself.
     */
    public FabricCollection withValue(List<FabricInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The value of next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The value of next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the FabricCollection object itself.
     */
    public FabricCollection withNextLink(String nextLink) {
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
