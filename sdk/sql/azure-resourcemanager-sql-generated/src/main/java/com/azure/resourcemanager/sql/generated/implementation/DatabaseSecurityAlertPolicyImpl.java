// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseSecurityAlertPolicyInner;
import com.azure.resourcemanager.sql.generated.models.DatabaseSecurityAlertPolicy;
import com.azure.resourcemanager.sql.generated.models.SecurityAlertPolicyEmailAccountAdmins;
import com.azure.resourcemanager.sql.generated.models.SecurityAlertPolicyName;
import com.azure.resourcemanager.sql.generated.models.SecurityAlertPolicyState;
import com.azure.resourcemanager.sql.generated.models.SecurityAlertPolicyUseServerDefault;

public final class DatabaseSecurityAlertPolicyImpl
    implements DatabaseSecurityAlertPolicy, DatabaseSecurityAlertPolicy.Definition, DatabaseSecurityAlertPolicy.Update {
    private DatabaseSecurityAlertPolicyInner innerObject;

    private final SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public SecurityAlertPolicyState state() {
        return this.innerModel().state();
    }

    public String disabledAlerts() {
        return this.innerModel().disabledAlerts();
    }

    public String emailAddresses() {
        return this.innerModel().emailAddresses();
    }

    public SecurityAlertPolicyEmailAccountAdmins emailAccountAdmins() {
        return this.innerModel().emailAccountAdmins();
    }

    public String storageEndpoint() {
        return this.innerModel().storageEndpoint();
    }

    public String storageAccountAccessKey() {
        return this.innerModel().storageAccountAccessKey();
    }

    public Integer retentionDays() {
        return this.innerModel().retentionDays();
    }

    public SecurityAlertPolicyUseServerDefault useServerDefault() {
        return this.innerModel().useServerDefault();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DatabaseSecurityAlertPolicyInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    private SecurityAlertPolicyName securityAlertPolicyName;

    public DatabaseSecurityAlertPolicyImpl withExistingDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    public DatabaseSecurityAlertPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseThreatDetectionPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serverName,
                    databaseName,
                    securityAlertPolicyName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseSecurityAlertPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseThreatDetectionPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, securityAlertPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl(SecurityAlertPolicyName name, SqlManager serviceManager) {
        this.innerObject = new DatabaseSecurityAlertPolicyInner();
        this.serviceManager = serviceManager;
        this.securityAlertPolicyName = name;
    }

    public DatabaseSecurityAlertPolicyImpl update() {
        return this;
    }

    public DatabaseSecurityAlertPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseThreatDetectionPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serverName,
                    databaseName,
                    securityAlertPolicyName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseSecurityAlertPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseThreatDetectionPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, securityAlertPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl(DatabaseSecurityAlertPolicyInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.securityAlertPolicyName =
            SecurityAlertPolicyName.fromString(Utils.getValueFromIdByName(innerObject.id(), "securityAlertPolicies"));
    }

    public DatabaseSecurityAlertPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseThreatDetectionPolicies()
                .getWithResponse(resourceGroupName, serverName, databaseName, securityAlertPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseSecurityAlertPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseThreatDetectionPolicies()
                .getWithResponse(resourceGroupName, serverName, databaseName, securityAlertPolicyName, context)
                .getValue();
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withState(SecurityAlertPolicyState state) {
        this.innerModel().withState(state);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withDisabledAlerts(String disabledAlerts) {
        this.innerModel().withDisabledAlerts(disabledAlerts);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withEmailAddresses(String emailAddresses) {
        this.innerModel().withEmailAddresses(emailAddresses);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withEmailAccountAdmins(
        SecurityAlertPolicyEmailAccountAdmins emailAccountAdmins) {
        this.innerModel().withEmailAccountAdmins(emailAccountAdmins);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.innerModel().withStorageEndpoint(storageEndpoint);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.innerModel().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withRetentionDays(Integer retentionDays) {
        this.innerModel().withRetentionDays(retentionDays);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withUseServerDefault(SecurityAlertPolicyUseServerDefault useServerDefault) {
        this.innerModel().withUseServerDefault(useServerDefault);
        return this;
    }
}
