// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitStatsInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitStats;

public final class ExpressRouteCircuitStatsImpl implements ExpressRouteCircuitStats {
    private ExpressRouteCircuitStatsInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ExpressRouteCircuitStatsImpl(
        ExpressRouteCircuitStatsInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Long primarybytesIn() {
        return this.innerModel().primarybytesIn();
    }

    public Long primarybytesOut() {
        return this.innerModel().primarybytesOut();
    }

    public Long secondarybytesIn() {
        return this.innerModel().secondarybytesIn();
    }

    public Long secondarybytesOut() {
        return this.innerModel().secondarybytesOut();
    }

    public ExpressRouteCircuitStatsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
