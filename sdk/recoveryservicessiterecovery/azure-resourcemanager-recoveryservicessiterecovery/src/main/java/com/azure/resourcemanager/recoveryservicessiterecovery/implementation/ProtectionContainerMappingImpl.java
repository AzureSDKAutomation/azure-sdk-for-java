// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectionContainerMappingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateProtectionContainerMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateProtectionContainerMappingInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainerMapping;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainerMappingProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RemoveProtectionContainerMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateProtectionContainerMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateProtectionContainerMappingInputProperties;

public final class ProtectionContainerMappingImpl
    implements ProtectionContainerMapping, ProtectionContainerMapping.Definition, ProtectionContainerMapping.Update {
    private ProtectionContainerMappingInner innerObject;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ProtectionContainerMappingProperties properties() {
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

    public ProtectionContainerMappingInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    private String resourceName;

    private String resourceGroupName;

    private String fabricName;

    private String protectionContainerName;

    private String mappingName;

    private CreateProtectionContainerMappingInput createCreationInput;

    private UpdateProtectionContainerMappingInput updateUpdateInput;

    public ProtectionContainerMappingImpl withExistingReplicationProtectionContainer(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName) {
        this.resourceName = resourceName;
        this.resourceGroupName = resourceGroupName;
        this.fabricName = fabricName;
        this.protectionContainerName = protectionContainerName;
        return this;
    }

    public ProtectionContainerMapping create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectionContainerMappings()
                .create(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    mappingName,
                    createCreationInput,
                    Context.NONE);
        return this;
    }

    public ProtectionContainerMapping create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectionContainerMappings()
                .create(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    mappingName,
                    createCreationInput,
                    context);
        return this;
    }

    ProtectionContainerMappingImpl(
        String name, com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = new ProtectionContainerMappingInner();
        this.serviceManager = serviceManager;
        this.mappingName = name;
        this.createCreationInput = new CreateProtectionContainerMappingInput();
    }

    public ProtectionContainerMappingImpl update() {
        this.updateUpdateInput = new UpdateProtectionContainerMappingInput();
        return this;
    }

    public ProtectionContainerMapping apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectionContainerMappings()
                .update(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    mappingName,
                    updateUpdateInput,
                    Context.NONE);
        return this;
    }

    public ProtectionContainerMapping apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectionContainerMappings()
                .update(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    mappingName,
                    updateUpdateInput,
                    context);
        return this;
    }

    ProtectionContainerMappingImpl(
        ProtectionContainerMappingInner innerObject,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "vaults");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.fabricName = Utils.getValueFromIdByName(innerObject.id(), "replicationFabrics");
        this.protectionContainerName = Utils.getValueFromIdByName(innerObject.id(), "replicationProtectionContainers");
        this.mappingName = Utils.getValueFromIdByName(innerObject.id(), "replicationProtectionContainerMappings");
    }

    public ProtectionContainerMapping refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectionContainerMappings()
                .getWithResponse(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, mappingName, Context.NONE)
                .getValue();
        return this;
    }

    public ProtectionContainerMapping refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationProtectionContainerMappings()
                .getWithResponse(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, mappingName, context)
                .getValue();
        return this;
    }

    public void delete(RemoveProtectionContainerMappingInput removalInput) {
        serviceManager
            .replicationProtectionContainerMappings()
            .delete(resourceName, resourceGroupName, fabricName, protectionContainerName, mappingName, removalInput);
    }

    public void delete(RemoveProtectionContainerMappingInput removalInput, Context context) {
        serviceManager
            .replicationProtectionContainerMappings()
            .delete(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                mappingName,
                removalInput,
                context);
    }

    public ProtectionContainerMappingImpl withProperties(CreateProtectionContainerMappingInputProperties properties) {
        this.createCreationInput.withProperties(properties);
        return this;
    }

    public ProtectionContainerMappingImpl withProperties(UpdateProtectionContainerMappingInputProperties properties) {
        this.updateUpdateInput.withProperties(properties);
        return this;
    }
}
