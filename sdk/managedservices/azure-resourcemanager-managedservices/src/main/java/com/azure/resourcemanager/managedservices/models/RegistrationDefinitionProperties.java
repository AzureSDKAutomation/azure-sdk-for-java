// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a registration definition. */
@Fluent
public final class RegistrationDefinitionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistrationDefinitionProperties.class);

    /*
     * Description of the registration definition.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Authorization tuple containing principal id of the user/security group
     * or service principal and id of the build-in role.
     */
    @JsonProperty(value = "authorizations", required = true)
    private List<Authorization> authorizations;

    /*
     * Eligible PIM authorization tuple containing principal id of the
     * user/security group or service principal, id of the built-in role, and
     * just-in-time access policy setting
     */
    @JsonProperty(value = "eligibleAuthorizations")
    private List<EligibleAuthorization> eligibleAuthorizations;

    /*
     * Name of the registration definition.
     */
    @JsonProperty(value = "registrationDefinitionName")
    private String registrationDefinitionName;

    /*
     * Id of the managedBy tenant.
     */
    @JsonProperty(value = "managedByTenantId", required = true)
    private String managedByTenantId;

    /*
     * Current state of the registration definition.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Name of the managedBy tenant.
     */
    @JsonProperty(value = "managedByTenantName", access = JsonProperty.Access.WRITE_ONLY)
    private String managedByTenantName;

    /**
     * Get the description property: Description of the registration definition.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the registration definition.
     *
     * @param description the description value to set.
     * @return the RegistrationDefinitionProperties object itself.
     */
    public RegistrationDefinitionProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the authorizations property: Authorization tuple containing principal id of the user/security group or
     * service principal and id of the build-in role.
     *
     * @return the authorizations value.
     */
    public List<Authorization> authorizations() {
        return this.authorizations;
    }

    /**
     * Set the authorizations property: Authorization tuple containing principal id of the user/security group or
     * service principal and id of the build-in role.
     *
     * @param authorizations the authorizations value to set.
     * @return the RegistrationDefinitionProperties object itself.
     */
    public RegistrationDefinitionProperties withAuthorizations(List<Authorization> authorizations) {
        this.authorizations = authorizations;
        return this;
    }

    /**
     * Get the eligibleAuthorizations property: Eligible PIM authorization tuple containing principal id of the
     * user/security group or service principal, id of the built-in role, and just-in-time access policy setting.
     *
     * @return the eligibleAuthorizations value.
     */
    public List<EligibleAuthorization> eligibleAuthorizations() {
        return this.eligibleAuthorizations;
    }

    /**
     * Set the eligibleAuthorizations property: Eligible PIM authorization tuple containing principal id of the
     * user/security group or service principal, id of the built-in role, and just-in-time access policy setting.
     *
     * @param eligibleAuthorizations the eligibleAuthorizations value to set.
     * @return the RegistrationDefinitionProperties object itself.
     */
    public RegistrationDefinitionProperties withEligibleAuthorizations(
        List<EligibleAuthorization> eligibleAuthorizations) {
        this.eligibleAuthorizations = eligibleAuthorizations;
        return this;
    }

    /**
     * Get the registrationDefinitionName property: Name of the registration definition.
     *
     * @return the registrationDefinitionName value.
     */
    public String registrationDefinitionName() {
        return this.registrationDefinitionName;
    }

    /**
     * Set the registrationDefinitionName property: Name of the registration definition.
     *
     * @param registrationDefinitionName the registrationDefinitionName value to set.
     * @return the RegistrationDefinitionProperties object itself.
     */
    public RegistrationDefinitionProperties withRegistrationDefinitionName(String registrationDefinitionName) {
        this.registrationDefinitionName = registrationDefinitionName;
        return this;
    }

    /**
     * Get the managedByTenantId property: Id of the managedBy tenant.
     *
     * @return the managedByTenantId value.
     */
    public String managedByTenantId() {
        return this.managedByTenantId;
    }

    /**
     * Set the managedByTenantId property: Id of the managedBy tenant.
     *
     * @param managedByTenantId the managedByTenantId value to set.
     * @return the RegistrationDefinitionProperties object itself.
     */
    public RegistrationDefinitionProperties withManagedByTenantId(String managedByTenantId) {
        this.managedByTenantId = managedByTenantId;
        return this;
    }

    /**
     * Get the provisioningState property: Current state of the registration definition.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the managedByTenantName property: Name of the managedBy tenant.
     *
     * @return the managedByTenantName value.
     */
    public String managedByTenantName() {
        return this.managedByTenantName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authorizations() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authorizations in model RegistrationDefinitionProperties"));
        } else {
            authorizations().forEach(e -> e.validate());
        }
        if (eligibleAuthorizations() != null) {
            eligibleAuthorizations().forEach(e -> e.validate());
        }
        if (managedByTenantId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property managedByTenantId in model RegistrationDefinitionProperties"));
        }
    }
}
