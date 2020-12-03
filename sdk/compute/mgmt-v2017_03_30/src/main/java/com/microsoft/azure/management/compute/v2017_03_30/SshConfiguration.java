/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSH configuration for Linux based VMs running on Azure.
 */
public class SshConfiguration {
    /**
     * The list of SSH public keys used to authenticate with linux based VMs.
     */
    @JsonProperty(value = "publicKeys")
    private List<SshPublicKey> publicKeys;

    /**
     * Get the list of SSH public keys used to authenticate with linux based VMs.
     *
     * @return the publicKeys value
     */
    public List<SshPublicKey> publicKeys() {
        return this.publicKeys;
    }

    /**
     * Set the list of SSH public keys used to authenticate with linux based VMs.
     *
     * @param publicKeys the publicKeys value to set
     * @return the SshConfiguration object itself.
     */
    public SshConfiguration withPublicKeys(List<SshPublicKey> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

}
