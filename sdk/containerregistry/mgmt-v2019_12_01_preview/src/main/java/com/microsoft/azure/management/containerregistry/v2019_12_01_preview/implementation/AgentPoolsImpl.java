/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.AgentPools;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.AgentPoolQueueStatus;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.AgentPool;

class AgentPoolsImpl extends WrapperImpl<AgentPoolsInner> implements AgentPools {
    private final ContainerRegistryManager manager;

    AgentPoolsImpl(ContainerRegistryManager manager) {
        super(manager.inner().agentPools());
        this.manager = manager;
    }

    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public AgentPoolImpl define(String name) {
        return wrapModel(name);
    }

    private AgentPoolImpl wrapModel(AgentPoolInner inner) {
        return  new AgentPoolImpl(inner, manager());
    }

    private AgentPoolImpl wrapModel(String name) {
        return new AgentPoolImpl(name, this.manager());
    }

    @Override
    public Observable<AgentPoolQueueStatus> getQueueStatusAsync(String resourceGroupName, String registryName, String agentPoolName) {
        AgentPoolsInner client = this.inner();
        return client.getQueueStatusAsync(resourceGroupName, registryName, agentPoolName)
        .map(new Func1<AgentPoolQueueStatusInner, AgentPoolQueueStatus>() {
            @Override
            public AgentPoolQueueStatus call(AgentPoolQueueStatusInner inner) {
                return new AgentPoolQueueStatusImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AgentPool> listAsync(final String resourceGroupName, final String registryName) {
        AgentPoolsInner client = this.inner();
        return client.listAsync(resourceGroupName, registryName)
        .flatMapIterable(new Func1<Page<AgentPoolInner>, Iterable<AgentPoolInner>>() {
            @Override
            public Iterable<AgentPoolInner> call(Page<AgentPoolInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AgentPoolInner, AgentPool>() {
            @Override
            public AgentPool call(AgentPoolInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<AgentPool> getAsync(String resourceGroupName, String registryName, String agentPoolName) {
        AgentPoolsInner client = this.inner();
        return client.getAsync(resourceGroupName, registryName, agentPoolName)
        .flatMap(new Func1<AgentPoolInner, Observable<AgentPool>>() {
            @Override
            public Observable<AgentPool> call(AgentPoolInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((AgentPool)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String registryName, String agentPoolName) {
        AgentPoolsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, registryName, agentPoolName).toCompletable();
    }

}
