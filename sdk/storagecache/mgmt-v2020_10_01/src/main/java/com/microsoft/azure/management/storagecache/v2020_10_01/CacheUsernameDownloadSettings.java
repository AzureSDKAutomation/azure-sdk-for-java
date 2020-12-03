/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings for Extended Groups username and group download.
 */
public class CacheUsernameDownloadSettings {
    /**
     * Whether or not Extended Groups is enabled.
     */
    @JsonProperty(value = "extendedGroupsEnabled")
    private Boolean extendedGroupsEnabled;

    /**
     * This setting determines how the cache gets username and group names for
     * clients. Possible values include: 'AD', 'LDAP', 'File', 'None'.
     */
    @JsonProperty(value = "usernameSource")
    private UsernameSource usernameSource;

    /**
     * The URI of the file containing group information (in /etc/group file
     * format). This field must be populated when 'usernameSource' is set to
     * 'File'.
     */
    @JsonProperty(value = "groupFileURI")
    private String groupFileURI;

    /**
     * The URI of the file containing user information (in /etc/passwd file
     * format). This field must be populated when 'usernameSource' is set to
     * 'File'.
     */
    @JsonProperty(value = "userFileURI")
    private String userFileURI;

    /**
     * The fully qualified domain name or IP address of the LDAP server to use.
     */
    @JsonProperty(value = "ldapServer")
    private String ldapServer;

    /**
     * The base distinguished name for the LDAP domain.
     */
    @JsonProperty(value = "ldapBaseDn")
    private String ldapBaseDn;

    /**
     * Whether or not the LDAP connection should be encrypted.
     */
    @JsonProperty(value = "encryptLdapConnection")
    private Boolean encryptLdapConnection;

    /**
     * Determines if the certificates must be validated by a certificate
     * authority. When true, caCertificateURI must be provided.
     */
    @JsonProperty(value = "requireValidCertificate")
    private Boolean requireValidCertificate;

    /**
     * Determines if the certificate should be automatically downloaded. This
     * applies to 'caCertificateURI' only if 'requireValidCertificate' is true.
     */
    @JsonProperty(value = "autoDownloadCertificate")
    private Boolean autoDownloadCertificate;

    /**
     * The URI of the CA certificate to validate the LDAP secure connection.
     * This field must be populated when 'requireValidCertificate' is set to
     * true.
     */
    @JsonProperty(value = "caCertificateURI")
    private String caCertificateURI;

    /**
     * Indicates whether or not the HPC Cache has performed the username
     * download successfully. Possible values include: 'Yes', 'No', 'Error'.
     */
    @JsonProperty(value = "usernameDownloaded", access = JsonProperty.Access.WRITE_ONLY)
    private UsernameDownloadedType usernameDownloaded;

    /**
     * When present, these are the credentials for the secure LDAP connection.
     */
    @JsonProperty(value = "credentials")
    private CacheUsernameDownloadSettingsCredentials credentials;

    /**
     * Get whether or not Extended Groups is enabled.
     *
     * @return the extendedGroupsEnabled value
     */
    public Boolean extendedGroupsEnabled() {
        return this.extendedGroupsEnabled;
    }

    /**
     * Set whether or not Extended Groups is enabled.
     *
     * @param extendedGroupsEnabled the extendedGroupsEnabled value to set
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withExtendedGroupsEnabled(Boolean extendedGroupsEnabled) {
        this.extendedGroupsEnabled = extendedGroupsEnabled;
        return this;
    }

    /**
     * Get this setting determines how the cache gets username and group names for clients. Possible values include: 'AD', 'LDAP', 'File', 'None'.
     *
     * @return the usernameSource value
     */
    public UsernameSource usernameSource() {
        return this.usernameSource;
    }

    /**
     * Set this setting determines how the cache gets username and group names for clients. Possible values include: 'AD', 'LDAP', 'File', 'None'.
     *
     * @param usernameSource the usernameSource value to set
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withUsernameSource(UsernameSource usernameSource) {
        this.usernameSource = usernameSource;
        return this;
    }

    /**
     * Get the URI of the file containing group information (in /etc/group file format). This field must be populated when 'usernameSource' is set to 'File'.
     *
     * @return the groupFileURI value
     */
    public String groupFileURI() {
        return this.groupFileURI;
    }

    /**
     * Set the URI of the file containing group information (in /etc/group file format). This field must be populated when 'usernameSource' is set to 'File'.
     *
     * @param groupFileURI the groupFileURI value to set
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withGroupFileURI(String groupFileURI) {
        this.groupFileURI = groupFileURI;
        return this;
    }

    /**
     * Get the URI of the file containing user information (in /etc/passwd file format). This field must be populated when 'usernameSource' is set to 'File'.
     *
     * @return the userFileURI value
     */
    public String userFileURI() {
        return this.userFileURI;
    }

    /**
     * Set the URI of the file containing user information (in /etc/passwd file format). This field must be populated when 'usernameSource' is set to 'File'.
     *
     * @param userFileURI the userFileURI value to set
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withUserFileURI(String userFileURI) {
        this.userFileURI = userFileURI;
        return this;
    }

    /**
     * Get the fully qualified domain name or IP address of the LDAP server to use.
     *
     * @return the ldapServer value
     */
    public String ldapServer() {
        return this.ldapServer;
    }

    /**
     * Set the fully qualified domain name or IP address of the LDAP server to use.
     *
     * @param ldapServer the ldapServer value to set
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withLdapServer(String ldapServer) {
        this.ldapServer = ldapServer;
        return this;
    }

    /**
     * Get the base distinguished name for the LDAP domain.
     *
     * @return the ldapBaseDn value
     */
    public String ldapBaseDn() {
        return this.ldapBaseDn;
    }

    /**
     * Set the base distinguished name for the LDAP domain.
     *
     * @param ldapBaseDn the ldapBaseDn value to set
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withLdapBaseDn(String ldapBaseDn) {
        this.ldapBaseDn = ldapBaseDn;
        return this;
    }

    /**
     * Get whether or not the LDAP connection should be encrypted.
     *
     * @return the encryptLdapConnection value
     */
    public Boolean encryptLdapConnection() {
        return this.encryptLdapConnection;
    }

    /**
     * Set whether or not the LDAP connection should be encrypted.
     *
     * @param encryptLdapConnection the encryptLdapConnection value to set
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withEncryptLdapConnection(Boolean encryptLdapConnection) {
        this.encryptLdapConnection = encryptLdapConnection;
        return this;
    }

    /**
     * Get determines if the certificates must be validated by a certificate authority. When true, caCertificateURI must be provided.
     *
     * @return the requireValidCertificate value
     */
    public Boolean requireValidCertificate() {
        return this.requireValidCertificate;
    }

    /**
     * Set determines if the certificates must be validated by a certificate authority. When true, caCertificateURI must be provided.
     *
     * @param requireValidCertificate the requireValidCertificate value to set
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withRequireValidCertificate(Boolean requireValidCertificate) {
        this.requireValidCertificate = requireValidCertificate;
        return this;
    }

    /**
     * Get determines if the certificate should be automatically downloaded. This applies to 'caCertificateURI' only if 'requireValidCertificate' is true.
     *
     * @return the autoDownloadCertificate value
     */
    public Boolean autoDownloadCertificate() {
        return this.autoDownloadCertificate;
    }

    /**
     * Set determines if the certificate should be automatically downloaded. This applies to 'caCertificateURI' only if 'requireValidCertificate' is true.
     *
     * @param autoDownloadCertificate the autoDownloadCertificate value to set
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withAutoDownloadCertificate(Boolean autoDownloadCertificate) {
        this.autoDownloadCertificate = autoDownloadCertificate;
        return this;
    }

    /**
     * Get the URI of the CA certificate to validate the LDAP secure connection. This field must be populated when 'requireValidCertificate' is set to true.
     *
     * @return the caCertificateURI value
     */
    public String caCertificateURI() {
        return this.caCertificateURI;
    }

    /**
     * Set the URI of the CA certificate to validate the LDAP secure connection. This field must be populated when 'requireValidCertificate' is set to true.
     *
     * @param caCertificateURI the caCertificateURI value to set
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withCaCertificateURI(String caCertificateURI) {
        this.caCertificateURI = caCertificateURI;
        return this;
    }

    /**
     * Get indicates whether or not the HPC Cache has performed the username download successfully. Possible values include: 'Yes', 'No', 'Error'.
     *
     * @return the usernameDownloaded value
     */
    public UsernameDownloadedType usernameDownloaded() {
        return this.usernameDownloaded;
    }

    /**
     * Get when present, these are the credentials for the secure LDAP connection.
     *
     * @return the credentials value
     */
    public CacheUsernameDownloadSettingsCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set when present, these are the credentials for the secure LDAP connection.
     *
     * @param credentials the credentials value to set
     * @return the CacheUsernameDownloadSettings object itself.
     */
    public CacheUsernameDownloadSettings withCredentials(CacheUsernameDownloadSettingsCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

}
