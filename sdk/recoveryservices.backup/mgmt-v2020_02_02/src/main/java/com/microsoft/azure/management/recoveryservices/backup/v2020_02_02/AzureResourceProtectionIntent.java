/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ProtectionIntentInner;

/**
 * IaaS VM specific backup protection intent item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectionIntentItemType", defaultImpl = AzureResourceProtectionIntent.class)
@JsonTypeName("AzureResourceItem")
public class AzureResourceProtectionIntent extends ProtectionIntentInner {
    /**
     * Friendly name of the VM represented by this backup item.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Get friendly name of the VM represented by this backup item.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of the VM represented by this backup item.
     *
     * @param friendlyName the friendlyName value to set
     * @return the AzureResourceProtectionIntent object itself.
     */
    public AzureResourceProtectionIntent withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

}
