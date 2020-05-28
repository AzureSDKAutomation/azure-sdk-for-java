/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.containerservice.v2020_01_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.containerservice.v2020_01_01.OpenShiftManagedClusters;
import com.microsoft.azure.management.containerservice.v2020_01_01.OpenShiftManagedCluster;
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

class OpenShiftManagedClustersImpl extends GroupableResourcesCoreImpl<OpenShiftManagedCluster, OpenShiftManagedClusterImpl, OpenShiftManagedClusterInner, OpenShiftManagedClustersInner, ContainerServiceManager>  implements OpenShiftManagedClusters {
    protected OpenShiftManagedClustersImpl(ContainerServiceManager manager) {
        super(manager.inner().openShiftManagedClusters(), manager);
    }

    @Override
    protected Observable<OpenShiftManagedClusterInner> getInnerAsync(String resourceGroupName, String name) {
        OpenShiftManagedClustersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        OpenShiftManagedClustersInner client = this.inner();
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
    public PagedList<OpenShiftManagedCluster> listByResourceGroup(String resourceGroupName) {
        OpenShiftManagedClustersInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<OpenShiftManagedCluster> listByResourceGroupAsync(String resourceGroupName) {
        OpenShiftManagedClustersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<OpenShiftManagedClusterInner>, Iterable<OpenShiftManagedClusterInner>>() {
            @Override
            public Iterable<OpenShiftManagedClusterInner> call(Page<OpenShiftManagedClusterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OpenShiftManagedClusterInner, OpenShiftManagedCluster>() {
            @Override
            public OpenShiftManagedCluster call(OpenShiftManagedClusterInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<OpenShiftManagedCluster> list() {
        OpenShiftManagedClustersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<OpenShiftManagedCluster> listAsync() {
        OpenShiftManagedClustersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<OpenShiftManagedClusterInner>, Iterable<OpenShiftManagedClusterInner>>() {
            @Override
            public Iterable<OpenShiftManagedClusterInner> call(Page<OpenShiftManagedClusterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OpenShiftManagedClusterInner, OpenShiftManagedCluster>() {
            @Override
            public OpenShiftManagedCluster call(OpenShiftManagedClusterInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public OpenShiftManagedClusterImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected OpenShiftManagedClusterImpl wrapModel(OpenShiftManagedClusterInner inner) {
        return  new OpenShiftManagedClusterImpl(inner.name(), inner, manager());
    }

    @Override
    protected OpenShiftManagedClusterImpl wrapModel(String name) {
        return new OpenShiftManagedClusterImpl(name, new OpenShiftManagedClusterInner(), this.manager());
    }

}
