/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.netapp.v2017_08_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.netapp.v2017_08_15.Snapshots;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.netapp.v2017_08_15.Snapshot;

class SnapshotsImpl extends WrapperImpl<SnapshotsInner> implements Snapshots {
    private final NetAppManager manager;

    SnapshotsImpl(NetAppManager manager) {
        super(manager.inner().snapshots());
        this.manager = manager;
    }

    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public SnapshotImpl define(String name) {
        return wrapModel(name);
    }

    private SnapshotImpl wrapModel(SnapshotInner inner) {
        return  new SnapshotImpl(inner, manager());
    }

    private SnapshotImpl wrapModel(String name) {
        return new SnapshotImpl(name, this.manager());
    }

    @Override
    public Observable<Snapshot> listAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        SnapshotsInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName, poolName, volumeName)
        .flatMap(new Func1<List<SnapshotInner>, Observable<SnapshotInner>>() {
            @Override
            public Observable<SnapshotInner> call(List<SnapshotInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<SnapshotInner, Snapshot>() {
            @Override
            public Snapshot call(SnapshotInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Snapshot> getAsync(String resourceGroupName, String accountName, String poolName, String volumeName, String snapshotName) {
        SnapshotsInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, poolName, volumeName, snapshotName)
        .flatMap(new Func1<SnapshotInner, Observable<Snapshot>>() {
            @Override
            public Observable<Snapshot> call(SnapshotInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Snapshot)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String poolName, String volumeName, String snapshotName) {
        SnapshotsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, poolName, volumeName, snapshotName).toCompletable();
    }

}
