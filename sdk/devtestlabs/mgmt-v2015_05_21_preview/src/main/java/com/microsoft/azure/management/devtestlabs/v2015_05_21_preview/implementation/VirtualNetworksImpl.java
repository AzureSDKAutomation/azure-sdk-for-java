/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.VirtualNetworks;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.VirtualNetwork;

class VirtualNetworksImpl extends WrapperImpl<VirtualNetworksInner> implements VirtualNetworks {
    private final DevTestLabsManager manager;

    VirtualNetworksImpl(DevTestLabsManager manager) {
        super(manager.inner().virtualNetworks());
        this.manager = manager;
    }

    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public VirtualNetworkImpl define(String name) {
        return wrapModel(name);
    }

    private VirtualNetworkImpl wrapModel(VirtualNetworkInner inner) {
        return  new VirtualNetworkImpl(inner, manager());
    }

    private VirtualNetworkImpl wrapModel(String name) {
        return new VirtualNetworkImpl(name, this.manager());
    }

    @Override
    public Observable<VirtualNetwork> listAsync(final String resourceGroupName, final String labName) {
        VirtualNetworksInner client = this.inner();
        return client.listAsync(resourceGroupName, labName)
        .flatMapIterable(new Func1<Page<VirtualNetworkInner>, Iterable<VirtualNetworkInner>>() {
            @Override
            public Iterable<VirtualNetworkInner> call(Page<VirtualNetworkInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkInner, VirtualNetwork>() {
            @Override
            public VirtualNetwork call(VirtualNetworkInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<VirtualNetwork> getResourceAsync(String resourceGroupName, String labName, String name) {
        VirtualNetworksInner client = this.inner();
        return client.getResourceAsync(resourceGroupName, labName, name)
        .flatMap(new Func1<VirtualNetworkInner, Observable<VirtualNetwork>>() {
            @Override
            public Observable<VirtualNetwork> call(VirtualNetworkInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VirtualNetwork)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteResourceAsync(String resourceGroupName, String labName, String name) {
        VirtualNetworksInner client = this.inner();
        return client.deleteResourceAsync(resourceGroupName, labName, name).toCompletable();
    }

}
