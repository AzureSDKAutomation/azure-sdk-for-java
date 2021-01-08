// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The ManagedIdentity model. */
@Fluent
public class ManagedIdentity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedIdentity.class);

    /*
     * The type property.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The systemIdentityUrl property.
     */
    @JsonProperty(value = "systemIdentityUrl")
    private String systemIdentityUrl;

    /*
     * The principalId property.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * The tenantId property.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The clientId property.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * The clientSecretUrl property.
     */
    @JsonProperty(value = "clientSecretUrl")
    private String clientSecretUrl;

    /*
     * Dictionary of <UserAssignedIdentity>
     */
    @JsonProperty(value = "userAssignedIdentities")
    private Map<String, UserAssignedIdentity> userAssignedIdentities;

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the systemIdentityUrl property: The systemIdentityUrl property.
     *
     * @return the systemIdentityUrl value.
     */
    public String systemIdentityUrl() {
        return this.systemIdentityUrl;
    }

    /**
     * Set the systemIdentityUrl property: The systemIdentityUrl property.
     *
     * @param systemIdentityUrl the systemIdentityUrl value to set.
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity withSystemIdentityUrl(String systemIdentityUrl) {
        this.systemIdentityUrl = systemIdentityUrl;
        return this;
    }

    /**
     * Get the principalId property: The principalId property.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principalId property.
     *
     * @param principalId the principalId value to set.
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the tenantId property: The tenantId property.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenantId property.
     *
     * @param tenantId the tenantId value to set.
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the clientId property: The clientId property.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The clientId property.
     *
     * @param clientId the clientId value to set.
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecretUrl property: The clientSecretUrl property.
     *
     * @return the clientSecretUrl value.
     */
    public String clientSecretUrl() {
        return this.clientSecretUrl;
    }

    /**
     * Set the clientSecretUrl property: The clientSecretUrl property.
     *
     * @param clientSecretUrl the clientSecretUrl value to set.
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity withClientSecretUrl(String clientSecretUrl) {
        this.clientSecretUrl = clientSecretUrl;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: Dictionary of &lt;UserAssignedIdentity&gt;.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: Dictionary of &lt;UserAssignedIdentity&gt;.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity withUserAssignedIdentities(Map<String, UserAssignedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
