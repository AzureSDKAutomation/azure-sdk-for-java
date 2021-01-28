// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.attestation.AttestationManager;
import com.azure.resourcemanager.attestation.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.attestation.models.PrivateEndpoint;
import com.azure.resourcemanager.attestation.models.PrivateEndpointConnection;
import com.azure.resourcemanager.attestation.models.PrivateEndpointConnectionProvisioningState;
import com.azure.resourcemanager.attestation.models.PrivateLinkServiceConnectionState;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition {
    private PrivateEndpointConnectionInner innerObject;

    private final AttestationManager serviceManager;

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner innerObject, AttestationManager serviceManager) {
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

    private AttestationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String providerName;

    private String privateEndpointConnectionName;

    public PrivateEndpointConnectionImpl withExistingAttestationProvider(
        String resourceGroupName, String providerName) {
        this.resourceGroupName = resourceGroupName;
        this.providerName = providerName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createWithResponse(
                    resourceGroupName, providerName, privateEndpointConnectionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .createWithResponse(
                    resourceGroupName, providerName, privateEndpointConnectionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PrivateEndpointConnectionImpl(String name, AttestationManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, providerName, privateEndpointConnectionName, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, providerName, privateEndpointConnectionName, context)
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
