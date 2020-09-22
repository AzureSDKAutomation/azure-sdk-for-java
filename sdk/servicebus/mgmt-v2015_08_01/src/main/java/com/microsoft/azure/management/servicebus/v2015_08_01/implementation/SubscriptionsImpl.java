/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.servicebus.v2015_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.servicebus.v2015_08_01.Subscriptions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.servicebus.v2015_08_01.SubscriptionResource;

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
    public SubscriptionResourceImpl define(String name) {
        return wrapModel(name);
    }

    private SubscriptionResourceImpl wrapModel(SubscriptionResourceInner inner) {
        return  new SubscriptionResourceImpl(inner, manager());
    }

    private SubscriptionResourceImpl wrapModel(String name) {
        return new SubscriptionResourceImpl(name, this.manager());
    }

    @Override
    public Observable<SubscriptionResource> listAllAsync(final String resourceGroupName, final String namespaceName, final String topicName) {
        SubscriptionsInner client = this.inner();
        return client.listAllAsync(resourceGroupName, namespaceName, topicName)
        .flatMapIterable(new Func1<Page<SubscriptionResourceInner>, Iterable<SubscriptionResourceInner>>() {
            @Override
            public Iterable<SubscriptionResourceInner> call(Page<SubscriptionResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SubscriptionResourceInner, SubscriptionResource>() {
            @Override
            public SubscriptionResource call(SubscriptionResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<SubscriptionResource> getAsync(String resourceGroupName, String namespaceName, String topicName, String subscriptionName) {
        SubscriptionsInner client = this.inner();
        return client.getAsync(resourceGroupName, namespaceName, topicName, subscriptionName)
        .flatMap(new Func1<SubscriptionResourceInner, Observable<SubscriptionResource>>() {
            @Override
            public Observable<SubscriptionResource> call(SubscriptionResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SubscriptionResource)wrapModel(inner));
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
