// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of strings with server paging support. */
@Fluent
public final class PageableListOfStrings {
    /*
     * The collection of pageable items.
     */
    @JsonProperty(value = "value")
    private List<String> value;

    /*
     * The link to the next page of items.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The collection of pageable items.
     *
     * @return the value value.
     */
    public List<String> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The collection of pageable items.
     *
     * @param value the value value to set.
     * @return the PageableListOfStrings object itself.
     */
    public PageableListOfStrings setValue(List<String> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     *
     * @param nextLink the nextLink value to set.
     * @return the PageableListOfStrings object itself.
     */
    public PageableListOfStrings setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
