/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the parameters for using a user's KeyVault certificate for
 * securing custom domain.
 */
public class KeyVaultCertificateSourceParameters {
    /**
     * The odatatype property.
     */
    @JsonProperty(value = "@odata\\.type", required = true)
    private String odatatype;

    /**
     * Subscription Id of the user's Key Vault containing the SSL certificate.
     */
    @JsonProperty(value = "subscriptionId", required = true)
    private String subscriptionId;

    /**
     * Resource group of the user's Key Vault containing the SSL certificate.
     */
    @JsonProperty(value = "resourceGroupName", required = true)
    private String resourceGroupName;

    /**
     * The name of the user's Key Vault containing the SSL certificate.
     */
    @JsonProperty(value = "vaultNameGRAPES")
    private String vaultNameGRAPES;

    /**
     * The name of Key Vault Secret (representing the full certificate PFX) in
     * Key Vault.
     */
    @JsonProperty(value = "secretName", required = true)
    private String secretName;

    /**
     * The version(GUID) of Key Vault Secret in Key Vault.
     */
    @JsonProperty(value = "secretVersion", required = true)
    private String secretVersion;

    /**
     * Describes the action that shall be taken when the certificate is updated
     * in Key Vault.
     */
    @JsonProperty(value = "updateRule", required = true)
    private String updateRule;

    /**
     * Describes the action that shall be taken when the certificate is removed
     * from Key Vault.
     */
    @JsonProperty(value = "deleteRule", required = true)
    private String deleteRule;

    /**
     * Creates an instance of KeyVaultCertificateSourceParameters class.
     * @param subscriptionId subscription Id of the user's Key Vault containing the SSL certificate.
     * @param resourceGroupName resource group of the user's Key Vault containing the SSL certificate.
     * @param secretName the name of Key Vault Secret (representing the full certificate PFX) in Key Vault.
     * @param secretVersion the version(GUID) of Key Vault Secret in Key Vault.
     */
    public KeyVaultCertificateSourceParameters() {
        odatatype = "#Microsoft.Azure.Cdn.Models.KeyVaultCertificateSourceParameters";
        updateRule = "NoAction";
        deleteRule = "NoAction";
    }

    /**
     * Get the odatatype value.
     *
     * @return the odatatype value
     */
    public String odatatype() {
        return this.odatatype;
    }

    /**
     * Set the odatatype value.
     *
     * @param odatatype the odatatype value to set
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withOdatatype(String odatatype) {
        this.odatatype = odatatype;
        return this;
    }

    /**
     * Get subscription Id of the user's Key Vault containing the SSL certificate.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set subscription Id of the user's Key Vault containing the SSL certificate.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get resource group of the user's Key Vault containing the SSL certificate.
     *
     * @return the resourceGroupName value
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set resource group of the user's Key Vault containing the SSL certificate.
     *
     * @param resourceGroupName the resourceGroupName value to set
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the name of the user's Key Vault containing the SSL certificate.
     *
     * @return the vaultNameGRAPES value
     */
    public String vaultNameGRAPES() {
        return this.vaultNameGRAPES;
    }

    /**
     * Set the name of the user's Key Vault containing the SSL certificate.
     *
     * @param vaultNameGRAPES the vaultNameGRAPES value to set
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withVaultNameGRAPES(String vaultNameGRAPES) {
        this.vaultNameGRAPES = vaultNameGRAPES;
        return this;
    }

    /**
     * Get the name of Key Vault Secret (representing the full certificate PFX) in Key Vault.
     *
     * @return the secretName value
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the name of Key Vault Secret (representing the full certificate PFX) in Key Vault.
     *
     * @param secretName the secretName value to set
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the version(GUID) of Key Vault Secret in Key Vault.
     *
     * @return the secretVersion value
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the version(GUID) of Key Vault Secret in Key Vault.
     *
     * @param secretVersion the secretVersion value to set
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Get describes the action that shall be taken when the certificate is updated in Key Vault.
     *
     * @return the updateRule value
     */
    public String updateRule() {
        return this.updateRule;
    }

    /**
     * Set describes the action that shall be taken when the certificate is updated in Key Vault.
     *
     * @param updateRule the updateRule value to set
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withUpdateRule(String updateRule) {
        this.updateRule = updateRule;
        return this;
    }

    /**
     * Get describes the action that shall be taken when the certificate is removed from Key Vault.
     *
     * @return the deleteRule value
     */
    public String deleteRule() {
        return this.deleteRule;
    }

    /**
     * Set describes the action that shall be taken when the certificate is removed from Key Vault.
     *
     * @param deleteRule the deleteRule value to set
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withDeleteRule(String deleteRule) {
        this.deleteRule = deleteRule;
        return this;
    }

}
