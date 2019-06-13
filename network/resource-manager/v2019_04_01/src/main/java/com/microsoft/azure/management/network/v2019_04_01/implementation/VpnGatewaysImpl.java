/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2019_04_01.VpnGateways;
import com.microsoft.azure.management.network.v2019_04_01.VpnGateway;
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

class VpnGatewaysImpl extends GroupableResourcesCoreImpl<VpnGateway, VpnGatewayImpl, VpnGatewayInner, VpnGatewaysInner, NetworkManager>  implements VpnGateways {
    protected VpnGatewaysImpl(NetworkManager manager) {
        super(manager.inner().vpnGateways(), manager);
    }

    @Override
    protected Observable<VpnGatewayInner> getInnerAsync(String resourceGroupName, String name) {
        VpnGatewaysInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VpnGatewaysInner client = this.inner();
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
    public PagedList<VpnGateway> listByResourceGroup(String resourceGroupName) {
        VpnGatewaysInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<VpnGateway> listByResourceGroupAsync(String resourceGroupName) {
        VpnGatewaysInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<VpnGatewayInner>, Iterable<VpnGatewayInner>>() {
            @Override
            public Iterable<VpnGatewayInner> call(Page<VpnGatewayInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VpnGatewayInner, VpnGateway>() {
            @Override
            public VpnGateway call(VpnGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<VpnGateway> list() {
        VpnGatewaysInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<VpnGateway> listAsync() {
        VpnGatewaysInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<VpnGatewayInner>, Iterable<VpnGatewayInner>>() {
            @Override
            public Iterable<VpnGatewayInner> call(Page<VpnGatewayInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VpnGatewayInner, VpnGateway>() {
            @Override
            public VpnGateway call(VpnGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public VpnGatewayImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<VpnGateway> resetAsync(String resourceGroupName, String gatewayName) {
        VpnGatewaysInner client = this.inner();
        return client.resetAsync(resourceGroupName, gatewayName)
        .map(new Func1<VpnGatewayInner, VpnGateway>() {
            @Override
            public VpnGateway call(VpnGatewayInner inner) {
                return new VpnGatewayImpl(inner.name(), inner, manager());
            }
        });
    }

    @Override
    protected VpnGatewayImpl wrapModel(VpnGatewayInner inner) {
        return  new VpnGatewayImpl(inner.name(), inner, manager());
    }

    @Override
    protected VpnGatewayImpl wrapModel(String name) {
        return new VpnGatewayImpl(name, new VpnGatewayInner(), this.manager());
    }

}
