// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeKeyVaultProperties;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeSource;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The Encryption Scope resource. */
@JsonFlatten
@Fluent
public class EncryptionScopeInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionScopeInner.class);

    /*
     * The provider for the encryption scope. Possible values
     * (case-insensitive):  Microsoft.Storage, Microsoft.KeyVault.
     */
    @JsonProperty(value = "properties.source")
    private EncryptionScopeSource source;

    /*
     * The state of the encryption scope. Possible values (case-insensitive):
     * Enabled, Disabled.
     */
    @JsonProperty(value = "properties.state")
    private EncryptionScopeState state;

    /*
     * Gets the creation date and time of the encryption scope in UTC.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Gets the last modification date and time of the encryption scope in UTC.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * The key vault properties for the encryption scope. This is a required
     * field if encryption scope 'source' attribute is set to
     * 'Microsoft.KeyVault'.
     */
    @JsonProperty(value = "properties.keyVaultProperties")
    private EncryptionScopeKeyVaultProperties keyVaultProperties;

    /**
     * Get the source property: The provider for the encryption scope. Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.KeyVault.
     *
     * @return the source value.
     */
    public EncryptionScopeSource source() {
        return this.source;
    }

    /**
     * Set the source property: The provider for the encryption scope. Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.KeyVault.
     *
     * @param source the source value to set.
     * @return the EncryptionScopeInner object itself.
     */
    public EncryptionScopeInner withSource(EncryptionScopeSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the state property: The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
     *
     * @return the state value.
     */
    public EncryptionScopeState state() {
        return this.state;
    }

    /**
     * Set the state property: The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
     *
     * @param state the state value to set.
     * @return the EncryptionScopeInner object itself.
     */
    public EncryptionScopeInner withState(EncryptionScopeState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the creationTime property: Gets the creation date and time of the encryption scope in UTC.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastModifiedTime property: Gets the last modification date and time of the encryption scope in UTC.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the keyVaultProperties property: The key vault properties for the encryption scope. This is a required field
     * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     *
     * @return the keyVaultProperties value.
     */
    public EncryptionScopeKeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: The key vault properties for the encryption scope. This is a required field
     * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the EncryptionScopeInner object itself.
     */
    public EncryptionScopeInner withKeyVaultProperties(EncryptionScopeKeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
    }
}
