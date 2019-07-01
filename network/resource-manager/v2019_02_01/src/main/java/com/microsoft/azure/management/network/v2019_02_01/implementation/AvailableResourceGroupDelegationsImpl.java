/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_02_01.AvailableResourceGroupDelegations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_02_01.LocationAvailableDelegationModel;

class AvailableResourceGroupDelegationsImpl extends WrapperImpl<AvailableResourceGroupDelegationsInner> implements AvailableResourceGroupDelegations {
    private final NetworkManager manager;

    AvailableResourceGroupDelegationsImpl(NetworkManager manager) {
        super(manager.inner().availableResourceGroupDelegations());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private LocationAvailableDelegationModelImpl wrapLocationAvailableDelegationModelModel(AvailableDelegationInner inner) {
        return  new LocationAvailableDelegationModelImpl(inner, manager());
    }

    @Override
    public Observable<LocationAvailableDelegationModel> listAsync(final String location, final String resourceGroupName) {
        AvailableResourceGroupDelegationsInner client = this.inner();
        return client.listAsync(location, resourceGroupName)
        .flatMapIterable(new Func1<Page<AvailableDelegationInner>, Iterable<AvailableDelegationInner>>() {
            @Override
            public Iterable<AvailableDelegationInner> call(Page<AvailableDelegationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailableDelegationInner, LocationAvailableDelegationModel>() {
            @Override
            public LocationAvailableDelegationModel call(AvailableDelegationInner inner) {
                return wrapLocationAvailableDelegationModelModel(inner);
            }
        });
    }

}
