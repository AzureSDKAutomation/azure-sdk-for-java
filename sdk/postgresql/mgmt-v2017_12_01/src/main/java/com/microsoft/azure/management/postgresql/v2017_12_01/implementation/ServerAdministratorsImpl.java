/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.postgresql.v2017_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.postgresql.v2017_12_01.ServerAdministrators;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import rx.Completable;
import com.microsoft.azure.management.postgresql.v2017_12_01.ServerAdministratorResource;

class ServerAdministratorsImpl extends WrapperImpl<ServerAdministratorsInner> implements ServerAdministrators {
    private final DBForPostgreSQLManager manager;

    ServerAdministratorsImpl(DBForPostgreSQLManager manager) {
        super(manager.inner().serverAdministrators());
        this.manager = manager;
    }

    public DBForPostgreSQLManager manager() {
        return this.manager;
    }

    private ServerAdministratorResourceImpl wrapModel(ServerAdministratorResourceInner inner) {
        return  new ServerAdministratorResourceImpl(inner, manager());
    }

    @Override
    public Observable<ServerAdministratorResource> getAsync(String resourceGroupName, String serverName) {
        ServerAdministratorsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName)
        .map(new Func1<ServerAdministratorResourceInner, ServerAdministratorResource>() {
            @Override
            public ServerAdministratorResource call(ServerAdministratorResourceInner inner) {
                return new ServerAdministratorResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServerAdministratorResource> createOrUpdateAsync(String resourceGroupName, String serverName, ServerAdministratorResourceInner properties) {
        ServerAdministratorsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, serverName, properties)
        .map(new Func1<ServerAdministratorResourceInner, ServerAdministratorResource>() {
            @Override
            public ServerAdministratorResource call(ServerAdministratorResourceInner inner) {
                return new ServerAdministratorResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName) {
        ServerAdministratorsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName).toCompletable();
    }

    @Override
    public Observable<ServerAdministratorResource> listAsync(String resourceGroupName, String serverName) {
        ServerAdministratorsInner client = this.inner();
        return client.listAsync(resourceGroupName, serverName)
        .flatMap(new Func1<List<ServerAdministratorResourceInner>, Observable<ServerAdministratorResourceInner>>() {
            @Override
            public Observable<ServerAdministratorResourceInner> call(List<ServerAdministratorResourceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ServerAdministratorResourceInner, ServerAdministratorResource>() {
            @Override
            public ServerAdministratorResource call(ServerAdministratorResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
