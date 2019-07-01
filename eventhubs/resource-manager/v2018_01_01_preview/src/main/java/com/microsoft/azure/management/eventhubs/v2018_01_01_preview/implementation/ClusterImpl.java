/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.Cluster;
import rx.Observable;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.ClusterSku;

class ClusterImpl extends GroupableResourceCoreImpl<Cluster, ClusterInner, ClusterImpl, EventHubsManager> implements Cluster, Cluster.Definition, Cluster.Update {
    ClusterImpl(String name, ClusterInner inner, EventHubsManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<Cluster> createResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.putAsync(this.resourceGroupName(), this.name())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Cluster> updateResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.patchAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ClusterInner> getInnerAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String created() {
        return this.inner().created();
    }

    @Override
    public String metricId() {
        return this.inner().metricId();
    }

    @Override
    public ClusterSku sku() {
        return this.inner().sku();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

    @Override
    public String updated() {
        return this.inner().updated();
    }

    @Override
    public ClusterImpl withSku(ClusterSku sku) {
        this.inner().withSku(sku);
        return this;
    }

}
