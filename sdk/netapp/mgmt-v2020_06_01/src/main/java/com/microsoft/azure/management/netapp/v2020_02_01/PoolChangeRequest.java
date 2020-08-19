/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pool change request.
 */
public class PoolChangeRequest {
    /**
     * Resource id of the pool to move volume to.
     */
    @JsonProperty(value = "newPoolResourceId", required = true)
    private String newPoolResourceId;

    /**
     * Get resource id of the pool to move volume to.
     *
     * @return the newPoolResourceId value
     */
    public String newPoolResourceId() {
        return this.newPoolResourceId;
    }

    /**
     * Set resource id of the pool to move volume to.
     *
     * @param newPoolResourceId the newPoolResourceId value to set
     * @return the PoolChangeRequest object itself.
     */
    public PoolChangeRequest withNewPoolResourceId(String newPoolResourceId) {
        this.newPoolResourceId = newPoolResourceId;
        return this;
    }

}
