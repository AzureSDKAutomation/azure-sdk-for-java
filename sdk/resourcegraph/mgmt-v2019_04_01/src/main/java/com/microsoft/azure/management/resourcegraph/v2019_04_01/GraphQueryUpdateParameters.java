/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcegraph.v2019_04_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters that can be provided when updating workbook properties
 * properties.
 */
@JsonFlatten
public class GraphQueryUpdateParameters {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * This will be used to handle Optimistic Concurrency. If not present, it
     * will always overwrite the existing resource without checking conflict.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * The description of a graph query.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * KQL query that will be graph.
     */
    @JsonProperty(value = "properties.query")
    private String query;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the GraphQueryUpdateParameters object itself.
     */
    public GraphQueryUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get this will be used to handle Optimistic Concurrency. If not present, it will always overwrite the existing resource without checking conflict.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set this will be used to handle Optimistic Concurrency. If not present, it will always overwrite the existing resource without checking conflict.
     *
     * @param eTag the eTag value to set
     * @return the GraphQueryUpdateParameters object itself.
     */
    public GraphQueryUpdateParameters withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the description of a graph query.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of a graph query.
     *
     * @param description the description value to set
     * @return the GraphQueryUpdateParameters object itself.
     */
    public GraphQueryUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get kQL query that will be graph.
     *
     * @return the query value
     */
    public String query() {
        return this.query;
    }

    /**
     * Set kQL query that will be graph.
     *
     * @param query the query value to set
     * @return the GraphQueryUpdateParameters object itself.
     */
    public GraphQueryUpdateParameters withQuery(String query) {
        this.query = query;
        return this;
    }

}
