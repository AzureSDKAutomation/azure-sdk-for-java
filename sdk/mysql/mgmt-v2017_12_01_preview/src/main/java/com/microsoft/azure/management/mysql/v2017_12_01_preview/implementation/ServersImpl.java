/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.mysql.v2017_12_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.Servers;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.Server;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ServersImpl extends GroupableResourcesCoreImpl<Server, ServerImpl, ServerInner, ServersInner, DBforMySQLManager>  implements Servers {
    protected ServersImpl(DBforMySQLManager manager) {
        super(manager.inner().servers(), manager);
    }

    @Override
    protected Observable<ServerInner> getInnerAsync(String resourceGroupName, String name) {
        ServersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ServersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Server> listByResourceGroup(String resourceGroupName) {
        ServersInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Server> listByResourceGroupAsync(String resourceGroupName) {
        ServersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<ServerInner>, Observable<ServerInner>>() {
            @Override
            public Observable<ServerInner> call(Page<ServerInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<ServerInner, Server>() {
            @Override
            public Server call(ServerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Server> list() {
        ServersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Server> listAsync() {
        ServersInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<ServerInner>, Observable<ServerInner>>() {
            @Override
            public Observable<ServerInner> call(Page<ServerInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<ServerInner, Server>() {
            @Override
            public Server call(ServerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ServerImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable restartAsync(String resourceGroupName, String serverName) {
        ServersInner client = this.inner();
        return client.restartAsync(resourceGroupName, serverName).toCompletable();
    }

    @Override
    protected ServerImpl wrapModel(ServerInner inner) {
        return  new ServerImpl(inner.name(), inner, manager());
    }

    @Override
    protected ServerImpl wrapModel(String name) {
        return new ServerImpl(name, new ServerInner(), this.manager());
    }

}
