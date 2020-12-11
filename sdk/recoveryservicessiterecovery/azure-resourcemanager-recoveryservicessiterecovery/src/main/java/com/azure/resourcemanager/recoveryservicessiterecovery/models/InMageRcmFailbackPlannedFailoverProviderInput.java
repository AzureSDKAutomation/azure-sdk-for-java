// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Provider specific input for InMageRcmFailback failover. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcmFailback")
@Fluent
public final class InMageRcmFailbackPlannedFailoverProviderInput extends ProviderSpecificFailoverInput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(InMageRcmFailbackPlannedFailoverProviderInput.class);

    /*
     * The recovery point type. See InMageRcmFailbackRecoveryPointType enum for
     * possible values.
     */
    @JsonProperty(value = "recoveryPointType")
    private InMageRcmFailbackRecoveryPointType recoveryPointType;

    /**
     * Get the recoveryPointType property: The recovery point type. See InMageRcmFailbackRecoveryPointType enum for
     * possible values.
     *
     * @return the recoveryPointType value.
     */
    public InMageRcmFailbackRecoveryPointType recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recoveryPointType property: The recovery point type. See InMageRcmFailbackRecoveryPointType enum for
     * possible values.
     *
     * @param recoveryPointType the recoveryPointType value to set.
     * @return the InMageRcmFailbackPlannedFailoverProviderInput object itself.
     */
    public InMageRcmFailbackPlannedFailoverProviderInput withRecoveryPointType(
        InMageRcmFailbackRecoveryPointType recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
