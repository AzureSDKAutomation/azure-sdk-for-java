// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.DatabasePrincipalAssignmentInner;
import com.azure.resourcemanager.synapse.models.DatabasePrincipalAssignment;
import com.azure.resourcemanager.synapse.models.DatabasePrincipalRole;
import com.azure.resourcemanager.synapse.models.PrincipalType;
import com.azure.resourcemanager.synapse.models.ResourceProvisioningState;

public final class DatabasePrincipalAssignmentImpl
    implements DatabasePrincipalAssignment, DatabasePrincipalAssignment.Definition, DatabasePrincipalAssignment.Update {
    private DatabasePrincipalAssignmentInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String principalId() {
        return this.innerModel().principalId();
    }

    public DatabasePrincipalRole role() {
        return this.innerModel().role();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public PrincipalType principalType() {
        return this.innerModel().principalType();
    }

    public String tenantName() {
        return this.innerModel().tenantName();
    }

    public String principalName() {
        return this.innerModel().principalName();
    }

    public ResourceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public DatabasePrincipalAssignmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    private String workspaceName;

    private String kustoPoolName;

    private String databaseName;

    private String principalAssignmentName;

    private String resourceGroupName;

    public DatabasePrincipalAssignmentImpl withExistingDatabase(
        String workspaceName, String kustoPoolName, String databaseName, String resourceGroupName) {
        this.workspaceName = workspaceName;
        this.kustoPoolName = kustoPoolName;
        this.databaseName = databaseName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DatabasePrincipalAssignment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    databaseName,
                    principalAssignmentName,
                    resourceGroupName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public DatabasePrincipalAssignment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    databaseName,
                    principalAssignmentName,
                    resourceGroupName,
                    this.innerModel(),
                    context);
        return this;
    }

    DatabasePrincipalAssignmentImpl(String name, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = new DatabasePrincipalAssignmentInner();
        this.serviceManager = serviceManager;
        this.principalAssignmentName = name;
    }

    public DatabasePrincipalAssignmentImpl update() {
        return this;
    }

    public DatabasePrincipalAssignment apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    databaseName,
                    principalAssignmentName,
                    resourceGroupName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public DatabasePrincipalAssignment apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    databaseName,
                    principalAssignmentName,
                    resourceGroupName,
                    this.innerModel(),
                    context);
        return this;
    }

    DatabasePrincipalAssignmentImpl(
        DatabasePrincipalAssignmentInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.kustoPoolName = Utils.getValueFromIdByName(innerObject.id(), "kustoPools");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.principalAssignmentName = Utils.getValueFromIdByName(innerObject.id(), "principalAssignments");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public DatabasePrincipalAssignment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .getWithResponse(
                    workspaceName,
                    kustoPoolName,
                    databaseName,
                    principalAssignmentName,
                    resourceGroupName,
                    Context.NONE)
                .getValue();
        return this;
    }

    public DatabasePrincipalAssignment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .getWithResponse(
                    workspaceName, kustoPoolName, databaseName, principalAssignmentName, resourceGroupName, context)
                .getValue();
        return this;
    }

    public DatabasePrincipalAssignmentImpl withPrincipalId(String principalId) {
        this.innerModel().withPrincipalId(principalId);
        return this;
    }

    public DatabasePrincipalAssignmentImpl withRole(DatabasePrincipalRole role) {
        this.innerModel().withRole(role);
        return this;
    }

    public DatabasePrincipalAssignmentImpl withTenantId(String tenantId) {
        this.innerModel().withTenantId(tenantId);
        return this;
    }

    public DatabasePrincipalAssignmentImpl withPrincipalType(PrincipalType principalType) {
        this.innerModel().withPrincipalType(principalType);
        return this;
    }
}
