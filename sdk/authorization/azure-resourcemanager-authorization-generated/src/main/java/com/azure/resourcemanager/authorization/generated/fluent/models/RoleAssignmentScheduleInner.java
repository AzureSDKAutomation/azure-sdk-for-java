// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.models.AssignmentType;
import com.azure.resourcemanager.authorization.generated.models.ExpandedProperties;
import com.azure.resourcemanager.authorization.generated.models.MemberType;
import com.azure.resourcemanager.authorization.generated.models.PrincipalType;
import com.azure.resourcemanager.authorization.generated.models.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Role Assignment schedule. */
@JsonFlatten
@Fluent
public class RoleAssignmentScheduleInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoleAssignmentScheduleInner.class);

    /*
     * The role assignment schedule Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The role assignment schedule name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The role assignment schedule type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The role assignment schedule scope.
     */
    @JsonProperty(value = "properties.scope")
    private String scope;

    /*
     * The role definition ID.
     */
    @JsonProperty(value = "properties.roleDefinitionId")
    private String roleDefinitionId;

    /*
     * The principal ID.
     */
    @JsonProperty(value = "properties.principalId")
    private String principalId;

    /*
     * The principal type of the assigned principal ID.
     */
    @JsonProperty(value = "properties.principalType")
    private PrincipalType principalType;

    /*
     * The id of roleAssignmentScheduleRequest used to create this
     * roleAssignmentSchedule
     */
    @JsonProperty(value = "properties.roleAssignmentScheduleRequestId")
    private String roleAssignmentScheduleRequestId;

    /*
     * The id of roleEligibilitySchedule used to activated this
     * roleAssignmentSchedule
     */
    @JsonProperty(value = "properties.linkedRoleEligibilityScheduleId")
    private String linkedRoleEligibilityScheduleId;

    /*
     * Assignment type of the role assignment schedule
     */
    @JsonProperty(value = "properties.assignmentType")
    private AssignmentType assignmentType;

    /*
     * Membership type of the role assignment schedule
     */
    @JsonProperty(value = "properties.memberType")
    private MemberType memberType;

    /*
     * The status of the role assignment schedule.
     */
    @JsonProperty(value = "properties.status")
    private Status status;

    /*
     * Start DateTime when role assignment schedule
     */
    @JsonProperty(value = "properties.startDateTime")
    private OffsetDateTime startDateTime;

    /*
     * End DateTime when role assignment schedule
     */
    @JsonProperty(value = "properties.endDateTime")
    private OffsetDateTime endDateTime;

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

    /*
     * DateTime when role assignment schedule was created
     */
    @JsonProperty(value = "properties.createdOn")
    private OffsetDateTime createdOn;

    /*
     * DateTime when role assignment schedule was modified
     */
    @JsonProperty(value = "properties.updatedOn")
    private OffsetDateTime updatedOn;

    /*
     * Additional properties of principal, scope and role definition
     */
    @JsonProperty(value = "properties.expandedProperties")
    private ExpandedProperties expandedProperties;

    /**
     * Get the id property: The role assignment schedule Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The role assignment schedule name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The role assignment schedule type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the scope property: The role assignment schedule scope.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The role assignment schedule scope.
     *
     * @param scope the scope value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the roleDefinitionId property: The role definition ID.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The role definition ID.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId property: The principal ID.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID.
     *
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withPrincipalId(String principalId) {
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
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Get the roleAssignmentScheduleRequestId property: The id of roleAssignmentScheduleRequest used to create this
     * roleAssignmentSchedule.
     *
     * @return the roleAssignmentScheduleRequestId value.
     */
    public String roleAssignmentScheduleRequestId() {
        return this.roleAssignmentScheduleRequestId;
    }

    /**
     * Set the roleAssignmentScheduleRequestId property: The id of roleAssignmentScheduleRequest used to create this
     * roleAssignmentSchedule.
     *
     * @param roleAssignmentScheduleRequestId the roleAssignmentScheduleRequestId value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withRoleAssignmentScheduleRequestId(String roleAssignmentScheduleRequestId) {
        this.roleAssignmentScheduleRequestId = roleAssignmentScheduleRequestId;
        return this;
    }

    /**
     * Get the linkedRoleEligibilityScheduleId property: The id of roleEligibilitySchedule used to activated this
     * roleAssignmentSchedule.
     *
     * @return the linkedRoleEligibilityScheduleId value.
     */
    public String linkedRoleEligibilityScheduleId() {
        return this.linkedRoleEligibilityScheduleId;
    }

    /**
     * Set the linkedRoleEligibilityScheduleId property: The id of roleEligibilitySchedule used to activated this
     * roleAssignmentSchedule.
     *
     * @param linkedRoleEligibilityScheduleId the linkedRoleEligibilityScheduleId value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withLinkedRoleEligibilityScheduleId(String linkedRoleEligibilityScheduleId) {
        this.linkedRoleEligibilityScheduleId = linkedRoleEligibilityScheduleId;
        return this;
    }

    /**
     * Get the assignmentType property: Assignment type of the role assignment schedule.
     *
     * @return the assignmentType value.
     */
    public AssignmentType assignmentType() {
        return this.assignmentType;
    }

    /**
     * Set the assignmentType property: Assignment type of the role assignment schedule.
     *
     * @param assignmentType the assignmentType value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withAssignmentType(AssignmentType assignmentType) {
        this.assignmentType = assignmentType;
        return this;
    }

    /**
     * Get the memberType property: Membership type of the role assignment schedule.
     *
     * @return the memberType value.
     */
    public MemberType memberType() {
        return this.memberType;
    }

    /**
     * Set the memberType property: Membership type of the role assignment schedule.
     *
     * @param memberType the memberType value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withMemberType(MemberType memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * Get the status property: The status of the role assignment schedule.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the role assignment schedule.
     *
     * @param status the status value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the startDateTime property: Start DateTime when role assignment schedule.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: Start DateTime when role assignment schedule.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the endDateTime property: End DateTime when role assignment schedule.
     *
     * @return the endDateTime value.
     */
    public OffsetDateTime endDateTime() {
        return this.endDateTime;
    }

    /**
     * Set the endDateTime property: End DateTime when role assignment schedule.
     *
     * @param endDateTime the endDateTime value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withEndDateTime(OffsetDateTime endDateTime) {
        this.endDateTime = endDateTime;
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
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withCondition(String condition) {
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
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withConditionVersion(String conditionVersion) {
        this.conditionVersion = conditionVersion;
        return this;
    }

    /**
     * Get the createdOn property: DateTime when role assignment schedule was created.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Set the createdOn property: DateTime when role assignment schedule was created.
     *
     * @param createdOn the createdOn value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Get the updatedOn property: DateTime when role assignment schedule was modified.
     *
     * @return the updatedOn value.
     */
    public OffsetDateTime updatedOn() {
        return this.updatedOn;
    }

    /**
     * Set the updatedOn property: DateTime when role assignment schedule was modified.
     *
     * @param updatedOn the updatedOn value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withUpdatedOn(OffsetDateTime updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * Get the expandedProperties property: Additional properties of principal, scope and role definition.
     *
     * @return the expandedProperties value.
     */
    public ExpandedProperties expandedProperties() {
        return this.expandedProperties;
    }

    /**
     * Set the expandedProperties property: Additional properties of principal, scope and role definition.
     *
     * @param expandedProperties the expandedProperties value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withExpandedProperties(ExpandedProperties expandedProperties) {
        this.expandedProperties = expandedProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (expandedProperties() != null) {
            expandedProperties().validate();
        }
    }
}
