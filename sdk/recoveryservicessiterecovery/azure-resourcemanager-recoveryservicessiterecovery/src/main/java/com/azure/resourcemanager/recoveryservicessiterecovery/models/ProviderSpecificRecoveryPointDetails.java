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

/** Replication provider specific recovery point details. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = ProviderSpecificRecoveryPointDetails.class)
@JsonTypeName("ProviderSpecificRecoveryPointDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2ARecoveryPointDetails.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2RecoveryPointDetails.class),
    @JsonSubTypes.Type(name = "InMageRcm", value = InMageRcmRecoveryPointDetails.class)
})
@Immutable
public class ProviderSpecificRecoveryPointDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderSpecificRecoveryPointDetails.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
