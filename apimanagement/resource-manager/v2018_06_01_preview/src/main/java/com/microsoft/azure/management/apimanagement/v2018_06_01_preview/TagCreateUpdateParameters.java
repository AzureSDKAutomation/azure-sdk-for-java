/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to Create/Update Tag operations.
 */
@JsonFlatten
public class TagCreateUpdateParameters {
    /**
     * Tag name.
     */
    @JsonProperty(value = "properties.displayName", required = true)
    private String displayName;

    /**
     * Get tag name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set tag name.
     *
     * @param displayName the displayName value to set
     * @return the TagCreateUpdateParameters object itself.
     */
    public TagCreateUpdateParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
