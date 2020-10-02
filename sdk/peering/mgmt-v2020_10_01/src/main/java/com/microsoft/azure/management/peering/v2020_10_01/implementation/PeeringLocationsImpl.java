/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.peering.v2020_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.peering.v2020_10_01.PeeringLocations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.peering.v2020_10_01.PeeringLocation;

class PeeringLocationsImpl extends WrapperImpl<PeeringLocationsInner> implements PeeringLocations {
    private final PeeringManager manager;

    PeeringLocationsImpl(PeeringManager manager) {
        super(manager.inner().peeringLocations());
        this.manager = manager;
    }

    public PeeringManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PeeringLocation> listAsync(final String kind) {
        PeeringLocationsInner client = this.inner();
        return client.listAsync(kind)
        .flatMapIterable(new Func1<Page<PeeringLocationInner>, Iterable<PeeringLocationInner>>() {
            @Override
            public Iterable<PeeringLocationInner> call(Page<PeeringLocationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PeeringLocationInner, PeeringLocation>() {
            @Override
            public PeeringLocation call(PeeringLocationInner inner) {
                return new PeeringLocationImpl(inner, manager());
            }
        });
    }

}
