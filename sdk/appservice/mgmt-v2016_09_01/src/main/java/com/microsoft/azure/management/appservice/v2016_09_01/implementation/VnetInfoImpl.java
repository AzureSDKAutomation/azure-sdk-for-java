/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01.implementation;

import com.microsoft.azure.management.appservice.v2016_09_01.VnetInfo;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.ArrayList;
import com.microsoft.azure.management.appservice.v2016_09_01.VnetRoute;
import java.util.List;

class VnetInfoImpl extends IndexableRefreshableWrapperImpl<VnetInfo, VnetInfoInner> implements VnetInfo {
    private final WebManager manager;
    private String resourceGroupName;
    private String name;
    private String vnetName;

    VnetInfoImpl(VnetInfoInner inner,  WebManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "serverfarms");
        this.vnetName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualNetworkConnections");
    }

    @Override
    public WebManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<VnetInfoInner> getInnerAsync() {
        AppServicePlansInner client = this.manager().inner().appServicePlans();
        return client.getVnetFromServerFarmAsync(this.resourceGroupName, this.name, this.vnetName);
    }



    @Override
    public byte[] certBlob() {
        return this.inner().certBlob();
    }

    @Override
    public String certThumbprint() {
        return this.inner().certThumbprint();
    }

    @Override
    public String dnsServers() {
        return this.inner().dnsServers();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Boolean resyncRequired() {
        return this.inner().resyncRequired();
    }

    @Override
    public List<VnetRoute> routes() {
        List<VnetRoute> lst = new ArrayList<VnetRoute>();
        if (this.inner().routes() != null) {
            for (VnetRouteInner inner : this.inner().routes()) {
                lst.add( new VnetRouteImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String vnetResourceId() {
        return this.inner().vnetResourceId();
    }

}
