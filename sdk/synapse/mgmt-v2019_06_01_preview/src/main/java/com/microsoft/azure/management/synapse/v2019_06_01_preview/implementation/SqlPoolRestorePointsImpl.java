/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolRestorePoints;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.RestorePoint;
import com.microsoft.azure.Page;
import rx.Completable;

class SqlPoolRestorePointsImpl extends WrapperImpl<SqlPoolRestorePointsInner> implements SqlPoolRestorePoints {
    private final SynapseManager manager;

    SqlPoolRestorePointsImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolRestorePoints());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private RestorePointImpl wrapRestorePointModel(RestorePointInner inner) {
        return  new RestorePointImpl(inner, manager());
    }

    private Observable<RestorePointInner> getRestorePointInnerUsingSqlPoolRestorePointsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String workspaceName = IdParsingUtils.getValueFromIdByName(id, "workspaces");
        String sqlPoolName = IdParsingUtils.getValueFromIdByName(id, "sqlPools");
        String restorePointName = IdParsingUtils.getValueFromIdByName(id, "restorePoints");
        SqlPoolRestorePointsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName, restorePointName);
    }

    @Override
    public Observable<RestorePoint> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointName) {
        SqlPoolRestorePointsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName, restorePointName)
        .flatMap(new Func1<RestorePointInner, Observable<RestorePoint>>() {
            @Override
            public Observable<RestorePoint> call(RestorePointInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((RestorePoint)wrapRestorePointModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<RestorePoint> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        SqlPoolRestorePointsInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMapIterable(new Func1<Page<RestorePointInner>, Iterable<RestorePointInner>>() {
            @Override
            public Iterable<RestorePointInner> call(Page<RestorePointInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RestorePointInner, RestorePoint>() {
            @Override
            public RestorePoint call(RestorePointInner inner) {
                return wrapRestorePointModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointName) {
        SqlPoolRestorePointsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, sqlPoolName, restorePointName).toCompletable();
    }

    @Override
    public Observable<RestorePoint> createAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointLabel) {
        SqlPoolRestorePointsInner client = this.inner();
        return client.createAsync(resourceGroupName, workspaceName, sqlPoolName, restorePointLabel)
        .map(new Func1<RestorePointInner, RestorePoint>() {
            @Override
            public RestorePoint call(RestorePointInner inner) {
                return new RestorePointImpl(inner, manager());
            }
        });
    }

}
