/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.SqlVirtualMachineGroup;
import rx.Observable;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.SqlVmGroupImageSku;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.ScaleType;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.ClusterManagerType;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.ClusterConfiguration;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.WsfcDomainProfile;

class SqlVirtualMachineGroupImpl extends GroupableResourceCoreImpl<SqlVirtualMachineGroup, SqlVirtualMachineGroupInner, SqlVirtualMachineGroupImpl, SqlVirtualMachineManager> implements SqlVirtualMachineGroup, SqlVirtualMachineGroup.Definition, SqlVirtualMachineGroup.Update {
    SqlVirtualMachineGroupImpl(String name, SqlVirtualMachineGroupInner inner, SqlVirtualMachineManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<SqlVirtualMachineGroup> createResourceAsync() {
        SqlVirtualMachineGroupsInner client = this.manager().inner().sqlVirtualMachineGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SqlVirtualMachineGroup> updateResourceAsync() {
        SqlVirtualMachineGroupsInner client = this.manager().inner().sqlVirtualMachineGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SqlVirtualMachineGroupInner> getInnerAsync() {
        SqlVirtualMachineGroupsInner client = this.manager().inner().sqlVirtualMachineGroups();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public ClusterConfiguration clusterConfiguration() {
        return this.inner().clusterConfiguration();
    }

    @Override
    public ClusterManagerType clusterManagerType() {
        return this.inner().clusterManagerType();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ScaleType scaleType() {
        return this.inner().scaleType();
    }

    @Override
    public String sqlImageOffer() {
        return this.inner().sqlImageOffer();
    }

    @Override
    public SqlVmGroupImageSku sqlImageSku() {
        return this.inner().sqlImageSku();
    }

    @Override
    public WsfcDomainProfile wsfcDomainProfile() {
        return this.inner().wsfcDomainProfile();
    }

    @Override
    public SqlVirtualMachineGroupImpl withSqlImageOffer(String sqlImageOffer) {
        this.inner().withSqlImageOffer(sqlImageOffer);
        return this;
    }

    @Override
    public SqlVirtualMachineGroupImpl withSqlImageSku(SqlVmGroupImageSku sqlImageSku) {
        this.inner().withSqlImageSku(sqlImageSku);
        return this;
    }

    @Override
    public SqlVirtualMachineGroupImpl withWsfcDomainProfile(WsfcDomainProfile wsfcDomainProfile) {
        this.inner().withWsfcDomainProfile(wsfcDomainProfile);
        return this;
    }

}
