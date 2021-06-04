// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleManagementPolicyAssignmentInner;
import com.azure.resourcemanager.authorization.generated.models.PolicyAssignmentProperties;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyAssignment;

public final class RoleManagementPolicyAssignmentImpl
    implements RoleManagementPolicyAssignment, RoleManagementPolicyAssignment.Definition {
    private RoleManagementPolicyAssignmentInner innerObject;

    private final com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager;

    RoleManagementPolicyAssignmentImpl(
        RoleManagementPolicyAssignmentInner innerObject,
        com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager) {
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

    public String policyId() {
        return this.innerModel().policyId();
    }

    public PolicyAssignmentProperties policyAssignmentProperties() {
        return this.innerModel().policyAssignmentProperties();
    }

    public RoleManagementPolicyAssignmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.authorization.generated.AuthorizationManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String roleManagementPolicyAssignmentName;

    public RoleManagementPolicyAssignmentImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public RoleManagementPolicyAssignment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleManagementPolicyAssignments()
                .createWithResponse(scope, roleManagementPolicyAssignmentName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public RoleManagementPolicyAssignment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleManagementPolicyAssignments()
                .createWithResponse(scope, roleManagementPolicyAssignmentName, this.innerModel(), context)
                .getValue();
        return this;
    }

    RoleManagementPolicyAssignmentImpl(
        String name, com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager) {
        this.innerObject = new RoleManagementPolicyAssignmentInner();
        this.serviceManager = serviceManager;
        this.roleManagementPolicyAssignmentName = name;
    }

    public RoleManagementPolicyAssignment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleManagementPolicyAssignments()
                .getWithResponse(scope, roleManagementPolicyAssignmentName, Context.NONE)
                .getValue();
        return this;
    }

    public RoleManagementPolicyAssignment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleManagementPolicyAssignments()
                .getWithResponse(scope, roleManagementPolicyAssignmentName, context)
                .getValue();
        return this;
    }

    public RoleManagementPolicyAssignmentImpl withScope(String scope) {
        this.innerModel().withScope(scope);
        return this;
    }

    public RoleManagementPolicyAssignmentImpl withRoleDefinitionId(String roleDefinitionId) {
        this.innerModel().withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    public RoleManagementPolicyAssignmentImpl withPolicyId(String policyId) {
        this.innerModel().withPolicyId(policyId);
        return this;
    }
}
