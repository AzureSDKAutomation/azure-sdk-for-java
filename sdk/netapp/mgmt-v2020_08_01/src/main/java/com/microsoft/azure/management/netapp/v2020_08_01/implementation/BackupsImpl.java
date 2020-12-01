/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.netapp.v2020_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.netapp.v2020_08_01.Backups;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.netapp.v2020_08_01.CapacityPoolNetAppAccountBackup;

class BackupsImpl extends WrapperImpl<BackupsInner> implements Backups {
    private final NetAppManager manager;

    BackupsImpl(NetAppManager manager) {
        super(manager.inner().backups());
        this.manager = manager;
    }

    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public CapacityPoolNetAppAccountBackupImpl define(String name) {
        return wrapModel(name);
    }

    private CapacityPoolNetAppAccountBackupImpl wrapModel(BackupInner inner) {
        return  new CapacityPoolNetAppAccountBackupImpl(inner, manager());
    }

    private CapacityPoolNetAppAccountBackupImpl wrapModel(String name) {
        return new CapacityPoolNetAppAccountBackupImpl(name, this.manager());
    }

    @Override
    public Observable<CapacityPoolNetAppAccountBackup> listAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        BackupsInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName, poolName, volumeName)
        .flatMap(new Func1<List<BackupInner>, Observable<BackupInner>>() {
            @Override
            public Observable<BackupInner> call(List<BackupInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<BackupInner, CapacityPoolNetAppAccountBackup>() {
            @Override
            public CapacityPoolNetAppAccountBackup call(BackupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<CapacityPoolNetAppAccountBackup> getAsync(String resourceGroupName, String accountName, String poolName, String volumeName, String backupName) {
        BackupsInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, poolName, volumeName, backupName)
        .flatMap(new Func1<BackupInner, Observable<CapacityPoolNetAppAccountBackup>>() {
            @Override
            public Observable<CapacityPoolNetAppAccountBackup> call(BackupInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((CapacityPoolNetAppAccountBackup)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String poolName, String volumeName, String backupName) {
        BackupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, poolName, volumeName, backupName).toCompletable();
    }

}
