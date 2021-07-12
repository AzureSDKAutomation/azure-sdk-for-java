// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Disable protection input properties. */
@Fluent
public final class DisableProtectionInputProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DisableProtectionInputProperties.class);

    /*
     * Disable protection reason. It can have values
     * NotSpecified/MigrationComplete.
     */
    @JsonProperty(value = "disableProtectionReason")
    private DisableProtectionReason disableProtectionReason;

    /*
     * Replication provider specific input.
     */
    @JsonProperty(value = "replicationProviderInput")
    private DisableProtectionProviderSpecificInput replicationProviderInput;

    /**
     * Get the disableProtectionReason property: Disable protection reason. It can have values
     * NotSpecified/MigrationComplete.
     *
     * @return the disableProtectionReason value.
     */
    public DisableProtectionReason disableProtectionReason() {
        return this.disableProtectionReason;
    }

    /**
     * Set the disableProtectionReason property: Disable protection reason. It can have values
     * NotSpecified/MigrationComplete.
     *
     * @param disableProtectionReason the disableProtectionReason value to set.
     * @return the DisableProtectionInputProperties object itself.
     */
    public DisableProtectionInputProperties withDisableProtectionReason(
        DisableProtectionReason disableProtectionReason) {
        this.disableProtectionReason = disableProtectionReason;
        return this;
    }

    /**
     * Get the replicationProviderInput property: Replication provider specific input.
     *
     * @return the replicationProviderInput value.
     */
    public DisableProtectionProviderSpecificInput replicationProviderInput() {
        return this.replicationProviderInput;
    }

    /**
     * Set the replicationProviderInput property: Replication provider specific input.
     *
     * @param replicationProviderInput the replicationProviderInput value to set.
     * @return the DisableProtectionInputProperties object itself.
     */
    public DisableProtectionInputProperties withReplicationProviderInput(
        DisableProtectionProviderSpecificInput replicationProviderInput) {
        this.replicationProviderInput = replicationProviderInput;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (replicationProviderInput() != null) {
            replicationProviderInput().validate();
        }
    }
}
