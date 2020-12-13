// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Client Certificate definition. */
@Fluent
public final class ClientCertificate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClientCertificate.class);

    /*
     * Whether the certificate is admin or not.
     */
    @JsonProperty(value = "isAdmin", required = true)
    private boolean isAdmin;

    /*
     * Certificate Thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * Certificate Common name.
     */
    @JsonProperty(value = "commonName")
    private String commonName;

    /*
     * Issuer thumbprint for the certificate. Only used together with
     * CommonName.
     */
    @JsonProperty(value = "issuerThumbprint")
    private String issuerThumbprint;

    /**
     * Get the isAdmin property: Whether the certificate is admin or not.
     *
     * @return the isAdmin value.
     */
    public boolean isAdmin() {
        return this.isAdmin;
    }

    /**
     * Set the isAdmin property: Whether the certificate is admin or not.
     *
     * @param isAdmin the isAdmin value to set.
     * @return the ClientCertificate object itself.
     */
    public ClientCertificate withIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate Thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: Certificate Thumbprint.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the ClientCertificate object itself.
     */
    public ClientCertificate withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the commonName property: Certificate Common name.
     *
     * @return the commonName value.
     */
    public String commonName() {
        return this.commonName;
    }

    /**
     * Set the commonName property: Certificate Common name.
     *
     * @param commonName the commonName value to set.
     * @return the ClientCertificate object itself.
     */
    public ClientCertificate withCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * Get the issuerThumbprint property: Issuer thumbprint for the certificate. Only used together with CommonName.
     *
     * @return the issuerThumbprint value.
     */
    public String issuerThumbprint() {
        return this.issuerThumbprint;
    }

    /**
     * Set the issuerThumbprint property: Issuer thumbprint for the certificate. Only used together with CommonName.
     *
     * @param issuerThumbprint the issuerThumbprint value to set.
     * @return the ClientCertificate object itself.
     */
    public ClientCertificate withIssuerThumbprint(String issuerThumbprint) {
        this.issuerThumbprint = issuerThumbprint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
