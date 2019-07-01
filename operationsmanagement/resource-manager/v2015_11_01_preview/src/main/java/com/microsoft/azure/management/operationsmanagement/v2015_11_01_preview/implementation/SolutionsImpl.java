/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.Solutions;
import com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.Solution;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class SolutionsImpl extends GroupableResourcesCoreImpl<Solution, SolutionImpl, SolutionInner, SolutionsInner, OperationsManagementManager>  implements Solutions {
    protected SolutionsImpl(OperationsManagementManager manager) {
        super(manager.inner().solutions(), manager);
    }

    @Override
    protected Observable<SolutionInner> getInnerAsync(String resourceGroupName, String name) {
        SolutionsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        SolutionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Solution> listByResourceGroup(String resourceGroupName) {
        SolutionsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Solution> listByResourceGroupAsync(String resourceGroupName) {
        SolutionsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<SolutionInner>, Observable<SolutionInner>>() {
            @Override
            public Observable<SolutionInner> call(Page<SolutionInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<SolutionInner, Solution>() {
            @Override
            public Solution call(SolutionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Solution> list() {
        SolutionsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Solution> listAsync() {
        SolutionsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<SolutionInner>, Observable<SolutionInner>>() {
            @Override
            public Observable<SolutionInner> call(Page<SolutionInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<SolutionInner, Solution>() {
            @Override
            public Solution call(SolutionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public SolutionImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected SolutionImpl wrapModel(SolutionInner inner) {
        return  new SolutionImpl(inner.name(), inner, manager());
    }

    @Override
    protected SolutionImpl wrapModel(String name) {
        return new SolutionImpl(name, new SolutionInner(), this.manager());
    }

}
