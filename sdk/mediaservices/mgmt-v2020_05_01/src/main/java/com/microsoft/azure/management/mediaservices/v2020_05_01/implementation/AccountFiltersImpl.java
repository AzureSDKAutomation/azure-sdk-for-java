/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mediaservices.v2020_05_01.AccountFilters;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mediaservices.v2020_05_01.AccountFilter;

class AccountFiltersImpl extends WrapperImpl<AccountFiltersInner> implements AccountFilters {
    private final MediaManager manager;

    AccountFiltersImpl(MediaManager manager) {
        super(manager.inner().accountFilters());
        this.manager = manager;
    }

    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public AccountFilterImpl define(String name) {
        return wrapModel(name);
    }

    private AccountFilterImpl wrapModel(AccountFilterInner inner) {
        return  new AccountFilterImpl(inner, manager());
    }

    private AccountFilterImpl wrapModel(String name) {
        return new AccountFilterImpl(name, this.manager());
    }

    @Override
    public Observable<AccountFilter> listAsync(final String resourceGroupName, final String accountName) {
        AccountFiltersInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<AccountFilterInner>, Iterable<AccountFilterInner>>() {
            @Override
            public Iterable<AccountFilterInner> call(Page<AccountFilterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AccountFilterInner, AccountFilter>() {
            @Override
            public AccountFilter call(AccountFilterInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<AccountFilter> getAsync(String resourceGroupName, String accountName, String filterName) {
        AccountFiltersInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, filterName)
        .flatMap(new Func1<AccountFilterInner, Observable<AccountFilter>>() {
            @Override
            public Observable<AccountFilter> call(AccountFilterInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((AccountFilter)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String filterName) {
        AccountFiltersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, filterName).toCompletable();
    }

}
