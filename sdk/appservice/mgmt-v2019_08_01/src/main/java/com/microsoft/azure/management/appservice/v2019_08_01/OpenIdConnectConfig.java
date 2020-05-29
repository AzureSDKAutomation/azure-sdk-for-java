/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The OpenIdConnectConfig model.
 */
@JsonFlatten
public class OpenIdConnectConfig extends ProxyOnlyResource {
    /**
     * The authorizationEndpoint property.
     */
    @JsonProperty(value = "properties.authorizationEndpoint")
    private String authorizationEndpoint;

    /**
     * The tokenEndpoint property.
     */
    @JsonProperty(value = "properties.tokenEndpoint")
    private String tokenEndpoint;

    /**
     * The issuer property.
     */
    @JsonProperty(value = "properties.issuer")
    private String issuer;

    /**
     * The certificationUri property.
     */
    @JsonProperty(value = "properties.certificationUri")
    private String certificationUri;

    /**
     * The wellKnownOpenIdConfiguration property.
     */
    @JsonProperty(value = "properties.wellKnownOpenIdConfiguration")
    private String wellKnownOpenIdConfiguration;

    /**
     * Get the authorizationEndpoint value.
     *
     * @return the authorizationEndpoint value
     */
    public String authorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * Set the authorizationEndpoint value.
     *
     * @param authorizationEndpoint the authorizationEndpoint value to set
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    /**
     * Get the tokenEndpoint value.
     *
     * @return the tokenEndpoint value
     */
    public String tokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * Set the tokenEndpoint value.
     *
     * @param tokenEndpoint the tokenEndpoint value to set
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    /**
     * Get the issuer value.
     *
     * @return the issuer value
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Set the issuer value.
     *
     * @param issuer the issuer value to set
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get the certificationUri value.
     *
     * @return the certificationUri value
     */
    public String certificationUri() {
        return this.certificationUri;
    }

    /**
     * Set the certificationUri value.
     *
     * @param certificationUri the certificationUri value to set
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withCertificationUri(String certificationUri) {
        this.certificationUri = certificationUri;
        return this;
    }

    /**
     * Get the wellKnownOpenIdConfiguration value.
     *
     * @return the wellKnownOpenIdConfiguration value
     */
    public String wellKnownOpenIdConfiguration() {
        return this.wellKnownOpenIdConfiguration;
    }

    /**
     * Set the wellKnownOpenIdConfiguration value.
     *
     * @param wellKnownOpenIdConfiguration the wellKnownOpenIdConfiguration value to set
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withWellKnownOpenIdConfiguration(String wellKnownOpenIdConfiguration) {
        this.wellKnownOpenIdConfiguration = wellKnownOpenIdConfiguration;
        return this;
    }

}
