/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupProtectableItems;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.WorkloadProtectableItemResource;

class BackupProtectableItemsImpl extends WrapperImpl<BackupProtectableItemsInner> implements BackupProtectableItems {
    private final RecoveryServicesManager manager;

    BackupProtectableItemsImpl(RecoveryServicesManager manager) {
        super(manager.inner().backupProtectableItems());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private WorkloadProtectableItemResourceImpl wrapModel(WorkloadProtectableItemResourceInner inner) {
        return  new WorkloadProtectableItemResourceImpl(inner, manager());
    }

    @Override
    public Observable<WorkloadProtectableItemResource> listAsync(final String vaultName, final String resourceGroupName) {
        BackupProtectableItemsInner client = this.inner();
        return client.listAsync(vaultName, resourceGroupName)
        .flatMapIterable(new Func1<Page<WorkloadProtectableItemResourceInner>, Iterable<WorkloadProtectableItemResourceInner>>() {
            @Override
            public Iterable<WorkloadProtectableItemResourceInner> call(Page<WorkloadProtectableItemResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkloadProtectableItemResourceInner, WorkloadProtectableItemResource>() {
            @Override
            public WorkloadProtectableItemResource call(WorkloadProtectableItemResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
