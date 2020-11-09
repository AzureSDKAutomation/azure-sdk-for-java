/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2019_08_01_preview.ManagementPolicies;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.storage.v2019_08_01_preview.ManagementPolicy;

class ManagementPoliciesImpl extends WrapperImpl<ManagementPoliciesInner> implements ManagementPolicies {
    private final StorageManager manager;

    ManagementPoliciesImpl(StorageManager manager) {
        super(manager.inner().managementPolicies());
        this.manager = manager;
    }

    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public ManagementPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ManagementPolicyImpl wrapModel(ManagementPolicyInner inner) {
        return  new ManagementPolicyImpl(inner, manager());
    }

    private ManagementPolicyImpl wrapModel(String name) {
        return new ManagementPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ManagementPolicy> getAsync(String resourceGroupName, String accountName) {
        ManagementPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName)
        .flatMap(new Func1<ManagementPolicyInner, Observable<ManagementPolicy>>() {
            @Override
            public Observable<ManagementPolicy> call(ManagementPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ManagementPolicy)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName) {
        ManagementPoliciesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName).toCompletable();
    }

}
