/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * SAP Business Warehouse Linked Service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SapBWLinkedService.class)
@JsonTypeName("SapBW")
@JsonFlatten
public class SapBWLinkedService extends LinkedServiceInner {
    /**
     * Host name of the SAP BW instance. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /**
     * System number of the BW system. (Usually a two-digit decimal number
     * represented as a string.) Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.systemNumber", required = true)
    private Object systemNumber;

    /**
     * Client ID of the client on the BW system. (Usually a three-digit decimal
     * number represented as a string) Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.clientId", required = true)
    private Object clientId;

    /**
     * Username to access the SAP BW server. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /**
     * Password to access the SAP BW server.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get host name of the SAP BW instance. Type: string (or Expression with resultType string).
     *
     * @return the server value
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set host name of the SAP BW instance. Type: string (or Expression with resultType string).
     *
     * @param server the server value to set
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get system number of the BW system. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     *
     * @return the systemNumber value
     */
    public Object systemNumber() {
        return this.systemNumber;
    }

    /**
     * Set system number of the BW system. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     *
     * @param systemNumber the systemNumber value to set
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withSystemNumber(Object systemNumber) {
        this.systemNumber = systemNumber;
        return this;
    }

    /**
     * Get client ID of the client on the BW system. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     *
     * @return the clientId value
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set client ID of the client on the BW system. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     *
     * @param clientId the clientId value to set
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get username to access the SAP BW server. Type: string (or Expression with resultType string).
     *
     * @return the userName value
     */
    public Object userName() {
        return this.userName;
    }

    /**
     * Set username to access the SAP BW server. Type: string (or Expression with resultType string).
     *
     * @param userName the userName value to set
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get password to access the SAP BW server.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password to access the SAP BW server.
     *
     * @param password the password value to set
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withPassword(SecretBase password) {
        this.password = password;
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
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
