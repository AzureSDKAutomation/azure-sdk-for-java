/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataProtection.
 * DataProtection volume, can have a replication object.
 */
public class VolumePropertiesDataProtection {
    /**
     * Replication.
     * Replication properties.
     */
    @JsonProperty(value = "replication")
    private Object replication;

    /**
     * Get replication properties.
     *
     * @return the replication value
     */
    public Object replication() {
        return this.replication;
    }

    /**
     * Set replication properties.
     *
     * @param replication the replication value to set
     * @return the VolumePropertiesDataProtection object itself.
     */
    public VolumePropertiesDataProtection withReplication(Object replication) {
        this.replication = replication;
        return this;
    }

}
