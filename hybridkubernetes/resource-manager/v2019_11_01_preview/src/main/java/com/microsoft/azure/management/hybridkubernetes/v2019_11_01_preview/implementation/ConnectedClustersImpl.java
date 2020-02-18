/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.hybridkubernetes.v2019_11_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.hybridkubernetes.v2019_11_01_preview.ConnectedClusters;
import com.microsoft.azure.management.hybridkubernetes.v2019_11_01_preview.ConnectedCluster;
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
import com.microsoft.azure.management.hybridkubernetes.v2019_11_01_preview.ConnectedClusterAccessProfile;

class ConnectedClustersImpl extends GroupableResourcesCoreImpl<ConnectedCluster, ConnectedClusterImpl, ConnectedClusterInner, ConnectedClustersInner, KubernetesManager>  implements ConnectedClusters {
    protected ConnectedClustersImpl(KubernetesManager manager) {
        super(manager.inner().connectedClusters(), manager);
    }

    @Override
    protected Observable<ConnectedClusterInner> getInnerAsync(String resourceGroupName, String name) {
        ConnectedClustersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ConnectedClustersInner client = this.inner();
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
    public PagedList<ConnectedCluster> listByResourceGroup(String resourceGroupName) {
        ConnectedClustersInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ConnectedCluster> listByResourceGroupAsync(String resourceGroupName) {
        ConnectedClustersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ConnectedClusterInner>, Iterable<ConnectedClusterInner>>() {
            @Override
            public Iterable<ConnectedClusterInner> call(Page<ConnectedClusterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ConnectedClusterInner, ConnectedCluster>() {
            @Override
            public ConnectedCluster call(ConnectedClusterInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ConnectedCluster> list() {
        ConnectedClustersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ConnectedCluster> listAsync() {
        ConnectedClustersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ConnectedClusterInner>, Iterable<ConnectedClusterInner>>() {
            @Override
            public Iterable<ConnectedClusterInner> call(Page<ConnectedClusterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ConnectedClusterInner, ConnectedCluster>() {
            @Override
            public ConnectedCluster call(ConnectedClusterInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ConnectedClusterImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<ConnectedClusterAccessProfile> listCredentialsAsync(String resourceGroupName, String clusterName) {
        ConnectedClustersInner client = this.inner();
        return client.listCredentialsAsync(resourceGroupName, clusterName)
        .map(new Func1<ConnectedClusterAccessProfileInner, ConnectedClusterAccessProfile>() {
            @Override
            public ConnectedClusterAccessProfile call(ConnectedClusterAccessProfileInner inner) {
                return new ConnectedClusterAccessProfileImpl(inner, manager());
            }
        });
    }

    @Override
    protected ConnectedClusterImpl wrapModel(ConnectedClusterInner inner) {
        return  new ConnectedClusterImpl(inner.name(), inner, manager());
    }

    @Override
    protected ConnectedClusterImpl wrapModel(String name) {
        return new ConnectedClusterImpl(name, new ConnectedClusterInner(), this.manager());
    }

}
