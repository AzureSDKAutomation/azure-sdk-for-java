/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PrivateEndpointConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PrivateEndpoint;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PrivateLinkServiceConnectionState;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ProvisioningState;

class PrivateEndpointConnectionImpl extends CreatableUpdatableImpl<PrivateEndpointConnection, PrivateEndpointConnectionInner, PrivateEndpointConnectionImpl> implements PrivateEndpointConnection, PrivateEndpointConnection.Definition, PrivateEndpointConnection.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String privateEndpointConnectionName;

    PrivateEndpointConnectionImpl(String name, ContainerRegistryManager manager) {
        super(name, new PrivateEndpointConnectionInner());
        this.manager = manager;
        // Set resource name
        this.privateEndpointConnectionName = name;
        //
    }

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.privateEndpointConnectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.privateEndpointConnectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateEndpointConnections");
        //
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PrivateEndpointConnection> createResourceAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.registryName, this.privateEndpointConnectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PrivateEndpointConnection> updateResourceAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.registryName, this.privateEndpointConnectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateEndpointConnectionInner> getInnerAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return client.getAsync(this.resourceGroupName, this.registryName, this.privateEndpointConnectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PrivateEndpoint privateEndpoint() {
        return this.inner().privateEndpoint();
    }

    @Override
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.inner().privateLinkServiceConnectionState();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PrivateEndpointConnectionImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.inner().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    @Override
    public PrivateEndpointConnectionImpl withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.inner().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

}
