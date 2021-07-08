// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the Azure Active Directory app registration. */
@JsonFlatten
@Fluent
public class AzureActiveDirectoryRegistration extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureActiveDirectoryRegistration.class);

    /*
     * The OpenID Connect Issuer URI that represents the entity which issues
     * access tokens for this application.
     * When using Azure Active Directory, this value is the URI of the
     * directory tenant, e.g.
     * https://login.microsoftonline.com/v2.0/{tenant-guid}/.
     * This URI is a case-sensitive identifier for the token issuer.
     * More information on OpenID Connect Discovery:
     * http://openid.net/specs/openid-connect-discovery-1_0.html
     */
    @JsonProperty(value = "properties.openIdIssuer")
    private String openIdIssuer;

    /*
     * The Client ID of this relying party application, known as the client_id.
     * This setting is required for enabling OpenID Connection authentication
     * with Azure Active Directory or
     * other 3rd party OpenID Connect providers.
     * More information on OpenID Connect:
     * http://openid.net/specs/openid-connect-core-1_0.html
     */
    @JsonProperty(value = "properties.clientId")
    private String clientId;

    /*
     * The app setting name that contains the client secret of the relying
     * party application.
     */
    @JsonProperty(value = "properties.clientSecretSettingName")
    private String clientSecretSettingName;

    /*
     * An alternative to the client secret, that is the thumbprint of a
     * certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret. It is also optional.
     */
    @JsonProperty(value = "properties.clientSecretCertificateThumbprint")
    private String clientSecretCertificateThumbprint;

    /**
     * Get the openIdIssuer property: The OpenID Connect Issuer URI that represents the entity which issues access
     * tokens for this application. When using Azure Active Directory, this value is the URI of the directory tenant,
     * e.g. https://login.microsoftonline.com/v2.0/{tenant-guid}/. This URI is a case-sensitive identifier for the token
     * issuer. More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html.
     *
     * @return the openIdIssuer value.
     */
    public String openIdIssuer() {
        return this.openIdIssuer;
    }

    /**
     * Set the openIdIssuer property: The OpenID Connect Issuer URI that represents the entity which issues access
     * tokens for this application. When using Azure Active Directory, this value is the URI of the directory tenant,
     * e.g. https://login.microsoftonline.com/v2.0/{tenant-guid}/. This URI is a case-sensitive identifier for the token
     * issuer. More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html.
     *
     * @param openIdIssuer the openIdIssuer value to set.
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withOpenIdIssuer(String openIdIssuer) {
        this.openIdIssuer = openIdIssuer;
        return this;
    }

    /**
     * Get the clientId property: The Client ID of this relying party application, known as the client_id. This setting
     * is required for enabling OpenID Connection authentication with Azure Active Directory or other 3rd party OpenID
     * Connect providers. More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The Client ID of this relying party application, known as the client_id. This setting
     * is required for enabling OpenID Connection authentication with Azure Active Directory or other 3rd party OpenID
     * Connect providers. More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html.
     *
     * @param clientId the clientId value to set.
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecretSettingName property: The app setting name that contains the client secret of the relying
     * party application.
     *
     * @return the clientSecretSettingName value.
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }

    /**
     * Set the clientSecretSettingName property: The app setting name that contains the client secret of the relying
     * party application.
     *
     * @param clientSecretSettingName the clientSecretSettingName value to set.
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withClientSecretSettingName(String clientSecretSettingName) {
        this.clientSecretSettingName = clientSecretSettingName;
        return this;
    }

    /**
     * Get the clientSecretCertificateThumbprint property: An alternative to the client secret, that is the thumbprint
     * of a certificate used for signing purposes. This property acts as a replacement for the Client Secret. It is also
     * optional.
     *
     * @return the clientSecretCertificateThumbprint value.
     */
    public String clientSecretCertificateThumbprint() {
        return this.clientSecretCertificateThumbprint;
    }

    /**
     * Set the clientSecretCertificateThumbprint property: An alternative to the client secret, that is the thumbprint
     * of a certificate used for signing purposes. This property acts as a replacement for the Client Secret. It is also
     * optional.
     *
     * @param clientSecretCertificateThumbprint the clientSecretCertificateThumbprint value to set.
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withClientSecretCertificateThumbprint(
        String clientSecretCertificateThumbprint) {
        this.clientSecretCertificateThumbprint = clientSecretCertificateThumbprint;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureActiveDirectoryRegistration withKind(String kind) {
        super.withKind(kind);
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
    }
}
