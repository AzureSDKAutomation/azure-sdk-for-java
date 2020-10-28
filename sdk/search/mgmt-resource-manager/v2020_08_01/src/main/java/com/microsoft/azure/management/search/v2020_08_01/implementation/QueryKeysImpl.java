/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.search.v2020_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.search.v2020_08_01.QueryKeys;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.search.v2020_08_01.QueryKey;

class QueryKeysImpl extends WrapperImpl<QueryKeysInner> implements QueryKeys {
    private final SearchManager manager;

    QueryKeysImpl(SearchManager manager) {
        super(manager.inner().queryKeys());
        this.manager = manager;
    }

    public SearchManager manager() {
        return this.manager;
    }

    @Override
    public Observable<QueryKey> createAsync(String resourceGroupName, String searchServiceName, String name) {
        QueryKeysInner client = this.inner();
        return client.createAsync(resourceGroupName, searchServiceName, name)
        .map(new Func1<QueryKeyInner, QueryKey>() {
            @Override
            public QueryKey call(QueryKeyInner inner) {
                return new QueryKeyImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<QueryKey> listBySearchServiceAsync(final String resourceGroupName, final String searchServiceName) {
        QueryKeysInner client = this.inner();
        return client.listBySearchServiceAsync(resourceGroupName, searchServiceName)
        .flatMapIterable(new Func1<Page<QueryKeyInner>, Iterable<QueryKeyInner>>() {
            @Override
            public Iterable<QueryKeyInner> call(Page<QueryKeyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<QueryKeyInner, QueryKey>() {
            @Override
            public QueryKey call(QueryKeyInner inner) {
                return new QueryKeyImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String searchServiceName, String key) {
        QueryKeysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, searchServiceName, key).toCompletable();
    }

}
