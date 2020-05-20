/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters supplied to the Regenerate Authorization Rule operation,
 * specifies which key needs to be reset.
 */
public class RegenerateAccessKeyParameters {
    /**
     * The access key to regenerate. Possible values include: 'PrimaryKey',
     * 'SecondaryKey'.
     */
    @JsonProperty(value = "keyType", required = true)
    private KeyType keyType;

    /**
     * Optional, if the key value provided, is set for KeyType or autogenerated
     * Key value set for keyType.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get the access key to regenerate. Possible values include: 'PrimaryKey', 'SecondaryKey'.
     *
     * @return the keyType value
     */
    public KeyType keyType() {
        return this.keyType;
    }

    /**
     * Set the access key to regenerate. Possible values include: 'PrimaryKey', 'SecondaryKey'.
     *
     * @param keyType the keyType value to set
     * @return the RegenerateAccessKeyParameters object itself.
     */
    public RegenerateAccessKeyParameters withKeyType(KeyType keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * Get optional, if the key value provided, is set for KeyType or autogenerated Key value set for keyType.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set optional, if the key value provided, is set for KeyType or autogenerated Key value set for keyType.
     *
     * @param key the key value to set
     * @return the RegenerateAccessKeyParameters object itself.
     */
    public RegenerateAccessKeyParameters withKey(String key) {
        this.key = key;
        return this;
    }

}
