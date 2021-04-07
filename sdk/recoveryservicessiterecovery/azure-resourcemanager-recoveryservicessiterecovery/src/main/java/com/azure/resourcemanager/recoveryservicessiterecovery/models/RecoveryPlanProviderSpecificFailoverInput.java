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

/** Recovery plan provider specific failover input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = RecoveryPlanProviderSpecificFailoverInput.class)
@JsonTypeName("RecoveryPlanProviderSpecificFailoverInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = RecoveryPlanA2AFailoverInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzureFailback", value = RecoveryPlanHyperVReplicaAzureFailbackInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = RecoveryPlanHyperVReplicaAzureFailoverInput.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = RecoveryPlanInMageAzureV2FailoverInput.class),
    @JsonSubTypes.Type(name = "InMage", value = RecoveryPlanInMageFailoverInput.class),
    @JsonSubTypes.Type(name = "InMageRcmFailback", value = RecoveryPlanInMageRcmFailbackFailoverInput.class),
    @JsonSubTypes.Type(name = "InMageRcm", value = RecoveryPlanInMageRcmFailoverInput.class)
})
@Immutable
public class RecoveryPlanProviderSpecificFailoverInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoveryPlanProviderSpecificFailoverInput.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
