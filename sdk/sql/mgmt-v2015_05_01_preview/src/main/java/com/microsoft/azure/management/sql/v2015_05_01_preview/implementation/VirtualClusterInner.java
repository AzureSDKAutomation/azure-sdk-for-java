/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * An Azure SQL virtual cluster.
 */
@JsonFlatten
public class VirtualClusterInner extends Resource {
    /**
     * Subnet resource ID for the virtual cluster.
     */
    @JsonProperty(value = "properties.subnetId", access = JsonProperty.Access.WRITE_ONLY)
    private String subnetId;

    /**
     * If the service has different generations of hardware, for the same SKU,
     * then that can be captured here.
     */
    @JsonProperty(value = "properties.family")
    private String family;

    /**
     * List of resources in this virtual cluster.
     */
    @JsonProperty(value = "properties.childResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> childResources;

    /**
     * Get subnet resource ID for the virtual cluster.
     *
     * @return the subnetId value
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Get if the service has different generations of hardware, for the same SKU, then that can be captured here.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Set if the service has different generations of hardware, for the same SKU, then that can be captured here.
     *
     * @param family the family value to set
     * @return the VirtualClusterInner object itself.
     */
    public VirtualClusterInner withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get list of resources in this virtual cluster.
     *
     * @return the childResources value
     */
    public List<String> childResources() {
        return this.childResources;
    }

}
