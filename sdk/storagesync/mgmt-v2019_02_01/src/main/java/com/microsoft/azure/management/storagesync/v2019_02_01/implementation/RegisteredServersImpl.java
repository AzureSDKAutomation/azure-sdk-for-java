/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storagesync.v2019_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storagesync.v2019_02_01.RegisteredServers;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.storagesync.v2019_02_01.RegisteredServer;

class RegisteredServersImpl extends WrapperImpl<RegisteredServersInner> implements RegisteredServers {
    private final StorageSyncManager manager;

    RegisteredServersImpl(StorageSyncManager manager) {
        super(manager.inner().registeredServers());
        this.manager = manager;
    }

    public StorageSyncManager manager() {
        return this.manager;
    }

    @Override
    public RegisteredServerImpl define(String name) {
        return wrapModel(name);
    }

    private RegisteredServerImpl wrapModel(RegisteredServerInner inner) {
        return  new RegisteredServerImpl(inner, manager());
    }

    private RegisteredServerImpl wrapModel(String name) {
        return new RegisteredServerImpl(name, this.manager());
    }

    @Override
    public Completable triggerRolloverAsync(String resourceGroupName, String storageSyncServiceName, String serverId) {
        RegisteredServersInner client = this.inner();
        return client.triggerRolloverAsync(resourceGroupName, storageSyncServiceName, serverId).toCompletable();
    }

    @Override
    public Observable<RegisteredServer> listByStorageSyncServiceAsync(String resourceGroupName, String storageSyncServiceName) {
        RegisteredServersInner client = this.inner();
        return client.listByStorageSyncServiceAsync(resourceGroupName, storageSyncServiceName)
        .flatMap(new Func1<List<RegisteredServerInner>, Observable<RegisteredServerInner>>() {
            @Override
            public Observable<RegisteredServerInner> call(List<RegisteredServerInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<RegisteredServerInner, RegisteredServer>() {
            @Override
            public RegisteredServer call(RegisteredServerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<RegisteredServer> getAsync(String resourceGroupName, String storageSyncServiceName, String serverId) {
        RegisteredServersInner client = this.inner();
        return client.getAsync(resourceGroupName, storageSyncServiceName, serverId)
        .flatMap(new Func1<RegisteredServerInner, Observable<RegisteredServer>>() {
            @Override
            public Observable<RegisteredServer> call(RegisteredServerInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((RegisteredServer)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String storageSyncServiceName, String serverId) {
        RegisteredServersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, storageSyncServiceName, serverId).toCompletable();
    }

}
