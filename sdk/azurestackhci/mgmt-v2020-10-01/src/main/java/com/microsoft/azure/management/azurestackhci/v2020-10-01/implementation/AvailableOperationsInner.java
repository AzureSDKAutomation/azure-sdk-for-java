/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestackhci.v2020-10-01.implementation;

import java.util.List;
import com.microsoft.azure.management.azurestackhci.v2020-10-01.OperationDetail;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available operations of the service.
 */
public class AvailableOperationsInner {
    /**
     * Collection of available operation details.
     */
    @JsonProperty(value = "value")
    private List<OperationDetail> value;

    /**
     * URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get collection of available operation details.
     *
     * @return the value value
     */
    public List<OperationDetail> value() {
        return this.value;
    }

    /**
     * Set collection of available operation details.
     *
     * @param value the value value to set
     * @return the AvailableOperationsInner object itself.
     */
    public AvailableOperationsInner withValue(List<OperationDetail> value) {
        this.value = value;
        return this;
    }

    /**
     * Get uRL client should use to fetch the next page (per server side paging).
     It's null for now, added for future use.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set uRL client should use to fetch the next page (per server side paging).
     It's null for now, added for future use.
     *
     * @param nextLink the nextLink value to set
     * @return the AvailableOperationsInner object itself.
     */
    public AvailableOperationsInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
