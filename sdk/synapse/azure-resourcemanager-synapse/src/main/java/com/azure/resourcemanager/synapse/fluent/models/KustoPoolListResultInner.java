// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list Kusto pools operation response. */
@Fluent
public final class KustoPoolListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KustoPoolListResultInner.class);

    /*
     * The list of Kusto pools.
     */
    @JsonProperty(value = "value")
    private List<KustoPoolInner> value;

    /**
     * Get the value property: The list of Kusto pools.
     *
     * @return the value value.
     */
    public List<KustoPoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Kusto pools.
     *
     * @param value the value value to set.
     * @return the KustoPoolListResultInner object itself.
     */
    public KustoPoolListResultInner withValue(List<KustoPoolInner> value) {
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
