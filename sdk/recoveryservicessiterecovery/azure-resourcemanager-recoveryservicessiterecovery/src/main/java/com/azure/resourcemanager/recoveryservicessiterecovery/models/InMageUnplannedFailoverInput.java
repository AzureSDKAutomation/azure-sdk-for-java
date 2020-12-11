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

/** Provider specific input for InMage unplanned failover. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMage")
@Fluent
public final class InMageUnplannedFailoverInput extends UnplannedFailoverProviderSpecificInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InMageUnplannedFailoverInput.class);

    /*
     * The recovery point type. Values from LatestTime, LatestTag or Custom. In
     * the case of custom, the recovery point provided by RecoveryPointId will
     * be used. In the other two cases, recovery point id will be ignored.
     */
    @JsonProperty(value = "recoveryPointType")
    private RecoveryPointType recoveryPointType;

    /*
     * The recovery point id to be passed to failover to a particular recovery
     * point. In case of latest recovery point, null should be passed.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /**
     * Get the recoveryPointType property: The recovery point type. Values from LatestTime, LatestTag or Custom. In the
     * case of custom, the recovery point provided by RecoveryPointId will be used. In the other two cases, recovery
     * point id will be ignored.
     *
     * @return the recoveryPointType value.
     */
    public RecoveryPointType recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recoveryPointType property: The recovery point type. Values from LatestTime, LatestTag or Custom. In the
     * case of custom, the recovery point provided by RecoveryPointId will be used. In the other two cases, recovery
     * point id will be ignored.
     *
     * @param recoveryPointType the recoveryPointType value to set.
     * @return the InMageUnplannedFailoverInput object itself.
     */
    public InMageUnplannedFailoverInput withRecoveryPointType(RecoveryPointType recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get the recoveryPointId property: The recovery point id to be passed to failover to a particular recovery point.
     * In case of latest recovery point, null should be passed.
     *
     * @return the recoveryPointId value.
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recoveryPointId property: The recovery point id to be passed to failover to a particular recovery point.
     * In case of latest recovery point, null should be passed.
     *
     * @param recoveryPointId the recoveryPointId value to set.
     * @return the InMageUnplannedFailoverInput object itself.
     */
    public InMageUnplannedFailoverInput withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
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
