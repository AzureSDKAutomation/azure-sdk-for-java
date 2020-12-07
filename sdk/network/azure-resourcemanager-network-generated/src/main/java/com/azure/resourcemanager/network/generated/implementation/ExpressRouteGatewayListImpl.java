// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteGatewayListInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteGateway;
import com.azure.resourcemanager.network.generated.models.ExpressRouteGatewayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ExpressRouteGatewayListImpl implements ExpressRouteGatewayList {
    private ExpressRouteGatewayListInner innerObject;

    private final NetworkManager serviceManager;

    public ExpressRouteGatewayListImpl(ExpressRouteGatewayListInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ExpressRouteGateway> value() {
        List<ExpressRouteGatewayInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ExpressRouteGatewayImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ExpressRouteGatewayListInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
