// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VaultProvisioningState. */
public final class VaultProvisioningState extends ExpandableStringEnum<VaultProvisioningState> {
    /** Static value Succeeded for VaultProvisioningState. */
    public static final VaultProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value RegisteringDns for VaultProvisioningState. */
    public static final VaultProvisioningState REGISTERING_DNS = fromString("RegisteringDns");

    /**
     * Creates or finds a VaultProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VaultProvisioningState.
     */
    @JsonCreator
    public static VaultProvisioningState fromString(String name) {
        return fromString(name, VaultProvisioningState.class);
    }

    /** @return known VaultProvisioningState values. */
    public static Collection<VaultProvisioningState> values() {
        return values(VaultProvisioningState.class);
    }
}
