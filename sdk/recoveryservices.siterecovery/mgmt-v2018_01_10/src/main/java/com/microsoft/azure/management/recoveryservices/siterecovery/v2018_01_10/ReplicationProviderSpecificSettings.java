/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Replication provider specific settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = ReplicationProviderSpecificSettings.class)
@JsonTypeName("ReplicationProviderSpecificSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2AReplicationDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzureReplicationDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplicaBaseReplicationDetails", value = HyperVReplicaBaseReplicationDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplica2012R2", value = HyperVReplicaBlueReplicationDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplica2012", value = HyperVReplicaReplicationDetails.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2ReplicationDetails.class),
    @JsonSubTypes.Type(name = "InMage", value = InMageReplicationDetails.class)
})
public class ReplicationProviderSpecificSettings {
}
