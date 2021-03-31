// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.PrivateEndpointConnectionResourceInner;
import com.azure.resourcemanager.appservice.generated.models.ArmIdWrapper;
import com.azure.resourcemanager.appservice.generated.models.PrivateEndpointConnectionResource;
import com.azure.resourcemanager.appservice.generated.models.PrivateLinkConnectionApprovalRequestResource;
import com.azure.resourcemanager.appservice.generated.models.PrivateLinkConnectionState;

public final class PrivateEndpointConnectionResourceImpl
    implements PrivateEndpointConnectionResource,
        PrivateEndpointConnectionResource.Definition,
        PrivateEndpointConnectionResource.Update {
    private PrivateEndpointConnectionResourceInner innerObject;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ArmIdWrapper privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public PrivateLinkConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public PrivateEndpointConnectionResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String privateEndpointConnectionName;

    private PrivateLinkConnectionApprovalRequestResource createPrivateEndpointWrapper;

    private PrivateLinkConnectionApprovalRequestResource updatePrivateEndpointWrapper;

    public PrivateEndpointConnectionResourceImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    public PrivateEndpointConnectionResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .approveOrRejectPrivateEndpointConnection(
                    resourceGroupName, name, privateEndpointConnectionName, createPrivateEndpointWrapper, Context.NONE);
        return this;
    }

    public PrivateEndpointConnectionResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .approveOrRejectPrivateEndpointConnection(
                    resourceGroupName, name, privateEndpointConnectionName, createPrivateEndpointWrapper, context);
        return this;
    }

    PrivateEndpointConnectionResourceImpl(
        String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionResourceInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
        this.createPrivateEndpointWrapper = new PrivateLinkConnectionApprovalRequestResource();
    }

    public PrivateEndpointConnectionResourceImpl update() {
        this.updatePrivateEndpointWrapper = new PrivateLinkConnectionApprovalRequestResource();
        return this;
    }

    public PrivateEndpointConnectionResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .approveOrRejectPrivateEndpointConnection(
                    resourceGroupName, name, privateEndpointConnectionName, updatePrivateEndpointWrapper, Context.NONE);
        return this;
    }

    public PrivateEndpointConnectionResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .approveOrRejectPrivateEndpointConnection(
                    resourceGroupName, name, privateEndpointConnectionName, updatePrivateEndpointWrapper, context);
        return this;
    }

    PrivateEndpointConnectionResourceImpl(
        PrivateEndpointConnectionResourceInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "sites");
        this.privateEndpointConnectionName = Utils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnectionResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getPrivateEndpointConnectionWithResponse(
                    resourceGroupName, name, privateEndpointConnectionName, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getPrivateEndpointConnectionWithResponse(
                    resourceGroupName, name, privateEndpointConnectionName, context)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionResourceImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.createPrivateEndpointWrapper.withKind(kind);
            return this;
        } else {
            this.updatePrivateEndpointWrapper.withKind(kind);
            return this;
        }
    }

    public PrivateEndpointConnectionResourceImpl withPrivateLinkServiceConnectionState(
        PrivateLinkConnectionState privateLinkServiceConnectionState) {
        if (isInCreateMode()) {
            this.createPrivateEndpointWrapper.withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
            return this;
        } else {
            this.updatePrivateEndpointWrapper.withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
