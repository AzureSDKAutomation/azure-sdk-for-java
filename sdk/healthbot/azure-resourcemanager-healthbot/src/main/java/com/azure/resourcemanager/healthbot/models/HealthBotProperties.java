// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a Azure Health Bot. The Health Bot Service is a cloud platform that empowers developers in
 * Healthcare organizations to build and deploy their compliant, AI-powered virtual health assistants and health bots,
 * that help them improve processes and reduce costs.
 */
@Immutable
public final class HealthBotProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HealthBotProperties.class);

    /*
     * The provisioning state of the Azure Health Bot resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The link.
     */
    @JsonProperty(value = "botManagementPortalLink", access = JsonProperty.Access.WRITE_ONLY)
    private String botManagementPortalLink;

    /**
     * Get the provisioningState property: The provisioning state of the Azure Health Bot resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the botManagementPortalLink property: The link.
     *
     * @return the botManagementPortalLink value.
     */
    public String botManagementPortalLink() {
        return this.botManagementPortalLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
