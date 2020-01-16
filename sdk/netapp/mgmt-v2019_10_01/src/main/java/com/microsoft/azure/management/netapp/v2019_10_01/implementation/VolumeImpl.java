/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_10_01.implementation;

import com.microsoft.azure.management.netapp.v2019_10_01.Volume;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.netapp.v2019_10_01.VolumePatch;
import com.microsoft.azure.management.netapp.v2019_10_01.ServiceLevel;
import com.microsoft.azure.management.netapp.v2019_10_01.VolumePropertiesExportPolicy;
import java.util.List;
import com.microsoft.azure.management.netapp.v2019_10_01.MountTargetList;
import com.microsoft.azure.management.netapp.v2019_10_01.VolumePropertiesDataProtection;
import java.util.Map;
import com.microsoft.azure.management.netapp.v2019_10_01.VolumePatchPropertiesExportPolicy;
import rx.functions.Func1;

class VolumeImpl extends CreatableUpdatableImpl<Volume, VolumeInner, VolumeImpl> implements Volume, Volume.Definition, Volume.Update {
    private final NetAppManager manager;
    private String resourceGroupName;
    private String accountName;
    private String poolName;
    private String volumeName;
    private VolumePatch updateParameter;

    VolumeImpl(String name, NetAppManager manager) {
        super(name, new VolumeInner());
        this.manager = manager;
        // Set resource name
        this.volumeName = name;
        //
        this.updateParameter = new VolumePatch();
    }

    VolumeImpl(VolumeInner inner, NetAppManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.volumeName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "netAppAccounts");
        this.poolName = IdParsingUtils.getValueFromIdByName(inner.id(), "capacityPools");
        this.volumeName = IdParsingUtils.getValueFromIdByName(inner.id(), "volumes");
        //
        this.updateParameter = new VolumePatch();
    }

    @Override
    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Volume> createResourceAsync() {
        VolumesInner client = this.manager().inner().volumes();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.poolName, this.volumeName, this.inner())
            .map(new Func1<VolumeInner, VolumeInner>() {
               @Override
               public VolumeInner call(VolumeInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Volume> updateResourceAsync() {
        VolumesInner client = this.manager().inner().volumes();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.poolName, this.volumeName, this.updateParameter)
            .map(new Func1<VolumeInner, VolumeInner>() {
               @Override
               public VolumeInner call(VolumeInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VolumeInner> getInnerAsync() {
        VolumesInner client = this.manager().inner().volumes();
        return client.getAsync(this.resourceGroupName, this.accountName, this.poolName, this.volumeName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new VolumePatch();
    }

    @Override
    public String baremetalTenantId() {
        return this.inner().baremetalTenantId();
    }

    @Override
    public String creationToken() {
        return this.inner().creationToken();
    }

    @Override
    public VolumePropertiesDataProtection dataProtection() {
        return this.inner().dataProtection();
    }

    @Override
    public VolumePropertiesExportPolicy exportPolicy() {
        return this.inner().exportPolicy();
    }

    @Override
    public String fileSystemId() {
        return this.inner().fileSystemId();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isRestoring() {
        return this.inner().isRestoring();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public List<MountTargetList> mountTargets() {
        return this.inner().mountTargets();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<String> protocolTypes() {
        return this.inner().protocolTypes();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ServiceLevel serviceLevel() {
        return this.inner().serviceLevel();
    }

    @Override
    public String snapshotId() {
        return this.inner().snapshotId();
    }

    @Override
    public String subnetId() {
        return this.inner().subnetId();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public long usageThreshold() {
        return this.inner().usageThreshold();
    }

    @Override
    public String volumeType() {
        return this.inner().volumeType();
    }

    @Override
    public VolumeImpl withExistingCapacityPool(String resourceGroupName, String accountName, String poolName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.poolName = poolName;
        return this;
    }

    @Override
    public VolumeImpl withCreationToken(String creationToken) {
        this.inner().withCreationToken(creationToken);
        return this;
    }

    @Override
    public VolumeImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public VolumeImpl withSubnetId(String subnetId) {
        this.inner().withSubnetId(subnetId);
        return this;
    }

    @Override
    public VolumeImpl withUsageThreshold(long usageThreshold) {
        this.inner().withUsageThreshold(usageThreshold);
        return this;
    }

    @Override
    public VolumeImpl withDataProtection(VolumePropertiesDataProtection dataProtection) {
        this.inner().withDataProtection(dataProtection);
        return this;
    }

    @Override
    public VolumeImpl withExportPolicy(VolumePropertiesExportPolicy exportPolicy) {
        this.inner().withExportPolicy(exportPolicy);
        return this;
    }

    @Override
    public VolumeImpl withIsRestoring(Boolean isRestoring) {
        this.inner().withIsRestoring(isRestoring);
        return this;
    }

    @Override
    public VolumeImpl withMountTargets(List<MountTargetList> mountTargets) {
        this.inner().withMountTargets(mountTargets);
        return this;
    }

    @Override
    public VolumeImpl withProtocolTypes(List<String> protocolTypes) {
        this.inner().withProtocolTypes(protocolTypes);
        return this;
    }

    @Override
    public VolumeImpl withSnapshotId(String snapshotId) {
        this.inner().withSnapshotId(snapshotId);
        return this;
    }

    @Override
    public VolumeImpl withVolumeType(String volumeType) {
        this.inner().withVolumeType(volumeType);
        return this;
    }

    @Override
    public VolumeImpl withExportPolicy(VolumePatchPropertiesExportPolicy exportPolicy) {
        this.updateParameter.withExportPolicy(exportPolicy);
        return this;
    }

    @Override
    public VolumeImpl withUsageThreshold(Long usageThreshold) {
        this.updateParameter.withUsageThreshold(usageThreshold);
        return this;
    }

    @Override
    public VolumeImpl withServiceLevel(ServiceLevel serviceLevel) {
        if (isInCreateMode()) {
            this.inner().withServiceLevel(serviceLevel);
        } else {
            this.updateParameter.withServiceLevel(serviceLevel);
        }
        return this;
    }

    @Override
    public VolumeImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
