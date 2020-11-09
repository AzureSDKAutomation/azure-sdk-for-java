/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that defines the blob inventory rule. Each definition consists of
 * a set of filters.
 */
public class BlobInventoryPolicyDefinition {
    /**
     * An object that defines the filter set.
     */
    @JsonProperty(value = "filters", required = true)
    private BlobInventoryPolicyFilter filters;

    /**
     * Get an object that defines the filter set.
     *
     * @return the filters value
     */
    public BlobInventoryPolicyFilter filters() {
        return this.filters;
    }

    /**
     * Set an object that defines the filter set.
     *
     * @param filters the filters value to set
     * @return the BlobInventoryPolicyDefinition object itself.
     */
    public BlobInventoryPolicyDefinition withFilters(BlobInventoryPolicyFilter filters) {
        this.filters = filters;
        return this;
    }

}
