/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource filter.
 */
public class GenericResourceFilter {
    /**
     * The resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * The tag name.
     */
    @JsonProperty(value = "tagname")
    private String tagname;

    /**
     * The tag value.
     */
    @JsonProperty(value = "tagvalue")
    private String tagvalue;

    /**
     * Get the resource type.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resource type.
     *
     * @param resourceType the resourceType value to set
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the tag name.
     *
     * @return the tagname value
     */
    public String tagname() {
        return this.tagname;
    }

    /**
     * Set the tag name.
     *
     * @param tagname the tagname value to set
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter withTagname(String tagname) {
        this.tagname = tagname;
        return this;
    }

    /**
     * Get the tag value.
     *
     * @return the tagvalue value
     */
    public String tagvalue() {
        return this.tagvalue;
    }

    /**
     * Set the tag value.
     *
     * @param tagvalue the tagvalue value to set
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter withTagvalue(String tagvalue) {
        this.tagvalue = tagvalue;
        return this;
    }

}
