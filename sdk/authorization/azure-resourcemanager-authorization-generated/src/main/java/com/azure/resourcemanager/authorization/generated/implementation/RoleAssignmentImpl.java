// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.AuthorizationManager;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleAssignmentInner;
import com.azure.resourcemanager.authorization.generated.models.PrincipalType;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignment;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentCreateParameters;
import java.time.OffsetDateTime;

public final class RoleAssignmentImpl implements RoleAssignment, RoleAssignment.Definition {
    private RoleAssignmentInner innerObject;

    private final AuthorizationManager serviceManager;

    RoleAssignmentImpl(RoleAssignmentInner innerObject, AuthorizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public String roleDefinitionId() {
        return this.innerModel().roleDefinitionId();
    }

    public String principalId() {
        return this.innerModel().principalId();
    }

    public PrincipalType principalType() {
        return this.innerModel().principalType();
    }

    public Boolean canDelegate() {
        return this.innerModel().canDelegate();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String condition() {
        return this.innerModel().condition();
    }

    public String conditionVersion() {
        return this.innerModel().conditionVersion();
    }

    public OffsetDateTime createdOn() {
        return this.innerModel().createdOn();
    }

    public OffsetDateTime updatedOn() {
        return this.innerModel().updatedOn();
    }

    public String createdBy() {
        return this.innerModel().createdBy();
    }

    public String updatedBy() {
        return this.innerModel().updatedBy();
    }

    public String delegatedManagedIdentityResourceId() {
        return this.innerModel().delegatedManagedIdentityResourceId();
    }

    public RoleAssignmentInner innerModel() {
        return this.innerObject;
    }

    private AuthorizationManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String roleAssignmentName;

    private RoleAssignmentCreateParameters createParameters;

    public RoleAssignmentImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public RoleAssignment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .createWithResponse(scope, roleAssignmentName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public RoleAssignment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .createWithResponse(scope, roleAssignmentName, createParameters, context)
                .getValue();
        return this;
    }

    RoleAssignmentImpl(String name, AuthorizationManager serviceManager) {
        this.innerObject = new RoleAssignmentInner();
        this.serviceManager = serviceManager;
        this.roleAssignmentName = name;
        this.createParameters = new RoleAssignmentCreateParameters();
    }

    public RoleAssignment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .getWithResponse(scope, roleAssignmentName, Context.NONE)
                .getValue();
        return this;
    }

    public RoleAssignment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .getWithResponse(scope, roleAssignmentName, context)
                .getValue();
        return this;
    }

    public RoleAssignmentImpl withRoleDefinitionId(String roleDefinitionId) {
        this.createParameters.withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    public RoleAssignmentImpl withPrincipalId(String principalId) {
        this.createParameters.withPrincipalId(principalId);
        return this;
    }

    public RoleAssignmentImpl withPrincipalType(PrincipalType principalType) {
        this.createParameters.withPrincipalType(principalType);
        return this;
    }

    public RoleAssignmentImpl withCanDelegate(Boolean canDelegate) {
        this.createParameters.withCanDelegate(canDelegate);
        return this;
    }

    public RoleAssignmentImpl withDescription(String description) {
        this.createParameters.withDescription(description);
        return this;
    }

    public RoleAssignmentImpl withCondition(String condition) {
        this.createParameters.withCondition(condition);
        return this;
    }

    public RoleAssignmentImpl withConditionVersion(String conditionVersion) {
        this.createParameters.withConditionVersion(conditionVersion);
        return this;
    }
}