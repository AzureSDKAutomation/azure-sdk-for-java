/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.Environments;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.DtlEnvironment;

class EnvironmentsImpl extends WrapperImpl<EnvironmentsInner> implements Environments {
    private final DevTestLabsManager manager;

    EnvironmentsImpl(DevTestLabsManager manager) {
        super(manager.inner().environments());
        this.manager = manager;
    }

    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public DtlEnvironmentImpl define(String name) {
        return wrapModel(name);
    }

    private DtlEnvironmentImpl wrapModel(DtlEnvironmentInner inner) {
        return  new DtlEnvironmentImpl(inner, manager());
    }

    private DtlEnvironmentImpl wrapModel(String name) {
        return new DtlEnvironmentImpl(name, this.manager());
    }

    @Override
    public Observable<DtlEnvironment> listAsync(final String resourceGroupName, final String labName, final String userName) {
        EnvironmentsInner client = this.inner();
        return client.listAsync(resourceGroupName, labName, userName)
        .flatMapIterable(new Func1<Page<DtlEnvironmentInner>, Iterable<DtlEnvironmentInner>>() {
            @Override
            public Iterable<DtlEnvironmentInner> call(Page<DtlEnvironmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DtlEnvironmentInner, DtlEnvironment>() {
            @Override
            public DtlEnvironment call(DtlEnvironmentInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DtlEnvironment> getAsync(String resourceGroupName, String labName, String userName, String name) {
        EnvironmentsInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, userName, name)
        .flatMap(new Func1<DtlEnvironmentInner, Observable<DtlEnvironment>>() {
            @Override
            public Observable<DtlEnvironment> call(DtlEnvironmentInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DtlEnvironment)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String labName, String userName, String name) {
        EnvironmentsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, labName, userName, name).toCompletable();
    }

}
