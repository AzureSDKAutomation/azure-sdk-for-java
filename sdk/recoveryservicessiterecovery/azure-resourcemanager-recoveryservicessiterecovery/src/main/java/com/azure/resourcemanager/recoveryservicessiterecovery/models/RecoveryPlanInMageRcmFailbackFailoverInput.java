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

/** Recovery plan InMageRcmFailback failover input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcmFailback")
@Fluent
public final class RecoveryPlanInMageRcmFailbackFailoverInput extends RecoveryPlanProviderSpecificFailoverInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoveryPlanInMageRcmFailbackFailoverInput.class);

    /*
     * The recovery point type.
     */
    @JsonProperty(value = "recoveryPointType", required = true)
    private InMageRcmFailbackRecoveryPointType recoveryPointType;

    /*
     * A value indicating whether multi VM sync enabled VMs should use multi VM
     * sync points for failover.
     */
    @JsonProperty(value = "useMultiVmSyncPoint")
    private String useMultiVmSyncPoint;

    /**
     * Get the recoveryPointType property: The recovery point type.
     *
     * @return the recoveryPointType value.
     */
    public InMageRcmFailbackRecoveryPointType recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recoveryPointType property: The recovery point type.
     *
     * @param recoveryPointType the recoveryPointType value to set.
     * @return the RecoveryPlanInMageRcmFailbackFailoverInput object itself.
     */
    public RecoveryPlanInMageRcmFailbackFailoverInput withRecoveryPointType(
        InMageRcmFailbackRecoveryPointType recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get the useMultiVmSyncPoint property: A value indicating whether multi VM sync enabled VMs should use multi VM
     * sync points for failover.
     *
     * @return the useMultiVmSyncPoint value.
     */
    public String useMultiVmSyncPoint() {
        return this.useMultiVmSyncPoint;
    }

    /**
     * Set the useMultiVmSyncPoint property: A value indicating whether multi VM sync enabled VMs should use multi VM
     * sync points for failover.
     *
     * @param useMultiVmSyncPoint the useMultiVmSyncPoint value to set.
     * @return the RecoveryPlanInMageRcmFailbackFailoverInput object itself.
     */
    public RecoveryPlanInMageRcmFailbackFailoverInput withUseMultiVmSyncPoint(String useMultiVmSyncPoint) {
        this.useMultiVmSyncPoint = useMultiVmSyncPoint;
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
        if (recoveryPointType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property recoveryPointType in model"
                            + " RecoveryPlanInMageRcmFailbackFailoverInput"));
        }
    }
}
