// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The key vault properties. */
@Fluent
public final class KeyVaultProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultProperties.class);

    /*
     * The Key Vault uri which holds they key associated with the Log Analytics
     * cluster.
     */
    @JsonProperty(value = "keyVaultUri")
    private String keyVaultUri;

    /*
     * The name of the key associated with the Log Analytics cluster.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /*
     * The version of the key associated with the Log Analytics cluster.
     */
    @JsonProperty(value = "keyVersion")
    private String keyVersion;

    /*
     * Selected key minimum required size.
     */
    @JsonProperty(value = "keyRsaSize")
    private Integer keyRsaSize;

    /**
     * Get the keyVaultUri property: The Key Vault uri which holds they key associated with the Log Analytics cluster.
     *
     * @return the keyVaultUri value.
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri property: The Key Vault uri which holds they key associated with the Log Analytics cluster.
     *
     * @param keyVaultUri the keyVaultUri value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the keyName property: The name of the key associated with the Log Analytics cluster.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of the key associated with the Log Analytics cluster.
     *
     * @param keyName the keyName value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion property: The version of the key associated with the Log Analytics cluster.
     *
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: The version of the key associated with the Log Analytics cluster.
     *
     * @param keyVersion the keyVersion value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get the keyRsaSize property: Selected key minimum required size.
     *
     * @return the keyRsaSize value.
     */
    public Integer keyRsaSize() {
        return this.keyRsaSize;
    }

    /**
     * Set the keyRsaSize property: Selected key minimum required size.
     *
     * @param keyRsaSize the keyRsaSize value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyRsaSize(Integer keyRsaSize) {
        this.keyRsaSize = keyRsaSize;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
