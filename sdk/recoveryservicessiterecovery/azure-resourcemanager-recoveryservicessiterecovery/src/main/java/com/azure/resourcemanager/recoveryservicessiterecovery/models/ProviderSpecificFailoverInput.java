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

/** Provider specific failover input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = ProviderSpecificFailoverInput.class)
@JsonTypeName("ProviderSpecificFailoverInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2AFailoverProviderInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzureFailback", value = HyperVReplicaAzureFailbackProviderInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzureFailoverProviderInput.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2FailoverProviderInput.class),
    @JsonSubTypes.Type(name = "InMage", value = InMageFailoverProviderInput.class),
    @JsonSubTypes.Type(name = "InMageRcmFailback", value = InMageRcmFailbackPlannedFailoverProviderInput.class)
})
@Immutable
public class ProviderSpecificFailoverInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderSpecificFailoverInput.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
