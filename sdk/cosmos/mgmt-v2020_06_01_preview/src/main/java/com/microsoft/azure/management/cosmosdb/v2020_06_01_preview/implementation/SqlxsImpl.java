/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.Sqlxs;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ServiceGetResults;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ServiceResourceCreateUpdateParameters;

class SqlxsImpl extends WrapperImpl<SqlxsInner> implements Sqlxs {
    private final CosmosDBManager manager;

    SqlxsImpl(CosmosDBManager manager) {
        super(manager.inner().sqlxs());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServiceGetResults> getAsync(String resourceGroupName, String accountName) {
        SqlxsInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName)
        .map(new Func1<ServiceGetResultsInner, ServiceGetResults>() {
            @Override
            public ServiceGetResults call(ServiceGetResultsInner inner) {
                return new ServiceGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceGetResults> createOrUpdateAsync(String resourceGroupName, String accountName, ServiceResourceCreateUpdateParameters createUpdateServiceResourceParameters) {
        SqlxsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, accountName, createUpdateServiceResourceParameters)
        .map(new Func1<ServiceGetResultsInner, ServiceGetResults>() {
            @Override
            public ServiceGetResults call(ServiceGetResultsInner inner) {
                return new ServiceGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName) {
        SqlxsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName).toCompletable();
    }

}
