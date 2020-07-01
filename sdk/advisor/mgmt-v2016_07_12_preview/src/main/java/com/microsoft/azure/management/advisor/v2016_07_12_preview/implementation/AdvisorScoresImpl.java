/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.advisor.v2016_07_12_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.advisor.v2016_07_12_preview.AdvisorScores;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.advisor.v2016_07_12_preview.AdvisorScore;

class AdvisorScoresImpl extends WrapperImpl<AdvisorScoresInner> implements AdvisorScores {
    private final AdvisorManager manager;

    AdvisorScoresImpl(AdvisorManager manager) {
        super(manager.inner().advisorScores());
        this.manager = manager;
    }

    public AdvisorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AdvisorScore> getAsync(String name) {
        AdvisorScoresInner client = this.inner();
        return client.getAsync(name)
        .map(new Func1<AdvisorScoreInner, AdvisorScore>() {
            @Override
            public AdvisorScore call(AdvisorScoreInner inner) {
                return new AdvisorScoreImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AdvisorScore> listAsync() {
        AdvisorScoresInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<AdvisorScoreInner>, Observable<AdvisorScoreInner>>() {
            @Override
            public Observable<AdvisorScoreInner> call(Page<AdvisorScoreInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<AdvisorScoreInner, AdvisorScore>() {
            @Override
            public AdvisorScore call(AdvisorScoreInner inner) {
                return new AdvisorScoreImpl(inner, manager());
            }
        });
    }

}
