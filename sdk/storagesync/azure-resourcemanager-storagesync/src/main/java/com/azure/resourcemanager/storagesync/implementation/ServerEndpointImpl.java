// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storagesync.StoragesyncManager;
import com.azure.resourcemanager.storagesync.fluent.models.ServerEndpointInner;
import com.azure.resourcemanager.storagesync.models.FeatureStatus;
import com.azure.resourcemanager.storagesync.models.InitialDownloadPolicy;
import com.azure.resourcemanager.storagesync.models.LocalCacheMode;
import com.azure.resourcemanager.storagesync.models.ServerEndpoint;
import com.azure.resourcemanager.storagesync.models.ServerEndpointCloudTieringStatus;
import com.azure.resourcemanager.storagesync.models.ServerEndpointCreateParameters;
import com.azure.resourcemanager.storagesync.models.ServerEndpointRecallStatus;
import com.azure.resourcemanager.storagesync.models.ServerEndpointSyncStatus;
import com.azure.resourcemanager.storagesync.models.ServerEndpointUpdateParameters;

public final class ServerEndpointImpl implements ServerEndpoint, ServerEndpoint.Definition, ServerEndpoint.Update {
    private ServerEndpointInner innerObject;

    private final StoragesyncManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String serverLocalPath() {
        return this.innerModel().serverLocalPath();
    }

    public FeatureStatus cloudTiering() {
        return this.innerModel().cloudTiering();
    }

    public Integer volumeFreeSpacePercent() {
        return this.innerModel().volumeFreeSpacePercent();
    }

    public Integer tierFilesOlderThanDays() {
        return this.innerModel().tierFilesOlderThanDays();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public String serverResourceId() {
        return this.innerModel().serverResourceId();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String lastWorkflowId() {
        return this.innerModel().lastWorkflowId();
    }

    public String lastOperationName() {
        return this.innerModel().lastOperationName();
    }

    public ServerEndpointSyncStatus syncStatus() {
        return this.innerModel().syncStatus();
    }

    public FeatureStatus offlineDataTransfer() {
        return this.innerModel().offlineDataTransfer();
    }

    public String offlineDataTransferStorageAccountResourceId() {
        return this.innerModel().offlineDataTransferStorageAccountResourceId();
    }

    public String offlineDataTransferStorageAccountTenantId() {
        return this.innerModel().offlineDataTransferStorageAccountTenantId();
    }

    public String offlineDataTransferShareName() {
        return this.innerModel().offlineDataTransferShareName();
    }

    public ServerEndpointCloudTieringStatus cloudTieringStatus() {
        return this.innerModel().cloudTieringStatus();
    }

    public ServerEndpointRecallStatus recallStatus() {
        return this.innerModel().recallStatus();
    }

    public InitialDownloadPolicy initialDownloadPolicy() {
        return this.innerModel().initialDownloadPolicy();
    }

    public LocalCacheMode localCacheMode() {
        return this.innerModel().localCacheMode();
    }

    public String serverName() {
        return this.innerModel().serverName();
    }

    public ServerEndpointInner innerModel() {
        return this.innerObject;
    }

    private StoragesyncManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String storageSyncServiceName;

    private String syncGroupName;

    private String serverEndpointName;

    private ServerEndpointCreateParameters createParameters;

    private ServerEndpointUpdateParameters updateParameters;

    public ServerEndpointImpl withExistingSyncGroup(
        String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        this.resourceGroupName = resourceGroupName;
        this.storageSyncServiceName = storageSyncServiceName;
        this.syncGroupName = syncGroupName;
        return this;
    }

    public ServerEndpoint create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerEndpoints()
                .create(
                    resourceGroupName,
                    storageSyncServiceName,
                    syncGroupName,
                    serverEndpointName,
                    createParameters,
                    Context.NONE);
        return this;
    }

    public ServerEndpoint create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerEndpoints()
                .create(
                    resourceGroupName,
                    storageSyncServiceName,
                    syncGroupName,
                    serverEndpointName,
                    createParameters,
                    context);
        return this;
    }

    ServerEndpointImpl(String name, StoragesyncManager serviceManager) {
        this.innerObject = new ServerEndpointInner();
        this.serviceManager = serviceManager;
        this.serverEndpointName = name;
        this.createParameters = new ServerEndpointCreateParameters();
    }

    public ServerEndpointImpl update() {
        this.updateParameters = new ServerEndpointUpdateParameters();
        return this;
    }

    public ServerEndpoint apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerEndpoints()
                .update(
                    resourceGroupName,
                    storageSyncServiceName,
                    syncGroupName,
                    serverEndpointName,
                    updateParameters,
                    Context.NONE);
        return this;
    }

    public ServerEndpoint apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerEndpoints()
                .update(
                    resourceGroupName,
                    storageSyncServiceName,
                    syncGroupName,
                    serverEndpointName,
                    updateParameters,
                    context);
        return this;
    }

    ServerEndpointImpl(ServerEndpointInner innerObject, StoragesyncManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.storageSyncServiceName = Utils.getValueFromIdByName(innerObject.id(), "storageSyncServices");
        this.syncGroupName = Utils.getValueFromIdByName(innerObject.id(), "syncGroups");
        this.serverEndpointName = Utils.getValueFromIdByName(innerObject.id(), "serverEndpoints");
    }

    public ServerEndpoint refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerEndpoints()
                .getWithResponse(
                    resourceGroupName, storageSyncServiceName, syncGroupName, serverEndpointName, Context.NONE)
                .getValue();
        return this;
    }

    public ServerEndpoint refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerEndpoints()
                .getWithResponse(resourceGroupName, storageSyncServiceName, syncGroupName, serverEndpointName, context)
                .getValue();
        return this;
    }

    public ServerEndpointImpl withServerLocalPath(String serverLocalPath) {
        this.createParameters.withServerLocalPath(serverLocalPath);
        return this;
    }

    public ServerEndpointImpl withCloudTiering(FeatureStatus cloudTiering) {
        if (isInCreateMode()) {
            this.createParameters.withCloudTiering(cloudTiering);
            return this;
        } else {
            this.updateParameters.withCloudTiering(cloudTiering);
            return this;
        }
    }

    public ServerEndpointImpl withVolumeFreeSpacePercent(Integer volumeFreeSpacePercent) {
        if (isInCreateMode()) {
            this.createParameters.withVolumeFreeSpacePercent(volumeFreeSpacePercent);
            return this;
        } else {
            this.updateParameters.withVolumeFreeSpacePercent(volumeFreeSpacePercent);
            return this;
        }
    }

    public ServerEndpointImpl withTierFilesOlderThanDays(Integer tierFilesOlderThanDays) {
        if (isInCreateMode()) {
            this.createParameters.withTierFilesOlderThanDays(tierFilesOlderThanDays);
            return this;
        } else {
            this.updateParameters.withTierFilesOlderThanDays(tierFilesOlderThanDays);
            return this;
        }
    }

    public ServerEndpointImpl withFriendlyName(String friendlyName) {
        this.createParameters.withFriendlyName(friendlyName);
        return this;
    }

    public ServerEndpointImpl withServerResourceId(String serverResourceId) {
        this.createParameters.withServerResourceId(serverResourceId);
        return this;
    }

    public ServerEndpointImpl withOfflineDataTransfer(FeatureStatus offlineDataTransfer) {
        if (isInCreateMode()) {
            this.createParameters.withOfflineDataTransfer(offlineDataTransfer);
            return this;
        } else {
            this.updateParameters.withOfflineDataTransfer(offlineDataTransfer);
            return this;
        }
    }

    public ServerEndpointImpl withOfflineDataTransferShareName(String offlineDataTransferShareName) {
        if (isInCreateMode()) {
            this.createParameters.withOfflineDataTransferShareName(offlineDataTransferShareName);
            return this;
        } else {
            this.updateParameters.withOfflineDataTransferShareName(offlineDataTransferShareName);
            return this;
        }
    }

    public ServerEndpointImpl withInitialDownloadPolicy(InitialDownloadPolicy initialDownloadPolicy) {
        this.createParameters.withInitialDownloadPolicy(initialDownloadPolicy);
        return this;
    }

    public ServerEndpointImpl withLocalCacheMode(LocalCacheMode localCacheMode) {
        if (isInCreateMode()) {
            this.createParameters.withLocalCacheMode(localCacheMode);
            return this;
        } else {
            this.updateParameters.withLocalCacheMode(localCacheMode);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
