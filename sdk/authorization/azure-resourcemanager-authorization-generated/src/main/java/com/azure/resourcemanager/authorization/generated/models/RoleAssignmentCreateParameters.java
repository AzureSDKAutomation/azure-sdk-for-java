// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Role assignment create parameters. */
@JsonFlatten
@Fluent
public class RoleAssignmentCreateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoleAssignmentCreateParameters.class);

    /*
     * The role definition ID used in the role assignment.
     */
    @JsonProperty(value = "properties.roleDefinitionId", required = true)
    private String roleDefinitionId;

    /*
     * The principal ID assigned to the role. This maps to the ID inside the
     * Active Directory. It can point to a user, service principal, or security
     * group.
     */
    @JsonProperty(value = "properties.principalId", required = true)
    private String principalId;

    /*
     * The principal type of the assigned principal ID.
     */
    @JsonProperty(value = "properties.principalType")
    private PrincipalType principalType;

    /*
     * The delegation flag used for creating a role assignment
     */
    @JsonProperty(value = "properties.canDelegate")
    private Boolean canDelegate;

    /*
     * Description of role assignment
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The conditions on the role assignment. This limits the resources it can
     * be assigned to. e.g.:
     * @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'
     */
    @JsonProperty(value = "properties.condition")
    private String condition;

    /*
     * Version of the condition. Currently accepted value is '2.0'
     */
    @JsonProperty(value = "properties.conditionVersion")
    private String conditionVersion;

    /**
     * Get the roleDefinitionId property: The role definition ID used in the role assignment.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The role definition ID used in the role assignment.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId property: The principal ID assigned to the role. This maps to the ID inside the Active
     * Directory. It can point to a user, service principal, or security group.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID assigned to the role. This maps to the ID inside the Active
     * Directory. It can point to a user, service principal, or security group.
     *
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the principalType property: The principal type of the assigned principal ID.
     *
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.principalType;
    }

    /**
     * Set the principalType property: The principal type of the assigned principal ID.
     *
     * @param principalType the principalType value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Get the canDelegate property: The delegation flag used for creating a role assignment.
     *
     * @return the canDelegate value.
     */
    public Boolean canDelegate() {
        return this.canDelegate;
    }

    /**
     * Set the canDelegate property: The delegation flag used for creating a role assignment.
     *
     * @param canDelegate the canDelegate value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withCanDelegate(Boolean canDelegate) {
        this.canDelegate = canDelegate;
        return this;
    }

    /**
     * Get the description property: Description of role assignment.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of role assignment.
     *
     * @param description the description value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     *
     * @return the condition value.
     */
    public String condition() {
        return this.condition;
    }

    /**
     * Set the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     *
     * @param condition the condition value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the conditionVersion property: Version of the condition. Currently accepted value is '2.0'.
     *
     * @return the conditionVersion value.
     */
    public String conditionVersion() {
        return this.conditionVersion;
    }

    /**
     * Set the conditionVersion property: Version of the condition. Currently accepted value is '2.0'.
     *
     * @param conditionVersion the conditionVersion value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withConditionVersion(String conditionVersion) {
        this.conditionVersion = conditionVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roleDefinitionId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property roleDefinitionId in model RoleAssignmentCreateParameters"));
        }
        if (principalId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property principalId in model RoleAssignmentCreateParameters"));
        }
    }
}