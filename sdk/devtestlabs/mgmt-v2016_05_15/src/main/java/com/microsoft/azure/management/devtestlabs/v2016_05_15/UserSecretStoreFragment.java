/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a user's secret store.
 */
public class UserSecretStoreFragment {
    /**
     * The URI of the user's Key vault.
     */
    @JsonProperty(value = "keyVaultUri")
    private String keyVaultUri;

    /**
     * The ID of the user's Key vault.
     */
    @JsonProperty(value = "keyVaultId")
    private String keyVaultId;

    /**
     * Get the URI of the user's Key vault.
     *
     * @return the keyVaultUri value
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the URI of the user's Key vault.
     *
     * @param keyVaultUri the keyVaultUri value to set
     * @return the UserSecretStoreFragment object itself.
     */
    public UserSecretStoreFragment withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the ID of the user's Key vault.
     *
     * @return the keyVaultId value
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set the ID of the user's Key vault.
     *
     * @param keyVaultId the keyVaultId value to set
     * @return the UserSecretStoreFragment object itself.
     */
    public UserSecretStoreFragment withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

}
