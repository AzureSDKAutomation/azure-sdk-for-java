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
 * Jira Service linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = JiraLinkedService.class)
@JsonTypeName("Jira")
@JsonFlatten
public class JiraLinkedService extends LinkedServiceInner {
    /**
     * The IP address or host name of the Jira service. (e.g.
     * jira.example.com).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /**
     * The TCP port that the Jira server uses to listen for client connections.
     * The default value is 443 if connecting through HTTPS, or 8080 if
     * connecting through HTTP.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /**
     * The user name that you use to access Jira Service.
     */
    @JsonProperty(value = "typeProperties.username", required = true)
    private Object username;

    /**
     * The password corresponding to the user name that you provided in the
     * username field.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     */
    @JsonProperty(value = "typeProperties.useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /**
     * Specifies whether to require the host name in the server's certificate
     * to match the host name of the server when connecting over SSL. The
     * default value is true.
     */
    @JsonProperty(value = "typeProperties.useHostVerification")
    private Object useHostVerification;

    /**
     * Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     */
    @JsonProperty(value = "typeProperties.usePeerVerification")
    private Object usePeerVerification;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the IP address or host name of the Jira service. (e.g. jira.example.com).
     *
     * @return the host value
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the IP address or host name of the Jira service. (e.g. jira.example.com).
     *
     * @param host the host value to set
     * @return the JiraLinkedService object itself.
     */
    public JiraLinkedService withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the TCP port that the Jira server uses to listen for client connections. The default value is 443 if connecting through HTTPS, or 8080 if connecting through HTTP.
     *
     * @return the port value
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the TCP port that the Jira server uses to listen for client connections. The default value is 443 if connecting through HTTPS, or 8080 if connecting through HTTP.
     *
     * @param port the port value to set
     * @return the JiraLinkedService object itself.
     */
    public JiraLinkedService withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the user name that you use to access Jira Service.
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the user name that you use to access Jira Service.
     *
     * @param username the username value to set
     * @return the JiraLinkedService object itself.
     */
    public JiraLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password corresponding to the user name that you provided in the username field.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password corresponding to the user name that you provided in the username field.
     *
     * @param password the password value to set
     * @return the JiraLinkedService object itself.
     */
    public JiraLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @return the useEncryptedEndpoints value
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set
     * @return the JiraLinkedService object itself.
     */
    public JiraLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set
     * @return the JiraLinkedService object itself.
     */
    public JiraLinkedService withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @return the usePeerVerification value
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set
     * @return the JiraLinkedService object itself.
     */
    public JiraLinkedService withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
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
     * @return the JiraLinkedService object itself.
     */
    public JiraLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
