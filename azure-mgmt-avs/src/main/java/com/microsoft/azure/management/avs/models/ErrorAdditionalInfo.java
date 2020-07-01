/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource management error additional info.
 */
public class ErrorAdditionalInfo {
    /**
     * The additional info type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The additional info.
     */
    @JsonProperty(value = "info", access = JsonProperty.Access.WRITE_ONLY)
    private Object info;

    /**
     * Get the additional info type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the additional info.
     *
     * @return the info value
     */
    public Object info() {
        return this.info;
    }

}
