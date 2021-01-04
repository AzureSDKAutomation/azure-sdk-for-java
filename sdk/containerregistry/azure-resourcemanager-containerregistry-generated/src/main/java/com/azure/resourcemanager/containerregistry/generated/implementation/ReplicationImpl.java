// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.ReplicationInner;
import com.azure.resourcemanager.containerregistry.generated.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.generated.models.Replication;
import com.azure.resourcemanager.containerregistry.generated.models.ReplicationUpdateParameters;
import com.azure.resourcemanager.containerregistry.generated.models.Status;
import com.azure.resourcemanager.containerregistry.generated.models.SystemData;
import com.azure.resourcemanager.containerregistry.generated.models.ZoneRedundancy;
import java.util.Collections;
import java.util.Map;

public final class ReplicationImpl implements Replication, Replication.Definition, Replication.Update {
    private ReplicationInner innerObject;

    private final ContainerRegistryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Status status() {
        return this.innerModel().status();
    }

    public Boolean regionEndpointEnabled() {
        return this.innerModel().regionEndpointEnabled();
    }

    public ZoneRedundancy zoneRedundancy() {
        return this.innerModel().zoneRedundancy();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ReplicationInner innerModel() {
        return this.innerObject;
    }

    private ContainerRegistryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String registryName;

    private String replicationName;

    private ReplicationUpdateParameters updateReplicationUpdateParameters;

    public ReplicationImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    public Replication create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplications()
                .create(resourceGroupName, registryName, replicationName, this.innerModel(), Context.NONE);
        return this;
    }

    public Replication create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplications()
                .create(resourceGroupName, registryName, replicationName, this.innerModel(), context);
        return this;
    }

    ReplicationImpl(String name, ContainerRegistryManager serviceManager) {
        this.innerObject = new ReplicationInner();
        this.serviceManager = serviceManager;
        this.replicationName = name;
    }

    public ReplicationImpl update() {
        this.updateReplicationUpdateParameters = new ReplicationUpdateParameters();
        return this;
    }

    public Replication apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplications()
                .update(
                    resourceGroupName, registryName, replicationName, updateReplicationUpdateParameters, Context.NONE);
        return this;
    }

    public Replication apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplications()
                .update(resourceGroupName, registryName, replicationName, updateReplicationUpdateParameters, context);
        return this;
    }

    ReplicationImpl(ReplicationInner innerObject, ContainerRegistryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.registryName = Utils.getValueFromIdByName(innerObject.id(), "registries");
        this.replicationName = Utils.getValueFromIdByName(innerObject.id(), "replications");
    }

    public Replication refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplications()
                .getWithResponse(resourceGroupName, registryName, replicationName, Context.NONE)
                .getValue();
        return this;
    }

    public Replication refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplications()
                .getWithResponse(resourceGroupName, registryName, replicationName, context)
                .getValue();
        return this;
    }

    public ReplicationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ReplicationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ReplicationImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateReplicationUpdateParameters.withTags(tags);
            return this;
        }
    }

    public ReplicationImpl withRegionEndpointEnabled(Boolean regionEndpointEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withRegionEndpointEnabled(regionEndpointEnabled);
            return this;
        } else {
            this.updateReplicationUpdateParameters.withRegionEndpointEnabled(regionEndpointEnabled);
            return this;
        }
    }

    public ReplicationImpl withZoneRedundancy(ZoneRedundancy zoneRedundancy) {
        this.innerModel().withZoneRedundancy(zoneRedundancy);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
