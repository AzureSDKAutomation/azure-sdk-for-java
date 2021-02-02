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

/** InMageAzureV2 provider specific input for failover. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageAzureV2")
@Fluent
public final class InMageAzureV2FailoverProviderInput extends ProviderSpecificFailoverInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InMageAzureV2FailoverProviderInput.class);

    /*
     * Location of the vault.
     */
    @JsonProperty(value = "vaultLocation")
    private String vaultLocation;

    /*
     * The recovery point id to be passed to failover to a particular recovery
     * point. In case of latest recovery point, null should be passed.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /**
     * Get the vaultLocation property: Location of the vault.
     *
     * @return the vaultLocation value.
     */
    public String vaultLocation() {
        return this.vaultLocation;
    }

    /**
     * Set the vaultLocation property: Location of the vault.
     *
     * @param vaultLocation the vaultLocation value to set.
     * @return the InMageAzureV2FailoverProviderInput object itself.
     */
    public InMageAzureV2FailoverProviderInput withVaultLocation(String vaultLocation) {
        this.vaultLocation = vaultLocation;
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
     * @return the InMageAzureV2FailoverProviderInput object itself.
     */
    public InMageAzureV2FailoverProviderInput withRecoveryPointId(String recoveryPointId) {
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
