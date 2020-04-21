/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020-03-01.implementation;

import com.microsoft.azure.management.storagecache.v2020-03-01.StorageTarget;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.storagecache.v2020-03-01.NamespaceJunction;
import com.microsoft.azure.management.storagecache.v2020-03-01.ProvisioningStateType;
import com.microsoft.azure.management.storagecache.v2020-03-01.Nfs3Target;
import com.microsoft.azure.management.storagecache.v2020-03-01.ClfsTarget;
import com.microsoft.azure.management.storagecache.v2020-03-01.UnknownTarget;

class StorageTargetImpl extends CreatableUpdatableImpl<StorageTarget, StorageTargetInner, StorageTargetImpl> implements StorageTarget, StorageTarget.Definition, StorageTarget.Update {
    private final StorageCacheManager manager;
    private String resourceGroupName;
    private String cacheName;
    private String storageTargetName;

    StorageTargetImpl(String name, StorageCacheManager manager) {
        super(name, new StorageTargetInner());
        this.manager = manager;
        // Set resource name
        this.storageTargetName = name;
        //
    }

    StorageTargetImpl(StorageTargetInner inner, StorageCacheManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.storageTargetName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.cacheName = IdParsingUtils.getValueFromIdByName(inner.id(), "caches");
        this.storageTargetName = IdParsingUtils.getValueFromIdByName(inner.id(), "storageTargets");
        //
    }

    @Override
    public StorageCacheManager manager() {
        return this.manager;
    }

    @Override
    public Observable<StorageTarget> createResourceAsync() {
        StorageTargetsInner client = this.manager().inner().storageTargets();
        return client.createOrUpdateAsync(this.resourceGroupName, this.cacheName, this.storageTargetName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<StorageTarget> updateResourceAsync() {
        StorageTargetsInner client = this.manager().inner().storageTargets();
        return client.createOrUpdateAsync(this.resourceGroupName, this.cacheName, this.storageTargetName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<StorageTargetInner> getInnerAsync() {
        StorageTargetsInner client = this.manager().inner().storageTargets();
        return client.getAsync(this.resourceGroupName, this.cacheName, this.storageTargetName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public ClfsTarget clfs() {
        return this.inner().clfs();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<NamespaceJunction> junctions() {
        return this.inner().junctions();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Nfs3Target nfs3() {
        return this.inner().nfs3();
    }

    @Override
    public ProvisioningStateType provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String targetType() {
        return this.inner().targetType();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public UnknownTarget unknown() {
        return this.inner().unknown();
    }

    @Override
    public StorageTargetImpl withExistingCach(String resourceGroupName, String cacheName) {
        this.resourceGroupName = resourceGroupName;
        this.cacheName = cacheName;
        return this;
    }

    @Override
    public StorageTargetImpl withClfs(ClfsTarget clfs) {
        this.inner().withClfs(clfs);
        return this;
    }

    @Override
    public StorageTargetImpl withJunctions(List<NamespaceJunction> junctions) {
        this.inner().withJunctions(junctions);
        return this;
    }

    @Override
    public StorageTargetImpl withNfs3(Nfs3Target nfs3) {
        this.inner().withNfs3(nfs3);
        return this;
    }

    @Override
    public StorageTargetImpl withProvisioningState(ProvisioningStateType provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public StorageTargetImpl withTargetType(String targetType) {
        this.inner().withTargetType(targetType);
        return this;
    }

    @Override
    public StorageTargetImpl withUnknown(UnknownTarget unknown) {
        this.inner().withUnknown(unknown);
        return this;
    }

}
