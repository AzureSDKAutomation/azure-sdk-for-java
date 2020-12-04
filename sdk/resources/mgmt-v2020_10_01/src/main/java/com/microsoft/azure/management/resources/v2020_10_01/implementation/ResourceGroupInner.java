/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_10_01.implementation;

import com.microsoft.azure.management.resources.v2020_10_01.ResourceGroupProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * Resource group information.
 */
public class ResourceGroupInner extends Resource {
    /**
     * The resource group properties.
     */
    @JsonProperty(value = "properties")
    private ResourceGroupProperties properties;

    /**
     * The ID of the resource that manages this resource group.
     */
    @JsonProperty(value = "managedBy")
    private String managedBy;

    /**
     * Get the resource group properties.
     *
     * @return the properties value
     */
    public ResourceGroupProperties properties() {
        return this.properties;
    }

    /**
     * Set the resource group properties.
     *
     * @param properties the properties value to set
     * @return the ResourceGroupInner object itself.
     */
    public ResourceGroupInner withProperties(ResourceGroupProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the ID of the resource that manages this resource group.
     *
     * @return the managedBy value
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Set the ID of the resource that manages this resource group.
     *
     * @param managedBy the managedBy value to set
     * @return the ResourceGroupInner object itself.
     */
    public ResourceGroupInner withManagedBy(String managedBy) {
        this.managedBy = managedBy;
        return this;
    }

}
