// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.connectedvmware.models.GuestCredential;
import com.azure.resourcemanager.connectedvmware.models.ProvisioningAction;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the GuestAgent. */
@JsonFlatten
@Fluent
public class GuestAgentInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GuestAgentInner.class);

    /*
     * The system data.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Username / Password Credentials to provision guest agent.
     */
    @JsonProperty(value = "properties.credentials")
    private GuestCredential credentials;

    /*
     * Gets or sets the guest agent provisioning action.
     */
    @JsonProperty(value = "properties.provisioningAction")
    private ProvisioningAction provisioningAction;

    /*
     * Gets or sets the guest agent status.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * Gets or sets the provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the systemData property: The system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the credentials property: Username / Password Credentials to provision guest agent.
     *
     * @return the credentials value.
     */
    public GuestCredential credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: Username / Password Credentials to provision guest agent.
     *
     * @param credentials the credentials value to set.
     * @return the GuestAgentInner object itself.
     */
    public GuestAgentInner withCredentials(GuestCredential credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the provisioningAction property: Gets or sets the guest agent provisioning action.
     *
     * @return the provisioningAction value.
     */
    public ProvisioningAction provisioningAction() {
        return this.provisioningAction;
    }

    /**
     * Set the provisioningAction property: Gets or sets the guest agent provisioning action.
     *
     * @param provisioningAction the provisioningAction value to set.
     * @return the GuestAgentInner object itself.
     */
    public GuestAgentInner withProvisioningAction(ProvisioningAction provisioningAction) {
        this.provisioningAction = provisioningAction;
        return this;
    }

    /**
     * Get the status property: Gets or sets the guest agent status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the provisioningState property: Gets or sets the provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credentials() != null) {
            credentials().validate();
        }
    }
}
