/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an API key for a given Azure Cognitive Search service that has
 * permissions for query operations only.
 */
public class QueryKeyInner {
    /**
     * The name of the query API key; may be empty.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The value of the query API key.
     */
    @JsonProperty(value = "key", access = JsonProperty.Access.WRITE_ONLY)
    private String key;

    /**
     * Get the name of the query API key; may be empty.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value of the query API key.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

}
