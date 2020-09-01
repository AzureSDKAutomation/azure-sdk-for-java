/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.commerce.v2015_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.commerce.v2015_06_01_preview.RateCards;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.commerce.v2015_06_01_preview.OfferTermInfo;

class RateCardsImpl extends WrapperImpl<RateCardsInner> implements RateCards {
    private final CommerceManager manager;

    RateCardsImpl(CommerceManager manager) {
        super(manager.inner().rateCards());
        this.manager = manager;
    }

    public CommerceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OfferTermInfo> listAsync(String filter) {
        RateCardsInner client = this.inner();
        return client.listAsync(filter)
        .flatMap(new Func1<Page<OfferTermInfoInner>, Observable<OfferTermInfoInner>>() {
            @Override
            public Observable<OfferTermInfoInner> call(Page<OfferTermInfoInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<OfferTermInfoInner, OfferTermInfo>() {
            @Override
            public OfferTermInfo call(OfferTermInfoInner inner) {
                return new OfferTermInfoImpl(inner, manager());
            }
        });
    }

}
