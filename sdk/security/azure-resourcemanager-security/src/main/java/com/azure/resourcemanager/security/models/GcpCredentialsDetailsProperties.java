// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GCP cloud account connector based service to service credentials, the credentials are composed of the organization ID
 * and a JSON API key (write only).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authenticationType")
@JsonTypeName("gcpCredentials")
@Fluent
public final class GcpCredentialsDetailsProperties extends AuthenticationDetailsProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GcpCredentialsDetailsProperties.class);

    /*
     * The organization ID of the GCP cloud account
     */
    @JsonProperty(value = "organizationId", required = true)
    private String organizationId;

    /*
     * Type field of the API key (write only)
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * Project ID field of the API key (write only)
     */
    @JsonProperty(value = "projectId", required = true)
    private String projectId;

    /*
     * Private key ID field of the API key (write only)
     */
    @JsonProperty(value = "privateKeyId", required = true)
    private String privateKeyId;

    /*
     * Private key field of the API key (write only)
     */
    @JsonProperty(value = "privateKey", required = true)
    private String privateKey;

    /*
     * Client email field of the API key (write only)
     */
    @JsonProperty(value = "clientEmail", required = true)
    private String clientEmail;

    /*
     * Client ID field of the API key (write only)
     */
    @JsonProperty(value = "clientId", required = true)
    private String clientId;

    /*
     * Auth URI field of the API key (write only)
     */
    @JsonProperty(value = "authUri", required = true)
    private String authUri;

    /*
     * Token URI field of the API key (write only)
     */
    @JsonProperty(value = "tokenUri", required = true)
    private String tokenUri;

    /*
     * Auth provider x509 certificate URL field of the API key (write only)
     */
    @JsonProperty(value = "authProviderX509CertUrl", required = true)
    private String authProviderX509CertUrl;

    /*
     * Client x509 certificate URL field of the API key (write only)
     */
    @JsonProperty(value = "clientX509CertUrl", required = true)
    private String clientX509CertUrl;

    /**
     * Get the organizationId property: The organization ID of the GCP cloud account.
     *
     * @return the organizationId value.
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * Set the organizationId property: The organization ID of the GCP cloud account.
     *
     * @param organizationId the organizationId value to set.
     * @return the GcpCredentialsDetailsProperties object itself.
     */
    public GcpCredentialsDetailsProperties withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Get the type property: Type field of the API key (write only).
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type field of the API key (write only).
     *
     * @param type the type value to set.
     * @return the GcpCredentialsDetailsProperties object itself.
     */
    public GcpCredentialsDetailsProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the projectId property: Project ID field of the API key (write only).
     *
     * @return the projectId value.
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * Set the projectId property: Project ID field of the API key (write only).
     *
     * @param projectId the projectId value to set.
     * @return the GcpCredentialsDetailsProperties object itself.
     */
    public GcpCredentialsDetailsProperties withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get the privateKeyId property: Private key ID field of the API key (write only).
     *
     * @return the privateKeyId value.
     */
    public String privateKeyId() {
        return this.privateKeyId;
    }

    /**
     * Set the privateKeyId property: Private key ID field of the API key (write only).
     *
     * @param privateKeyId the privateKeyId value to set.
     * @return the GcpCredentialsDetailsProperties object itself.
     */
    public GcpCredentialsDetailsProperties withPrivateKeyId(String privateKeyId) {
        this.privateKeyId = privateKeyId;
        return this;
    }

    /**
     * Get the privateKey property: Private key field of the API key (write only).
     *
     * @return the privateKey value.
     */
    public String privateKey() {
        return this.privateKey;
    }

    /**
     * Set the privateKey property: Private key field of the API key (write only).
     *
     * @param privateKey the privateKey value to set.
     * @return the GcpCredentialsDetailsProperties object itself.
     */
    public GcpCredentialsDetailsProperties withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Get the clientEmail property: Client email field of the API key (write only).
     *
     * @return the clientEmail value.
     */
    public String clientEmail() {
        return this.clientEmail;
    }

    /**
     * Set the clientEmail property: Client email field of the API key (write only).
     *
     * @param clientEmail the clientEmail value to set.
     * @return the GcpCredentialsDetailsProperties object itself.
     */
    public GcpCredentialsDetailsProperties withClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
        return this;
    }

    /**
     * Get the clientId property: Client ID field of the API key (write only).
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Client ID field of the API key (write only).
     *
     * @param clientId the clientId value to set.
     * @return the GcpCredentialsDetailsProperties object itself.
     */
    public GcpCredentialsDetailsProperties withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the authUri property: Auth URI field of the API key (write only).
     *
     * @return the authUri value.
     */
    public String authUri() {
        return this.authUri;
    }

    /**
     * Set the authUri property: Auth URI field of the API key (write only).
     *
     * @param authUri the authUri value to set.
     * @return the GcpCredentialsDetailsProperties object itself.
     */
    public GcpCredentialsDetailsProperties withAuthUri(String authUri) {
        this.authUri = authUri;
        return this;
    }

    /**
     * Get the tokenUri property: Token URI field of the API key (write only).
     *
     * @return the tokenUri value.
     */
    public String tokenUri() {
        return this.tokenUri;
    }

    /**
     * Set the tokenUri property: Token URI field of the API key (write only).
     *
     * @param tokenUri the tokenUri value to set.
     * @return the GcpCredentialsDetailsProperties object itself.
     */
    public GcpCredentialsDetailsProperties withTokenUri(String tokenUri) {
        this.tokenUri = tokenUri;
        return this;
    }

    /**
     * Get the authProviderX509CertUrl property: Auth provider x509 certificate URL field of the API key (write only).
     *
     * @return the authProviderX509CertUrl value.
     */
    public String authProviderX509CertUrl() {
        return this.authProviderX509CertUrl;
    }

    /**
     * Set the authProviderX509CertUrl property: Auth provider x509 certificate URL field of the API key (write only).
     *
     * @param authProviderX509CertUrl the authProviderX509CertUrl value to set.
     * @return the GcpCredentialsDetailsProperties object itself.
     */
    public GcpCredentialsDetailsProperties withAuthProviderX509CertUrl(String authProviderX509CertUrl) {
        this.authProviderX509CertUrl = authProviderX509CertUrl;
        return this;
    }

    /**
     * Get the clientX509CertUrl property: Client x509 certificate URL field of the API key (write only).
     *
     * @return the clientX509CertUrl value.
     */
    public String clientX509CertUrl() {
        return this.clientX509CertUrl;
    }

    /**
     * Set the clientX509CertUrl property: Client x509 certificate URL field of the API key (write only).
     *
     * @param clientX509CertUrl the clientX509CertUrl value to set.
     * @return the GcpCredentialsDetailsProperties object itself.
     */
    public GcpCredentialsDetailsProperties withClientX509CertUrl(String clientX509CertUrl) {
        this.clientX509CertUrl = clientX509CertUrl;
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
        if (organizationId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property organizationId in model GcpCredentialsDetailsProperties"));
        }
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property type in model GcpCredentialsDetailsProperties"));
        }
        if (projectId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property projectId in model GcpCredentialsDetailsProperties"));
        }
        if (privateKeyId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property privateKeyId in model GcpCredentialsDetailsProperties"));
        }
        if (privateKey() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property privateKey in model GcpCredentialsDetailsProperties"));
        }
        if (clientEmail() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clientEmail in model GcpCredentialsDetailsProperties"));
        }
        if (clientId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clientId in model GcpCredentialsDetailsProperties"));
        }
        if (authUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authUri in model GcpCredentialsDetailsProperties"));
        }
        if (tokenUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property tokenUri in model GcpCredentialsDetailsProperties"));
        }
        if (authProviderX509CertUrl() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authProviderX509CertUrl in model GcpCredentialsDetailsProperties"));
        }
        if (clientX509CertUrl() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clientX509CertUrl in model GcpCredentialsDetailsProperties"));
        }
    }
}
