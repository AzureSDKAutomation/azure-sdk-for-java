/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * Integration runtime resource type.
 */
public class IntegrationRuntimeResourceInner extends SubResource {
    /**
     * Integration runtime properties.
     */
    @JsonProperty(value = "properties", required = true)
    private IntegrationRuntimeInner properties;

    /**
     * The resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Etag identifies change in the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get integration runtime properties.
     *
     * @return the properties value
     */
    public IntegrationRuntimeInner properties() {
        return this.properties;
    }

    /**
     * Set integration runtime properties.
     *
     * @param properties the properties value to set
     * @return the IntegrationRuntimeResourceInner object itself.
     */
    public IntegrationRuntimeResourceInner withProperties(IntegrationRuntimeInner properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get etag identifies change in the resource.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
