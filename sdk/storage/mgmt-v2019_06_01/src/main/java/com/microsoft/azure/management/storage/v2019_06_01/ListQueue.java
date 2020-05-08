/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The ListQueue model.
 */
@JsonFlatten
public class ListQueue extends ProxyResource {
    /**
     * A name-value pair that represents queue metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Map<String, String> metadata;

    /**
     * Get a name-value pair that represents queue metadata.
     *
     * @return the metadata value
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set a name-value pair that represents queue metadata.
     *
     * @param metadata the metadata value to set
     * @return the ListQueue object itself.
     */
    public ListQueue withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

}
