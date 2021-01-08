// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.MachinelearningservicesManager;
import com.azure.resourcemanager.machinelearningservices.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.machinelearningservices.models.EncryptionProperty;
import com.azure.resourcemanager.machinelearningservices.models.Identity;
import com.azure.resourcemanager.machinelearningservices.models.PrivateEndpointConnection;
import com.azure.resourcemanager.machinelearningservices.models.ProvisioningState;
import com.azure.resourcemanager.machinelearningservices.models.SharedPrivateLinkResource;
import com.azure.resourcemanager.machinelearningservices.models.Sku;
import com.azure.resourcemanager.machinelearningservices.models.Workspace;
import com.azure.resourcemanager.machinelearningservices.models.WorkspaceUpdateParameters;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class WorkspaceImpl implements Workspace, Workspace.Definition, Workspace.Update {
    private WorkspaceInner innerObject;

    private final MachinelearningservicesManager serviceManager;

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

    public String workspaceId() {
        return this.innerModel().workspaceId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public String keyVault() {
        return this.innerModel().keyVault();
    }

    public String applicationInsights() {
        return this.innerModel().applicationInsights();
    }

    public String containerRegistry() {
        return this.innerModel().containerRegistry();
    }

    public String storageAccount() {
        return this.innerModel().storageAccount();
    }

    public String discoveryUrl() {
        return this.innerModel().discoveryUrl();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public EncryptionProperty encryption() {
        return this.innerModel().encryption();
    }

    public Boolean hbiWorkspace() {
        return this.innerModel().hbiWorkspace();
    }

    public String serviceProvisionedResourceGroup() {
        return this.innerModel().serviceProvisionedResourceGroup();
    }

    public Integer privateLinkCount() {
        return this.innerModel().privateLinkCount();
    }

    public String imageBuildCompute() {
        return this.innerModel().imageBuildCompute();
    }

    public Boolean allowPublicAccessWhenBehindVnet() {
        return this.innerModel().allowPublicAccessWhenBehindVnet();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<SharedPrivateLinkResource> sharedPrivateLinkResources() {
        List<SharedPrivateLinkResource> inner = this.innerModel().sharedPrivateLinkResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public WorkspaceInner innerModel() {
        return this.innerObject;
    }

    private MachinelearningservicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private WorkspaceUpdateParameters updateParameters;

    public WorkspaceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Workspace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public Workspace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), context);
        return this;
    }

    WorkspaceImpl(String name, MachinelearningservicesManager serviceManager) {
        this.innerObject = new WorkspaceInner();
        this.serviceManager = serviceManager;
        this.workspaceName = name;
    }

    public WorkspaceImpl update() {
        this.updateParameters = new WorkspaceUpdateParameters();
        return this;
    }

    public Workspace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateWithResponse(resourceGroupName, workspaceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Workspace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateWithResponse(resourceGroupName, workspaceName, updateParameters, context)
                .getValue();
        return this;
    }

    WorkspaceImpl(WorkspaceInner innerObject, MachinelearningservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
    }

    public Workspace refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, Context.NONE)
                .getValue();
        return this;
    }

    public Workspace refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, context)
                .getValue();
        return this;
    }

    public WorkspaceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WorkspaceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WorkspaceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public WorkspaceImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateParameters.withDescription(description);
            return this;
        }
    }

    public WorkspaceImpl withFriendlyName(String friendlyName) {
        if (isInCreateMode()) {
            this.innerModel().withFriendlyName(friendlyName);
            return this;
        } else {
            this.updateParameters.withFriendlyName(friendlyName);
            return this;
        }
    }

    public WorkspaceImpl withKeyVault(String keyVault) {
        this.innerModel().withKeyVault(keyVault);
        return this;
    }

    public WorkspaceImpl withApplicationInsights(String applicationInsights) {
        this.innerModel().withApplicationInsights(applicationInsights);
        return this;
    }

    public WorkspaceImpl withContainerRegistry(String containerRegistry) {
        this.innerModel().withContainerRegistry(containerRegistry);
        return this;
    }

    public WorkspaceImpl withStorageAccount(String storageAccount) {
        this.innerModel().withStorageAccount(storageAccount);
        return this;
    }

    public WorkspaceImpl withDiscoveryUrl(String discoveryUrl) {
        this.innerModel().withDiscoveryUrl(discoveryUrl);
        return this;
    }

    public WorkspaceImpl withEncryption(EncryptionProperty encryption) {
        this.innerModel().withEncryption(encryption);
        return this;
    }

    public WorkspaceImpl withHbiWorkspace(Boolean hbiWorkspace) {
        this.innerModel().withHbiWorkspace(hbiWorkspace);
        return this;
    }

    public WorkspaceImpl withImageBuildCompute(String imageBuildCompute) {
        this.innerModel().withImageBuildCompute(imageBuildCompute);
        return this;
    }

    public WorkspaceImpl withAllowPublicAccessWhenBehindVnet(Boolean allowPublicAccessWhenBehindVnet) {
        this.innerModel().withAllowPublicAccessWhenBehindVnet(allowPublicAccessWhenBehindVnet);
        return this;
    }

    public WorkspaceImpl withSharedPrivateLinkResources(List<SharedPrivateLinkResource> sharedPrivateLinkResources) {
        this.innerModel().withSharedPrivateLinkResources(sharedPrivateLinkResources);
        return this;
    }

    public WorkspaceImpl withIdentity(Identity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public WorkspaceImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
