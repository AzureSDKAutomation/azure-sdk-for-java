// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storagesync.StoragesyncManager;
import com.azure.resourcemanager.storagesync.fluent.models.SyncGroupInner;
import com.azure.resourcemanager.storagesync.models.SyncGroup;
import com.azure.resourcemanager.storagesync.models.SyncGroupCreateParameters;

public final class SyncGroupImpl implements SyncGroup, SyncGroup.Definition {
    private SyncGroupInner innerObject;

    private final StoragesyncManager serviceManager;

    SyncGroupImpl(SyncGroupInner innerObject, StoragesyncManager serviceManager) {
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

    public String uniqueId() {
        return this.innerModel().uniqueId();
    }

    public String syncGroupStatus() {
        return this.innerModel().syncGroupStatus();
    }

    public SyncGroupInner innerModel() {
        return this.innerObject;
    }

    private StoragesyncManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String storageSyncServiceName;

    private String syncGroupName;

    private SyncGroupCreateParameters createParameters;

    public SyncGroupImpl withExistingStorageSyncService(String resourceGroupName, String storageSyncServiceName) {
        this.resourceGroupName = resourceGroupName;
        this.storageSyncServiceName = storageSyncServiceName;
        return this;
    }

    public SyncGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncGroups()
                .createWithResponse(
                    resourceGroupName, storageSyncServiceName, syncGroupName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public SyncGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncGroups()
                .createWithResponse(resourceGroupName, storageSyncServiceName, syncGroupName, createParameters, context)
                .getValue();
        return this;
    }

    SyncGroupImpl(String name, StoragesyncManager serviceManager) {
        this.innerObject = new SyncGroupInner();
        this.serviceManager = serviceManager;
        this.syncGroupName = name;
        this.createParameters = new SyncGroupCreateParameters();
    }

    public SyncGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncGroups()
                .getWithResponse(resourceGroupName, storageSyncServiceName, syncGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public SyncGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncGroups()
                .getWithResponse(resourceGroupName, storageSyncServiceName, syncGroupName, context)
                .getValue();
        return this;
    }

    public SyncGroupImpl withProperties(Object properties) {
        this.createParameters.withProperties(properties);
        return this;
    }
}
