// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseBlobAuditingPolicyInner;
import com.azure.resourcemanager.sql.generated.models.BlobAuditingPolicyState;
import com.azure.resourcemanager.sql.generated.models.DatabaseBlobAuditingPolicy;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class DatabaseBlobAuditingPolicyImpl
    implements DatabaseBlobAuditingPolicy, DatabaseBlobAuditingPolicy.Definition, DatabaseBlobAuditingPolicy.Update {
    private DatabaseBlobAuditingPolicyInner innerObject;

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

    public String kind() {
        return this.innerModel().kind();
    }

    public BlobAuditingPolicyState state() {
        return this.innerModel().state();
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

    public List<String> auditActionsAndGroups() {
        List<String> inner = this.innerModel().auditActionsAndGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public UUID storageAccountSubscriptionId() {
        return this.innerModel().storageAccountSubscriptionId();
    }

    public Boolean isStorageSecondaryKeyInUse() {
        return this.innerModel().isStorageSecondaryKeyInUse();
    }

    public Boolean isAzureMonitorTargetEnabled() {
        return this.innerModel().isAzureMonitorTargetEnabled();
    }

    public Integer queueDelayMs() {
        return this.innerModel().queueDelayMs();
    }

    public DatabaseBlobAuditingPolicyInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    public DatabaseBlobAuditingPolicyImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public DatabaseBlobAuditingPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseBlobAuditingPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseBlobAuditingPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseBlobAuditingPolicies()
                .createOrUpdateWithResponse(resourceGroupName, serverName, databaseName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public DatabaseBlobAuditingPolicyImpl(String name, SqlManager serviceManager) {
        this.innerObject = new DatabaseBlobAuditingPolicyInner();
        this.serviceManager = serviceManager;
        this.databaseName = name;
    }

    public DatabaseBlobAuditingPolicyImpl update() {
        return this;
    }

    public DatabaseBlobAuditingPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseBlobAuditingPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseBlobAuditingPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseBlobAuditingPolicies()
                .createOrUpdateWithResponse(resourceGroupName, serverName, databaseName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public DatabaseBlobAuditingPolicyImpl(DatabaseBlobAuditingPolicyInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
    }

    public DatabaseBlobAuditingPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseBlobAuditingPolicies()
                .getWithResponse(resourceGroupName, serverName, databaseName, Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseBlobAuditingPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseBlobAuditingPolicies()
                .getWithResponse(resourceGroupName, serverName, databaseName, context)
                .getValue();
        return this;
    }

    public DatabaseBlobAuditingPolicyImpl withState(BlobAuditingPolicyState state) {
        this.innerModel().withState(state);
        return this;
    }

    public DatabaseBlobAuditingPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.innerModel().withStorageEndpoint(storageEndpoint);
        return this;
    }

    public DatabaseBlobAuditingPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.innerModel().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    public DatabaseBlobAuditingPolicyImpl withRetentionDays(Integer retentionDays) {
        this.innerModel().withRetentionDays(retentionDays);
        return this;
    }

    public DatabaseBlobAuditingPolicyImpl withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.innerModel().withAuditActionsAndGroups(auditActionsAndGroups);
        return this;
    }

    public DatabaseBlobAuditingPolicyImpl withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.innerModel().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }

    public DatabaseBlobAuditingPolicyImpl withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.innerModel().withIsStorageSecondaryKeyInUse(isStorageSecondaryKeyInUse);
        return this;
    }

    public DatabaseBlobAuditingPolicyImpl withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.innerModel().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    public DatabaseBlobAuditingPolicyImpl withQueueDelayMs(Integer queueDelayMs) {
        this.innerModel().withQueueDelayMs(queueDelayMs);
        return this;
    }
}
