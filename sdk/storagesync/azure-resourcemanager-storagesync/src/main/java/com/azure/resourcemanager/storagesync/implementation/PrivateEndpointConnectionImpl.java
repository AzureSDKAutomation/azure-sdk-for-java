// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storagesync.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.storagesync.models.PrivateEndpoint;
import com.azure.resourcemanager.storagesync.models.PrivateEndpointConnection;
import com.azure.resourcemanager.storagesync.models.PrivateEndpointConnectionProvisioningState;
import com.azure.resourcemanager.storagesync.models.PrivateLinkServiceConnectionState;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition {
    private PrivateEndpointConnectionInner innerObject;

    private final com.azure.resourcemanager.storagesync.StoragesyncManager serviceManager;

    PrivateEndpointConnectionImpl(
        PrivateEndpointConnectionInner innerObject,
        com.azure.resourcemanager.storagesync.StoragesyncManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PrivateEndpoint privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storagesync.StoragesyncManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String storageSyncServiceName;

    private String privateEndpointConnectionName;

    public PrivateEndpointConnectionImpl withExistingStorageSyncService(
        String resourceGroupName, String storageSyncServiceName) {
        this.resourceGroupName = resourceGroupName;
        this.storageSyncServiceName = storageSyncServiceName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .create(
                    resourceGroupName,
                    storageSyncServiceName,
                    privateEndpointConnectionName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .create(
                    resourceGroupName,
                    storageSyncServiceName,
                    privateEndpointConnectionName,
                    this.innerModel(),
                    context);
        return this;
    }

    PrivateEndpointConnectionImpl(
        String name, com.azure.resourcemanager.storagesync.StoragesyncManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, storageSyncServiceName, privateEndpointConnectionName, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, storageSyncServiceName, privateEndpointConnectionName, context)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.innerModel().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.innerModel().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }
}
