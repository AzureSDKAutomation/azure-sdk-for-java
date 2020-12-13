// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The sort parameters for search. */
@Fluent
public final class SearchSort {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SearchSort.class);

    /*
     * The name of the field the search query is sorted on.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The sort order of the search.
     */
    @JsonProperty(value = "order")
    private SearchSortEnum order;

    /**
     * Get the name property: The name of the field the search query is sorted on.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the field the search query is sorted on.
     *
     * @param name the name value to set.
     * @return the SearchSort object itself.
     */
    public SearchSort withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the order property: The sort order of the search.
     *
     * @return the order value.
     */
    public SearchSortEnum order() {
        return this.order;
    }

    /**
     * Set the order property: The sort order of the search.
     *
     * @param order the order value to set.
     * @return the SearchSort object itself.
     */
    public SearchSort withOrder(SearchSortEnum order) {
        this.order = order;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
