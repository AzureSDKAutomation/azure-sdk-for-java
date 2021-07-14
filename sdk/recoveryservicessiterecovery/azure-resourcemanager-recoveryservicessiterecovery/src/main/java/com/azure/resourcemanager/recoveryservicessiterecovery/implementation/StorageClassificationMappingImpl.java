// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.StorageClassificationMappingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassificationMapping;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassificationMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassificationMappingProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageMappingInputProperties;

public final class StorageClassificationMappingImpl
    implements StorageClassificationMapping, StorageClassificationMapping.Definition {
    private StorageClassificationMappingInner innerObject;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    StorageClassificationMappingImpl(
        StorageClassificationMappingInner innerObject,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
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

    public StorageClassificationMappingProperties properties() {
        return this.innerModel().properties();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public StorageClassificationMappingInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    private String resourceName;

    private String resourceGroupName;

    private String fabricName;

    private String storageClassificationName;

    private String storageClassificationMappingName;

    private StorageClassificationMappingInput createPairingInput;

    public StorageClassificationMappingImpl withExistingReplicationStorageClassification(
        String resourceName, String resourceGroupName, String fabricName, String storageClassificationName) {
        this.resourceName = resourceName;
        this.resourceGroupName = resourceGroupName;
        this.fabricName = fabricName;
        this.storageClassificationName = storageClassificationName;
        return this;
    }

    public StorageClassificationMapping create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationStorageClassificationMappings()
                .create(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    storageClassificationName,
                    storageClassificationMappingName,
                    createPairingInput,
                    Context.NONE);
        return this;
    }

    public StorageClassificationMapping create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationStorageClassificationMappings()
                .create(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    storageClassificationName,
                    storageClassificationMappingName,
                    createPairingInput,
                    context);
        return this;
    }

    StorageClassificationMappingImpl(
        String name, com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = new StorageClassificationMappingInner();
        this.serviceManager = serviceManager;
        this.storageClassificationMappingName = name;
        this.createPairingInput = new StorageClassificationMappingInput();
    }

    public StorageClassificationMapping refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationStorageClassificationMappings()
                .getWithResponse(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    storageClassificationName,
                    storageClassificationMappingName,
                    Context.NONE)
                .getValue();
        return this;
    }

    public StorageClassificationMapping refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationStorageClassificationMappings()
                .getWithResponse(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    storageClassificationName,
                    storageClassificationMappingName,
                    context)
                .getValue();
        return this;
    }

    public StorageClassificationMappingImpl withProperties(StorageMappingInputProperties properties) {
        this.createPairingInput.withProperties(properties);
        return this;
    }
}
