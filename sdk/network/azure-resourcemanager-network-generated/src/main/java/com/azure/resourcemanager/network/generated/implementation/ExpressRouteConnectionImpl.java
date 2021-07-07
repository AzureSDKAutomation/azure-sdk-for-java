// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteConnectionInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitPeeringId;
import com.azure.resourcemanager.network.generated.models.ExpressRouteConnection;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RoutingConfiguration;

public final class ExpressRouteConnectionImpl implements ExpressRouteConnection {
    private ExpressRouteConnectionInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ExpressRouteConnectionImpl(
        ExpressRouteConnectionInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ExpressRouteCircuitPeeringId expressRouteCircuitPeering() {
        return this.innerModel().expressRouteCircuitPeering();
    }

    public String authorizationKey() {
        return this.innerModel().authorizationKey();
    }

    public Integer routingWeight() {
        return this.innerModel().routingWeight();
    }

    public Boolean enableInternetSecurity() {
        return this.innerModel().enableInternetSecurity();
    }

    public Boolean expressRouteGatewayBypass() {
        return this.innerModel().expressRouteGatewayBypass();
    }

    public RoutingConfiguration routingConfiguration() {
        return this.innerModel().routingConfiguration();
    }

    public ExpressRouteConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
