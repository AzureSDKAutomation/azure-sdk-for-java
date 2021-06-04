// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.resourcemanager.authorization.generated.fluent.models.RoleAssignmentScheduleInstanceInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of RoleAssignmentScheduleInstance. */
public interface RoleAssignmentScheduleInstance {
    /**
     * Gets the id property: The role assignment schedule instance ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The role assignment schedule instance name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The role assignment schedule instance type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the scope property: The role assignment schedule scope.
     *
     * @return the scope value.
     */
    String scope();

    /**
     * Gets the roleDefinitionId property: The role definition ID.
     *
     * @return the roleDefinitionId value.
     */
    String roleDefinitionId();

    /**
     * Gets the principalId property: The principal ID.
     *
     * @return the principalId value.
     */
    String principalId();

    /**
     * Gets the principalType property: The principal type of the assigned principal ID.
     *
     * @return the principalType value.
     */
    PrincipalType principalType();

    /**
     * Gets the roleAssignmentScheduleId property: Id of the master role assignment schedule.
     *
     * @return the roleAssignmentScheduleId value.
     */
    String roleAssignmentScheduleId();

    /**
     * Gets the originRoleAssignmentId property: Role Assignment Id in external system.
     *
     * @return the originRoleAssignmentId value.
     */
    String originRoleAssignmentId();

    /**
     * Gets the status property: The status of the role assignment schedule instance.
     *
     * @return the status value.
     */
    Status status();

    /**
     * Gets the startDateTime property: The startDateTime of the role assignment schedule instance.
     *
     * @return the startDateTime value.
     */
    OffsetDateTime startDateTime();

    /**
     * Gets the endDateTime property: The endDateTime of the role assignment schedule instance.
     *
     * @return the endDateTime value.
     */
    OffsetDateTime endDateTime();

    /**
     * Gets the linkedRoleEligibilityScheduleId property: roleEligibilityScheduleId used to activate.
     *
     * @return the linkedRoleEligibilityScheduleId value.
     */
    String linkedRoleEligibilityScheduleId();

    /**
     * Gets the linkedRoleEligibilityScheduleInstanceId property: roleEligibilityScheduleInstanceId linked to this
     * roleAssignmentScheduleInstance.
     *
     * @return the linkedRoleEligibilityScheduleInstanceId value.
     */
    String linkedRoleEligibilityScheduleInstanceId();

    /**
     * Gets the assignmentType property: Assignment type of the role assignment schedule.
     *
     * @return the assignmentType value.
     */
    AssignmentType assignmentType();

    /**
     * Gets the memberType property: Membership type of the role assignment schedule.
     *
     * @return the memberType value.
     */
    MemberType memberType();

    /**
     * Gets the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     *
     * @return the condition value.
     */
    String condition();

    /**
     * Gets the conditionVersion property: Version of the condition. Currently accepted value is '2.0'.
     *
     * @return the conditionVersion value.
     */
    String conditionVersion();

    /**
     * Gets the createdOn property: DateTime when role assignment schedule was created.
     *
     * @return the createdOn value.
     */
    OffsetDateTime createdOn();

    /**
     * Gets the expandedProperties property: Additional properties of principal, scope and role definition.
     *
     * @return the expandedProperties value.
     */
    ExpandedProperties expandedProperties();

    /**
     * Gets the inner
     * com.azure.resourcemanager.authorization.generated.fluent.models.RoleAssignmentScheduleInstanceInner object.
     *
     * @return the inner object.
     */
    RoleAssignmentScheduleInstanceInner innerModel();
}
