/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2019_11_01.MetricNamespaces;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.monitor.v2019_11_01.MetricNamespace;

class MetricNamespacesImpl extends WrapperImpl<MetricNamespacesInner> implements MetricNamespaces {
    private final MonitorManager manager;

    MetricNamespacesImpl(MonitorManager manager) {
        super(manager.inner().metricNamespaces());
        this.manager = manager;
    }

    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<MetricNamespace> listAsync(String resourceUri) {
        MetricNamespacesInner client = this.inner();
        return client.listAsync(resourceUri)
        .flatMap(new Func1<List<MetricNamespaceInner>, Observable<MetricNamespaceInner>>() {
            @Override
            public Observable<MetricNamespaceInner> call(List<MetricNamespaceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricNamespaceInner, MetricNamespace>() {
            @Override
            public MetricNamespace call(MetricNamespaceInner inner) {
                return new MetricNamespaceImpl(inner, manager());
            }
        });
    }

}
