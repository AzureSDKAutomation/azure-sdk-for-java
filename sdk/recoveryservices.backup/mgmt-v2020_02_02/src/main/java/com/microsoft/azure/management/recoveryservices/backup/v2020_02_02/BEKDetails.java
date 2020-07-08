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

/**
 * BEK is bitlocker encryption key.
 */
public class BEKDetails {
    /**
     * Secret is BEK.
     */
    @JsonProperty(value = "secretUrl")
    private String secretUrl;

    /**
     * ID of the Key Vault where this Secret is stored.
     */
    @JsonProperty(value = "secretVaultId")
    private String secretVaultId;

    /**
     * BEK data.
     */
    @JsonProperty(value = "secretData")
    private String secretData;

    /**
     * Get secret is BEK.
     *
     * @return the secretUrl value
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set secret is BEK.
     *
     * @param secretUrl the secretUrl value to set
     * @return the BEKDetails object itself.
     */
    public BEKDetails withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

    /**
     * Get iD of the Key Vault where this Secret is stored.
     *
     * @return the secretVaultId value
     */
    public String secretVaultId() {
        return this.secretVaultId;
    }

    /**
     * Set iD of the Key Vault where this Secret is stored.
     *
     * @param secretVaultId the secretVaultId value to set
     * @return the BEKDetails object itself.
     */
    public BEKDetails withSecretVaultId(String secretVaultId) {
        this.secretVaultId = secretVaultId;
        return this;
    }

    /**
     * Get bEK data.
     *
     * @return the secretData value
     */
    public String secretData() {
        return this.secretData;
    }

    /**
     * Set bEK data.
     *
     * @param secretData the secretData value to set
     * @return the BEKDetails object itself.
     */
    public BEKDetails withSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }

}
