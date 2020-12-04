/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource Id model.
 */
public class ResourceReference {
    /**
     * The fully qualified resource Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the fully qualified resource Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}
