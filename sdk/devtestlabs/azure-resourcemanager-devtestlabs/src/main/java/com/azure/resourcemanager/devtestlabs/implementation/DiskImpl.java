// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.fluent.models.DiskInner;
import com.azure.resourcemanager.devtestlabs.models.AttachDiskProperties;
import com.azure.resourcemanager.devtestlabs.models.DetachDiskProperties;
import com.azure.resourcemanager.devtestlabs.models.Disk;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import com.azure.resourcemanager.devtestlabs.models.UpdateResource;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class DiskImpl implements Disk, Disk.Definition, Disk.Update {
    private DiskInner innerObject;

    private final DevTestLabsManager serviceManager;

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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public StorageType diskType() {
        return this.innerModel().diskType();
    }

    public Integer diskSizeGiB() {
        return this.innerModel().diskSizeGiB();
    }

    public String leasedByLabVmId() {
        return this.innerModel().leasedByLabVmId();
    }

    public String diskBlobName() {
        return this.innerModel().diskBlobName();
    }

    public String diskUri() {
        return this.innerModel().diskUri();
    }

    public String storageAccountId() {
        return this.innerModel().storageAccountId();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public String hostCaching() {
        return this.innerModel().hostCaching();
    }

    public String managedDiskId() {
        return this.innerModel().managedDiskId();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DiskInner innerModel() {
        return this.innerObject;
    }

    private DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labName;

    private String username;

    private String name;

    private UpdateResource updateDisk;

    public DiskImpl withExistingUser(String resourceGroupName, String labName, String username) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        this.username = username;
        return this;
    }

    public Disk create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisks()
                .createOrUpdate(resourceGroupName, labName, username, name, this.innerModel(), Context.NONE);
        return this;
    }

    public Disk create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisks()
                .createOrUpdate(resourceGroupName, labName, username, name, this.innerModel(), context);
        return this;
    }

    DiskImpl(String name, DevTestLabsManager serviceManager) {
        this.innerObject = new DiskInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public DiskImpl update() {
        this.updateDisk = new UpdateResource();
        return this;
    }

    public Disk apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisks()
                .updateWithResponse(resourceGroupName, labName, username, name, updateDisk, Context.NONE)
                .getValue();
        return this;
    }

    public Disk apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisks()
                .updateWithResponse(resourceGroupName, labName, username, name, updateDisk, context)
                .getValue();
        return this;
    }

    DiskImpl(DiskInner innerObject, DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labName = Utils.getValueFromIdByName(innerObject.id(), "labs");
        this.username = Utils.getValueFromIdByName(innerObject.id(), "users");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "disks");
    }

    public Disk refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisks()
                .getWithResponse(resourceGroupName, labName, username, name, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public Disk refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDisks()
                .getWithResponse(resourceGroupName, labName, username, name, localExpand, context)
                .getValue();
        return this;
    }

    public void attach(AttachDiskProperties attachDiskProperties) {
        serviceManager.disks().attach(resourceGroupName, labName, username, name, attachDiskProperties);
    }

    public void attach(AttachDiskProperties attachDiskProperties, Context context) {
        serviceManager.disks().attach(resourceGroupName, labName, username, name, attachDiskProperties, context);
    }

    public void detach(DetachDiskProperties detachDiskProperties) {
        serviceManager.disks().detach(resourceGroupName, labName, username, name, detachDiskProperties);
    }

    public void detach(DetachDiskProperties detachDiskProperties, Context context) {
        serviceManager.disks().detach(resourceGroupName, labName, username, name, detachDiskProperties, context);
    }

    public DiskImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DiskImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DiskImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateDisk.withTags(tags);
            return this;
        }
    }

    public DiskImpl withDiskType(StorageType diskType) {
        this.innerModel().withDiskType(diskType);
        return this;
    }

    public DiskImpl withDiskSizeGiB(Integer diskSizeGiB) {
        this.innerModel().withDiskSizeGiB(diskSizeGiB);
        return this;
    }

    public DiskImpl withLeasedByLabVmId(String leasedByLabVmId) {
        this.innerModel().withLeasedByLabVmId(leasedByLabVmId);
        return this;
    }

    public DiskImpl withDiskBlobName(String diskBlobName) {
        this.innerModel().withDiskBlobName(diskBlobName);
        return this;
    }

    public DiskImpl withDiskUri(String diskUri) {
        this.innerModel().withDiskUri(diskUri);
        return this;
    }

    public DiskImpl withStorageAccountId(String storageAccountId) {
        this.innerModel().withStorageAccountId(storageAccountId);
        return this;
    }

    public DiskImpl withHostCaching(String hostCaching) {
        this.innerModel().withHostCaching(hostCaching);
        return this;
    }

    public DiskImpl withManagedDiskId(String managedDiskId) {
        this.innerModel().withManagedDiskId(managedDiskId);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
