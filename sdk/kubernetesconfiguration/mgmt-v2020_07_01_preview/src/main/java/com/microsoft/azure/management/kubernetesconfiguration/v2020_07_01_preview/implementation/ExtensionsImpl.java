/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.kubernetesconfiguration.v2020_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.kubernetesconfiguration.v2020_07_01_preview.Extensions;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.kubernetesconfiguration.v2020_07_01_preview.ExtensionInstance;
import com.microsoft.azure.management.kubernetesconfiguration.v2020_07_01_preview.ExtensionInstanceForList;

class ExtensionsImpl extends WrapperImpl<ExtensionsInner> implements Extensions {
    private final KubernetesConfigurationManager manager;

    ExtensionsImpl(KubernetesConfigurationManager manager) {
        super(manager.inner().extensions());
        this.manager = manager;
    }

    public KubernetesConfigurationManager manager() {
        return this.manager;
    }

    @Override
    public ExtensionInstanceImpl define(String name) {
        return wrapModel(name);
    }

    private ExtensionInstanceImpl wrapModel(ExtensionInstanceInner inner) {
        return  new ExtensionInstanceImpl(inner, manager());
    }

    private ExtensionInstanceImpl wrapModel(String name) {
        return new ExtensionInstanceImpl(name, this.manager());
    }

    @Override
    public Observable<ExtensionInstance> getAsync(String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName, String extensionInstanceName) {
        ExtensionsInner client = this.inner();
        return client.getAsync(resourceGroupName, clusterRp, clusterResourceName, clusterName, extensionInstanceName)
        .map(new Func1<ExtensionInstanceInner, ExtensionInstance>() {
            @Override
            public ExtensionInstance call(ExtensionInstanceInner inner) {
                return new ExtensionInstanceImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName, String extensionInstanceName) {
        ExtensionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, clusterRp, clusterResourceName, clusterName, extensionInstanceName).toCompletable();
    }

    @Override
    public Observable<ExtensionInstanceForList> listAsync(final String resourceGroupName, final String clusterRp, final String clusterResourceName, final String clusterName) {
        ExtensionsInner client = this.inner();
        return client.listAsync(resourceGroupName, clusterRp, clusterResourceName, clusterName)
        .flatMapIterable(new Func1<Page<ExtensionInstanceForListInner>, Iterable<ExtensionInstanceForListInner>>() {
            @Override
            public Iterable<ExtensionInstanceForListInner> call(Page<ExtensionInstanceForListInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExtensionInstanceForListInner, ExtensionInstanceForList>() {
            @Override
            public ExtensionInstanceForList call(ExtensionInstanceForListInner inner) {
                return new ExtensionInstanceForListImpl(inner, manager());
            }
        });
    }

}
