/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_08_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Snapshot of a Volume.
 */
@JsonFlatten
public class SnapshotInner extends ProxyResource {
    /**
     * Resource location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * snapshotId.
     * UUID v4 used to identify the Snapshot.
     */
    @JsonProperty(value = "properties.snapshotId", access = JsonProperty.Access.WRITE_ONLY)
    private String snapshotId;

    /**
     * name.
     * The creation date of the snapshot.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * Azure lifecycle management.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get uUID v4 used to identify the Snapshot.
     *
     * @return the snapshotId value
     */
    public String snapshotId() {
        return this.snapshotId;
    }

    /**
     * Get the creation date of the snapshot.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get azure lifecycle management.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
