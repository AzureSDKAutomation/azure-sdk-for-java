// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.fluent.models.StorageAccountInner;
import com.azure.resourcemanager.databoxedge.models.DataPolicy;
import com.azure.resourcemanager.databoxedge.models.StorageAccount;
import com.azure.resourcemanager.databoxedge.models.StorageAccountStatus;

public final class StorageAccountImpl implements StorageAccount, StorageAccount.Definition, StorageAccount.Update {
    private StorageAccountInner innerObject;

    private final DataBoxEdgeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String description() {
        return this.innerModel().description();
    }

    public StorageAccountStatus storageAccountStatus() {
        return this.innerModel().storageAccountStatus();
    }

    public DataPolicy dataPolicy() {
        return this.innerModel().dataPolicy();
    }

    public String storageAccountCredentialId() {
        return this.innerModel().storageAccountCredentialId();
    }

    public String blobEndpoint() {
        return this.innerModel().blobEndpoint();
    }

    public Integer containerCount() {
        return this.innerModel().containerCount();
    }

    public StorageAccountInner innerModel() {
        return this.innerObject;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    private String deviceName;

    private String storageAccountName;

    private String resourceGroupName;

    public StorageAccountImpl withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public StorageAccount create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .createOrUpdate(deviceName, storageAccountName, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public StorageAccount create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .createOrUpdate(deviceName, storageAccountName, resourceGroupName, this.innerModel(), context);
        return this;
    }

    public StorageAccountImpl(String name, DataBoxEdgeManager serviceManager) {
        this.innerObject = new StorageAccountInner();
        this.serviceManager = serviceManager;
        this.storageAccountName = name;
    }

    public StorageAccountImpl update() {
        return this;
    }

    public StorageAccount apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .createOrUpdate(deviceName, storageAccountName, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public StorageAccount apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .createOrUpdate(deviceName, storageAccountName, resourceGroupName, this.innerModel(), context);
        return this;
    }

    public StorageAccountImpl(StorageAccountInner innerObject, DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.deviceName = Utils.getValueFromIdByName(innerObject.id(), "dataBoxEdgeDevices");
        this.storageAccountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public StorageAccount refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .getWithResponse(deviceName, storageAccountName, resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public StorageAccount refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .getWithResponse(deviceName, storageAccountName, resourceGroupName, context)
                .getValue();
        return this;
    }

    public StorageAccountImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public StorageAccountImpl withStorageAccountStatus(StorageAccountStatus storageAccountStatus) {
        this.innerModel().withStorageAccountStatus(storageAccountStatus);
        return this;
    }

    public StorageAccountImpl withDataPolicy(DataPolicy dataPolicy) {
        this.innerModel().withDataPolicy(dataPolicy);
        return this;
    }

    public StorageAccountImpl withStorageAccountCredentialId(String storageAccountCredentialId) {
        this.innerModel().withStorageAccountCredentialId(storageAccountCredentialId);
        return this;
    }
}
