// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerDevOpsAuditingSettingsInner;
import com.azure.resourcemanager.sql.generated.models.BlobAuditingPolicyState;
import com.azure.resourcemanager.sql.generated.models.ServerDevOpsAuditingSettings;
import java.util.UUID;

public final class ServerDevOpsAuditingSettingsImpl
    implements ServerDevOpsAuditingSettings,
        ServerDevOpsAuditingSettings.Definition,
        ServerDevOpsAuditingSettings.Update {
    private ServerDevOpsAuditingSettingsInner innerObject;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Boolean isAzureMonitorTargetEnabled() {
        return this.innerModel().isAzureMonitorTargetEnabled();
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

    public UUID storageAccountSubscriptionId() {
        return this.innerModel().storageAccountSubscriptionId();
    }

    public ServerDevOpsAuditingSettingsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String devOpsAuditingSettingsName;

    public ServerDevOpsAuditingSettingsImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public ServerDevOpsAuditingSettings create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerDevOpsAuditSettings()
                .createOrUpdate(
                    resourceGroupName, serverName, devOpsAuditingSettingsName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerDevOpsAuditingSettings create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerDevOpsAuditSettings()
                .createOrUpdate(resourceGroupName, serverName, devOpsAuditingSettingsName, this.innerModel(), context);
        return this;
    }

    ServerDevOpsAuditingSettingsImpl(String name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new ServerDevOpsAuditingSettingsInner();
        this.serviceManager = serviceManager;
        this.devOpsAuditingSettingsName = name;
    }

    public ServerDevOpsAuditingSettingsImpl update() {
        return this;
    }

    public ServerDevOpsAuditingSettings apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerDevOpsAuditSettings()
                .createOrUpdate(
                    resourceGroupName, serverName, devOpsAuditingSettingsName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerDevOpsAuditingSettings apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerDevOpsAuditSettings()
                .createOrUpdate(resourceGroupName, serverName, devOpsAuditingSettingsName, this.innerModel(), context);
        return this;
    }

    ServerDevOpsAuditingSettingsImpl(
        ServerDevOpsAuditingSettingsInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.devOpsAuditingSettingsName = Utils.getValueFromIdByName(innerObject.id(), "devOpsAuditingSettings");
    }

    public ServerDevOpsAuditingSettings refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerDevOpsAuditSettings()
                .getWithResponse(resourceGroupName, serverName, devOpsAuditingSettingsName, Context.NONE)
                .getValue();
        return this;
    }

    public ServerDevOpsAuditingSettings refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerDevOpsAuditSettings()
                .getWithResponse(resourceGroupName, serverName, devOpsAuditingSettingsName, context)
                .getValue();
        return this;
    }

    public ServerDevOpsAuditingSettingsImpl withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.innerModel().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    public ServerDevOpsAuditingSettingsImpl withState(BlobAuditingPolicyState state) {
        this.innerModel().withState(state);
        return this;
    }

    public ServerDevOpsAuditingSettingsImpl withStorageEndpoint(String storageEndpoint) {
        this.innerModel().withStorageEndpoint(storageEndpoint);
        return this;
    }

    public ServerDevOpsAuditingSettingsImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.innerModel().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    public ServerDevOpsAuditingSettingsImpl withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.innerModel().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }
}
