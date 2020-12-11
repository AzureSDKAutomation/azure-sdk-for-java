// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.NetworkMappingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateNetworkMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateNetworkMappingInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMapping;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMappingProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateNetworkMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateNetworkMappingInputProperties;

public final class NetworkMappingImpl implements NetworkMapping, NetworkMapping.Definition, NetworkMapping.Update {
    private NetworkMappingInner innerObject;

    private final SiteRecoveryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public NetworkMappingProperties properties() {
        return this.innerModel().properties();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public NetworkMappingInner innerModel() {
        return this.innerObject;
    }

    private SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    private String fabricName;

    private String networkName;

    private String networkMappingName;

    private CreateNetworkMappingInput createInput;

    private UpdateNetworkMappingInput updateInput;

    public NetworkMappingImpl withExistingReplicationNetwork(String fabricName, String networkName) {
        this.fabricName = fabricName;
        this.networkName = networkName;
        return this;
    }

    public NetworkMapping create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationNetworkMappings()
                .create(fabricName, networkName, networkMappingName, createInput, Context.NONE);
        return this;
    }

    public NetworkMapping create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationNetworkMappings()
                .create(fabricName, networkName, networkMappingName, createInput, context);
        return this;
    }

    public NetworkMappingImpl(String name, SiteRecoveryManager serviceManager) {
        this.innerObject = new NetworkMappingInner();
        this.serviceManager = serviceManager;
        this.networkMappingName = name;
        this.createInput = new CreateNetworkMappingInput();
    }

    public NetworkMappingImpl update() {
        this.updateInput = new UpdateNetworkMappingInput();
        return this;
    }

    public NetworkMapping apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationNetworkMappings()
                .update(fabricName, networkName, networkMappingName, updateInput, Context.NONE);
        return this;
    }

    public NetworkMapping apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationNetworkMappings()
                .update(fabricName, networkName, networkMappingName, updateInput, context);
        return this;
    }

    public NetworkMappingImpl(NetworkMappingInner innerObject, SiteRecoveryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.fabricName = Utils.getValueFromIdByName(innerObject.id(), "replicationFabrics");
        this.networkName = Utils.getValueFromIdByName(innerObject.id(), "replicationNetworks");
        this.networkMappingName = Utils.getValueFromIdByName(innerObject.id(), "replicationNetworkMappings");
    }

    public NetworkMapping refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationNetworkMappings()
                .getWithResponse(fabricName, networkName, networkMappingName, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkMapping refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationNetworkMappings()
                .getWithResponse(fabricName, networkName, networkMappingName, context)
                .getValue();
        return this;
    }

    public NetworkMappingImpl withProperties(CreateNetworkMappingInputProperties properties) {
        this.createInput.withProperties(properties);
        return this;
    }

    public NetworkMappingImpl withProperties(UpdateNetworkMappingInputProperties properties) {
        this.updateInput.withProperties(properties);
        return this;
    }
}
