/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters used to regenerate the storage account key.
 */
public class StorageAccountRegenerateKeyParameters {
    /**
     * The name of storage keys that want to be regenerated, possible values
     * are key1, key2, kerb1, kerb2.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /**
     * Get the name of storage keys that want to be regenerated, possible values are key1, key2, kerb1, kerb2.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the name of storage keys that want to be regenerated, possible values are key1, key2, kerb1, kerb2.
     *
     * @param keyName the keyName value to set
     * @return the StorageAccountRegenerateKeyParameters object itself.
     */
    public StorageAccountRegenerateKeyParameters withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

}
