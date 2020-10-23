/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.databoxedge.v2019_07_01.Orders;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.databoxedge.v2019_07_01.Order;

class OrdersImpl extends WrapperImpl<OrdersInner> implements Orders {
    private final DataBoxEdgeManager manager;

    OrdersImpl(DataBoxEdgeManager manager) {
        super(manager.inner().orders());
        this.manager = manager;
    }

    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    private OrderImpl wrapModel(OrderInner inner) {
        return  new OrderImpl(inner, manager());
    }

    @Override
    public Observable<Order> getAsync(String deviceName, String resourceGroupName) {
        OrdersInner client = this.inner();
        return client.getAsync(deviceName, resourceGroupName)
        .map(new Func1<OrderInner, Order>() {
            @Override
            public Order call(OrderInner inner) {
                return new OrderImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Order> createOrUpdateAsync(String deviceName, String resourceGroupName, OrderInner order) {
        OrdersInner client = this.inner();
        return client.createOrUpdateAsync(deviceName, resourceGroupName, order)
        .map(new Func1<OrderInner, Order>() {
            @Override
            public Order call(OrderInner inner) {
                return new OrderImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String deviceName, String resourceGroupName) {
        OrdersInner client = this.inner();
        return client.deleteAsync(deviceName, resourceGroupName).toCompletable();
    }

    @Override
    public Observable<Order> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName) {
        OrdersInner client = this.inner();
        return client.listByDataBoxEdgeDeviceAsync(deviceName, resourceGroupName)
        .flatMapIterable(new Func1<Page<OrderInner>, Iterable<OrderInner>>() {
            @Override
            public Iterable<OrderInner> call(Page<OrderInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OrderInner, Order>() {
            @Override
            public Order call(OrderInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
