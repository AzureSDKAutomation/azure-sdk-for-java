/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reference to a secret stored in Azure Key Vault.
 */
public class KeyVaultSecretRef {
    /**
     * Key vault identifier.
     */
    @JsonProperty(value = "vaultID", required = true)
    private String vaultID;

    /**
     * The secret name.
     */
    @JsonProperty(value = "secretName", required = true)
    private String secretName;

    /**
     * The secret version.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get key vault identifier.
     *
     * @return the vaultID value
     */
    public String vaultID() {
        return this.vaultID;
    }

    /**
     * Set key vault identifier.
     *
     * @param vaultID the vaultID value to set
     * @return the KeyVaultSecretRef object itself.
     */
    public KeyVaultSecretRef withVaultID(String vaultID) {
        this.vaultID = vaultID;
        return this;
    }

    /**
     * Get the secret name.
     *
     * @return the secretName value
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the secret name.
     *
     * @param secretName the secretName value to set
     * @return the KeyVaultSecretRef object itself.
     */
    public KeyVaultSecretRef withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the secret version.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the secret version.
     *
     * @param version the version value to set
     * @return the KeyVaultSecretRef object itself.
     */
    public KeyVaultSecretRef withVersion(String version) {
        this.version = version;
        return this;
    }

}
