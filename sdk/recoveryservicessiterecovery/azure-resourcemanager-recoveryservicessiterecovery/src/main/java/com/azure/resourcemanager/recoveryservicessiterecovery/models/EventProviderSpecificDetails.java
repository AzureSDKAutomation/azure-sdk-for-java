// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Model class for provider specific details for an event. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = EventProviderSpecificDetails.class)
@JsonTypeName("EventProviderSpecificDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2AEventDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplica2012", value = HyperVReplica2012EventDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplica2012R2", value = HyperVReplica2012R2EventDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzureEventDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplicaBaseEventDetails", value = HyperVReplicaBaseEventDetails.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2EventDetails.class),
    @JsonSubTypes.Type(name = "InMageRcm", value = InMageRcmEventDetails.class)
})
@Immutable
public class EventProviderSpecificDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventProviderSpecificDetails.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
