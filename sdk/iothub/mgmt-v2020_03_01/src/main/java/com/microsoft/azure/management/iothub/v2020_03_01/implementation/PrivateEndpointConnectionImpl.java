/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01.implementation;

import com.microsoft.azure.management.iothub.v2020_03_01.PrivateEndpointConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.iothub.v2020_03_01.PrivateEndpointConnectionProperties;
import rx.functions.Func1;

class PrivateEndpointConnectionImpl extends CreatableUpdatableImpl<PrivateEndpointConnection, PrivateEndpointConnectionInner, PrivateEndpointConnectionImpl> implements PrivateEndpointConnection, PrivateEndpointConnection.Update {
    private final DevicesManager manager;
    private String resourceGroupName;
    private String resourceName;
    private String privateEndpointConnectionName;
    private PrivateEndpointConnectionProperties uproperties;

    PrivateEndpointConnectionImpl(String name, DevicesManager manager) {
        super(name, new PrivateEndpointConnectionInner());
        this.manager = manager;
        // Set resource name
        this.privateEndpointConnectionName = name;
        //
        this.uproperties = new PrivateEndpointConnectionProperties();
    }

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner inner, DevicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.privateEndpointConnectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.resourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "iotHubs");
        this.privateEndpointConnectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateEndpointConnections");
        //
        this.uproperties = new PrivateEndpointConnectionProperties();
    }

    @Override
    public DevicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PrivateEndpointConnection> createResourceAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<PrivateEndpointConnection> updateResourceAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return client.updateAsync(this.resourceGroupName, this.resourceName, this.privateEndpointConnectionName, this.uproperties)
            .map(new Func1<PrivateEndpointConnectionInner, PrivateEndpointConnectionInner>() {
               @Override
               public PrivateEndpointConnectionInner call(PrivateEndpointConnectionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateEndpointConnectionInner> getInnerAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return client.getAsync(this.resourceGroupName, this.resourceName, this.privateEndpointConnectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.uproperties = new PrivateEndpointConnectionProperties();
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
    public PrivateEndpointConnectionProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PrivateEndpointConnectionImpl withProperties(PrivateEndpointConnectionProperties properties) {
        this.uproperties = properties;
        return this;
    }

}
