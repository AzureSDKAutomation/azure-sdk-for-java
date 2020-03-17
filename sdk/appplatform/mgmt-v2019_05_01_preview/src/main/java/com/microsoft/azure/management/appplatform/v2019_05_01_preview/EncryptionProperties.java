/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EncryptionProperties model.
 */
public class EncryptionProperties {
    /**
     * Possible values include: 'None', 'Microsoft.AppPlatform',
     * 'Microsoft.KeyVault'.
     */
    @JsonProperty(value = "keySource")
    private EncryptionKeySourceType keySource;

    /**
     * The keyVaultProperties property.
     */
    @JsonProperty(value = "keyVaultProperties")
    private EncryptionKeyProperties keyVaultProperties;

    /**
     * Get possible values include: 'None', 'Microsoft.AppPlatform', 'Microsoft.KeyVault'.
     *
     * @return the keySource value
     */
    public EncryptionKeySourceType keySource() {
        return this.keySource;
    }

    /**
     * Set possible values include: 'None', 'Microsoft.AppPlatform', 'Microsoft.KeyVault'.
     *
     * @param keySource the keySource value to set
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withKeySource(EncryptionKeySourceType keySource) {
        this.keySource = keySource;
        return this;
    }

    /**
     * Get the keyVaultProperties value.
     *
     * @return the keyVaultProperties value
     */
    public EncryptionKeyProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties value.
     *
     * @param keyVaultProperties the keyVaultProperties value to set
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withKeyVaultProperties(EncryptionKeyProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

}
