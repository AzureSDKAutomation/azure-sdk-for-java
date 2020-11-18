/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A workspace key.
 */
@JsonFlatten
public class KeyInner extends ProxyResource {
    /**
     * Used to activate the workspace after a customer managed key is provided.
     */
    @JsonProperty(value = "properties.isActiveCMK")
    private Boolean isActiveCMK;

    /**
     * The Key Vault Url of the workspace key.
     */
    @JsonProperty(value = "properties.keyVaultUrl")
    private String keyVaultUrl;

    /**
     * Get used to activate the workspace after a customer managed key is provided.
     *
     * @return the isActiveCMK value
     */
    public Boolean isActiveCMK() {
        return this.isActiveCMK;
    }

    /**
     * Set used to activate the workspace after a customer managed key is provided.
     *
     * @param isActiveCMK the isActiveCMK value to set
     * @return the KeyInner object itself.
     */
    public KeyInner withIsActiveCMK(Boolean isActiveCMK) {
        this.isActiveCMK = isActiveCMK;
        return this;
    }

    /**
     * Get the Key Vault Url of the workspace key.
     *
     * @return the keyVaultUrl value
     */
    public String keyVaultUrl() {
        return this.keyVaultUrl;
    }

    /**
     * Set the Key Vault Url of the workspace key.
     *
     * @param keyVaultUrl the keyVaultUrl value to set
     * @return the KeyInner object itself.
     */
    public KeyInner withKeyVaultUrl(String keyVaultUrl) {
        this.keyVaultUrl = keyVaultUrl;
        return this;
    }

}
