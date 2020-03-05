/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2019_12_12;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties required to reconnect a hybrid machine.
 */
public class MachineReconnectProperties {
    /**
     * Specifies the hybrid machine unique ID.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /**
     * Public Key that the client provides to be used during initial resource
     * onboarding.
     */
    @JsonProperty(value = "clientPublicKey")
    private String clientPublicKey;

    /**
     * Get specifies the hybrid machine unique ID.
     *
     * @return the vmId value
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set specifies the hybrid machine unique ID.
     *
     * @param vmId the vmId value to set
     * @return the MachineReconnectProperties object itself.
     */
    public MachineReconnectProperties withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get public Key that the client provides to be used during initial resource onboarding.
     *
     * @return the clientPublicKey value
     */
    public String clientPublicKey() {
        return this.clientPublicKey;
    }

    /**
     * Set public Key that the client provides to be used during initial resource onboarding.
     *
     * @param clientPublicKey the clientPublicKey value to set
     * @return the MachineReconnectProperties object itself.
     */
    public MachineReconnectProperties withClientPublicKey(String clientPublicKey) {
        this.clientPublicKey = clientPublicKey;
        return this;
    }

}
