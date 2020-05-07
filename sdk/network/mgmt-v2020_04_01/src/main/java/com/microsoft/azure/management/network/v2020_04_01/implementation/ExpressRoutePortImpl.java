/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_04_01.ExpressRoutePort;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_04_01.ExpressRoutePortsEncapsulation;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_04_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_04_01.ManagedServiceIdentity;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2020_04_01.ExpressRouteLink;

class ExpressRoutePortImpl extends GroupableResourceCoreImpl<ExpressRoutePort, ExpressRoutePortInner, ExpressRoutePortImpl, NetworkManager> implements ExpressRoutePort, ExpressRoutePort.Definition, ExpressRoutePort.Update {
    ExpressRoutePortImpl(String name, ExpressRoutePortInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ExpressRoutePort> createResourceAsync() {
        ExpressRoutePortsInner client = this.manager().inner().expressRoutePorts();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExpressRoutePort> updateResourceAsync() {
        ExpressRoutePortsInner client = this.manager().inner().expressRoutePorts();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExpressRoutePortInner> getInnerAsync() {
        ExpressRoutePortsInner client = this.manager().inner().expressRoutePorts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String allocationDate() {
        return this.inner().allocationDate();
    }

    @Override
    public Integer bandwidthInGbps() {
        return this.inner().bandwidthInGbps();
    }

    @Override
    public List<SubResource> circuits() {
        return this.inner().circuits();
    }

    @Override
    public ExpressRoutePortsEncapsulation encapsulation() {
        return this.inner().encapsulation();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String etherType() {
        return this.inner().etherType();
    }

    @Override
    public ManagedServiceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public List<ExpressRouteLink> links() {
        List<ExpressRouteLink> lst = new ArrayList<ExpressRouteLink>();
        if (this.inner().links() != null) {
            for (ExpressRouteLinkInner inner : this.inner().links()) {
                lst.add( new ExpressRouteLinkImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String mtu() {
        return this.inner().mtu();
    }

    @Override
    public String peeringLocation() {
        return this.inner().peeringLocation();
    }

    @Override
    public Double provisionedBandwidthInGbps() {
        return this.inner().provisionedBandwidthInGbps();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public ExpressRoutePortImpl withBandwidthInGbps(Integer bandwidthInGbps) {
        this.inner().withBandwidthInGbps(bandwidthInGbps);
        return this;
    }

    @Override
    public ExpressRoutePortImpl withEncapsulation(ExpressRoutePortsEncapsulation encapsulation) {
        this.inner().withEncapsulation(encapsulation);
        return this;
    }

    @Override
    public ExpressRoutePortImpl withIdentity(ManagedServiceIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public ExpressRoutePortImpl withLinks(List<ExpressRouteLinkInner> links) {
        this.inner().withLinks(links);
        return this;
    }

    @Override
    public ExpressRoutePortImpl withPeeringLocation(String peeringLocation) {
        this.inner().withPeeringLocation(peeringLocation);
        return this;
    }

}
