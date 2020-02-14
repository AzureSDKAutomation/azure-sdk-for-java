/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.CollectionRegions;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.CollectionDatabasisDatabaseAccountMetricModel;

class CollectionRegionsImpl extends WrapperImpl<CollectionRegionsInner> implements CollectionRegions {
    private final CosmosDBManager manager;

    CollectionRegionsImpl(CosmosDBManager manager) {
        super(manager.inner().collectionRegions());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    private CollectionDatabasisDatabaseAccountMetricModelImpl wrapCollectionDatabasisDatabaseAccountMetricModelModel(MetricInner inner) {
        return  new CollectionDatabasisDatabaseAccountMetricModelImpl(inner, manager());
    }

    @Override
    public Observable<CollectionDatabasisDatabaseAccountMetricModel> listMetricsAsync(String resourceGroupName, String accountName, String region, String databaseRid, String collectionRid, String filter) {
        CollectionRegionsInner client = this.inner();
        return client.listMetricsAsync(resourceGroupName, accountName, region, databaseRid, collectionRid, filter)
        .flatMap(new Func1<List<MetricInner>, Observable<MetricInner>>() {
            @Override
            public Observable<MetricInner> call(List<MetricInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricInner, CollectionDatabasisDatabaseAccountMetricModel>() {
            @Override
            public CollectionDatabasisDatabaseAccountMetricModel call(MetricInner inner) {
                return wrapCollectionDatabasisDatabaseAccountMetricModelModel(inner);
            }
        });
    }

}
