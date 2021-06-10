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

/** Base class for Provider specific details for policies. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = PolicyProviderSpecificDetails.class)
@JsonTypeName("PolicyProviderSpecificDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2APolicyDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzurePolicyDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplicaBasePolicyDetails", value = HyperVReplicaBasePolicyDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplica2012R2", value = HyperVReplicaBluePolicyDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplica2012", value = HyperVReplicaPolicyDetails.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2PolicyDetails.class),
    @JsonSubTypes.Type(name = "InMageBasePolicyDetails", value = InMageBasePolicyDetails.class),
    @JsonSubTypes.Type(name = "InMage", value = InMagePolicyDetails.class),
    @JsonSubTypes.Type(name = "InMageRcm", value = InMageRcmPolicyDetails.class),
    @JsonSubTypes.Type(name = "RcmAzureMigration", value = RcmAzureMigrationPolicyDetails.class),
    @JsonSubTypes.Type(name = "VMwareCbt", value = VmwareCbtPolicyDetails.class)
})
@Immutable
public class PolicyProviderSpecificDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyProviderSpecificDetails.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
