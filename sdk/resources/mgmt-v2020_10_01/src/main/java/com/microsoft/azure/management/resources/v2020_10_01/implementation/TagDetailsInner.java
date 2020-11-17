/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_10_01.implementation;

import com.microsoft.azure.management.resources.v2020_10_01.TagCount;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tag details.
 */
public class TagDetailsInner {
    /**
     * The tag name ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The tag name.
     */
    @JsonProperty(value = "tagName")
    private String tagName;

    /**
     * The total number of resources that use the resource tag. When a tag is
     * initially created and has no associated resources, the value is 0.
     */
    @JsonProperty(value = "count")
    private TagCount count;

    /**
     * The list of tag values.
     */
    @JsonProperty(value = "values")
    private List<TagValueInner> values;

    /**
     * Get the tag name ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the tag name.
     *
     * @return the tagName value
     */
    public String tagName() {
        return this.tagName;
    }

    /**
     * Set the tag name.
     *
     * @param tagName the tagName value to set
     * @return the TagDetailsInner object itself.
     */
    public TagDetailsInner withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * Get the total number of resources that use the resource tag. When a tag is initially created and has no associated resources, the value is 0.
     *
     * @return the count value
     */
    public TagCount count() {
        return this.count;
    }

    /**
     * Set the total number of resources that use the resource tag. When a tag is initially created and has no associated resources, the value is 0.
     *
     * @param count the count value to set
     * @return the TagDetailsInner object itself.
     */
    public TagDetailsInner withCount(TagCount count) {
        this.count = count;
        return this;
    }

    /**
     * Get the list of tag values.
     *
     * @return the values value
     */
    public List<TagValueInner> values() {
        return this.values;
    }

    /**
     * Set the list of tag values.
     *
     * @param values the values value to set
     * @return the TagDetailsInner object itself.
     */
    public TagDetailsInner withValues(List<TagValueInner> values) {
        this.values = values;
        return this;
    }

}
