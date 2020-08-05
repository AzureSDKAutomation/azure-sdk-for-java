/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Azure Data Lake Storage Gen2 linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzureBlobFSLinkedService.class)
@JsonTypeName("AzureBlobFS")
@JsonFlatten
public class AzureBlobFSLinkedService extends LinkedServiceInner {
    /**
     * Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /**
     * Account key for the Azure Data Lake Storage Gen2 service. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.accountKey")
    private Object accountKey;

    /**
     * The ID of the application used to authenticate against the Azure Data
     * Lake Storage Gen2 account. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /**
     * The Key of the application used to authenticate against the Azure Data
     * Lake Storage Gen2 account.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /**
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed
     * values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany.
     * Default value is the data factory regions’ cloud type. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.azureCloudType")
    private Object azureCloudType;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     *
     * @return the url value
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get account key for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     *
     * @return the accountKey value
     */
    public Object accountKey() {
        return this.accountKey;
    }

    /**
     * Set account key for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     *
     * @param accountKey the accountKey value to set
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withAccountKey(Object accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the ID of the application used to authenticate against the Azure Data Lake Storage Gen2 account. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the ID of the application used to authenticate against the Azure Data Lake Storage Gen2 account. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the Key of the application used to authenticate against the Azure Data Lake Storage Gen2 account.
     *
     * @return the servicePrincipalKey value
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the Key of the application used to authenticate against the Azure Data Lake Storage Gen2 account.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     *
     * @return the tenant value
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     *
     * @param tenant the tenant value to set
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     *
     * @return the azureCloudType value
     */
    public Object azureCloudType() {
        return this.azureCloudType;
    }

    /**
     * Set indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     *
     * @param azureCloudType the azureCloudType value to set
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the AzureBlobFSLinkedService object itself.
     */
    public AzureBlobFSLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
