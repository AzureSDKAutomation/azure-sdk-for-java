/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.databoxedge.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.databoxedge.StorageAccounts;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.databoxedge.StorageAccount;

class StorageAccountsImpl extends WrapperImpl<StorageAccountsInner> implements StorageAccounts {
    private final DataBoxEdgeManager manager;

    StorageAccountsImpl(DataBoxEdgeManager manager) {
        super(manager.inner().storageAccounts());
        this.manager = manager;
    }

    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public StorageAccountImpl define(String name) {
        return wrapModel(name);
    }

    private StorageAccountImpl wrapModel(StorageAccountInner inner) {
        return  new StorageAccountImpl(inner, manager());
    }

    private StorageAccountImpl wrapModel(String name) {
        return new StorageAccountImpl(name, this.manager());
    }

    @Override
    public Observable<StorageAccount> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName) {
        StorageAccountsInner client = this.inner();
        return client.listByDataBoxEdgeDeviceAsync(deviceName, resourceGroupName)
        .flatMapIterable(new Func1<Page<StorageAccountInner>, Iterable<StorageAccountInner>>() {
            @Override
            public Iterable<StorageAccountInner> call(Page<StorageAccountInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StorageAccountInner, StorageAccount>() {
            @Override
            public StorageAccount call(StorageAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<StorageAccount> getAsync(String deviceName, String storageAccountName, String resourceGroupName) {
        StorageAccountsInner client = this.inner();
        return client.getAsync(deviceName, storageAccountName, resourceGroupName)
        .flatMap(new Func1<StorageAccountInner, Observable<StorageAccount>>() {
            @Override
            public Observable<StorageAccount> call(StorageAccountInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((StorageAccount)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String deviceName, String storageAccountName, String resourceGroupName) {
        StorageAccountsInner client = this.inner();
        return client.deleteAsync(deviceName, storageAccountName, resourceGroupName).toCompletable();
    }

}
