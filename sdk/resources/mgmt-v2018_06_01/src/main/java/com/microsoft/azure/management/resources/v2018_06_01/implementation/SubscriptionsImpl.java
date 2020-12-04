/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.resources.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2018_06_01.Subscriptions;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resources.v2018_06_01.Subscription;
import java.util.List;
import com.microsoft.azure.management.resources.v2018_06_01.Location;

class SubscriptionsImpl extends WrapperImpl<SubscriptionsInner> implements Subscriptions {
    private final ResourcesManager manager;

    SubscriptionsImpl(ResourcesManager manager) {
        super(manager.inner().subscriptions());
        this.manager = manager;
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Subscription> getAsync(String subscriptionId) {
        SubscriptionsInner client = this.inner();
        return client.getAsync(subscriptionId)
        .map(new Func1<SubscriptionInner, Subscription>() {
            @Override
            public Subscription call(SubscriptionInner inner) {
                return new SubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Subscription> listAsync() {
        SubscriptionsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<SubscriptionInner>, Iterable<SubscriptionInner>>() {
            @Override
            public Iterable<SubscriptionInner> call(Page<SubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SubscriptionInner, Subscription>() {
            @Override
            public Subscription call(SubscriptionInner inner) {
                return new SubscriptionImpl(inner, manager());
            }
        });
    }

    private LocationImpl wrapLocationModel(LocationInner inner) {
        return  new LocationImpl(inner, manager());
    }

    @Override
    public Observable<Location> listLocationsAsync(String subscriptionId) {
        SubscriptionsInner client = this.inner();
        return client.listLocationsAsync(subscriptionId)
        .flatMap(new Func1<List<LocationInner>, Observable<LocationInner>>() {
            @Override
            public Observable<LocationInner> call(List<LocationInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<LocationInner, Location>() {
            @Override
            public Location call(LocationInner inner) {
                return wrapLocationModel(inner);
            }
        });
    }

}
