// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.fluent.models.ResourceGroupInner;
import com.azure.resourcemanager.resources.generated.models.ExportTemplateRequest;
import com.azure.resourcemanager.resources.generated.models.ResourceGroup;
import com.azure.resourcemanager.resources.generated.models.ResourceGroupExportResult;
import com.azure.resourcemanager.resources.generated.models.ResourceGroupPatchable;
import com.azure.resourcemanager.resources.generated.models.ResourceGroupProperties;
import java.util.Collections;
import java.util.Map;

public final class ResourceGroupImpl implements ResourceGroup, ResourceGroup.Definition, ResourceGroup.Update {
    private ResourceGroupInner innerObject;

    private final ResourceManager serviceManager;

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

    public ResourceGroupProperties properties() {
        return this.innerModel().properties();
    }

    public String managedBy() {
        return this.innerModel().managedBy();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ResourceGroupInner innerModel() {
        return this.innerObject;
    }

    private ResourceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private ResourceGroupPatchable updateParameters;

    public ResourceGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGroups()
                .createOrUpdateWithResponse(resourceGroupName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ResourceGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGroups()
                .createOrUpdateWithResponse(resourceGroupName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ResourceGroupImpl(String name, ResourceManager serviceManager) {
        this.innerObject = new ResourceGroupInner();
        this.serviceManager = serviceManager;
        this.resourceGroupName = name;
    }

    public ResourceGroupImpl update() {
        this.updateParameters = new ResourceGroupPatchable();
        return this;
    }

    public ResourceGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGroups()
                .updateWithResponse(resourceGroupName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public ResourceGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGroups()
                .updateWithResponse(resourceGroupName, updateParameters, context)
                .getValue();
        return this;
    }

    ResourceGroupImpl(ResourceGroupInner innerObject, ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
    }

    public ResourceGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGroups()
                .getWithResponse(resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public ResourceGroup refresh(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getResourceGroups().getWithResponse(resourceGroupName, context).getValue();
        return this;
    }

    public ResourceGroupExportResult exportTemplate(ExportTemplateRequest parameters) {
        return serviceManager.resourceGroups().exportTemplate(resourceGroupName, parameters);
    }

    public ResourceGroupExportResult exportTemplate(ExportTemplateRequest parameters, Context context) {
        return serviceManager.resourceGroups().exportTemplate(resourceGroupName, parameters, context);
    }

    public ResourceGroupImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ResourceGroupImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ResourceGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ResourceGroupImpl withProperties(ResourceGroupProperties properties) {
        if (isInCreateMode()) {
            this.innerModel().withProperties(properties);
            return this;
        } else {
            this.updateParameters.withProperties(properties);
            return this;
        }
    }

    public ResourceGroupImpl withManagedBy(String managedBy) {
        if (isInCreateMode()) {
            this.innerModel().withManagedBy(managedBy);
            return this;
        } else {
            this.updateParameters.withManagedBy(managedBy);
            return this;
        }
    }

    public ResourceGroupImpl withName(String name) {
        this.updateParameters.withName(name);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
