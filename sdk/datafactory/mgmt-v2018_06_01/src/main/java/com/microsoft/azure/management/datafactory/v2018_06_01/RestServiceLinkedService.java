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
 * Rest Service linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = RestServiceLinkedService.class)
@JsonTypeName("RestService")
@JsonFlatten
public class RestServiceLinkedService extends LinkedServiceInner {
    /**
     * The base URL of the REST service.
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /**
     * Whether to validate server side SSL certificate when connecting to the
     * endpoint.The default value is true. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "typeProperties.enableServerCertificateValidation")
    private Object enableServerCertificateValidation;

    /**
     * Type of authentication used to connect to the REST service. Possible
     * values include: 'Anonymous', 'Basic', 'AadServicePrincipal',
     * 'ManagedServiceIdentity'.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private RestServiceAuthenticationType authenticationType;

    /**
     * The user name used in Basic authentication type.
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /**
     * The password used in Basic authentication type.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The application's client ID used in AadServicePrincipal authentication
     * type.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /**
     * The application's key used in AadServicePrincipal authentication type.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /**
     * The tenant information (domain name or tenant ID) used in
     * AadServicePrincipal authentication type under which your application
     * resides.
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
     * The resource you are requesting authorization to use.
     */
    @JsonProperty(value = "typeProperties.aadResourceId")
    private Object aadResourceId;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the base URL of the REST service.
     *
     * @return the url value
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the base URL of the REST service.
     *
     * @param url the url value to set
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableServerCertificateValidation value
     */
    public Object enableServerCertificateValidation() {
        return this.enableServerCertificateValidation;
    }

    /**
     * Set whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableServerCertificateValidation the enableServerCertificateValidation value to set
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withEnableServerCertificateValidation(Object enableServerCertificateValidation) {
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        return this;
    }

    /**
     * Get type of authentication used to connect to the REST service. Possible values include: 'Anonymous', 'Basic', 'AadServicePrincipal', 'ManagedServiceIdentity'.
     *
     * @return the authenticationType value
     */
    public RestServiceAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set type of authentication used to connect to the REST service. Possible values include: 'Anonymous', 'Basic', 'AadServicePrincipal', 'ManagedServiceIdentity'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withAuthenticationType(RestServiceAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the user name used in Basic authentication type.
     *
     * @return the userName value
     */
    public Object userName() {
        return this.userName;
    }

    /**
     * Set the user name used in Basic authentication type.
     *
     * @param userName the userName value to set
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password used in Basic authentication type.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password used in Basic authentication type.
     *
     * @param password the password value to set
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the application's client ID used in AadServicePrincipal authentication type.
     *
     * @return the servicePrincipalId value
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the application's client ID used in AadServicePrincipal authentication type.
     *
     * @param servicePrincipalId the servicePrincipalId value to set
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the application's key used in AadServicePrincipal authentication type.
     *
     * @return the servicePrincipalKey value
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the application's key used in AadServicePrincipal authentication type.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
     *
     * @return the tenant value
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
     *
     * @param tenant the tenant value to set
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withTenant(Object tenant) {
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
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the resource you are requesting authorization to use.
     *
     * @return the aadResourceId value
     */
    public Object aadResourceId() {
        return this.aadResourceId;
    }

    /**
     * Set the resource you are requesting authorization to use.
     *
     * @param aadResourceId the aadResourceId value to set
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withAadResourceId(Object aadResourceId) {
        this.aadResourceId = aadResourceId;
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
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
