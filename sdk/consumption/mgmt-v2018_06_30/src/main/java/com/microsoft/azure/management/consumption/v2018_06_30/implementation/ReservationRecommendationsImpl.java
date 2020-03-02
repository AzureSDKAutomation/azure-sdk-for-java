/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.consumption.v2018_06_30.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.consumption.v2018_06_30.ReservationRecommendations;
import com.microsoft.azure.management.consumption.v2018_06_30.ReservationRecommendation;
import rx.Observable;
import rx.Completable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ReservationRecommendationsImpl extends GroupableResourcesCoreImpl<ReservationRecommendation, ReservationRecommendationImpl, ReservationRecommendationInner, ReservationRecommendationsInner, ConsumptionManager>  implements ReservationRecommendations {
    protected ReservationRecommendationsImpl(ConsumptionManager manager) {
        super(manager.inner().reservationRecommendations(), manager);
    }

    @Override
    protected Observable<ReservationRecommendationInner> getInnerAsync(String resourceGroupName, String name) {
        return null; // NOP Retrieve by resource group not supported
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ReservationRecommendationsInner client = this.inner();
        return Completable.error(new Throwable("Delete by RG not supported for this resource")); // NOP Delete by RG not supported
    }

    @Override
    public PagedList<ReservationRecommendation> list() {
        ReservationRecommendationsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ReservationRecommendation> listAsync() {
        ReservationRecommendationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ReservationRecommendationInner>, Iterable<ReservationRecommendationInner>>() {
            @Override
            public Iterable<ReservationRecommendationInner> call(Page<ReservationRecommendationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ReservationRecommendationInner, ReservationRecommendation>() {
            @Override
            public ReservationRecommendation call(ReservationRecommendationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    protected ReservationRecommendationImpl wrapModel(ReservationRecommendationInner inner) {
        return  new ReservationRecommendationImpl(inner.name(), inner, manager());
    }

    @Override
    protected ReservationRecommendationImpl wrapModel(String name) {
        return null; // Model is not creatable
    }

}
