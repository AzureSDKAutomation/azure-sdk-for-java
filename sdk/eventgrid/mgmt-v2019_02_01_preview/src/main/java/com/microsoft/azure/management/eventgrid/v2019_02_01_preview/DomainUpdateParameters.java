/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_02_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the Domain update.
 */
public class DomainUpdateParameters {
    /**
     * Tags of the domains resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get tags of the domains resource.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set tags of the domains resource.
     *
     * @param tags the tags value to set
     * @return the DomainUpdateParameters object itself.
     */
    public DomainUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
