/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mariadb.v2018_06_01.RecommendedActions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mariadb.v2018_06_01.RecommendationAction;

class RecommendedActionsImpl extends WrapperImpl<RecommendedActionsInner> implements RecommendedActions {
    private final MariaDBManager manager;

    RecommendedActionsImpl(MariaDBManager manager) {
        super(manager.inner().recommendedActions());
        this.manager = manager;
    }

    public MariaDBManager manager() {
        return this.manager;
    }

    private RecommendationActionImpl wrapModel(RecommendationActionInner inner) {
        return  new RecommendationActionImpl(inner, manager());
    }

    @Override
    public Observable<RecommendationAction> listByServerAsync(final String resourceGroupName, final String serverName, final String advisorName) {
        RecommendedActionsInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName, advisorName)
        .flatMapIterable(new Func1<Page<RecommendationActionInner>, Iterable<RecommendationActionInner>>() {
            @Override
            public Iterable<RecommendationActionInner> call(Page<RecommendationActionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RecommendationActionInner, RecommendationAction>() {
            @Override
            public RecommendationAction call(RecommendationActionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<RecommendationAction> getAsync(String resourceGroupName, String serverName, String advisorName, String recommendedActionName) {
        RecommendedActionsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, advisorName, recommendedActionName)
        .flatMap(new Func1<RecommendationActionInner, Observable<RecommendationAction>>() {
            @Override
            public Observable<RecommendationAction> call(RecommendationActionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((RecommendationAction)wrapModel(inner));
                }
            }
       });
    }

}
