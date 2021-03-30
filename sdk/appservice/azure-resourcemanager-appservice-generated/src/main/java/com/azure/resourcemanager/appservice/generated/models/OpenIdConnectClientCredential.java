// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OpenIdConnectClientCredential model. */
@JsonFlatten
@Fluent
public class OpenIdConnectClientCredential extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenIdConnectClientCredential.class);

    /*
     * The method property.
     */
    @JsonProperty(value = "properties.method")
    private ClientCredentialMethod method;

    /*
     * The clientSecretSettingName property.
     */
    @JsonProperty(value = "properties.clientSecretSettingName")
    private String clientSecretSettingName;

    /**
     * Get the method property: The method property.
     *
     * @return the method value.
     */
    public ClientCredentialMethod method() {
        return this.method;
    }

    /**
     * Set the method property: The method property.
     *
     * @param method the method value to set.
     * @return the OpenIdConnectClientCredential object itself.
     */
    public OpenIdConnectClientCredential withMethod(ClientCredentialMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the clientSecretSettingName property: The clientSecretSettingName property.
     *
     * @return the clientSecretSettingName value.
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }

    /**
     * Set the clientSecretSettingName property: The clientSecretSettingName property.
     *
     * @param clientSecretSettingName the clientSecretSettingName value to set.
     * @return the OpenIdConnectClientCredential object itself.
     */
    public OpenIdConnectClientCredential withClientSecretSettingName(String clientSecretSettingName) {
        this.clientSecretSettingName = clientSecretSettingName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OpenIdConnectClientCredential withKind(String kind) {
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
