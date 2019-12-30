/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.VCenter;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.UpdateVCenterRequestProperties;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.AddVCenterRequestProperties;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.VCenterProperties;
import rx.functions.Func1;

class VCenterImpl extends CreatableUpdatableImpl<VCenter, VCenterInner, VCenterImpl> implements VCenter, VCenter.Definition, VCenter.Update {
    private final RecoveryServicesManager manager;
    private String fabricName;
    private String vCenterName;
    private AddVCenterRequestProperties cproperties;
    private UpdateVCenterRequestProperties uproperties;

    VCenterImpl(String name, RecoveryServicesManager manager) {
        super(name, new VCenterInner());
        this.manager = manager;
        // Set resource name
        this.vCenterName = name;
        //
        this.cproperties = new AddVCenterRequestProperties();
        this.uproperties = new UpdateVCenterRequestProperties();
    }

    VCenterImpl(VCenterInner inner, RecoveryServicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.vCenterName = inner.name();
        // set resource ancestor and positional variables
        this.fabricName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationFabrics");
        this.vCenterName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationvCenters");
        //
        this.cproperties = new AddVCenterRequestProperties();
        this.uproperties = new UpdateVCenterRequestProperties();
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VCenter> createResourceAsync() {
        ReplicationvCentersInner client = this.manager().inner().replicationvCenters();
        return client.createAsync(this.fabricName, this.vCenterName, this.cproperties)
            .map(new Func1<VCenterInner, VCenterInner>() {
               @Override
               public VCenterInner call(VCenterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VCenter> updateResourceAsync() {
        ReplicationvCentersInner client = this.manager().inner().replicationvCenters();
        return client.updateAsync(this.fabricName, this.vCenterName, this.uproperties)
            .map(new Func1<VCenterInner, VCenterInner>() {
               @Override
               public VCenterInner call(VCenterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VCenterInner> getInnerAsync() {
        ReplicationvCentersInner client = this.manager().inner().replicationvCenters();
        return client.getAsync(this.fabricName, this.vCenterName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new AddVCenterRequestProperties();
        this.uproperties = new UpdateVCenterRequestProperties();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public VCenterProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public VCenterImpl withExistingReplicationFabric(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    @Override
    public VCenterImpl withProperties(AddVCenterRequestProperties properties) {
        this.cproperties = properties;
        return this;
    }

    @Override
    public VCenterImpl withProperties(UpdateVCenterRequestProperties properties) {
        this.uproperties = properties;
        return this;
    }

}
