/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters for updating an agent pool.
 */
@JsonFlatten
public class AgentPoolUpdateParameters {
    /**
     * The count of agent machine.
     */
    @JsonProperty(value = "properties.count")
    private Integer count;

    /**
     * The ARM resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the count of agent machine.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count of agent machine.
     *
     * @param count the count value to set
     * @return the AgentPoolUpdateParameters object itself.
     */
    public AgentPoolUpdateParameters withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the ARM resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the ARM resource tags.
     *
     * @param tags the tags value to set
     * @return the AgentPoolUpdateParameters object itself.
     */
    public AgentPoolUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
