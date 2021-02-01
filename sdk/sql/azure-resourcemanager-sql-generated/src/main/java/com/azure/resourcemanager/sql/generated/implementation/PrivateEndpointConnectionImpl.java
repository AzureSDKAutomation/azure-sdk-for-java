// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.sql.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.sql.generated.models.PrivateEndpointProperty;
import com.azure.resourcemanager.sql.generated.models.PrivateEndpointProvisioningState;
import com.azure.resourcemanager.sql.generated.models.PrivateLinkServiceConnectionStateProperty;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition, PrivateEndpointConnection.Update {
    private PrivateEndpointConnectionInner innerObject;

    private final SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PrivateEndpointProperty privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public PrivateEndpointProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String privateEndpointConnectionName;

    public PrivateEndpointConnectionImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdate(
                    resourceGroupName, serverName, privateEndpointConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdate(
                    resourceGroupName, serverName, privateEndpointConnectionName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionImpl(String name, SqlManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnectionImpl update() {
        return this;
    }

    public PrivateEndpointConnection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdate(
                    resourceGroupName, serverName, privateEndpointConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpointConnection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createOrUpdate(
                    resourceGroupName, serverName, privateEndpointConnectionName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.privateEndpointConnectionName = Utils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, serverName, privateEndpointConnectionName, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, serverName, privateEndpointConnectionName, context)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpointProperty privateEndpoint) {
        this.innerModel().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState) {
        this.innerModel().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }
}
