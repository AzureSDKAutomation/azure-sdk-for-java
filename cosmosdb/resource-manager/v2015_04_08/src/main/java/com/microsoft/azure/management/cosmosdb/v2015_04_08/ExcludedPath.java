/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ExcludedPath model.
 */
public class ExcludedPath {
    /**
     * The path for which the indexing behavior applies to. Index paths
     * typically start with root and end with wildcard (/path/*).
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Get the path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*).
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*).
     *
     * @param path the path value to set
     * @return the ExcludedPath object itself.
     */
    public ExcludedPath withPath(String path) {
        this.path = path;
        return this;
    }

}
