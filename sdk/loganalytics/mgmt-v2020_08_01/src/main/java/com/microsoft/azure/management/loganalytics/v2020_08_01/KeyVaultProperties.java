/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key vault properties.
 */
public class KeyVaultProperties {
    /**
     * The Key Vault uri which holds they key associated with the Log Analytics
     * cluster.
     */
    @JsonProperty(value = "keyVaultUri")
    private String keyVaultUri;

    /**
     * The name of the key associated with the Log Analytics cluster.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /**
     * The version of the key associated with the Log Analytics cluster.
     */
    @JsonProperty(value = "keyVersion")
    private String keyVersion;

    /**
     * Get the Key Vault uri which holds they key associated with the Log Analytics cluster.
     *
     * @return the keyVaultUri value
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the Key Vault uri which holds they key associated with the Log Analytics cluster.
     *
     * @param keyVaultUri the keyVaultUri value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the name of the key associated with the Log Analytics cluster.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the name of the key associated with the Log Analytics cluster.
     *
     * @param keyName the keyName value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the version of the key associated with the Log Analytics cluster.
     *
     * @return the keyVersion value
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the version of the key associated with the Log Analytics cluster.
     *
     * @param keyVersion the keyVersion value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

}
