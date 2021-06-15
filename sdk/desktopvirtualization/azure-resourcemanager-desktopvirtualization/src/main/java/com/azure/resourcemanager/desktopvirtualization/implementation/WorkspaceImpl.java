// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.desktopvirtualization.models.PublicNetworkAccess;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySetIdentity;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySetPlan;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySetSku;
import com.azure.resourcemanager.desktopvirtualization.models.Workspace;
import com.azure.resourcemanager.desktopvirtualization.models.WorkspacePatch;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class WorkspaceImpl implements Workspace, Workspace.Definition, Workspace.Update {
    private WorkspaceInner innerObject;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

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

    public String managedBy() {
        return this.innerModel().managedBy();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public ResourceModelWithAllowedPropertySetIdentity identity() {
        return this.innerModel().identity();
    }

    public ResourceModelWithAllowedPropertySetSku sku() {
        return this.innerModel().sku();
    }

    public ResourceModelWithAllowedPropertySetPlan plan() {
        return this.innerModel().plan();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String objectId() {
        return this.innerModel().objectId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public List<String> applicationGroupReferences() {
        List<String> inner = this.innerModel().applicationGroupReferences();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean cloudPcResource() {
        return this.innerModel().cloudPcResource();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
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

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private WorkspacePatch updateWorkspace;

    public WorkspaceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Workspace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Workspace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    WorkspaceImpl(
        String name, com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerObject = new WorkspaceInner();
        this.serviceManager = serviceManager;
        this.workspaceName = name;
    }

    public WorkspaceImpl update() {
        this.updateWorkspace = new WorkspacePatch();
        return this;
    }

    public Workspace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateWithResponse(resourceGroupName, workspaceName, updateWorkspace, Context.NONE)
                .getValue();
        return this;
    }

    public Workspace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateWithResponse(resourceGroupName, workspaceName, updateWorkspace, context)
                .getValue();
        return this;
    }

    WorkspaceImpl(
        WorkspaceInner innerObject,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
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
            this.updateWorkspace.withTags(tags);
            return this;
        }
    }

    public WorkspaceImpl withManagedBy(String managedBy) {
        this.innerModel().withManagedBy(managedBy);
        return this;
    }

    public WorkspaceImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public WorkspaceImpl withIdentity(ResourceModelWithAllowedPropertySetIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public WorkspaceImpl withSku(ResourceModelWithAllowedPropertySetSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public WorkspaceImpl withPlan(ResourceModelWithAllowedPropertySetPlan plan) {
        this.innerModel().withPlan(plan);
        return this;
    }

    public WorkspaceImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateWorkspace.withDescription(description);
            return this;
        }
    }

    public WorkspaceImpl withFriendlyName(String friendlyName) {
        if (isInCreateMode()) {
            this.innerModel().withFriendlyName(friendlyName);
            return this;
        } else {
            this.updateWorkspace.withFriendlyName(friendlyName);
            return this;
        }
    }

    public WorkspaceImpl withApplicationGroupReferences(List<String> applicationGroupReferences) {
        if (isInCreateMode()) {
            this.innerModel().withApplicationGroupReferences(applicationGroupReferences);
            return this;
        } else {
            this.updateWorkspace.withApplicationGroupReferences(applicationGroupReferences);
            return this;
        }
    }

    public WorkspaceImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateWorkspace.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
