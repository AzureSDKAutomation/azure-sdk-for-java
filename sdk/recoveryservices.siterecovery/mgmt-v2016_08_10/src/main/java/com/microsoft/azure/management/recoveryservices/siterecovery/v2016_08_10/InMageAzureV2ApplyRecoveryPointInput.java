/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApplyRecoveryPoint input specific to InMageAzureV2 provider.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = InMageAzureV2ApplyRecoveryPointInput.class)
@JsonTypeName("InMageAzureV2")
public class InMageAzureV2ApplyRecoveryPointInput extends ApplyRecoveryPointProviderSpecificInput {
    /**
     * The vault location where the recovery Vm resides.
     */
    @JsonProperty(value = "vaultLocation")
    private String vaultLocation;

    /**
     * Get the vault location where the recovery Vm resides.
     *
     * @return the vaultLocation value
     */
    public String vaultLocation() {
        return this.vaultLocation;
    }

    /**
     * Set the vault location where the recovery Vm resides.
     *
     * @param vaultLocation the vaultLocation value to set
     * @return the InMageAzureV2ApplyRecoveryPointInput object itself.
     */
    public InMageAzureV2ApplyRecoveryPointInput withVaultLocation(String vaultLocation) {
        this.vaultLocation = vaultLocation;
        return this;
    }

}
