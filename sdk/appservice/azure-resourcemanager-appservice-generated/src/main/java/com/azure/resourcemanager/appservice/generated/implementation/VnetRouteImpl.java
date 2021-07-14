// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetRouteInner;
import com.azure.resourcemanager.appservice.generated.models.RouteType;
import com.azure.resourcemanager.appservice.generated.models.VnetRoute;

public final class VnetRouteImpl implements VnetRoute, VnetRoute.Definition, VnetRoute.Update {
    private VnetRouteInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String startAddress() {
        return this.innerModel().startAddress();
    }

    public String endAddress() {
        return this.innerModel().endAddress();
    }

    public RouteType routeType() {
        return this.innerModel().routeType();
    }

    public VnetRouteInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String vnetName;

    private String routeName;

    public VnetRouteImpl withExistingVirtualNetworkConnection(String resourceGroupName, String name, String vnetName) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        this.vnetName = vnetName;
        return this;
    }

    public VnetRoute create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServicePlans()
                .createOrUpdateVnetRouteWithResponse(
                    resourceGroupName, name, vnetName, routeName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public VnetRoute create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServicePlans()
                .createOrUpdateVnetRouteWithResponse(
                    resourceGroupName, name, vnetName, routeName, this.innerModel(), context)
                .getValue();
        return this;
    }

    VnetRouteImpl(String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new VnetRouteInner();
        this.serviceManager = serviceManager;
        this.routeName = name;
    }

    public VnetRouteImpl update() {
        return this;
    }

    public VnetRoute apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServicePlans()
                .updateVnetRouteWithResponse(
                    resourceGroupName, name, vnetName, routeName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public VnetRoute apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServicePlans()
                .updateVnetRouteWithResponse(resourceGroupName, name, vnetName, routeName, this.innerModel(), context)
                .getValue();
        return this;
    }

    VnetRouteImpl(
        VnetRouteInner innerObject, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "serverfarms");
        this.vnetName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkConnections");
        this.routeName = Utils.getValueFromIdByName(innerObject.id(), "routes");
    }

    public VnetRouteImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public VnetRouteImpl withStartAddress(String startAddress) {
        this.innerModel().withStartAddress(startAddress);
        return this;
    }

    public VnetRouteImpl withEndAddress(String endAddress) {
        this.innerModel().withEndAddress(endAddress);
        return this;
    }

    public VnetRouteImpl withRouteType(RouteType routeType) {
        this.innerModel().withRouteType(routeType);
        return this;
    }
}
