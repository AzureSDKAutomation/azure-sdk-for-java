// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of registration definition inside registration assignment. */
@Fluent
public final class RegistrationAssignmentPropertiesRegistrationDefinitionProperties {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(RegistrationAssignmentPropertiesRegistrationDefinitionProperties.class);

    /*
     * Description of the registration definition.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Authorization tuple containing principal id of the user/security group
     * or service principal and id of the build-in role.
     */
    @JsonProperty(value = "authorizations")
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
     * Current state of the registration definition.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /*
     * Id of the home tenant.
     */
    @JsonProperty(value = "manageeTenantId")
    private String manageeTenantId;

    /*
     * Name of the home tenant.
     */
    @JsonProperty(value = "manageeTenantName")
    private String manageeTenantName;

    /*
     * Id of the managedBy tenant.
     */
    @JsonProperty(value = "managedByTenantId")
    private String managedByTenantId;

    /*
     * Name of the managedBy tenant.
     */
    @JsonProperty(value = "managedByTenantName")
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
     * @return the RegistrationAssignmentPropertiesRegistrationDefinitionProperties object itself.
     */
    public RegistrationAssignmentPropertiesRegistrationDefinitionProperties withDescription(String description) {
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
     * @return the RegistrationAssignmentPropertiesRegistrationDefinitionProperties object itself.
     */
    public RegistrationAssignmentPropertiesRegistrationDefinitionProperties withAuthorizations(
        List<Authorization> authorizations) {
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
     * @return the RegistrationAssignmentPropertiesRegistrationDefinitionProperties object itself.
     */
    public RegistrationAssignmentPropertiesRegistrationDefinitionProperties withEligibleAuthorizations(
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
     * @return the RegistrationAssignmentPropertiesRegistrationDefinitionProperties object itself.
     */
    public RegistrationAssignmentPropertiesRegistrationDefinitionProperties withRegistrationDefinitionName(
        String registrationDefinitionName) {
        this.registrationDefinitionName = registrationDefinitionName;
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
     * Set the provisioningState property: Current state of the registration definition.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the RegistrationAssignmentPropertiesRegistrationDefinitionProperties object itself.
     */
    public RegistrationAssignmentPropertiesRegistrationDefinitionProperties withProvisioningState(
        ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the manageeTenantId property: Id of the home tenant.
     *
     * @return the manageeTenantId value.
     */
    public String manageeTenantId() {
        return this.manageeTenantId;
    }

    /**
     * Set the manageeTenantId property: Id of the home tenant.
     *
     * @param manageeTenantId the manageeTenantId value to set.
     * @return the RegistrationAssignmentPropertiesRegistrationDefinitionProperties object itself.
     */
    public RegistrationAssignmentPropertiesRegistrationDefinitionProperties withManageeTenantId(
        String manageeTenantId) {
        this.manageeTenantId = manageeTenantId;
        return this;
    }

    /**
     * Get the manageeTenantName property: Name of the home tenant.
     *
     * @return the manageeTenantName value.
     */
    public String manageeTenantName() {
        return this.manageeTenantName;
    }

    /**
     * Set the manageeTenantName property: Name of the home tenant.
     *
     * @param manageeTenantName the manageeTenantName value to set.
     * @return the RegistrationAssignmentPropertiesRegistrationDefinitionProperties object itself.
     */
    public RegistrationAssignmentPropertiesRegistrationDefinitionProperties withManageeTenantName(
        String manageeTenantName) {
        this.manageeTenantName = manageeTenantName;
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
     * @return the RegistrationAssignmentPropertiesRegistrationDefinitionProperties object itself.
     */
    public RegistrationAssignmentPropertiesRegistrationDefinitionProperties withManagedByTenantId(
        String managedByTenantId) {
        this.managedByTenantId = managedByTenantId;
        return this;
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
     * Set the managedByTenantName property: Name of the managedBy tenant.
     *
     * @param managedByTenantName the managedByTenantName value to set.
     * @return the RegistrationAssignmentPropertiesRegistrationDefinitionProperties object itself.
     */
    public RegistrationAssignmentPropertiesRegistrationDefinitionProperties withManagedByTenantName(
        String managedByTenantName) {
        this.managedByTenantName = managedByTenantName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authorizations() != null) {
            authorizations().forEach(e -> e.validate());
        }
        if (eligibleAuthorizations() != null) {
            eligibleAuthorizations().forEach(e -> e.validate());
        }
    }
}
