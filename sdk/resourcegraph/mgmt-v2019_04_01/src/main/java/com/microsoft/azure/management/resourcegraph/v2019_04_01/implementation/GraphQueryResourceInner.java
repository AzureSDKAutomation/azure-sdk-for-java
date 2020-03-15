/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcegraph.v2019_04_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.resourcegraph.v2019_04_01.ResultKind;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Graph Query entity definition.
 */
@JsonFlatten
public class GraphQueryResourceInner extends ProxyResource {
    /**
     * Date and time in UTC of the last modification that was made to this
     * graph query definition.
     */
    @JsonProperty(value = "properties.timeModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timeModified;

    /**
     * The description of a graph query.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * KQL query that will be graph.
     */
    @JsonProperty(value = "properties.query", required = true)
    private String query;

    /**
     * Enum indicating a type of graph query. Possible values include: 'basic'.
     */
    @JsonProperty(value = "properties.resultKind", access = JsonProperty.Access.WRITE_ONLY)
    private ResultKind resultKind;

    /**
     * This will be used to handle Optimistic Concurrency. If not present, it
     * will always overwrite the existing resource without checking conflict.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get date and time in UTC of the last modification that was made to this graph query definition.
     *
     * @return the timeModified value
     */
    public DateTime timeModified() {
        return this.timeModified;
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
     * @return the GraphQueryResourceInner object itself.
     */
    public GraphQueryResourceInner withDescription(String description) {
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
     * @return the GraphQueryResourceInner object itself.
     */
    public GraphQueryResourceInner withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get enum indicating a type of graph query. Possible values include: 'basic'.
     *
     * @return the resultKind value
     */
    public ResultKind resultKind() {
        return this.resultKind;
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
     * @return the GraphQueryResourceInner object itself.
     */
    public GraphQueryResourceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

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
     * @return the GraphQueryResourceInner object itself.
     */
    public GraphQueryResourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
