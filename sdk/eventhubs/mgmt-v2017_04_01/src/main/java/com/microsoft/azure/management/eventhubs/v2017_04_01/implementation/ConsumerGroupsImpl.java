/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.eventhubs.v2017_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventhubs.v2017_04_01.ConsumerGroups;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.eventhubs.v2017_04_01.ConsumerGroup;

class ConsumerGroupsImpl extends WrapperImpl<ConsumerGroupsInner> implements ConsumerGroups {
    private final EventHubsManager manager;

    ConsumerGroupsImpl(EventHubsManager manager) {
        super(manager.inner().consumerGroups());
        this.manager = manager;
    }

    public EventHubsManager manager() {
        return this.manager;
    }

    @Override
    public ConsumerGroupImpl define(String name) {
        return wrapModel(name);
    }

    private ConsumerGroupImpl wrapModel(ConsumerGroupInner inner) {
        return  new ConsumerGroupImpl(inner, manager());
    }

    private ConsumerGroupImpl wrapModel(String name) {
        return new ConsumerGroupImpl(name, this.manager());
    }

    @Override
    public Observable<ConsumerGroup> listByEventHubAsync(final String resourceGroupName, final String namespaceName, final String eventHubName) {
        ConsumerGroupsInner client = this.inner();
        return client.listByEventHubAsync(resourceGroupName, namespaceName, eventHubName)
        .flatMapIterable(new Func1<Page<ConsumerGroupInner>, Iterable<ConsumerGroupInner>>() {
            @Override
            public Iterable<ConsumerGroupInner> call(Page<ConsumerGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ConsumerGroupInner, ConsumerGroup>() {
            @Override
            public ConsumerGroup call(ConsumerGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ConsumerGroup> getAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        ConsumerGroupsInner client = this.inner();
        return client.getAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName)
        .flatMap(new Func1<ConsumerGroupInner, Observable<ConsumerGroup>>() {
            @Override
            public Observable<ConsumerGroup> call(ConsumerGroupInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ConsumerGroup)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        ConsumerGroupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName).toCompletable();
    }

}
