// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.connectedvmware.fluent.models.InventoryItemInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of InventoryItems. */
@Fluent
public final class InventoryItemsList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InventoryItemsList.class);

    /*
     * Url to follow for getting next page of InventoryItems.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Array of InventoryItems
     */
    @JsonProperty(value = "value", required = true)
    private List<InventoryItemInner> value;

    /**
     * Get the nextLink property: Url to follow for getting next page of InventoryItems.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to follow for getting next page of InventoryItems.
     *
     * @param nextLink the nextLink value to set.
     * @return the InventoryItemsList object itself.
     */
    public InventoryItemsList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Array of InventoryItems.
     *
     * @return the value value.
     */
    public List<InventoryItemInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of InventoryItems.
     *
     * @param value the value value to set.
     * @return the InventoryItemsList object itself.
     */
    public InventoryItemsList withValue(List<InventoryItemInner> value) {
        this.value = value;
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
                    new IllegalArgumentException("Missing required property value in model InventoryItemsList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
