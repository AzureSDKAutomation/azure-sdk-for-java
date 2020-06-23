/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.signalr.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.signalr.v2020_05_01.SignalRPrivateEndpointConnections;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.signalr.v2020_05_01.PrivateEndpointConnection;

class SignalRPrivateEndpointConnectionsImpl extends WrapperImpl<SignalRPrivateEndpointConnectionsInner> implements SignalRPrivateEndpointConnections {
    private final SignalRServiceManager manager;

    SignalRPrivateEndpointConnectionsImpl(SignalRServiceManager manager) {
        super(manager.inner().signalRPrivateEndpointConnections());
        this.manager = manager;
    }

    public SignalRServiceManager manager() {
        return this.manager;
    }

    private PrivateEndpointConnectionImpl wrapModel(PrivateEndpointConnectionInner inner) {
        return  new PrivateEndpointConnectionImpl(inner, manager());
    }

    @Override
    public Observable<PrivateEndpointConnection> getAsync(String privateEndpointConnectionName, String resourceGroupName, String resourceName) {
        SignalRPrivateEndpointConnectionsInner client = this.inner();
        return client.getAsync(privateEndpointConnectionName, resourceGroupName, resourceName)
        .map(new Func1<PrivateEndpointConnectionInner, PrivateEndpointConnection>() {
            @Override
            public PrivateEndpointConnection call(PrivateEndpointConnectionInner inner) {
                return new PrivateEndpointConnectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String privateEndpointConnectionName, String resourceGroupName, String resourceName) {
        SignalRPrivateEndpointConnectionsInner client = this.inner();
        return client.deleteAsync(privateEndpointConnectionName, resourceGroupName, resourceName).toCompletable();
    }

}
