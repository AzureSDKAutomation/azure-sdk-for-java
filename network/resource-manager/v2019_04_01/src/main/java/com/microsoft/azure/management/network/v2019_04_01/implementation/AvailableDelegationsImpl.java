/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_04_01.AvailableDelegations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_04_01.LocationAvailableDelegation;

class AvailableDelegationsImpl extends WrapperImpl<AvailableDelegationsInner> implements AvailableDelegations {
    private final NetworkManager manager;

    AvailableDelegationsImpl(NetworkManager manager) {
        super(manager.inner().availableDelegations());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private LocationAvailableDelegationImpl wrapModel(AvailableDelegationInner inner) {
        return  new LocationAvailableDelegationImpl(inner, manager());
    }

    @Override
    public Observable<LocationAvailableDelegation> listAsync(final String location) {
        AvailableDelegationsInner client = this.inner();
        return client.listAsync(location)
        .flatMapIterable(new Func1<Page<AvailableDelegationInner>, Iterable<AvailableDelegationInner>>() {
            @Override
            public Iterable<AvailableDelegationInner> call(Page<AvailableDelegationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailableDelegationInner, LocationAvailableDelegation>() {
            @Override
            public LocationAvailableDelegation call(AvailableDelegationInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
