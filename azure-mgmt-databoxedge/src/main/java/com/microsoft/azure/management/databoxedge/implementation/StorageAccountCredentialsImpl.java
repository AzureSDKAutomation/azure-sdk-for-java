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
import com.microsoft.azure.management.databoxedge.StorageAccountCredentials;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.databoxedge.StorageAccountCredential;

class StorageAccountCredentialsImpl extends WrapperImpl<StorageAccountCredentialsInner> implements StorageAccountCredentials {
    private final DataBoxEdgeManager manager;

    StorageAccountCredentialsImpl(DataBoxEdgeManager manager) {
        super(manager.inner().storageAccountCredentials());
        this.manager = manager;
    }

    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public StorageAccountCredentialImpl define(String name) {
        return wrapModel(name);
    }

    private StorageAccountCredentialImpl wrapModel(StorageAccountCredentialInner inner) {
        return  new StorageAccountCredentialImpl(inner, manager());
    }

    private StorageAccountCredentialImpl wrapModel(String name) {
        return new StorageAccountCredentialImpl(name, this.manager());
    }

    @Override
    public Observable<StorageAccountCredential> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName) {
        StorageAccountCredentialsInner client = this.inner();
        return client.listByDataBoxEdgeDeviceAsync(deviceName, resourceGroupName)
        .flatMapIterable(new Func1<Page<StorageAccountCredentialInner>, Iterable<StorageAccountCredentialInner>>() {
            @Override
            public Iterable<StorageAccountCredentialInner> call(Page<StorageAccountCredentialInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StorageAccountCredentialInner, StorageAccountCredential>() {
            @Override
            public StorageAccountCredential call(StorageAccountCredentialInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<StorageAccountCredential> getAsync(String deviceName, String name, String resourceGroupName) {
        StorageAccountCredentialsInner client = this.inner();
        return client.getAsync(deviceName, name, resourceGroupName)
        .flatMap(new Func1<StorageAccountCredentialInner, Observable<StorageAccountCredential>>() {
            @Override
            public Observable<StorageAccountCredential> call(StorageAccountCredentialInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((StorageAccountCredential)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String deviceName, String name, String resourceGroupName) {
        StorageAccountCredentialsInner client = this.inner();
        return client.deleteAsync(deviceName, name, resourceGroupName).toCompletable();
    }

}
