// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedBackupShortTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.ManagedBackupShortTermRetentionPolicy;
import com.azure.resourcemanager.sql.generated.models.ManagedShortTermRetentionPolicyName;

public final class ManagedBackupShortTermRetentionPolicyImpl
    implements ManagedBackupShortTermRetentionPolicy,
        ManagedBackupShortTermRetentionPolicy.Definition,
        ManagedBackupShortTermRetentionPolicy.Update {
    private ManagedBackupShortTermRetentionPolicyInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Integer retentionDays() {
        return this.innerModel().retentionDays();
    }

    public ManagedBackupShortTermRetentionPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String managedInstanceName;

    private String databaseName;

    private ManagedShortTermRetentionPolicyName policyName;

    public ManagedBackupShortTermRetentionPolicyImpl withExistingDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.managedInstanceName = managedInstanceName;
        this.databaseName = databaseName;
        return this;
    }

    public ManagedBackupShortTermRetentionPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedBackupShortTermRetentionPolicies()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, databaseName, policyName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedBackupShortTermRetentionPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedBackupShortTermRetentionPolicies()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, databaseName, policyName, this.innerModel(), context);
        return this;
    }

    ManagedBackupShortTermRetentionPolicyImpl(
        ManagedShortTermRetentionPolicyName name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new ManagedBackupShortTermRetentionPolicyInner();
        this.serviceManager = serviceManager;
        this.policyName = name;
    }

    public ManagedBackupShortTermRetentionPolicyImpl update() {
        return this;
    }

    public ManagedBackupShortTermRetentionPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedBackupShortTermRetentionPolicies()
                .update(
                    resourceGroupName, managedInstanceName, databaseName, policyName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedBackupShortTermRetentionPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedBackupShortTermRetentionPolicies()
                .update(resourceGroupName, managedInstanceName, databaseName, policyName, this.innerModel(), context);
        return this;
    }

    ManagedBackupShortTermRetentionPolicyImpl(
        ManagedBackupShortTermRetentionPolicyInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.managedInstanceName = Utils.getValueFromIdByName(innerObject.id(), "managedInstances");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.policyName =
            ManagedShortTermRetentionPolicyName
                .fromString(Utils.getValueFromIdByName(innerObject.id(), "backupShortTermRetentionPolicies"));
    }

    public ManagedBackupShortTermRetentionPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedBackupShortTermRetentionPolicies()
                .getWithResponse(resourceGroupName, managedInstanceName, databaseName, policyName, Context.NONE)
                .getValue();
        return this;
    }

    public ManagedBackupShortTermRetentionPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedBackupShortTermRetentionPolicies()
                .getWithResponse(resourceGroupName, managedInstanceName, databaseName, policyName, context)
                .getValue();
        return this;
    }

    public ManagedBackupShortTermRetentionPolicyImpl withRetentionDays(Integer retentionDays) {
        this.innerModel().withRetentionDays(retentionDays);
        return this;
    }
}
