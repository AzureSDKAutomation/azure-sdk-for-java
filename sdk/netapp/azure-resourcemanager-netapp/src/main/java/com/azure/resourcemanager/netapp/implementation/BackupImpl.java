// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.fluent.models.BackupInner;
import com.azure.resourcemanager.netapp.models.Backup;
import com.azure.resourcemanager.netapp.models.BackupPatch;
import java.time.OffsetDateTime;
import java.util.Map;

public final class BackupImpl implements Backup, Backup.Definition, Backup.Update {
    private BackupInner innerObject;

    private final NetAppFilesManager serviceManager;

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

    public String backupId() {
        return this.innerModel().backupId();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Long size() {
        return this.innerModel().size();
    }

    public String label() {
        return this.innerModel().label();
    }

    public String backupType() {
        return this.innerModel().backupType();
    }

    public String failureReason() {
        return this.innerModel().failureReason();
    }

    public String volumeName() {
        return this.innerModel().volumeName();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public BackupInner innerModel() {
        return this.innerObject;
    }

    private NetAppFilesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String poolName;

    private String volumeName;

    private String backupName;

    private BackupPatch updateBody;

    public BackupImpl withExistingVolume(
        String resourceGroupName, String accountName, String poolName, String volumeName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.poolName = poolName;
        this.volumeName = volumeName;
        return this;
    }

    public Backup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackups()
                .create(
                    resourceGroupName, accountName, poolName, volumeName, backupName, this.innerModel(), Context.NONE);
        return this;
    }

    public Backup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackups()
                .create(resourceGroupName, accountName, poolName, volumeName, backupName, this.innerModel(), context);
        return this;
    }

    BackupImpl(String name, NetAppFilesManager serviceManager) {
        this.innerObject = new BackupInner();
        this.serviceManager = serviceManager;
        this.backupName = name;
    }

    public BackupImpl update() {
        this.updateBody = new BackupPatch();
        return this;
    }

    public Backup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackups()
                .update(resourceGroupName, accountName, poolName, volumeName, backupName, updateBody, Context.NONE);
        return this;
    }

    public Backup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackups()
                .update(resourceGroupName, accountName, poolName, volumeName, backupName, updateBody, context);
        return this;
    }

    BackupImpl(BackupInner innerObject, NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "netAppAccounts");
        this.poolName = Utils.getValueFromIdByName(innerObject.id(), "capacityPools");
        this.volumeName = Utils.getValueFromIdByName(innerObject.id(), "volumes");
        this.backupName = Utils.getValueFromIdByName(innerObject.id(), "backups");
    }

    public Backup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackups()
                .getWithResponse(resourceGroupName, accountName, poolName, volumeName, backupName, Context.NONE)
                .getValue();
        return this;
    }

    public Backup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackups()
                .getWithResponse(resourceGroupName, accountName, poolName, volumeName, backupName, context)
                .getValue();
        return this;
    }

    public BackupImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public BackupImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public BackupImpl withLabel(String label) {
        if (isInCreateMode()) {
            this.innerModel().withLabel(label);
            return this;
        } else {
            this.updateBody.withLabel(label);
            return this;
        }
    }

    public BackupImpl withTags(Map<String, String> tags) {
        this.updateBody.withTags(tags);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
