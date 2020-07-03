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
 * A linked service for an SSH File Transfer Protocol (SFTP) server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SftpServerLinkedService.class)
@JsonTypeName("Sftp")
@JsonFlatten
public class SftpServerLinkedService extends LinkedServiceInner {
    /**
     * The SFTP server host name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /**
     * The TCP port number that the SFTP server uses to listen for client
     * connections. Default value is 22. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /**
     * The authentication type to be used to connect to the FTP server.
     * Possible values include: 'Basic', 'SshPublicKey'.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private SftpAuthenticationType authenticationType;

    /**
     * The username used to log on to the SFTP server. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /**
     * Password to logon the SFTP server for Basic authentication.
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
     * The SSH private key file path for SshPublicKey authentication. Only
     * valid for on-premises copy. For on-premises copy with SshPublicKey
     * authentication, either PrivateKeyPath or PrivateKeyContent should be
     * specified. SSH private key should be OpenSSH format. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.privateKeyPath")
    private Object privateKeyPath;

    /**
     * Base64 encoded SSH private key content for SshPublicKey authentication.
     * For on-premises copy with SshPublicKey authentication, either
     * PrivateKeyPath or PrivateKeyContent should be specified. SSH private key
     * should be OpenSSH format.
     */
    @JsonProperty(value = "typeProperties.privateKeyContent")
    private SecretBase privateKeyContent;

    /**
     * The password to decrypt the SSH private key if the SSH private key is
     * encrypted.
     */
    @JsonProperty(value = "typeProperties.passPhrase")
    private SecretBase passPhrase;

    /**
     * If true, skip the SSH host key validation. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.skipHostKeyValidation")
    private Object skipHostKeyValidation;

    /**
     * The host key finger-print of the SFTP server. When SkipHostKeyValidation
     * is false, HostKeyFingerprint should be specified. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.hostKeyFingerprint")
    private Object hostKeyFingerprint;

    /**
     * Get the SFTP server host name. Type: string (or Expression with resultType string).
     *
     * @return the host value
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the SFTP server host name. Type: string (or Expression with resultType string).
     *
     * @param host the host value to set
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the TCP port number that the SFTP server uses to listen for client connections. Default value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the port value
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the TCP port number that the SFTP server uses to listen for client connections. Default value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param port the port value to set
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the authentication type to be used to connect to the FTP server. Possible values include: 'Basic', 'SshPublicKey'.
     *
     * @return the authenticationType value
     */
    public SftpAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authentication type to be used to connect to the FTP server. Possible values include: 'Basic', 'SshPublicKey'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withAuthenticationType(SftpAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username used to log on to the SFTP server. Type: string (or Expression with resultType string).
     *
     * @return the userName value
     */
    public Object userName() {
        return this.userName;
    }

    /**
     * Set the username used to log on to the SFTP server. Type: string (or Expression with resultType string).
     *
     * @param userName the userName value to set
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get password to logon the SFTP server for Basic authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password to logon the SFTP server for Basic authentication.
     *
     * @param password the password value to set
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withPassword(SecretBase password) {
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
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the SSH private key file path for SshPublicKey authentication. Only valid for on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with resultType string).
     *
     * @return the privateKeyPath value
     */
    public Object privateKeyPath() {
        return this.privateKeyPath;
    }

    /**
     * Set the SSH private key file path for SshPublicKey authentication. Only valid for on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with resultType string).
     *
     * @param privateKeyPath the privateKeyPath value to set
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withPrivateKeyPath(Object privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
        return this;
    }

    /**
     * Get base64 encoded SSH private key content for SshPublicKey authentication. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format.
     *
     * @return the privateKeyContent value
     */
    public SecretBase privateKeyContent() {
        return this.privateKeyContent;
    }

    /**
     * Set base64 encoded SSH private key content for SshPublicKey authentication. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format.
     *
     * @param privateKeyContent the privateKeyContent value to set
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withPrivateKeyContent(SecretBase privateKeyContent) {
        this.privateKeyContent = privateKeyContent;
        return this;
    }

    /**
     * Get the password to decrypt the SSH private key if the SSH private key is encrypted.
     *
     * @return the passPhrase value
     */
    public SecretBase passPhrase() {
        return this.passPhrase;
    }

    /**
     * Set the password to decrypt the SSH private key if the SSH private key is encrypted.
     *
     * @param passPhrase the passPhrase value to set
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withPassPhrase(SecretBase passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }

    /**
     * Get if true, skip the SSH host key validation. Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the skipHostKeyValidation value
     */
    public Object skipHostKeyValidation() {
        return this.skipHostKeyValidation;
    }

    /**
     * Set if true, skip the SSH host key validation. Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param skipHostKeyValidation the skipHostKeyValidation value to set
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withSkipHostKeyValidation(Object skipHostKeyValidation) {
        this.skipHostKeyValidation = skipHostKeyValidation;
        return this;
    }

    /**
     * Get the host key finger-print of the SFTP server. When SkipHostKeyValidation is false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     *
     * @return the hostKeyFingerprint value
     */
    public Object hostKeyFingerprint() {
        return this.hostKeyFingerprint;
    }

    /**
     * Set the host key finger-print of the SFTP server. When SkipHostKeyValidation is false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     *
     * @param hostKeyFingerprint the hostKeyFingerprint value to set
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withHostKeyFingerprint(Object hostKeyFingerprint) {
        this.hostKeyFingerprint = hostKeyFingerprint;
        return this;
    }

}
