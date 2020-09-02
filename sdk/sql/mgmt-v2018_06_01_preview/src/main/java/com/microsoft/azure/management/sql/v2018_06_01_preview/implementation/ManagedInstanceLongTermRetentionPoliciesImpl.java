/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2018_06_01_preview.ManagedInstanceLongTermRetentionPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2018_06_01_preview.ManagedInstanceLongTermRetentionPolicy;

class ManagedInstanceLongTermRetentionPoliciesImpl extends WrapperImpl<ManagedInstanceLongTermRetentionPoliciesInner> implements ManagedInstanceLongTermRetentionPolicies {
    private final SqlManager manager;

    ManagedInstanceLongTermRetentionPoliciesImpl(SqlManager manager) {
        super(manager.inner().managedInstanceLongTermRetentionPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public ManagedInstanceLongTermRetentionPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ManagedInstanceLongTermRetentionPolicyImpl wrapModel(ManagedInstanceLongTermRetentionPolicyInner inner) {
        return  new ManagedInstanceLongTermRetentionPolicyImpl(inner, manager());
    }

    private ManagedInstanceLongTermRetentionPolicyImpl wrapModel(String name) {
        return new ManagedInstanceLongTermRetentionPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ManagedInstanceLongTermRetentionPolicy> listByDatabaseAsync(final String resourceGroupName, final String managedInstanceName, final String databaseName) {
        ManagedInstanceLongTermRetentionPoliciesInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, managedInstanceName, databaseName)
        .flatMapIterable(new Func1<Page<ManagedInstanceLongTermRetentionPolicyInner>, Iterable<ManagedInstanceLongTermRetentionPolicyInner>>() {
            @Override
            public Iterable<ManagedInstanceLongTermRetentionPolicyInner> call(Page<ManagedInstanceLongTermRetentionPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagedInstanceLongTermRetentionPolicyInner, ManagedInstanceLongTermRetentionPolicy>() {
            @Override
            public ManagedInstanceLongTermRetentionPolicy call(ManagedInstanceLongTermRetentionPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ManagedInstanceLongTermRetentionPolicy> getAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        ManagedInstanceLongTermRetentionPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, managedInstanceName, databaseName)
        .flatMap(new Func1<ManagedInstanceLongTermRetentionPolicyInner, Observable<ManagedInstanceLongTermRetentionPolicy>>() {
            @Override
            public Observable<ManagedInstanceLongTermRetentionPolicy> call(ManagedInstanceLongTermRetentionPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ManagedInstanceLongTermRetentionPolicy)wrapModel(inner));
                }
            }
       });
    }

}
