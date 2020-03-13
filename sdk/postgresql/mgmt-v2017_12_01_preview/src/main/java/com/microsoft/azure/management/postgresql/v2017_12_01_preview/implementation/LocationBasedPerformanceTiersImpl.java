/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.postgresql.v2017_12_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.postgresql.v2017_12_01_preview.LocationBasedPerformanceTiers;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.postgresql.v2017_12_01_preview.PerformanceTierProperties;

class LocationBasedPerformanceTiersImpl extends WrapperImpl<LocationBasedPerformanceTiersInner> implements LocationBasedPerformanceTiers {
    private final DBforPostgreSQLManager manager;

    LocationBasedPerformanceTiersImpl(DBforPostgreSQLManager manager) {
        super(manager.inner().locationBasedPerformanceTiers());
        this.manager = manager;
    }

    public DBforPostgreSQLManager manager() {
        return this.manager;
    }

    private PerformanceTierPropertiesImpl wrapPerformanceTierPropertiesModel(PerformanceTierPropertiesInner inner) {
        return  new PerformanceTierPropertiesImpl(inner, manager());
    }

    @Override
    public Observable<PerformanceTierProperties> listAsync(String locationName) {
        LocationBasedPerformanceTiersInner client = this.inner();
        return client.listAsync(locationName)
        .flatMap(new Func1<List<PerformanceTierPropertiesInner>, Observable<PerformanceTierPropertiesInner>>() {
            @Override
            public Observable<PerformanceTierPropertiesInner> call(List<PerformanceTierPropertiesInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<PerformanceTierPropertiesInner, PerformanceTierProperties>() {
            @Override
            public PerformanceTierProperties call(PerformanceTierPropertiesInner inner) {
                return wrapPerformanceTierPropertiesModel(inner);
            }
        });
    }

}
