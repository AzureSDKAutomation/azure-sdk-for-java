/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ListQueueServicesInner model.
 */
public class ListQueueServicesInner {
    /**
     * List of queue services returned.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<QueueServicePropertiesInner> value;

    /**
     * Get list of queue services returned.
     *
     * @return the value value
     */
    public List<QueueServicePropertiesInner> value() {
        return this.value;
    }

}
