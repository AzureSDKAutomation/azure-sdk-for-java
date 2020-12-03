/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Replication properties.
 */
public class ReplicationObject {
    /**
     * Id.
     */
    @JsonProperty(value = "replicationId")
    private String replicationId;

    /**
     * Indicates whether the local volume is the source or destination for the
     * Volume Replication. Possible values include: 'src', 'dst'.
     */
    @JsonProperty(value = "endpointType")
    private EndpointType endpointType;

    /**
     * Schedule. Possible values include: '_10minutely', 'hourly', 'daily'.
     */
    @JsonProperty(value = "replicationSchedule", required = true)
    private ReplicationSchedule replicationSchedule;

    /**
     * The resource ID of the remote volume.
     */
    @JsonProperty(value = "remoteVolumeResourceId", required = true)
    private String remoteVolumeResourceId;

    /**
     * The remote region for the other end of the Volume Replication.
     */
    @JsonProperty(value = "remoteVolumeRegion")
    private String remoteVolumeRegion;

    /**
     * Get id.
     *
     * @return the replicationId value
     */
    public String replicationId() {
        return this.replicationId;
    }

    /**
     * Set id.
     *
     * @param replicationId the replicationId value to set
     * @return the ReplicationObject object itself.
     */
    public ReplicationObject withReplicationId(String replicationId) {
        this.replicationId = replicationId;
        return this;
    }

    /**
     * Get indicates whether the local volume is the source or destination for the Volume Replication. Possible values include: 'src', 'dst'.
     *
     * @return the endpointType value
     */
    public EndpointType endpointType() {
        return this.endpointType;
    }

    /**
     * Set indicates whether the local volume is the source or destination for the Volume Replication. Possible values include: 'src', 'dst'.
     *
     * @param endpointType the endpointType value to set
     * @return the ReplicationObject object itself.
     */
    public ReplicationObject withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * Get schedule. Possible values include: '_10minutely', 'hourly', 'daily'.
     *
     * @return the replicationSchedule value
     */
    public ReplicationSchedule replicationSchedule() {
        return this.replicationSchedule;
    }

    /**
     * Set schedule. Possible values include: '_10minutely', 'hourly', 'daily'.
     *
     * @param replicationSchedule the replicationSchedule value to set
     * @return the ReplicationObject object itself.
     */
    public ReplicationObject withReplicationSchedule(ReplicationSchedule replicationSchedule) {
        this.replicationSchedule = replicationSchedule;
        return this;
    }

    /**
     * Get the resource ID of the remote volume.
     *
     * @return the remoteVolumeResourceId value
     */
    public String remoteVolumeResourceId() {
        return this.remoteVolumeResourceId;
    }

    /**
     * Set the resource ID of the remote volume.
     *
     * @param remoteVolumeResourceId the remoteVolumeResourceId value to set
     * @return the ReplicationObject object itself.
     */
    public ReplicationObject withRemoteVolumeResourceId(String remoteVolumeResourceId) {
        this.remoteVolumeResourceId = remoteVolumeResourceId;
        return this;
    }

    /**
     * Get the remote region for the other end of the Volume Replication.
     *
     * @return the remoteVolumeRegion value
     */
    public String remoteVolumeRegion() {
        return this.remoteVolumeRegion;
    }

    /**
     * Set the remote region for the other end of the Volume Replication.
     *
     * @param remoteVolumeRegion the remoteVolumeRegion value to set
     * @return the ReplicationObject object itself.
     */
    public ReplicationObject withRemoteVolumeRegion(String remoteVolumeRegion) {
        this.remoteVolumeRegion = remoteVolumeRegion;
        return this;
    }

}
