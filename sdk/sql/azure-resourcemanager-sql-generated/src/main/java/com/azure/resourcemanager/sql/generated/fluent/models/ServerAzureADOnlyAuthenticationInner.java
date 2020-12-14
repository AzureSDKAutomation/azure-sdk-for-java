// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Active Directory only authentication. */
@JsonFlatten
@Fluent
public class ServerAzureADOnlyAuthenticationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerAzureADOnlyAuthenticationInner.class);

    /*
     * Azure Active Directory only Authentication enabled.
     */
    @JsonProperty(value = "properties.azureADOnlyAuthentication")
    private Boolean azureADOnlyAuthentication;

    /**
     * Get the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @return the azureADOnlyAuthentication value.
     */
    public Boolean azureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }

    /**
     * Set the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @param azureADOnlyAuthentication the azureADOnlyAuthentication value to set.
     * @return the ServerAzureADOnlyAuthenticationInner object itself.
     */
    public ServerAzureADOnlyAuthenticationInner withAzureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
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
