/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_10_01_preview.BackupShortTermRetentionPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2017_10_01_preview.BackupShortTermRetentionPolicy;

class BackupShortTermRetentionPoliciesImpl extends WrapperImpl<BackupShortTermRetentionPoliciesInner> implements BackupShortTermRetentionPolicies {
    private final SqlManager manager;

    BackupShortTermRetentionPoliciesImpl(SqlManager manager) {
        super(manager.inner().backupShortTermRetentionPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public BackupShortTermRetentionPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private BackupShortTermRetentionPolicyImpl wrapModel(BackupShortTermRetentionPolicyInner inner) {
        return  new BackupShortTermRetentionPolicyImpl(inner, manager());
    }

    private BackupShortTermRetentionPolicyImpl wrapModel(String name) {
        return new BackupShortTermRetentionPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<BackupShortTermRetentionPolicy> listByDatabaseAsync(final String resourceGroupName, final String serverName, final String databaseName) {
        BackupShortTermRetentionPoliciesInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, serverName, databaseName)
        .flatMapIterable(new Func1<Page<BackupShortTermRetentionPolicyInner>, Iterable<BackupShortTermRetentionPolicyInner>>() {
            @Override
            public Iterable<BackupShortTermRetentionPolicyInner> call(Page<BackupShortTermRetentionPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BackupShortTermRetentionPolicyInner, BackupShortTermRetentionPolicy>() {
            @Override
            public BackupShortTermRetentionPolicy call(BackupShortTermRetentionPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<BackupShortTermRetentionPolicy> getAsync(String resourceGroupName, String serverName, String databaseName) {
        BackupShortTermRetentionPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<BackupShortTermRetentionPolicyInner, Observable<BackupShortTermRetentionPolicy>>() {
            @Override
            public Observable<BackupShortTermRetentionPolicy> call(BackupShortTermRetentionPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BackupShortTermRetentionPolicy)wrapModel(inner));
                }
            }
       });
    }

}
