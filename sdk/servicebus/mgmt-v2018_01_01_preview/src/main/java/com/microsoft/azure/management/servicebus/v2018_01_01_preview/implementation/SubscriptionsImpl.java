/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.Subscriptions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.SBSubscription;

class SubscriptionsImpl extends WrapperImpl<SubscriptionsInner> implements Subscriptions {
    private final ServiceBusManager manager;

    SubscriptionsImpl(ServiceBusManager manager) {
        super(manager.inner().subscriptions());
        this.manager = manager;
    }

    public ServiceBusManager manager() {
        return this.manager;
    }

    @Override
    public SBSubscriptionImpl define(String name) {
        return wrapModel(name);
    }

    private SBSubscriptionImpl wrapModel(SBSubscriptionInner inner) {
        return  new SBSubscriptionImpl(inner, manager());
    }

    private SBSubscriptionImpl wrapModel(String name) {
        return new SBSubscriptionImpl(name, this.manager());
    }

    @Override
    public Observable<SBSubscription> listByTopicAsync(final String resourceGroupName, final String namespaceName, final String topicName) {
        SubscriptionsInner client = this.inner();
        return client.listByTopicAsync(resourceGroupName, namespaceName, topicName)
        .flatMapIterable(new Func1<Page<SBSubscriptionInner>, Iterable<SBSubscriptionInner>>() {
            @Override
            public Iterable<SBSubscriptionInner> call(Page<SBSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SBSubscriptionInner, SBSubscription>() {
            @Override
            public SBSubscription call(SBSubscriptionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<SBSubscription> getAsync(String resourceGroupName, String namespaceName, String topicName, String subscriptionName) {
        SubscriptionsInner client = this.inner();
        return client.getAsync(resourceGroupName, namespaceName, topicName, subscriptionName)
        .flatMap(new Func1<SBSubscriptionInner, Observable<SBSubscription>>() {
            @Override
            public Observable<SBSubscription> call(SBSubscriptionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SBSubscription)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String namespaceName, String topicName, String subscriptionName) {
        SubscriptionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, namespaceName, topicName, subscriptionName).toCompletable();
    }

}
