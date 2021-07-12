// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.models.AccountType;
import com.azure.resourcemanager.databoxedge.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.models.AsymmetricEncryptedSecret;
import com.azure.resourcemanager.databoxedge.models.SslStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The storage account credential. */
@JsonFlatten
@Fluent
public class StorageAccountCredentialInner extends ArmBaseModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccountCredentialInner.class);

    /*
     * StorageAccountCredential object
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Alias for the storage account.
     */
    @JsonProperty(value = "properties.alias", required = true)
    private String alias;

    /*
     * Username for the storage account.
     */
    @JsonProperty(value = "properties.userName")
    private String username;

    /*
     * Encrypted storage key.
     */
    @JsonProperty(value = "properties.accountKey")
    private AsymmetricEncryptedSecret accountKey;

    /*
     * Connection string for the storage account. Use this string if username
     * and account key are not specified.
     */
    @JsonProperty(value = "properties.connectionString")
    private String connectionString;

    /*
     * Signifies whether SSL needs to be enabled or not.
     */
    @JsonProperty(value = "properties.sslStatus", required = true)
    private SslStatus sslStatus;

    /*
     * Blob end point for private clouds.
     */
    @JsonProperty(value = "properties.blobDomainName")
    private String blobDomainName;

    /*
     * Type of storage accessed on the storage account.
     */
    @JsonProperty(value = "properties.accountType", required = true)
    private AccountType accountType;

    /*
     * Id of the storage account.
     */
    @JsonProperty(value = "properties.storageAccountId")
    private String storageAccountId;

    /**
     * Get the systemData property: StorageAccountCredential object.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the alias property: Alias for the storage account.
     *
     * @return the alias value.
     */
    public String alias() {
        return this.alias;
    }

    /**
     * Set the alias property: Alias for the storage account.
     *
     * @param alias the alias value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * Get the username property: Username for the storage account.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Username for the storage account.
     *
     * @param username the username value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the accountKey property: Encrypted storage key.
     *
     * @return the accountKey value.
     */
    public AsymmetricEncryptedSecret accountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: Encrypted storage key.
     *
     * @param accountKey the accountKey value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withAccountKey(AsymmetricEncryptedSecret accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the connectionString property: Connection string for the storage account. Use this string if username and
     * account key are not specified.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: Connection string for the storage account. Use this string if username and
     * account key are not specified.
     *
     * @param connectionString the connectionString value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the sslStatus property: Signifies whether SSL needs to be enabled or not.
     *
     * @return the sslStatus value.
     */
    public SslStatus sslStatus() {
        return this.sslStatus;
    }

    /**
     * Set the sslStatus property: Signifies whether SSL needs to be enabled or not.
     *
     * @param sslStatus the sslStatus value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withSslStatus(SslStatus sslStatus) {
        this.sslStatus = sslStatus;
        return this;
    }

    /**
     * Get the blobDomainName property: Blob end point for private clouds.
     *
     * @return the blobDomainName value.
     */
    public String blobDomainName() {
        return this.blobDomainName;
    }

    /**
     * Set the blobDomainName property: Blob end point for private clouds.
     *
     * @param blobDomainName the blobDomainName value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withBlobDomainName(String blobDomainName) {
        this.blobDomainName = blobDomainName;
        return this;
    }

    /**
     * Get the accountType property: Type of storage accessed on the storage account.
     *
     * @return the accountType value.
     */
    public AccountType accountType() {
        return this.accountType;
    }

    /**
     * Set the accountType property: Type of storage accessed on the storage account.
     *
     * @param accountType the accountType value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withAccountType(AccountType accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get the storageAccountId property: Id of the storage account.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId property: Id of the storage account.
     *
     * @param storageAccountId the storageAccountId value to set.
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (alias() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property alias in model StorageAccountCredentialInner"));
        }
        if (accountKey() != null) {
            accountKey().validate();
        }
        if (sslStatus() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sslStatus in model StorageAccountCredentialInner"));
        }
        if (accountType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property accountType in model StorageAccountCredentialInner"));
        }
    }
}
