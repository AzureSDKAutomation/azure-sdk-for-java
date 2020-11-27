/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base for all lists of resources.
 */
public class ResourceList {
    /**
     * The uri to fetch the next page of resources. Call ListNext() fetches
     * next page of resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the uri to fetch the next page of resources. Call ListNext() fetches next page of resources.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the uri to fetch the next page of resources. Call ListNext() fetches next page of resources.
     *
     * @param nextLink the nextLink value to set
     * @return the ResourceList object itself.
     */
    public ResourceList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
