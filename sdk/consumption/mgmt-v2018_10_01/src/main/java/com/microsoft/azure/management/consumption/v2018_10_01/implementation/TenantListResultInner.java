/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_10_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Tenant properties Resource.
 */
public class TenantListResultInner {
    /**
     * The list of tenant details.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<TenantInner> value;

    /**
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the list of tenant details.
     *
     * @return the value value
     */
    public List<TenantInner> value() {
        return this.value;
    }

    /**
     * Get the link (url) to the next page of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

}
