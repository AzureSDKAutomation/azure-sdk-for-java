// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The customer-managed encryption key (CMK) properties for the IoT DPS instance. */
@Fluent
public final class EncryptionPropertiesDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionPropertiesDescription.class);

    /*
     * The source of the encryption key. Typically, Microsoft.KeyVault
     */
    @JsonProperty(value = "keySource")
    private String keySource;

    /*
     * The properties of the encryption key configured in KeyVault.
     */
    @JsonProperty(value = "keyVaultProperties")
    private List<KeyVaultKeyProperties> keyVaultProperties;

    /*
     * The identity used to access the encryption key in KeyVault.
     */
    @JsonProperty(value = "identity")
    private EncryptionKeyIdentity identity;

    /**
     * Get the keySource property: The source of the encryption key. Typically, Microsoft.KeyVault.
     *
     * @return the keySource value.
     */
    public String keySource() {
        return this.keySource;
    }

    /**
     * Set the keySource property: The source of the encryption key. Typically, Microsoft.KeyVault.
     *
     * @param keySource the keySource value to set.
     * @return the EncryptionPropertiesDescription object itself.
     */
    public EncryptionPropertiesDescription withKeySource(String keySource) {
        this.keySource = keySource;
        return this;
    }

    /**
     * Get the keyVaultProperties property: The properties of the encryption key configured in KeyVault.
     *
     * @return the keyVaultProperties value.
     */
    public List<KeyVaultKeyProperties> keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: The properties of the encryption key configured in KeyVault.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the EncryptionPropertiesDescription object itself.
     */
    public EncryptionPropertiesDescription withKeyVaultProperties(List<KeyVaultKeyProperties> keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the identity property: The identity used to access the encryption key in KeyVault.
     *
     * @return the identity value.
     */
    public EncryptionKeyIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity used to access the encryption key in KeyVault.
     *
     * @param identity the identity value to set.
     * @return the EncryptionPropertiesDescription object itself.
     */
    public EncryptionPropertiesDescription withIdentity(EncryptionKeyIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() != null) {
            keyVaultProperties().forEach(e -> e.validate());
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
