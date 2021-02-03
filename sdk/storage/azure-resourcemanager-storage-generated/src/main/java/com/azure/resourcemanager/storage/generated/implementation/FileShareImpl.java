// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.FileShareInner;
import com.azure.resourcemanager.storage.generated.models.DeletedShare;
import com.azure.resourcemanager.storage.generated.models.EnabledProtocols;
import com.azure.resourcemanager.storage.generated.models.FileShare;
import com.azure.resourcemanager.storage.generated.models.GetShareExpand;
import com.azure.resourcemanager.storage.generated.models.RootSquashType;
import com.azure.resourcemanager.storage.generated.models.ShareAccessTier;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class FileShareImpl implements FileShare, FileShare.Definition, FileShare.Update {
    private FileShareInner innerObject;

    private final StorageManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public Map<String, String> metadata() {
        Map<String, String> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Integer shareQuota() {
        return this.innerModel().shareQuota();
    }

    public EnabledProtocols enabledProtocols() {
        return this.innerModel().enabledProtocols();
    }

    public RootSquashType rootSquash() {
        return this.innerModel().rootSquash();
    }

    public String version() {
        return this.innerModel().version();
    }

    public Boolean deleted() {
        return this.innerModel().deleted();
    }

    public OffsetDateTime deletedTime() {
        return this.innerModel().deletedTime();
    }

    public Integer remainingRetentionDays() {
        return this.innerModel().remainingRetentionDays();
    }

    public ShareAccessTier accessTier() {
        return this.innerModel().accessTier();
    }

    public OffsetDateTime accessTierChangeTime() {
        return this.innerModel().accessTierChangeTime();
    }

    public String accessTierStatus() {
        return this.innerModel().accessTierStatus();
    }

    public Long shareUsageBytes() {
        return this.innerModel().shareUsageBytes();
    }

    public FileShareInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String shareName;

    public FileShareImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public FileShare create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFileShares()
                .createWithResponse(resourceGroupName, accountName, shareName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public FileShare create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFileShares()
                .createWithResponse(resourceGroupName, accountName, shareName, this.innerModel(), context)
                .getValue();
        return this;
    }

    FileShareImpl(String name, StorageManager serviceManager) {
        this.innerObject = new FileShareInner();
        this.serviceManager = serviceManager;
        this.shareName = name;
    }

    public FileShareImpl update() {
        return this;
    }

    public FileShare apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFileShares()
                .updateWithResponse(resourceGroupName, accountName, shareName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public FileShare apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFileShares()
                .updateWithResponse(resourceGroupName, accountName, shareName, this.innerModel(), context)
                .getValue();
        return this;
    }

    FileShareImpl(FileShareInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.shareName = Utils.getValueFromIdByName(innerObject.id(), "shares");
    }

    public FileShare refresh() {
        GetShareExpand localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFileShares()
                .getWithResponse(resourceGroupName, accountName, shareName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public FileShare refresh(Context context) {
        GetShareExpand localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFileShares()
                .getWithResponse(resourceGroupName, accountName, shareName, localExpand, context)
                .getValue();
        return this;
    }

    public void restore(DeletedShare deletedShare) {
        serviceManager.fileShares().restore(resourceGroupName, accountName, shareName, deletedShare);
    }

    public Response<Void> restoreWithResponse(DeletedShare deletedShare, Context context) {
        return serviceManager
            .fileShares()
            .restoreWithResponse(resourceGroupName, accountName, shareName, deletedShare, context);
    }

    public FileShareImpl withMetadata(Map<String, String> metadata) {
        this.innerModel().withMetadata(metadata);
        return this;
    }

    public FileShareImpl withShareQuota(Integer shareQuota) {
        this.innerModel().withShareQuota(shareQuota);
        return this;
    }

    public FileShareImpl withEnabledProtocols(EnabledProtocols enabledProtocols) {
        this.innerModel().withEnabledProtocols(enabledProtocols);
        return this;
    }

    public FileShareImpl withRootSquash(RootSquashType rootSquash) {
        this.innerModel().withRootSquash(rootSquash);
        return this;
    }

    public FileShareImpl withAccessTier(ShareAccessTier accessTier) {
        this.innerModel().withAccessTier(accessTier);
        return this;
    }
}
