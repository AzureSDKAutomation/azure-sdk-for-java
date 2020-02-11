/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.ClusterCodeVersionsResult;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list results of the ServiceFabric runtime versions.
 */
public class ClusterCodeVersionsListResultInner {
    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<ClusterCodeVersionsResult> value;

    /**
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<ClusterCodeVersionsResult> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the ClusterCodeVersionsListResultInner object itself.
     */
    public ClusterCodeVersionsListResultInner withValue(List<ClusterCodeVersionsResult> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the URL to use for getting the next set of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set
     * @return the ClusterCodeVersionsListResultInner object itself.
     */
    public ClusterCodeVersionsListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
