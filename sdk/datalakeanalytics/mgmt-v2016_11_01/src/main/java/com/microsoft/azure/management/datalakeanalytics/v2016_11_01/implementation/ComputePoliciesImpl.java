/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datalakeanalytics.v2016_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datalakeanalytics.v2016_11_01.ComputePolicies;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datalakeanalytics.v2016_11_01.ComputePolicy;

class ComputePoliciesImpl extends WrapperImpl<ComputePoliciesInner> implements ComputePolicies {
    private final DataLakeAnalyticsManager manager;

    ComputePoliciesImpl(DataLakeAnalyticsManager manager) {
        super(manager.inner().computePolicies());
        this.manager = manager;
    }

    public DataLakeAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public ComputePolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ComputePolicyImpl wrapModel(ComputePolicyInner inner) {
        return  new ComputePolicyImpl(inner, manager());
    }

    private ComputePolicyImpl wrapModel(String name) {
        return new ComputePolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ComputePolicy> listByAccountAsync(final String resourceGroupName, final String accountName) {
        ComputePoliciesInner client = this.inner();
        return client.listByAccountAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<ComputePolicyInner>, Iterable<ComputePolicyInner>>() {
            @Override
            public Iterable<ComputePolicyInner> call(Page<ComputePolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ComputePolicyInner, ComputePolicy>() {
            @Override
            public ComputePolicy call(ComputePolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ComputePolicy> getAsync(String resourceGroupName, String accountName, String computePolicyName) {
        ComputePoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, computePolicyName)
        .flatMap(new Func1<ComputePolicyInner, Observable<ComputePolicy>>() {
            @Override
            public Observable<ComputePolicy> call(ComputePolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ComputePolicy)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String computePolicyName) {
        ComputePoliciesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, computePolicyName).toCompletable();
    }

}
