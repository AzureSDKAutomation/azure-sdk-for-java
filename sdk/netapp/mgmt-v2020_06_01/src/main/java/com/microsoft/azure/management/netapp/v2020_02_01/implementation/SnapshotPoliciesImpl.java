/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.netapp.v2020_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.netapp.v2020_02_01.SnapshotPolicies;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.netapp.v2020_02_01.SnapshotPolicy;
import com.microsoft.azure.management.netapp.v2020_02_01.SnapshotPolicyVolumeList;

class SnapshotPoliciesImpl extends WrapperImpl<SnapshotPoliciesInner> implements SnapshotPolicies {
    private final NetAppManager manager;

    SnapshotPoliciesImpl(NetAppManager manager) {
        super(manager.inner().snapshotPolicies());
        this.manager = manager;
    }

    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public SnapshotPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private SnapshotPolicyImpl wrapModel(SnapshotPolicyInner inner) {
        return  new SnapshotPolicyImpl(inner, manager());
    }

    private SnapshotPolicyImpl wrapModel(String name) {
        return new SnapshotPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<SnapshotPolicy> listAsync(String resourceGroupName, String accountName) {
        SnapshotPoliciesInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<SnapshotPolicyInner>, Observable<SnapshotPolicyInner>>() {
            @Override
            public Observable<SnapshotPolicyInner> call(List<SnapshotPolicyInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<SnapshotPolicyInner, SnapshotPolicy>() {
            @Override
            public SnapshotPolicy call(SnapshotPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<SnapshotPolicy> getAsync(String resourceGroupName, String accountName, String snapshotPolicyName) {
        SnapshotPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, snapshotPolicyName)
        .flatMap(new Func1<SnapshotPolicyInner, Observable<SnapshotPolicy>>() {
            @Override
            public Observable<SnapshotPolicy> call(SnapshotPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SnapshotPolicy)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String snapshotPolicyName) {
        SnapshotPoliciesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, snapshotPolicyName).toCompletable();
    }

    @Override
    public Observable<SnapshotPolicyVolumeList> listVolumesAsync(String resourceGroupName, String accountName, String snapshotPolicyName) {
        SnapshotPoliciesInner client = this.inner();
        return client.listVolumesAsync(resourceGroupName, accountName, snapshotPolicyName)
        .map(new Func1<SnapshotPolicyVolumeListInner, SnapshotPolicyVolumeList>() {
            @Override
            public SnapshotPolicyVolumeList call(SnapshotPolicyVolumeListInner inner) {
                return new SnapshotPolicyVolumeListImpl(inner, manager());
            }
        });
    }

}
