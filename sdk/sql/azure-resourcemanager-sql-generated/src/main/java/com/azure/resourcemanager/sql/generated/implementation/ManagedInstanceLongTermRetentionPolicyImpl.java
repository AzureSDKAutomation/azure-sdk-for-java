// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceLongTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceLongTermRetentionPolicy;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceLongTermRetentionPolicyName;

public final class ManagedInstanceLongTermRetentionPolicyImpl
    implements ManagedInstanceLongTermRetentionPolicy,
        ManagedInstanceLongTermRetentionPolicy.Definition,
        ManagedInstanceLongTermRetentionPolicy.Update {
    private ManagedInstanceLongTermRetentionPolicyInner innerObject;

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

    public String weeklyRetention() {
        return this.innerModel().weeklyRetention();
    }

    public String monthlyRetention() {
        return this.innerModel().monthlyRetention();
    }

    public String yearlyRetention() {
        return this.innerModel().yearlyRetention();
    }

    public Integer weekOfYear() {
        return this.innerModel().weekOfYear();
    }

    public ManagedInstanceLongTermRetentionPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String managedInstanceName;

    private String databaseName;

    private ManagedInstanceLongTermRetentionPolicyName policyName;

    public ManagedInstanceLongTermRetentionPolicyImpl withExistingDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.managedInstanceName = managedInstanceName;
        this.databaseName = databaseName;
        return this;
    }

    public ManagedInstanceLongTermRetentionPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceLongTermRetentionPolicies()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, databaseName, policyName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedInstanceLongTermRetentionPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceLongTermRetentionPolicies()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, databaseName, policyName, this.innerModel(), context);
        return this;
    }

    ManagedInstanceLongTermRetentionPolicyImpl(
        ManagedInstanceLongTermRetentionPolicyName name,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new ManagedInstanceLongTermRetentionPolicyInner();
        this.serviceManager = serviceManager;
        this.policyName = name;
    }

    public ManagedInstanceLongTermRetentionPolicyImpl update() {
        return this;
    }

    public ManagedInstanceLongTermRetentionPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceLongTermRetentionPolicies()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, databaseName, policyName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedInstanceLongTermRetentionPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceLongTermRetentionPolicies()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, databaseName, policyName, this.innerModel(), context);
        return this;
    }

    ManagedInstanceLongTermRetentionPolicyImpl(
        ManagedInstanceLongTermRetentionPolicyInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.managedInstanceName = Utils.getValueFromIdByName(innerObject.id(), "managedInstances");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.policyName =
            ManagedInstanceLongTermRetentionPolicyName
                .fromString(Utils.getValueFromIdByName(innerObject.id(), "backupLongTermRetentionPolicies"));
    }

    public ManagedInstanceLongTermRetentionPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceLongTermRetentionPolicies()
                .getWithResponse(resourceGroupName, managedInstanceName, databaseName, policyName, Context.NONE)
                .getValue();
        return this;
    }

    public ManagedInstanceLongTermRetentionPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceLongTermRetentionPolicies()
                .getWithResponse(resourceGroupName, managedInstanceName, databaseName, policyName, context)
                .getValue();
        return this;
    }

    public ManagedInstanceLongTermRetentionPolicyImpl withWeeklyRetention(String weeklyRetention) {
        this.innerModel().withWeeklyRetention(weeklyRetention);
        return this;
    }

    public ManagedInstanceLongTermRetentionPolicyImpl withMonthlyRetention(String monthlyRetention) {
        this.innerModel().withMonthlyRetention(monthlyRetention);
        return this;
    }

    public ManagedInstanceLongTermRetentionPolicyImpl withYearlyRetention(String yearlyRetention) {
        this.innerModel().withYearlyRetention(yearlyRetention);
        return this;
    }

    public ManagedInstanceLongTermRetentionPolicyImpl withWeekOfYear(Integer weekOfYear) {
        this.innerModel().withWeekOfYear(weekOfYear);
        return this;
    }
}
